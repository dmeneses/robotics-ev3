import lejos.hardware.Button;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
 
//import lejos.hardware.sensor.EV3TouchSensor;
//import stopwatch.
import lejos.utility.Stopwatch;

//package morse;

//public void reset()

public class robot2 
{
	double telegrafo; 
	String pal = "....*---*.-..*.-";
	String h = "....";
	String o = "---";
	String l= " .-..";
	String a= ".-" ;
	String espacio= "*";
	public static void main (String[]args)
	       {
		Stopwatch relog = new Stopwatch ();
	 System.out.println("hola");
		String morse= "hola";
		String traduccion= "";
		System.out.println("largo: " + morse.length());
	   
	    String pal = "....*---*.-..*.-*";
	    /*for (int x=0;x<pal.length();x++)
	    	
	    	int x = 0;
	    	while(x<pal.length())	    			
	    	{
	    		System.out.println("Caracter " + x + ": " + pal.charAt(x));
	    		x = x + 1;
	    	}
	      */  
	   System.out.println(morse.charAt(3));
	
	EV3TouchSensor boton;
	boton = new EV3TouchSensor (SensorPort.S4);
	
	float[] muestrasBoton = new float[boton.sampleSize()];
	String pal1 = "";
	while(true)
	{
		relog.reset();
		boton.fetchSample(muestrasBoton, 0);
		double pulsado=(muestrasBoton [0]);
		
		while (pulsado==1)
		{
			boton.fetchSample(muestrasBoton, 0);
			pulsado=(muestrasBoton [0]);
		}
		
 	   int tiempo = relog.elapsed ();
 	  boolean puntito=tiempo<1000 ;   
 	  boolean espacio= tiempo>1000 && tiempo<2000;
 	  boolean linea= tiempo>2000;
 	  
 	   if (puntito)
 	   {
 		   pal1 = pal1 + ".";
 		  System.out.println("punto");
 	   }
 	   if (linea)
 	  
 	   {
 		   pal1 = pal1 + "-";
 		  System.out.println("linea");
 	   }
 	   if (espacio)
 	   {
 		  pal1 = pal1 + "*";
 		  System.out.println("espacio");
 	   }   
 	   System.out.println(tiempo );
   	   //pal1 = ".../--.-/-."
   	   int boti = Button.waitForAnyPress();
   	   if(boti == Button.ID_ENTER)
   	   {
   		   break;
   	   }
       }//while
	 	//pal1: "....*---*.-..*.-"
	   for (int x=0;x<pal1.length();x++)
	    {
	        System.out.println("Caracter " + x + ": " + pal1.charAt(x));
	       
	        //almacenar letra por letra en un string
	        //encontrar un asterisco
	        //traducir letra
	        
	        tradletra = tradletra + pal1.charAt(x);//"...." 	        
	        if(tradletra == h)
	        	traduccion=traduccion+"h";
	        if(1)
	        	traduccion=traduccion+"o";
	        if (2)
	        	traduccion = traduccion +".-.."+"*";
	        if (3)
	        	traduccion = traduccion +".-"+ "*";
	        if()
		        traduccion = traduccion + "h";traduccion = traduccion +"h"+"o";
		        traduccion = traduccion +"h"+"o"+"l";traduccion = traduccion +"h"+"o"+"l"+"a";
	        
	    }
	}
}
