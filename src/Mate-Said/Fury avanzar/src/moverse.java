import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.utility.Delay;
public class moverse {

	public static void main(String[] args) {
	EV3LargeRegulatedMotor motorD = new EV3LargeRegulatedMotor(MotorPort.C);
    EV3LargeRegulatedMotor motorI = new EV3LargeRegulatedMotor(MotorPort.B);
    /*motorD.setSpeed(240);
	motorD.forward();
    motorI.setSpeed(240);
    motorI.forward();
    Delay.msDelay(2360);
    motorI.rotate(635, true);
    motorD.rotate(635);
    motorI.stop();
    motorD.stop();
    motorI.rotate(180);
    motorD.rotate(180);
    motorI.stop();
    motorD.stop();*/
    Button.waitForAnyPress();
    /*int D = 0;
    int x = 35;
	D = (360*x)/17; 
    motorI.rotate(D, true);
    motorD.rotate(D);
    motorI.rotate(360);
	motorD.rotate(360);
	motorI.rotate(360,true);
	motorD.rotate(360);
	motorD.rotate(360);
	motorI.rotate(360);
	int D1 = 0;
    int x1 = 120;
	D1 = 360*x1/17; 
    motorI.rotate(D1, true);
    motorD.rotate(D1);*/
	//EV3TouchSensor TouchSensor = new EV3TouchSensor(SensorPort.S4);
    int C = 0;
    int x = 30;
    C = (360*x)/17;
	motorI.rotate(C, true);
	motorD.rotate(C);
	motorI.rotate(370);
	motorD.rotate(C, true);
	motorI.rotate(C);
	motorI.rotate(360);
	motorI.rotate(C, true);
	motorD.rotate(C);
	motorI.rotate(370);
	motorD.rotate(C, true);
	motorI.rotate(C);
    motorD.setSpeed(440);
    motorD.forward();
    motorI.setSpeed(340);
    motorI.forward();
    Delay.msDelay(10000);
    }
}