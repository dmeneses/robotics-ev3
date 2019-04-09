
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.motor.Motor;
public class Robot40 
{
	//propiedades
	double radio;
	EV3UltrasonicSensor ojos;
	double eje; //6.25
	float [] muestrasOjos;
	EV3TouchSensor boton ;
	float [] muestrasBoton;	
	
	//constructor
	public Robot40 (double rad ,double ej )
	{radio=rad;
	eje	=ej;
	ojos =new EV3UltrasonicSensor(SensorPort.S4);
	boton= new EV3TouchSensor(SensorPort.S2);		
	muestrasOjos= new float[ojos.sampleSize()];
	muestrasBoton= new float [boton.sampleSize()];

	}
	
	
	
	//metodos
	public void avanzarCentimetros (int distancia)
	{		
		double perimetro = radio* Math.PI*2;
//regla de tres
		double avan= distancia *360/perimetro;
		//mover motores 
		Motor.B.setAcceleration(320);
		Motor.C.setAcceleration(320);
		Motor.B. rotate((int) avan, true);
		Motor.C.rotate((int)avan);
	}
	
	public int detectardistancia()
	{
		ojos.fetchSample (muestrasOjos, 0);
		System.out.println(muestrasOjos[0]);
		return (int) muestrasOjos [0] *100;
	}
	
	public int detectarPulsador()
	{
		boton.fetchSample (muestrasBoton,0);
		System.out.println(muestrasBoton[0]);
		return (int) muestrasBoton [0];	
	}
	
	public void girarGrados (int grados)
	{ 
		double perimetrog = eje* Math.PI;
		//regla de tres
		double giro= grados * perimetrog /360;
		
		double perimetro = radio  * Math.PI *2;
		//rule of three
		double gradito=giro*360/perimetro;
		Motor.B.rotate((int)gradito, true);
		Motor.C.rotate((int)-gradito );
					
	}
	public void dibujarTriangulo(int lado)
	{
		
		if(detectarPulsador()==1)	
		{				
			int i=1;			
			while (i<=3){ 
				avanzarCentimetros(lado);
				girarGrados(115);
				
			i=i+1;
			}
	}
}}