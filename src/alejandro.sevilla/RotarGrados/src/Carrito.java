import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.utility.Delay;

//el carrito tiene dos motores
public class Carrito {

	public static void main(String[] args) {
		EV3LargeRegulatedMotor motorDerecho = new EV3LargeRegulatedMotor(MotorPort.C);
		EV3LargeRegulatedMotor motorIzquierdo = new EV3LargeRegulatedMotor(MotorPort.B);
		//quiero moverme 60 cm
		//distancia tiene el valor de 60
		double distanciaAMover = 60;
		//distanciaAMover = distanciaAMover/100;
		//los grados que le paso al rotate
		int grados = 0;
		double diametroRueda = 5.5; //de gomita a gomita en cm
		double circunferencia = Math.PI*diametroRueda;
		double numeroDeRotaciones = distanciaAMover/circunferencia;
		grados = (int)(numeroDeRotaciones*360);
		System.out.println("es" + grados);
		System.out.println("es" + numeroDeRotaciones);
				 
		//calcular cuantos grados
		
		Button.waitForAnyPress();
		Sound.beepSequenceUp();
		int gradosGiro = 400;
		motorDerecho.setSpeed(500);
		motorDerecho.rotate(grados, true);
		motorIzquierdo.setSpeed(500);
		motorIzquierdo.rotate(grados);
		Delay.msDelay(500);
		motorDerecho.rotate(gradosGiro);
		Sound.beepSequenceUp();
		motorDerecho.setSpeed(500);
		motorDerecho.rotate(grados, true);
		motorIzquierdo.setSpeed(500);
		motorIzquierdo.rotate(grados);
		Delay.msDelay(500);
		motorDerecho.rotate(gradosGiro);
		Sound.beepSequenceUp();
		motorDerecho.setSpeed(500);
		motorDerecho.rotate(grados, true);
		motorIzquierdo.setSpeed(500);
		motorIzquierdo.rotate(grados);
		Delay.msDelay(500);
		motorDerecho.rotate(gradosGiro);
		Sound.beepSequenceUp();
		motorDerecho.setSpeed(500);
		motorDerecho.rotate(grados, true);
		motorIzquierdo.setSpeed(500);
		motorIzquierdo.rotate(grados);
		Delay.msDelay(500);
		
		motorDerecho.close();
		motorIzquierdo.close();
		

	}

}
