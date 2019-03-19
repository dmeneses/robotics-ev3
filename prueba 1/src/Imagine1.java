import lejos.hardware.Button;
import lejos.hardware.motor.Motor;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3UltrasonicSensor;


public class Imagine1 
{
     public static void main(String args[])
  {
    EV3UltrasonicSensor ojos;
    ojos = new EV3UltrasonicSensor(SensorPort.S2);
    float[]muestras = new float[ojos.sampleSize()];
    ojos.fetchSample(muestras, 0);
    System.out.println("distancia--->" + muestras[0]);	
    float[] distancia;
    distancia = muestras;
	Motor.B.rotate(distancia,true);
	Motor.C.rotate(distancia);
    	 
    	 Button.waitForAnyPress();
    	    
    	 
   	 
  }
 }
