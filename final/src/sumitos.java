

	import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.utility.Stopwatch;
	public class sumitos	
	{	
		public static void main(String args[])	
		{
			robosumito robo1;
			robo1= new robosumito(3, 12.3);

			/*Stopwatch relog;
			relog= new Stopwatch ();
			relog.reset();*/
			boolean cambiar = false;
			robo1.girarOjitos(cambiar);
			int cont = 0;
			while (true)			
			{ 
				cont++;
				robo1.acelerar(0);
			robo1.atacar();
			
				
				int luz = robo1.detectarLuz();
				//System.out.println("luz "+luz);
				
				if( luz > 20 )//detectar borde
				{ 
					robo1.pararCabecita();
					System.out.println("blanquito");
			
					 robo1.avanzarCentimentros(20);
					 robo1.girarGrados(180);
					 robo1.atacar();
					}
				
			
				int ojos= robo1.detectarDistancia();
				//int tiempo = relog.elapsed ();
				// int cachito = tiempo;
				
				
				if(cont> 100)
				{
					//cachito= tiempo<1000 && tiempo > 20; 
					cambiar = !cambiar;
					robo1.girarOjitos(cambiar);
					//relog.reset();
					System.out.println("cmabio ojos");
					cont = 0;
				}
				System.out.println(cont);
				if(ojos<25 )//buscar contrincante y atacar
				{
					
					
					
					robo1.megaAtaque(0);
					
				}
				
				//if()//atacar contrincante 
				//{}
			}
		}
	}

		
	