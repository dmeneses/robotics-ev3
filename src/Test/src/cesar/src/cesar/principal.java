package cesar;

import lejos.hardware.Button;
import lejos.utility.Delay;

public class principal {
	public static void main (String [] args){
		//EV3LargeRegulatedMotor motorA = new EV3LargeRegulatedMotor(MotorPort.B);
		//EV3LargeRegulatedMotor motorB = new EV3LargeRegulatedMotor(MotorPort.C);
	    
		Robot enigma = new Robot();
		//Button.waitForAnyPress();
		//Delay.msDelay(3000);
		enigma.vuelta();
		enigma.seguirencancha();
		enigma.buscarEnemigo();
	
		//enigma.retrocederatacar();
}
}