package pepito9415;

import lejos.hardware.motor.Motor;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3UltrasonicSensor;

public class juancho70 
{

	public static void main(String[] args) 
	{
		//1. Mantener el robot vivo esperando que el pulsador sea presionado 
		//2. Detectar distancia usando sensor ultrasonico
		//3. Avansar distancia apropiada para presionar el pulsador del robot siguiente
		EV3UltrasonicSensor  ojos;
		ojos = new EV3UltrasonicSensor(SensorPort.S4);
		float[] muestras = new float[ojos.sampleSize()];
		
		while(true)
		{
		    ojos.fetchSample(muestras, 0 );
		    double distancia = muestras[0] * 100;//en cm
		    System.out.println("Distancia " + distancia);
		    Motor.C.rotate(30);
		    
		}
			
	}
}
