import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;


public class avanzar {

	public static void main(String[] args) {
		EV3LargeRegulatedMotor motorA=new  EV3LargeRegulatedMotor(MotorPort.A);
		EV3LargeRegulatedMotor motorD=new  EV3LargeRegulatedMotor(MotorPort.D);
		Button.waitForAnyPress();
		
		motorA.forward();
		motorD.forward();
		
		motorA.stop();
		motorD.stop();
		
        double distanciaCM = 8; 
		int grados = 0;
		double diametroRueda = 5.5;
		double circunferencia = Math.PI * diametroRueda;
		double numeroDeRotaciones = distanciaCM * circunferencia;
		grados = (int) (numeroDeRotaciones * 360);

		
		int velocidad = 850;
		motorA.setSpeed(velocidad);
		motorA.rotate(grados, true);
		motorD.setSpeed(velocidad);
		motorD.rotate(grados);
		Delay.msDelay(200);
		Delay.msDelay(200);
		motorA.stop();
		motorD.stop();
		Button.waitForAnyPress(); 
	}

}
