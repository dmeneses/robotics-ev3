import lejos.hardware.Button;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.TouchAdapter;
import lejos.utility.Delay;
import lejos.utility.Stopwatch;

public class Robot {
	EV3TouchSensor sensorTouch = new EV3TouchSensor(SensorPort.S1);
	TouchAdapter touchAdaptador = new TouchAdapter(sensorTouch);
	Stopwatch timer = new Stopwatch();

	// SampleProvider muestrasCapturadasTouch = sensorTouch.getTouchMode();

	public boolean pedirDatosAlPulsadorTerminar() {

		boolean resultado = false;

		return resultado;
	}

	public char pedirDatosAlPulsadorCodigo() {
		int tiempoDePulsacion = 0;
		timer.reset();
		char valor = '.';
		char valor1 = '_';
		char valor2 = '/';

		while (!touchAdaptador.isPressed()) {
			System.out.println("presiona el touch");
		}
		//timer.reset();
		tiempoDePulsacion = timer.elapsed();
		System.out.println("hubo presion en el touch por=" + tiempoDePulsacion);
		
		//timer.reset();
		if (tiempoDePulsacion == 0) {
		System.out.println(valor2);
		}
	 
		//timer.reset();

		if (tiempoDePulsacion > 1000) {
			System.out.println(valor1);
		}
		//timer.reset();
		if (tiempoDePulsacion < 1000) {
			System.out.println(valor);
		}
		 
		System.out.println(valor+valor1+valor2);
		Button.waitForAnyPress();
	 

	
		return valor2;
}

	public void dibujarMorse(char[] codigoEnMorse) {
		 
	}}