package pepito9415;

import lejos.hardware.Button;
import lejos.hardware.motor.Motor;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;

public class juancho70 
{

	public static void main(String[] args) 
	{
		//1. Mantener el robot vivo esperando que el pulsador sea presionado 
		//2. Detectar distancia usando sensor ultrasonico
		//3. Avansar distancia apropiada para presionar el pulsador del robot siguiente
		EV3UltrasonicSensor  ojos;
		EV3TouchSensor boton;
		
		ojos = new EV3UltrasonicSensor(SensorPort.S4);
	    boton = new EV3TouchSensor(SensorPort.S1);
		float[] muestras = new float[ojos.sampleSize()];
		float[] muestrasBoton = new float [boton.sampleSize()];
	
		while(true)
		{
		    ojos.fetchSample(muestras, 0 );
		    boton.fetchSample(muestrasBoton, 0);
		    double distancia = muestras[0] * 100;//en cm
		    System.out.println("Distancia " + distancia);
		    System.out.println("Boton "+muestrasBoton[0]);
		    int presionado=(int)muestrasBoton[0];
		    if(presionado==1){
		    	double perimetro = 2*Math.PI*2.5;
		    	//360 ------ perimetro
		    	// ?  ------ distancia
		    	double grados = 360*distancia/perimetro;	
		    Motor.B.rotate((int)grados, true);
		    Motor.C.rotate((int)grados);
		    }
		    System.out.println("Hola mundo¡");
		   
		}
		
			
	}
}

