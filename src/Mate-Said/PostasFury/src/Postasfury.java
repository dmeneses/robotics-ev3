/*import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;
public class Postasfury {
	public static void main(String[] args){
		    EV3LargeRegulatedMotor motorD = new EV3LargeRegulatedMotor(MotorPort.C);
	        EV3LargeRegulatedMotor motorI = new EV3LargeRegulatedMotor(MotorPort.B);
	        EV3TouchSensor sensor = new  EV3TouchSensor(SensorPort.S4);
	        EV3UltrasonicSensor sonic = new EV3UltrasonicSensor(SensorPort.S1); 
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
	    
	            if(BotonActivo==true){
	            	int D = 0;
	                int x = 30;
	            	D = (360*x)/17; 
	                motorI.rotate(D, true);
	                motorD.rotate(D);
	             }
	            else{
	            System.out.println(BotonActivo);
	            }
	}
  }
}
*/