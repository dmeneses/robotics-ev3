/*import lejos.nxt.*;
import java.lang.*;
public class pruebas 

{
 
	static public void main(String args [])
	throws InterruptedException
	{    //main
		String palabra = "";
		SoundSensor sensor1 = new SoundSensor(SensorPort.S2);
		TouchSensor sensor2 = new TouchSensor(SensorPort.S3);
		Button.ESCAPE.addButtonListener(new TurnOffListener());
		Motor.A.setSpeed(200); Motor.B.setSpeed(300); Motor.C.setSpeed(200);
		//instrucciones en pantalla
		System.out.println("ENTER empezar");
		Button.ENTER.waitForPress();
		System.out.println("RIGHT escribir");
		System.out.println("LEFT borrar");
		System.out.println("ENTER otra letra");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("ESCRIBA...");
 
		while (!Button.RIGHT.isPressed())//RIGHT manda a escribir
		{
			int[] letra ={ 2, 2, 2, 2, 2 };
			int n = 0;
			while (!Button.ENTER.isPressed() && !Button.RIGHT.isPressed() && !Button.LEFT.isPressed()
 			&& n < 5)
			{//ENTER cambia letra y LEFT borra ultima letra
 
				if (sensor2.isPressed())
				{//aqui se mide el tiempo que se presiona el sensor de tacto
					long t0 = System.currentTimeMillis();
					long t = t0;
					while (sensor2.isPressed()) t = System.currentTimeMillis();
					if (t - t0 > 250) letra[n] = 1;
					else letra[n] = 0;
					n++;
				}
				if (Button.LEFT.isPressed() && palabra.length() > 0)
				{//LEFT borra la ultima letra recibida
					palabra = palabra.substring(0, palabra.length() - 1);
				}
			}
			//instrucciones en pantalla para la siguiente letra, usuario presiono ENTER
			System.out.println("RIGHT escribir");
			System.out.println("LEFT borrar");
			System.out.println("ENTER otra letra");
			System.out.println("ESPACIO .-.-.");
			System.out.println(" ");
			//la combinacion de puntos y letras se traduce a letra y se guarda en "palabra"
			palabra=palabra+identificar(letra);
			System.out.println(palabra);
			if (Button.LEFT.isPressed())
			{//tiempo para que el usuario suelte el boton LEFT
				try { Thread.sleep(500); }
				catch (InterruptedException x) { }
			}
		}
		//robot se prepara para escribir, lapiz siempre comienza tocando la superficie
		int sube = 90;
		Motor.C.rotate(sube);
		int cuantasw=0;
 //palabra se separa por letra y se llama a la funcion "escribir"
 //debido a que la w es una letra mas amplia cada vez que se escriba una letra w el robot tiene que retroceder un poco mas de lo acostumbrado   
		for(int i=0; i<palabra.length() ; i++){
			escribir(palabra.substring(i,i+1));
			if (palabra.substring(i,i+1).equals("w")) cuantasw=cuantasw+1;
			}
		Motor.A.setSpeed(900);
		int ancho = 80;
		int Separacion = 40;
		int J = palabra.length()+cuantasw;
		int H = J * (ancho + Separacion);
		Motor.A.rotate(-H);
 

}
*/