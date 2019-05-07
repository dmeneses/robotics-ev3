
import lejos.hardware.Button;
import lejos.hardware.motor.Motor;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
public class Principal {
	
		
		@SuppressWarnings("resource")
		public static void main(String args[])
		{ 
			//mantener el robot vivo hasta que el pulsador sea presionado
			//2.detectar dist con el ultrasonico
			//3.avanzar hasta el sgte pulsador
			EV3UltrasonicSensor ojos;
			ojos = new EV3UltrasonicSensor(SensorPort.S4);
			float []muestras = new float[ojos.sampleSize()];
			
			EV3TouchSensor botoncito;
			botoncito = new EV3TouchSensor(SensorPort.S1);
			float []muestras1 = new float[botoncito.sampleSize()];

			int pulsado = 0;
			while (1==1){
					while (pulsado == 0)
					{
						botoncito.fetchSample(muestras1,0);
						double presionado = muestras1[0];
						pulsado = (int)muestras1[0];
						System.out.println ("Pulsado : " + presionado);
					}
				ojos.fetchSample(muestras,0);
				double distancia = muestras[0] * 100;
				System.out.println ("Distancia : " + distancia);
				
				//2pi*r//360/17.5*dis//
				double perimetro = 2*Math.PI*2.75; 
				double grados = (360/perimetro*distancia)-6;
				System.out.println ("Grados : " + grados);
				//Motor.C.setAcceleration((int) (grados/5/5));
				//Motor.B.setAcceleration((int) (grados/5/5));
				
				Motor.B.setSpeed(800);
				Motor.C.setSpeed(800);
				Motor.B.setAcceleration(500);
				Motor.C.setAcceleration(500);
				//720
				
				Motor.B.rotate((int)grados, true);
				Motor.C.rotate((int)grados);
				
				Button.waitForAnyPress();
				pulsado = 0;
					}
		
		}
	}