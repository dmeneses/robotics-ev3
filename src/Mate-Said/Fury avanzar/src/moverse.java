import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;

public class moverse {

	public static void main(String[] args) {
	EV3LargeRegulatedMotor motorI = new EV3LargeRegulatedMotor(MotorPort.C);
    EV3LargeRegulatedMotor motorD = new EV3LargeRegulatedMotor(MotorPort.B);
	motorI.setSpeed(10);
    motorI.forward();
    motorD.setSpeed(640);
    motorD.forward();
    Delay.msDelay(9999);
	}

}