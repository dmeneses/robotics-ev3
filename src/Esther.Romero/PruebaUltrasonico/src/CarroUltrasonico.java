import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;


public class CarroUltrasonico {

	public static void main(String[] args) {
		EV3UltrasonicSensor ojitos = new EV3UltrasonicSensor (SensorPort.S4);
		System.out.println("Esperando a que presiona cualquier boton");
		Button.waitForAnyPress();
		Sound.beepSequenceUp();
		Sound.beepSequence();
		
		SampleProvider muestrasCapturadasOjitos = ojitos.getDistanceMode();
		
		float distanciaAlObstaculo = 0;
		
		while(distanciaAlObstaculo != Float.POSITIVE_INFINITY){
			float[] datosOjitos = new float[muestrasCapturadasOjitos.sampleSize()];
			muestrasCapturadasOjitos.fetchSample(datosOjitos, 0);
			distanciaAlObstaculo = datosOjitos[0];
			System.out.println("dato enviado por sensor = " + distanciaAlObstaculo );
			
		}
		ojitos.close();
		Sound.beepSequence();
		Sound.beepSequenceUp();
		Button.waitForAnyPress();
	}
	
}
