import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;
import lejos.utility.Stopwatch;

import java.util.HashMap;

	public class Morse {
		EV3TouchSensor  sensor;
		EV3MediumRegulatedMotor motor;
		EV3LargeRegulatedMotor motorD;
	    EV3LargeRegulatedMotor motorI;
	    Stopwatch timer;
		SampleProvider sp;
		HashMap morse;
		public Morse ()
		{
			sensor = new  EV3TouchSensor(SensorPort.S2);
			motorD = new EV3LargeRegulatedMotor(MotorPort.C);
	        motorI = new EV3LargeRegulatedMotor(MotorPort.B);
			motor = new EV3MediumRegulatedMotor(MotorPort.A);
			timer = new Stopwatch();
			morse = new HashMap();
			
			morse.put(".-","a");
			morse.put("-...","b");
			morse.put("-.-.","c");
			morse.put("-..","d");
			morse.put(".","e");
			morse.put("..-.","f");
			morse.put("--.","g");
			morse.put("....","h");
			morse.put("..","i");
			morse.put(".---","j");
			morse.put("-.-","k");
			morse.put(".-..","l");
			morse.put("--","m");
			morse.put("-.","n");
			morse.put("---","o");
			morse.put(".--.","p");
			morse.put("--.-","q");
			morse.put(".-.","r");
			morse.put("...","s");
			morse.put("-","t");
			morse.put("..-","u");
			morse.put("...-","v");
			morse.put(".--","w");
			morse.put("-..-","x");
			morse.put("-.--","y");
			morse.put("--..","z");
		}
		public void leerCodigo()
		{
			sp = sensor.getTouchMode();
			boolean BotonActivo;
			boolean contador = false;
			int apretar=0;
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
	        	if(BotonActivo && !contador){
	        	timer.reset();
	        	contador= true;
	            }
	        	if(!BotonActivo && contador){
	        	apretar = timer.elapsed();
	           	System.out.println(apretar);
	           	Delay.msDelay(1000);
	            contador = false;
	            }
	        	if(apretar > 0|| apretar <=1000)
	        	{
	        	System.out.println(".");
	        	}
	        	else if(apretar > 1000 || apretar <= 3000)
	        	{
	        	System.out.println("-");	
	        	}
	        	else if(apretar > 3000 || apretar <= 10000)
	        	{
	        	System.out.println(" ");	
	        	}
			/*public void mostrarCodigo(String codigo){ //codigo = ".-"
				String letra = (String)morse.get(codigo); // letra = "a"
				System.out.println(codigo);
   }*/
  }
 }
}