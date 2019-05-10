package hola;


import Return.Return;
import reset.Reset;
import lejos.hardware.Button;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.BaseSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.utility.Stopwatch;

public class thefish
{		
	String morse = "";
  	EV3TouchSensor touchBoton = new EV3TouchSensor(SensorPort.S2);
	float[] muestrasBoton = new float [touchBoton.sampleSize()];
	   
	public String morsecopiado()
	{
		
		Stopwatch cronos = new Stopwatch();
		float[] muestrasTouchBoton = new float[touchBoton.sampleSize()];
		  while(true)
			{

			touchBoton.fetchSample(muestrasTouchBoton, 0);
			 System.out.println("Boton "+muestrasTouchBoton[0]);
			    int presionado=(int)muestrasTouchBoton[0];
			    //antes de presionar
			    cronos.reset();//ponemos el crono en cero
			    while(presionado==1)
			    {
					touchBoton.fetchSample(muestrasTouchBoton, 0);
					 System.out.println("Boton "+muestrasTouchBoton[0]);
					    presionado=(int)muestrasTouchBoton[0];
			    	
			    }
			    //despues de presionar			    
			    int tiempo = cronos.elapsed();//recuperamos el tiempo que estuvo presionado
			    System.out.println("tiempo presionad: "+tiempo);
			    if(tiempo > 300 && tiempo < 1000)
			    {
			    	morse = morse + "-";
			    	System.out.println("rayita");
			    }
			    else if(tiempo > 1000)
			    {
			    	morse = morse + " ";
			    	System.out.println("fin de letra");
			    }
			    else
			    {
			    	morse = morse + ".";
			    	System.out.println("punto");
			    }
			    
			    System.out.println(morse);
			    int boton = Button.waitForAnyPress();
			    if(boton == Button.ID_ENTER)
			    {
			    	return morse;
			    }
			}
		  
		}
		 
	  }
	



  
		