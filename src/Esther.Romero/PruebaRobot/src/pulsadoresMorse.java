import lejos.hardware.Button;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.TouchAdapter;
import lejos.utility.Delay;
import lejos.utility.Stopwatch;

public class pulsadoresMorse {
	EV3TouchSensor touch = new EV3TouchSensor(SensorPort.S3);
	TouchAdapter touchAdaptador = new TouchAdapter(touch);
	Stopwatch timer = new Stopwatch();

	public char pulsadorMorse() {
		int tiempoDeReaccion = 0;
		char morse = ' ';
		System.out.println(" empieza ");
		Delay.msDelay(300);
		timer.reset();
		
		while (touchAdaptador.isPressed()) {
			System.out.println("estan realizando el morse");
		}
		tiempoDeReaccion = timer.elapsed();
		System.out.println("tiempoDeReaccion" + tiempoDeReaccion);
		if (tiempoDeReaccion <= 300) {
			morse = '.';
					
			
		} else if (tiempoDeReaccion >= 300) {
			morse = '_';
			
		}
		else if(tiempoDeReaccion==0){
        	morse=' ';
        	
        }
		timer.reset();
		while (!touchAdaptador.isPressed()) {
		}
		tiempoDeReaccion = timer.elapsed();
		System.out.println("tiempoDeReaccion" + tiempoDeReaccion);
		System.out.println(morse);
		return morse;
	}
	
}
        