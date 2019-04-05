import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;


public class PruevaLapiz {

	public static void main(String[] args) {
		
		EV3LargeRegulatedMotor brazo = new EV3LargeRegulatedMotor(MotorPort.D);
		EV3TouchSensor sensorTouch  = new EV3TouchSensor(SensorPort.S1);
		
		SampleProvider muestrasCapturadasTouch = sensorTouch.getTouchMode();
		boolean sensorTouchDetectoToque = false;
		while (sensorTouchDetectoToque == false ){
			System.out.println("toca para empezar");
			float[] datosDelSensor = new float[muestrasCapturadasTouch.sampleSize()];
			muestrasCapturadasTouch.fetchSample(datosDelSensor, 0);
			if (datosDelSensor[0] == 0){	
			}
			if (datosDelSensor[0]!= 0){
				sensorTouchDetectoToque = true;
			}
		}
		if (sensorTouchDetectoToque == true){
			
			brazo.rotate(60);
			brazo.setSpeed(800);
				
			}
		
		boolean sensorTouchDetectoToque1 = false;
		while (sensorTouchDetectoToque1 == false ){
			System.out.println("toca para bajar");
			float[] datosDelSensor = new float[muestrasCapturadasTouch.sampleSize()];
			muestrasCapturadasTouch.fetchSample(datosDelSensor, 0);
			if (datosDelSensor[0] == 0){	
			}
			if (datosDelSensor[0]!= 0){
				sensorTouchDetectoToque1 = true;
			}
		}
		if (sensorTouchDetectoToque1 == true){
			
			brazo.rotate(-60);
			brazo.setSpeed(800);
				
			}
		
		
		}
		


}

	
