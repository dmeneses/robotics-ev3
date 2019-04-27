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
		robot1= new Robot(3, 12.310);
		distancia =30;
		angurojo=new int [3];
		anguverde=new int [3];
		anguazul=new int [3];
		anguamarillo=new int [3];
		angurojo[0] = 20;
		angurojo[1] = -90;
		angurojo[2] = 70;
		anguverde[0]=-50;
		anguverde[1]=120;
		anguverde[2]=-70;
		anguazul[0]=70;
		anguazul[1]=-100;
		anguazul[2]=30;
		anguamarillo[0]=-50;
		anguamarillo[1]=120;
		anguamarillo[2]=-70;
	}
	
	public int velocidad()
	{
		return Motor.B.getSpeed();
	}
	
	public void acelerar(int aceleracion)
	{
		Motor.B.setSpeed(aceleracion);
		Motor.B.setAcceleration(aceleracion);
		Motor.C.setSpeed(aceleracion);
		Motor.C.setAcceleration(aceleracion);
	}
	
	public void iniciarCompetencia()
	{
		boolean entro = false;
		if (robot1.detectarColor()==1)
		  {
			System.out.println("verde");
			  robot1.girarGrados(anguverde[0]);
			  robot1.avanzarCentimentros(distancia);
			  robot1.girarGrados(anguverde[1]);
			  robot1.avanzarCentimentros(distancia);
			  robot1.girarGrados(anguverde[2]);
			 entro = true;
		  }			
		  

			  if (robot1.detectarColor()==0)
			  {
				  System.out.println("rojo");
				 robot1.girarGrados(angurojo[0]);
				 robot1.avanzarCentimentros(distancia);
				  robot1.girarGrados(angurojo[1]);
				  robot1.avanzarCentimentros(distancia);
				  robot1.girarGrados(angurojo[2]);
					 entro = true;//
			  }
		  
			  if (robot1.detectarColor()==2)
			  {
				  System.out.println("azul");
			  robot1.girarGrados(anguazul[0]);
			  robot1.avanzarCentimentros(distancia);
			  robot1.girarGrados(anguazul[1]);
			  robot1.avanzarCentimentros(distancia);
			  robot1.girarGrados(anguazul[2]);
				 entro = true;
		  }
		  
			  if (robot1.detectarColor()==3)
			  {
				  System.out.println("amarillo");
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
				  robot1.avanzarCentimentros(x-5);
				  entro = false;
				  acelerar(velocidadOriginal);
			  }
			  
	}
}
