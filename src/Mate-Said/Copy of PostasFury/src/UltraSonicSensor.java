

import lejos.hardware.port.Port;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.RangeFinder;
import lejos.robotics.SampleProvider;

public class UltraSonicSensor implements RangeFinder
{
	EV3UltrasonicSensor sonic = new EV3UltrasonicSensor(SensorPort.S1); 
	
	EV3UltrasonicSensor sensor;
	SampleProvider		sp;
    float [] 			sample;
	
	public float getRange() {
		{
       		sp.fetchSample(sample, 0);

       		return sample[0];
	}
	
	}
	
	public float[] getRanges() {
		
		return null;
	}

      
}
