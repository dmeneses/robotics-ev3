import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;

//el carrito tiene dos motores
public class Carrito {

	public static void main(String[] args) {
		EV3LargeRegulatedMotor motorDerecho = new EV3LargeRegulatedMotor(MotorPort.C);
		EV3LargeRegulatedMotor motorIzquierdo = new EV3LargeRegulatedMotor(MotorPort.B);
		//quiero moverme 60 cm
		//distancia tiene el valor de 60
		double distanciaAMover = 60;
		distanciaAMover = distanciaAMover/100;
		//los grados que le paso al rotate
		int grados = 0;
		double diametroRueda = 5.5/100; //de gomita a gomita en cm
		double circunferencia = Math.PI*diametroRueda;
		double numeroDeRotaciones = distanciaAMover/circunferencia;
		grados = (int)(numeroDeRotaciones*360);
		System.out.println("es" + grados);
				 
		//calcular cuantos grados
		
		Button.waitForAnyPress();
		motorDerecho.rotate(grados,true);
		motorIzquierdo.rotate(grados,true);
		
		motorDerecho.close();
		motorIzquierdo.close();
		

	}

}
