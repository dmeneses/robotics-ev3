package afedo3;

import lejos.hardware.Button;
import lejos.hardware.motor.Motor;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.BaseSensor;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3TouchSensor;

public class Array 
{
	int distanciafija;
	int[] angulosRojo;
	int[] angulosAmarillo;
	int[] angulosAzul;
	int[] angulosVerde;
	Pato robot;
	
	public Array()
	{
		distanciafija = 30;
		robot = new Pato(3, 12.25);
		angulosRojo = new int[3];
		angulosRojo[0]=270;
		angulosRojo[1]=255;
		angulosRojo[2]=290;
		angulosAmarillo = new int[3];
		angulosAmarillo[0]=200;
		angulosAmarillo[1]=-370;
		angulosAmarillo[2]=220;
		angulosAzul = new int[3];
		angulosAzul[0]=390;
		angulosAzul[1]=401;
		angulosAzul[2]=760;
		angulosVerde = new int[3];
		angulosVerde[0]=-80;
		angulosVerde[1]=150;
		angulosVerde[2]=-100;
	}
	public void jugar()
	{
		//recuperar el color del robot (pato)
		int color = robot.detectarColor();
		if(color == 0)//se detecto rojo
		{
			robot.girarGrados(angulosRojo[0]);
			robot.avanzarCentimetros(distanciafija);
			robot.girarGrados(angulosRojo[1]);
			robot.avanzarCentimetros(distanciafija);
            robot.girarGrados(angulosRojo[2]);
            int distancia = robot.detectarDistancia();
            robot.acelerar(600);
            robot.avanzarCentimetros(distancia); 
		}
		if(color == 3)//se detecto amarillo
		{
			robot.girarGrados(angulosAmarillo[0]);
			robot.avanzarCentimetros(distanciafija);
			robot.girarGrados(angulosAmarillo[1]);
			robot.avanzarCentimetros(distanciafija);
			robot.girarGrados(angulosAmarillo[2]);
            int distancia = robot.detectarDistancia();
            robot.acelerar(600);
            robot.avanzarCentimetros(distancia);
		}
		if(color == 2)//se detecto Azul
		{
			robot.girarGrados(angulosAzul[0]);
			robot.avanzarCentimetros(distanciafija);
			robot.girarGrados(angulosAzul[1]);
			robot.avanzarCentimetros(distanciafija);
			robot.girarGrados(angulosAzul[2]);
            int distancia = robot.detectarDistancia();
            robot.acelerar(600);
            robot.avanzarCentimetros(distancia);
        }	
		if(color == 1)//se detecto Verde
		{
			robot.girarGrados(angulosVerde[0]);
			robot.avanzarCentimetros(distanciafija);
			robot.girarGrados(angulosVerde[1]);
			robot.avanzarCentimetros(distanciafija);
            robot.girarGrados(angulosVerde[2]);
            robot.acelerar(600);
            int distancia = robot.detectarDistancia();
            robot.avanzarCentimetros(distancia); 
		}
	}	
}

	
	
	


