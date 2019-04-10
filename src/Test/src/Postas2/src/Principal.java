import lejos.hardware.motor.EV3LargeRegulatedMotor; 
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import  lejos.hardware.sensor.EV3ColorSensor; 
import lejos.utility.Delay;

public class Principal {		
	
	public static void main (String [] args){
			EV3LargeRegulatedMotor motorA = new EV3LargeRegulatedMotor(MotorPort.B);
			EV3LargeRegulatedMotor motorB = new EV3LargeRegulatedMotor(MotorPort.C);
			
			motorA.setSpeed(500);
			motorA.forward();
			
			motorB.setSpeed(500);
			motorB.backward();
			
			Delay.msDelay(1000);
			 
	
    int grados; 
 
     double distancia;
     distancia = 5;
     grados =( int ) (distancia *360/ 17);
     motorB.rotate(100,true);
     motorA.rotate(-100);
}
}