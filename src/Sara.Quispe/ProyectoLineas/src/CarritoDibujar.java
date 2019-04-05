import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.motor.BaseRegulatedMotor;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.utility.Delay;


public class CarritoDibujar {

	public static void main(String[] args) {
		int numeroTramos=2;
		double distanciaLapizArriba=20;
		double distanciaLapizAbajo=30;		
		 
		EV3LargeRegulatedMotor motorB = new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor motorD = new EV3LargeRegulatedMotor(MotorPort.D);
		EV3LargeRegulatedMotor motorA = new EV3LargeRegulatedMotor(MotorPort.A);
		
		System.out.println("Presiona cualquier boton para inuciar");
		Button .waitForAnyPress();
		Sound.beepSequence();
		
		int grados=180*-1;
		motorA.rotate(grados);
		
		Button.LEDPattern(5);
		
		double distanciaAMover=20;
		 
		int grados1=0;
		double diametroRueda=5.5;
		double circunferencia=Math.PI* diametroRueda;
		double numeroDeRotaciones=distanciaAMover/circunferencia;
		grados1=(int)(numeroDeRotaciones* 360);
		System.out.println("grados"+ grados1);
		
		int velocidad=300;
		motorB.setSpeed(velocidad);
		motorB.rotate(grados1,true);
		motorD.setSpeed(velocidad);
		motorD.rotate(grados1,true);
		Delay.msDelay(1000);
		 
		int grados2=150;
		motorA.rotate(grados);
		
		double distanciaAMover1=20;
		 
		int grados3=0;
		double diametroRueda1=5.5;
		double circunferencia1=Math.PI* diametroRueda1;
		double numeroDeRotaciones1=distanciaAMover1/circunferencia1;
		grados3=(int)(numeroDeRotaciones1* 360);
		System.out.println("grados"+ grados3);
		
		int velocidad1=300;
		motorB.setSpeed(velocidad1);
		motorB.rotate(grados3,true);
		motorD.setSpeed(velocidad1);
		motorD.rotate(grados3,true);
		 
		motorB.stop();
		motorD.stop();
		motorA.stop();
		Sound.beep();
		
		motorB.close();
		motorD.close();
		motorA.close();
		System.out.println("Presiona cualquier boton para terminar");
		 
		 
		 

	}

}
