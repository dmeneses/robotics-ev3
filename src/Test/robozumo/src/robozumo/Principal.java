package robozumo;

import lejos.hardware.Button;
import lejos.utility.Delay;

public class Principal 
{

	public static void main(String[] args) 
	{
		Zumo kamizake = new Zumo();
		
		Button.waitForAnyPress();
		Delay.msDelay(3000);
		
		while(true)
		{
			
			kamizake.Atacar();
			//kamizake.contrAtaque();
			
		}
		
		
		
				

	}

}
