import lejos.hardware.Button;

import lejos.utility.Delay;

public class Zumillo {
	public static void main(String[] args) {
		Zumilloo fury = new Zumilloo();
		Button.waitForAnyPress();
	    Delay.msDelay(3000);
		
		fury.verCancha();	
		
	}
}