import lejos.hardware.Button;


public class Pruebas {

	public static void main(String[] args)
	{
		Letra letra1;
		String palabra = "";
		letra1 = new Letra(1);
		
		letra1.insertarletra(1, "");
		palabra = letra1.insertarletra(2, "");
		System.out.println(palabra);
		System.out.println("Siguiente");
		letra1.insertarletra(1, "");
		palabra = letra1.insertarletra(2, "");
		System.out.println(palabra);
		System.out.println("Siguiente");
		Button.waitForAnyPress();
		/*
		simbs 
		
		0 .
		1 .
		2 .
		3 
		4 -

		palabrasimbs
		
		"... -"
		*/
		
	}
	

}
