import lejos.hardware.Button;
import lejos.hardware.port.MotorPort;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.utility.Delay;

public class pruebaabanzar {

	public static void main(String[] args) {
		EV3LargeRegulatedMotor motorB = new  EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor motorC = new  EV3LargeRegulatedMotor(MotorPort.C);
		
		/*motorB.setSpeed(800);
		motorB.forward();
		
		motorC.setSpeed(800);
		motorC.forward();
		
		Delay.msDelay(5000);
		
		motorB.stop();
		motorC.stop();
		motorC.setSpeed(500);
		motorB.setSpeed(500);
		
		Button.waitForAnyPress();
		 
		double distancia = 50;
		int grados = (int)distancia*360/17;
		motorB.rotate(grados,true);
		motorC.rotate(grados);
		
		Button.waitForAnyPress();
		
		motorB.setSpeed(700);
		motorB.rotate(grados);
		
	    /*distancia = 200;
		grados = (int)distancia*360/17;
		motorB.rotate(grados);
		motorC.rotate(grados);*/
		
		/*sadouble distancia = 57;
		int grados = (int)distancia*360/17;
		motorB.rotate(grados,true);
		motorC.rotate(grados);
		
		
		Button.waitForAnyPress();
		
		distancia = 0;
	    grados = 400;
		motorB.rotate(grados);
		
		Button.waitForAnyPress();
		
		distancia = 57;
		grados = (int)distancia*360/17;
		motorB.rotate(grados,true);
		motorC.rotate(grados);
		
		
		Button.waitForAnyPress();
		
		distancia = 0;
	    grados = 400;
		motorB.rotate(grados);
		
		Button.waitForAnyPress();
		
		distancia = 57;
		grados = (int)distancia*360/17;
		motorB.rotate(grados,true);
		motorC.rotate(grados);
		
		
		Button.waitForAnyPress();
		
		distancia = 0;
	    grados = 400;
		motorB.rotate(grados);
		
		Button.waitForAnyPress();
		
		distancia = 57;
		grados = (int)distancia*360/17;
		motorB.rotate(grados,true);
		motorC.rotate(grados);
		
		
		Button.waitForAnyPress();
		
		distancia = 0;
	    grados = 400;
		motorB.rotate(grados);
		
		Button.waitForAnyPress();
		
	    distancia = 57;
	    grados = (int)distancia*360/17;
		motorB.rotate(grados,true);
		motorC.rotate(grados);sa*/
		
		Button.waitForAnyPress();
		
		double distancia = 59;
		int grados = (int)distancia*360/17;
		motorB.rotate(grados,true);
		motorC.rotate(grados);
		
	    distancia = 17;
	    grados = (int)distancia*360/17;
		motorB.rotate(grados);
		
		distancia = 59;
	    grados = (int)distancia*360/17;
		motorB.rotate(grados,true);
		motorC.rotate(grados);
		
	    distancia = 17;
	    grados = (int)distancia*360/17;
		motorB.rotate(grados);
		
		distancia = 59;
	    grados = (int)distancia*360/17;
		motorB.rotate(grados,true);
		motorC.rotate(grados);
		
	    distancia = 17;
	    grados = (int)distancia*360/17;
		motorB.rotate(grados);
		
		distancia = 59;
	    grados = (int)distancia*360/17;
		motorB.rotate(grados,true);
		motorC.rotate(grados);
		
	    distancia = 17;
	    grados = (int)distancia*360/17;
		motorB.rotate(grados);
	
		
		
		
	}

}