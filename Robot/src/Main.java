import lejos.hardware.Button;


public class Main 
{

	public static void main(String[] args)
	{
		//11.35
		Robot robot1;
		robot1 = new Robot(2.75,12);
		
		while(true)
		{
			robot1.girargrados(90);
			Button.waitForAnyPress();
		}
			
			//robot1.avanzarcm(55);
			//robot1.avanzarcm(55);
			//robot1.avanzarcm(55);
		
		////robot1.dibujarTriangulo(40);
		
		
			//repetir detectar pulsador en 1
		//	while (true)
			//{//si pulsador det avanzar dist detectada
		//		if (robot1.detectarpulsador()==1)
				//{
					//int x= robot1.detectardistancia();
					//robot1.avanzarcm(x);
				
				//}
			//}

	}

}