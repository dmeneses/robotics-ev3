import lejos.hardware.Button;


public class Pruebas {

	public static void main(String[] args)
	{
		Letra letra1;
		String letra = "";
		String traduccion = "";
		letra1 = new Letra(1);
		
		
		letra = letra1.insertarletra();
		System.out.println(letra);
		
		traduccion = letra1.traducirletra();
		System.out.println(traduccion);
		
		System.out.println("Siguiente");
		
		letra = letra1.insertarletra();
		System.out.println(letra);
		
		traduccion =  traduccion + letra1.traducirletra();
		System.out.println(traduccion);
		
		System.out.println("Siguiente");
		Button.waitForAnyPress();
		
		
		
		
		
		/*int[] col = {1,2,3};
		int val = col[0];
		String cadena = "hola";
		for(int i=0; i<cadena.length(); i++) System.out.println(i + ":" + cadena.charAt(i));*/
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