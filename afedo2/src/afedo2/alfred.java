package afedo2;

import lejos.hardware.Button;
import lejos.hardware.motor.Motor;

public class alfred
{

public static void main(String args[])
{ 
	System.out.println("Hola mundo¡");
	Button.waitForAnyPress();
	int distancia = 30;
	//Una vuelta completa 360
	double perimetro = 2*Math.PI*2.5;
	//360 ------ perimetro
	// ?  ------ distancia
	double grados = 360*distancia/perimetro;
	Motor.C.rotate((int)grados, true);
	Motor.B.rotate((int)distancia);
	Motor.B.rotate((int)grados);
	Motor.C.rotate((int)perimetro);
	Button.waitForAnyPress();
} 
}

