import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;


public class Clase1 {

	public static void main(String[] args) {
		 
		 float colorBlanco=6.0f;
		 float colorNegro=7.0f;
 		Clase2 carrito=new Clase2();
		boolean detecteColor = false;
		float colorDetectado = 0;
		while (detecteColor == false) {
		colorDetectado = Clase2.detectarColor();
		
		
	 
		
		boolean detecteSiguiente = false;
		double distanciaDetectada = 0;
		while (detecteSiguiente == false){
		distanciaDetectada  = Clase2.detectarObstaculo();
		detecteSiguiente = true;
		carro.detectarObstaculo();
}
		}

		