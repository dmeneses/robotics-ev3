import lejos.hardware.Button;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.utility.Stopwatch;
import lejos.hardware.motor.Motor;
public class telegrafo{
	

	public static void main(String args[]){
	
		EV3TouchSensor boton= new EV3TouchSensor(SensorPort.S2);
		float[] muestrasBoton= new float [boton.sampleSize()];
		
		Stopwatch reloj=new Stopwatch() ;
		
	      String ss = "";
		
        while(true)
        {
    		boton.fetchSample (muestrasBoton,0);
        	reloj.reset();
        	while(muestrasBoton[0]==1)
        	{
        		System.out.println("presionado");
        		boton.fetchSample (muestrasBoton,0);     
        		
        	}
        	
        	int mili = reloj.elapsed();
        	System.out.println("mili " + mili);
        	if(mili <= 1000 && mili>= 100) //punto
        	{        		
        		ss=ss+".";System.out.println(ss);
        	}
        	if(mili>1000&& mili<=2000 ) //guión
        	{
        		ss=ss+"-";System.out.println(ss);
        	}
        	if(mili>2000 && mili<=3000) //espacio de letras
        	{
        		ss=ss+" ";System.out.println(ss);
        	}
        	if(mili>3000 && mili<=4000)//espacio entre palabras
        	{
        		ss=ss+"/";System.out.println(ss);
        	}
        	if(mili>4000)//salir y escribir
        	{
        		ss=ss+" ";
        		break;
          }
       
        }
        
	          System.out.println(ss);                      
        			String oracion= ss;
        			traducirMorse(ss);
        			Button.waitForAnyPress();
			}

    
		public static void traducirMorse(String ss){
			

					//ss: ".... --- .- --.-/..- --- .-."
					
					String letraMorse = "";
					String tradLetra = "";
					int tam = ss.length();
					int indice = 0;
					while(indice < tam)
					{
						if(ss.charAt(indice) == ' ')
						{
							System.out.println("espacio " + letraMorse);
							
							if(letraMorse.equals("...."))
							{
								tradLetra = tradLetra + "h";
								}								
							
							
							if (letraMorse.equals(".-"))
							{
								System.out.println("entro a");
								tradLetra =tradLetra +"a";
							}
	                       
							
							if(letraMorse.equals("-..."))
	                        {tradLetra =tradLetra +"b";}
	                        
							
							if(letraMorse.equals("-.-."))
							{  tradLetra =tradLetra +"c";}
							
							
							if(letraMorse.equals("-.."))
							{  tradLetra =tradLetra +"d";}
							
							
							if(letraMorse.equals("."))
							{  tradLetra =tradLetra +"e";}
							
							
							if(letraMorse.equals("..-."))
							{  tradLetra =tradLetra +"f";}
							
							
							if(letraMorse.equals("--."))
							{  tradLetra =tradLetra +"g";}
							
							
							if(letraMorse.equals(".."))
							{  tradLetra =tradLetra +"i";}
							
							
							if(letraMorse.equals(".---"))
							{  tradLetra =tradLetra +"j";}
							
							
							if(letraMorse.equals("-.-"))
							{  tradLetra =tradLetra +"k";}
							
							
							if(letraMorse.equals(".-.."))
							{  tradLetra =tradLetra +"l";}
							
							
							if(letraMorse.equals("--"))
							{  tradLetra =tradLetra +"m";}
							
							
							if(letraMorse.equals("-."))
							{  tradLetra =tradLetra +"n";}
							
							
							if(letraMorse.equals("---"))
							{  tradLetra =tradLetra +"o";}
							
							
							if(letraMorse.equals(".--."))
							{  tradLetra =tradLetra +"p";}
							
							
							if(letraMorse.equals("--.-"))
							{  tradLetra =tradLetra +"q";}
							
							
							if(letraMorse.equals(".-."))
							{  tradLetra =tradLetra +"r";}
							
							
							if(letraMorse.equals("..."))
							{  tradLetra =tradLetra +"s";}
							
							
							if(letraMorse.equals("-"))
							{  tradLetra =tradLetra +"t";}
							
							
							if(letraMorse.equals("..-"))
							{  tradLetra =tradLetra +"u";}
							
							
							if(letraMorse.equals("...-"))
							{  tradLetra =tradLetra +"v";}
							
							
							if(letraMorse.equals(".--"))
							{  tradLetra =tradLetra +"w";}
							
							
							if(letraMorse.equals("-..-"))
							{  tradLetra =tradLetra +"x";}
							
							
							if(letraMorse.equals("-.--"))
							{  tradLetra =tradLetra +"y";}
							
							
							if(letraMorse.equals("--.."))
							{  tradLetra =tradLetra +"z";}
	                        
							
		        			        
							letraMorse = "";
						}
						else						
						{
							letraMorse = letraMorse + ss.charAt(indice);
						}
						
						    indice ++;
						    if(tradLetra.equals(".")){
								Motor.A.rotate(90);
								Motor.A.rotate(-90);
								Motor.B.rotate(60,true);
								Motor.C.rotate(60);
							}
							if(tradLetra.equals("-")){
								Motor.A.rotate(90);
								
								Motor.B.rotate(60,true);
								
								Motor.C.rotate(60);
								Motor.A.rotate(-90);
							}
							if(tradLetra.equals(" ")){
								
								Motor.B.rotate(60,true);
								Motor.C.rotate(60);
							}        
						    
					
					//while
						    }
					System.out.println(tradLetra); 
					
        			
						    
						
						
						/*char letra = ss.charAt(indice);
						if(letra==' ')
						if(letra=='/'){letraMorse=letraMorse+ ' ';}*/
					}
		}

