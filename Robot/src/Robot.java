import lejos.hardware.Button;
import lejos.hardware.motor.Motor;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3TouchSensor;
//import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.Color;


public class Robot
{
	//propiedades	
	double radio;
	double eje;
	EV3UltrasonicSensor ojos;
	float[] muestrasojos;
	float[] muestrasboton;
	EV3TouchSensor boton;
	//int t=1;
	EV3ColorSensor color;
	float[] muestrascolor;
	
	
	//constructor
	public Robot (double rad, double ej)
	{
		radio = rad;
		eje = ej;
		ojos = new EV3UltrasonicSensor (SensorPort.S4);
		boton = new EV3TouchSensor (SensorPort.S1);
		muestrasojos = new float [ojos.sampleSize()];
		muestrasboton = new float [boton.sampleSize()];
		color = new EV3ColorSensor (SensorPort.S2);
		muestrascolor = new float [color.sampleSize()];
		color.setFloodlight(Color.WHITE);
	}
	
	//metodos
	public void avanzarcm(int distancia)
	{
		double perimetro = radio*Math.PI*2;
		//regla de 3
		double cm=distancia*360/perimetro;
		//mover motores
		Motor.B.rotate((int)cm,true);
		Motor.C.rotate((int)cm);
		
	}

	public int detectardistancia()
	{
		ojos.fetchSample(muestrasojos, 0);
		
		return (int)(muestrasojos[0]*100);
		
	}
	
	public int detectarpulsador()
	{
		boton.fetchSample(muestrasboton, 0);
		
		return (int)muestrasboton[0];
		
	}
	
	public void girargrados(int grados)
	{
		double perimetrog = eje*Math.PI; //radiorobot
		
		//regla de tres para obtener dist del arco a moverse //grad normal//
		
		double giro = grados*perimetrog/360; //cuantos grados normal va a girar
	
		//perimetro de la rueda
		double perimetro=radio*Math.PI*2; //para vanzar cm
		//regla de tres para obtener grados robot
		double gradito = giro*360/perimetro; //cuantos //grados robot//va a girar
		//mover motores
		Motor.B.rotate ((int)gradito,true);
		Motor.C.rotate((int)-gradito);
	}
	
	public void dibujarTriangulo(int lado,int g1, int g2, int g3)
	{
		//while (t<=3){	t=t+1;	
		
			
			girargrados(g1);
			avanzarcm (lado);
			girargrados(g2);
			avanzarcm (lado);
			girargrados(g3);
			
		
	
	}
	public int detectarColor()
	{
		color.fetchSample(muestrascolor, 0);
		
		int colorcito = (int)muestrascolor[0]; 
				
		while (colorcito == -1 || colorcito == 7)
		{
			
			color.fetchSample(muestrascolor, 0);
			
			colorcito = (int)muestrascolor[0]; 
		
			System.out.println ("color : " + colorcito);
		}
		
		return (int)muestrascolor[0];
		
	}

	
}