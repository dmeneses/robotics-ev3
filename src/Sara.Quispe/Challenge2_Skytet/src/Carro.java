import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;

public class Carro {
	EV3ColorSensor sensorColor = new EV3ColorSensor(SensorPort.S1);
	EV3UltrasonicSensor ultrasonic = new EV3UltrasonicSensor(SensorPort.S2);
	EV3LargeRegulatedMotor motorB = new EV3LargeRegulatedMotor(MotorPort.B);
	EV3LargeRegulatedMotor motorD = new EV3LargeRegulatedMotor(MotorPort.D);
	SampleProvider muestrasCapturadasOjitos = ultrasonic.getDistanceMode();

	double diametroRueda = 5.5;

	public float detectarColor() {

		SampleProvider muestrasCapturadasColor = sensorColor.getColorIDMode();
		float[] datosDelSensor = new float[muestrasCapturadasColor.sampleSize()];
		muestrasCapturadasColor.fetchSample(datosDelSensor, 0);
		float color = datosDelSensor[0];
		System.out.println("color=" + color);
		return color;
	}

	public void girar(int grado) {
		motorD.rotate(grado);
	}

	public void avanzar(double distanciaFijaRecorrido) {

		int grados = 0;
		double circunferencia1 = Math.PI * diametroRueda;
		double numeroDeRotaciones = distanciaFijaRecorrido / circunferencia1;
		grados = (int) (numeroDeRotaciones * 360);

		int velocidad = 200;
		motorB.setSpeed(velocidad);
		motorB.rotate(grados, true);
		motorD.setSpeed(velocidad);
		motorD.rotate(grados);
		Delay.msDelay(1000);
	}

	public double detectarObstaculo() {

		Delay.msDelay(2000);

		float distanciaAlObstaculo = 0;

		while (distanciaAlObstaculo == 0) {
			float[] datosOjitos = new float[muestrasCapturadasOjitos
					.sampleSize()];
			muestrasCapturadasOjitos.fetchSample(datosOjitos, 0);
			distanciaAlObstaculo = datosOjitos[0];
			System.out.println("dato enviado por sensor ="+ distanciaAlObstaculo);
			distanciaAlObstaculo = (distanciaAlObstaculo * 100)-10;
		}
		int grados = 0;
		double circunferencia1 = Math.PI * diametroRueda;
		double numeroDeRotaciones = distanciaAlObstaculo / circunferencia1;
		grados = (int) (numeroDeRotaciones * 360);

		int velocidad = 200;
		motorB.setSpeed(velocidad);
		motorB.rotate(grados, true);
		motorD.setSpeed(velocidad);
		motorD.rotate(grados);

		motorB.stop();
		motorD.stop();

		motorB.close();
		motorD.close();

		return distanciaAlObstaculo;

	}
}