import lejos.hardware.Button;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;
import lejos.robotics.TouchAdapter;
import lejos.utility.Delay;
import lejos.utility.Stopwatch;

public class Robot {

	public boolean pedirDatosAlPulsadorTerminar() {

		EV3TouchSensor sensorTouch = new EV3TouchSensor(SensorPort.S1);
		TouchAdapter touchAdaptador=new TouchAdapter(sensorTouch);
		Stopwatch timer = new Stopwatch();
		int tiempoDeReaccion=0;
		 Delay.msDelay(500);
		 timer.reset();
		 char valor='.';

		 while (!touchAdaptador.isPressed()){
			 System.out.println("Alguien esta presionando el touch!");
		 } 
		if(tiempoDeReaccion < 500) {
		System.out.println("tiempoDeReaccion="+ valor);
		 }
		 tiempoDeReaccion = timer.elapsed();
		 System.out.println("hubo presion en el touch por"+ tiempoDeReaccion);
	
		 timer.reset();
		 while (!touchAdaptador.isPressed()) {
			 System.out.println("No hay presion en el touch!");
		 }
		 tiempoDeReaccion = timer.elapsed();
		 System.out.println("no hubo presion en el touch por =" + tiempoDeReaccion);
		 Button.waitForAnyPress();
		return false;
	}
		  

	public char pedirDatosAlPulsadorCodigo() {

		return 0;
	}
}