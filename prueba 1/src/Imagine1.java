import lejos.hardware.Button;
import lejos.hardware.motor.Motor;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3UltrasonicSensor;


public class Imagine1 
{
     public static void main(String args[]) {
	
     
  
    EV3UltrasonicSensor ojos ;
    ojos = new EV3UltrasonicSensor(SensorPort.S2);
    float[]muestras = new float[ojos.sampleSize()];
    
    ojos.fetchSample(muestras, 0);	
    System.out.println("distancia"+ muestras [0]);
    double distancia = muestras [0];
    double grade = distancia * 36;
    Motor.B.rotate((int) distancia, true);
    Motor.C.rotate((int)distancia, true);
    Button.waitForAnyPress();
   
    
	
    	 
    	 
    	    
    	 
      }
  }

