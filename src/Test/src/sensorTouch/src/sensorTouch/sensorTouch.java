package sensorTouch;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;



public class sensorTouch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EV3TouchSensor sensor = new EV3TouchSensor(SensorPort.S2);
SampleProvider sp = sensor.getTouchMode();
boolean botonActivado;
while(true){
	float[]sample = new float [sp.sampleSize()];
	sp.fetchSample(sample,0);
	if (sample [0]==0){
		botonActivado = false;
	}else{
		botonActivado = true;
	}
	System.out.println(botonActivado);
	}
}
	}

