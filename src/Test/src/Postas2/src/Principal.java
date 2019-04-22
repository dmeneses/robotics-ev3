
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.utility.Delay;

public class Principal {	
	
	public static void main (String [] args){
			//EV3LargeRegulatedMotor motorA = new EV3LargeRegulatedMotor(MotorPort.B);
			//EV3LargeRegulatedMotor motorB = new EV3LargeRegulatedMotor(MotorPort.C);
		    
			Robot killer = new Robot(" ", 30);
			killer.avanzar();
			killer.girar(90);
			String color = killer.reconocerColor();
			
		    killer.avanzarRuta(color);
			
	}
}
