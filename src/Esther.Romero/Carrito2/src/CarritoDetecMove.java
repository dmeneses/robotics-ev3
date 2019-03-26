import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;


public class CarritoDetecMove {
	public static void main(String[] args) {
		EV3UltrasonicSensor ojitos = new EV3UltrasonicSensor (SensorPort.S4);
		EV3LargeRegulatedMotor motorDerecho = new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor motorIzquierdo = new EV3LargeRegulatedMotor(MotorPort.C);
		
		SampleProvider muestrasCapturadasOjitos = ojitos.getDistanceMode();
		float distanciaAlObstaculo = Float.POSITIVE_INFINITY;
		while(distanciaAlObstaculo == Float.POSITIVE_INFINITY){
			float[] datosOjitos = new float[muestrasCapturadasOjitos.sampleSize()];
			muestrasCapturadasOjitos.fetchSample(datosOjitos, 0);
			distanciaAlObstaculo = datosOjitos[0];
		}
		double distanciaAMoverme = distanciaAlObstaculo ;
		distanciaAMoverme = distanciaAMoverme*100;
		int grados = 0;
		double diametroRueda = 5.5;
		double circunferencia = Math.PI* diametroRueda;
		double numeroDeRotaciones = distanciaAMoverme/circunferencia;
		grados = (int)(numeroDeRotaciones*360);
		
		motorDerecho.setSpeed(500);
		motorDerecho.rotate(grados, true);
		motorIzquierdo.setSpeed(500);
		motorIzquierdo.rotate(grados);
		
		ojitos.close();
		motorDerecho.close();
		motorIzquierdo.close();
		Sound.beepSequence();
		Sound.beepSequenceUp();
		Button.waitForAnyPress();
	}
}
