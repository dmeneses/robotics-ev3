

	import lejos.hardware.Button;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.utility.Stopwatch;
	public class sumitos	
	{	
		public static void main(String args[]) throws InterruptedException	
		{
			robosumito robo1;
			robo1= new robosumito(3, 12.3);

			/*Stopwatch relog;
			relog= new Stopwatch ();
			relog.reset();*/
			//boolean cambiar = false;
			Button.waitForAnyPress();
			Thread.sleep(3000);
			//robo1.girarOjitos(cambiar);
			int cont = 0;
			while (true)			
			{ 
				
				robo1.cuchillito();
				robo1.atacar();
				robo1.detectarDistancia();
			
				
				int luz = robo1.detectarLuz();
				System.out.println("luz "+luz);
				
				if( luz > 45 )//detectar borde
				{ 
			
					System.out.println("blanquito");
			
					 robo1.avanzarCentimentros(20);
					 robo1.girarGrados(180);
					 robo1.atacar();
					}
				
			
				int ojos= robo1.detectarDistancia();
				if (ojos<48)					
				{ 
					System.out.println("atacando");
					//robo1.parar();
					//robo1.atacar();
					//robo1.acelerar(0);
					robo1.megaAtaque(0);
					//robo1.girarGrados(180);
				}
				else
				{
					robo1.acelerar(0);
				}
				int boton= robo1.detecatarPulsadorIzquierda();
				if (boton==1)
				{
					System.out.println("boton");
					robo1.avanzarCentimentros(13);
					robo1.megaAtaque(0);
					robo1.girarGrados(100);
				}
				int boton1= robo1.detectarPulsadorDerecha();
				if (boton1==1)
				{
					System.out.println("boton1");
					robo1.avanzarCentimentros(14);
					robo1.megaAtaque(0);
					robo1.girarGrados(-100);
				}
				
				
			
			}
		}
	}

		
	