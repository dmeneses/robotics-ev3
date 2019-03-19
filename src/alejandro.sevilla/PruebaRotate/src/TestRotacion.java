import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;


public class TestRotacion {

	public static void main(String[] args) {
		EV3LargeRegulatedMotor motorDerecho = new EV3LargeRegulatedMotor(MotorPort.C);
		EV3LargeRegulatedMotor motorIzquierdo = new EV3LargeRegulatedMotor(MotorPort.B);
		//HACER QUE LOS MOTORES ROTEN 360
		Button.waitForAnyPress();
		motorDerecho.rotate(360);
		motorIzquierdo.rotate(360);
		
		Button.waitForAnyPress();
		motorDerecho.rotate(360,true);
		motorIzquierdo.rotate(360,true);
		
		Button.waitForAnyPress();
		motorDerecho.rotate(170,true);
		motorIzquierdo.rotate(170,true);
		
		Button.waitForAnyPress();
		motorDerecho.rotate(-170,true);
		motorIzquierdo.rotate(-170,true);
		
		motorDerecho.close();
		motorIzquierdo.close();

	}

}
