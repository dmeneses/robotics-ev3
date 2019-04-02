import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;
import java.text.DecimalFormat;
public class Postasfury {
	public static void main(String[] args){
		    EV3LargeRegulatedMotor motorD = new EV3LargeRegulatedMotor(MotorPort.C);
	        EV3LargeRegulatedMotor motorI = new EV3LargeRegulatedMotor(MotorPort.B);
	        EV3TouchSensor sensor = new  EV3TouchSensor(SensorPort.S4);
	        EV3UltrasonicSensor eyes;
	        eyes = new EV3UltrasonicSensor(SensorPort.S1); 
	        SampleProvider sp = sensor.getTouchMode();
	        boolean BotonActivo;
	        while(true){
	        	float[] sample = new float [sp.sampleSize()];
	        	sp.fetchSample(sample, 0);
	        	if(sample[0]==0)
	        	{
	        		BotonActivo = false;
	        	}
	        	else
	        	{
	        		BotonActivo = true;
	        	}
	        	System.out.println(BotonActivo); 
	        	
	        	motorI.setAcceleration(10000);
                motorD.setAcceleration(10000);
	        	
        	if(BotonActivo==true){  
        	float[] muestras = new float[eyes.sampleSize()];
	     	eyes.fetchSample(muestras, 0);
        	double distancia = muestras[0] * 100;
	       	DecimalFormat decimal = new DecimalFormat("0.00");
		    System.out.println("Distance: " + decimal.format(distancia));
		   	Delay.msDelay(1000);
	            	int D = 0;
	            	int S = 0;
	                double x = distancia;
	                D = (int)(((360*x)-3200)/17);
	            	S = D ;
	            	motorI.setSpeed(motorI.getMaxSpeed());
	            	motorD.setSpeed(motorD.getMaxSpeed());
	            	motorI.rotate(D, true);
	                motorD.rotate(D);
	            	}
	            else{
	            System.out.println(BotonActivo);
    }
	}
  }
 }


