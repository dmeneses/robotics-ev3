

	import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
	public class sumitos	
	{	
		public static void main(String args[])	
		{
			robosumito robo1;
			robo1= new robosumito(3, 12.3);
			
			while (true)			
			{ 
				
				int luz = robo1.detectarLuz();
				if(luz < 30 && luz > 20 )//detectar borde
				{ 
					System.out.println("blanquito");
					
					 robo1.avanzarCentimentros(20);
					 robo1.girarGrados(180);
					 
					}
				robo1.girarOjitos(false);
				
				/*if()//buscar contrincante
				{}
				
				if()//atacar contrincante 
				{}*/
			}
		}
	}

		
	