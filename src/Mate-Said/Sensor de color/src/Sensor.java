import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.robotics.SampleProvider;
public class Sensor {
	public static void main(String[] args) {
		EV3ColorSensor C = new  EV3ColorSensor(SensorPort.S4);
		SampleProvider sp = C.getColorIDMode();
	    String Color; 
	    Color = null;
		 while(true){
	        	float[] sample = new float [sp.sampleSize()];
	        	sp.fetchSample(sample, 0);
	        	if(sample[0]==0)
	        	{
	        		Color = "Rojo" ;
	        	}
	        	else if(sample[0]==1)
	        	{
	        		 Color = "Verde";
	        	}
	        	else if(sample[0]==2)
	        	{
	        		 Color = "Azul";
	        	}
	        	else if(sample[0]==3)
	        	{
	        		 Color = "Amarillo";
	        	}
	        	else{
	        	System.out.println(Color = null);	
	        	}
	        	System.out.println(Color);
  }
 }
}