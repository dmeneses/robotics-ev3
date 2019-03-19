import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;


public class TestRotacion {

	public static void main(String[] args) {
		EV3LargeRegulatedMotor motorDerecho = new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor motorIzquierdo = new EV3LargeRegulatedMotor(MotorPort.C);
		
		Button.waitForAnyPress();

		motorDerecho.rotate(360);
		motorIzquierdo.rotate(360);
		
		Button.waitForAnyPress();
		
		motorDerecho.rotate(360, true);
		motorIzquierdo.rotate(360, true);
		
		Button.waitForAnyPress();
		motorDerecho.rotate(90, true);
		motorIzquierdo.rotate(90,true);
		
		Button.waitForAnyPress();
		motorDerecho.rotate(-90, true);
		motorIzquierdo.rotate(-90,true);
		
		motorDerecho.close();
		motorIzquierdo.close();
		
		Sound.beepSequence();
		Sound.beepSequenceUp();
		Sound.beepSequence();
		
		
		
	}

}
