import lejos.hardware.Button;


public class Letra 
{
	
	Telegrafo telegrafo1;
	int t = 1;
	String letra = "";

public Letra(int t)
{
	telegrafo1 = new Telegrafo();
	t=1;
}

public String insertarletra(int t, String Letra)
{
	while(t==1)
	{

			int simbolo = telegrafo1.insertarmorse();

			System.out.println("Sim: " + simbolo);


			if(simbolo==0)
			{
				System.out.println("error");
			}
			else
			{
				if (simbolo == 3)
				{
					System.out.println("Letra: completa");
					t=2;
					
				}
				else
				{
					letra = letra + simbolo;
				}
			}
			//Button.waitForAnyPress();
			
			System.out.println("Letra: " + letra);
			
			Button.waitForAnyPress();
			
	}
	letra = letra + "3";
	Button.waitForAnyPress();
	return letra;
}
}