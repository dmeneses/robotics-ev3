import lejos.hardware.motor.Motor;


/*import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;*/

public class Colors 
{		
	Robot robot1;
	int[]angurojo;
	int[]anguverde;
	int[]anguazul;
	int[]anguamarillo;
	int distancia;
	int detectarDistancia;
	
	
	
	public Colors()
	{	
		robot1= new Robot(3.05, 12.3);
		distancia =45 ;
		angurojo=new int [3];
		anguverde=new int [3];
		anguazul=new int [3];
		anguamarillo=new int [3];
		angurojo[0] = 120;
		angurojo[1] = -120;
		angurojo[2] = 90;
		anguverde[0]=120;
		anguverde[1]=120;
		anguverde[2]=-120;
		anguazul[0]=35;
		anguazul[1]=35;
		anguazul[2]=-35;
		anguamarillo[0]=43;
		anguamarillo[1]=43;
		anguamarillo[2]=43;
	}
	
	public int velocidad()
	{
		return Motor.B.getSpeed();
	}
	
	public void acelerar(int aceleracion)
	{
		Motor.B.setSpeed(aceleracion);
		//Motor.B.setAcceleration(aceleracion);
		Motor.C.setSpeed(aceleracion);
		//Motor.C.setAcceleration(aceleracion);*/
	}
	
	public void iniciarCompetencia()
	{
		boolean entro = false;
		  if (robot1.detectarColor()==1)
		  {
			  robot1.girarGrados(anguverde[0]);
			  robot1.avanzarCentimentros(distancia);
			  robot1.girarGrados(anguverde[1]);
			  robot1.avanzarCentimentros(distancia);
			  robot1.girarGrados(anguverde[2]);
			 entro = true;
		  }			
		  

			  if (robot1.detectarColor()==0)
			  {
				 robot1.girarGrados(angurojo[0]);
				 robot1.avanzarCentimentros(distancia);
				  robot1.girarGrados(angurojo[1]);
				  robot1.avanzarCentimentros(distancia);
				  robot1.girarGrados(angurojo[2]);
					 entro = true;//
			  }
		  
			  if (robot1.detectarColor()==2)
			  {
			  robot1.girarGrados(anguazul[0]);
			  robot1.avanzarCentimentros(distancia);
			  robot1.girarGrados(anguazul[1]);
			  robot1.avanzarCentimentros(distancia);
			  robot1.girarGrados(anguazul[2]);
				 entro = true;
		  }
		  
			  if (robot1.detectarColor()==3)
			  {
				  robot1.girarGrados(anguamarillo[0]);
				  robot1.avanzarCentimentros(distancia);
				  robot1.girarGrados(anguamarillo[1]);
				  robot1.avanzarCentimentros(distancia);
				  robot1.girarGrados(anguamarillo[2]);
				  entro = true;
			 }
			  
			  if(entro)
			  {
        		  int velocidadOriginal = velocidad();
        		  acelerar(500);
				  int x=robot1.detectarDistancia();
				  robot1.avanzarCentimentros(x-3);
				  entro = false;
				  acelerar(velocidadOriginal);
			  }
			  
	}
}
