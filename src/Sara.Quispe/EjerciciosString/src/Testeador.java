
 public class Testeador {

	public static void main(String[] args) {
		// declaramos una variable del tipo ConvertidorString
		ConvertidorString convertidor = new ConvertidorString();
		
		String palabra = "hola Maria, como estas 1234#.......";
		
		// char[]--> cada de los elementos es un char  
		char[] arreglo = convertidor.convertirStringEnArreglo(palabra);
		for(int piso=0; piso < arreglo.length; piso = piso + 1)
		{
			System.out.println(arreglo[piso]);
		}
		
		// 2. codificar un mensaje
		char letraABuscar = 'a';
		char cambiarPor = '#';
		char[] codificar=convertidor.codificarPalabra(palabra, letraABuscar, cambiarPor);
		
		// String desde un char[]
		String aPartirDeArreglo = new String(codificar);
		System.out.println(aPartirDeArreglo);
		
		// char[] a partir de un String  (forma directa
		char[] miArreglo = aPartirDeArreglo.toCharArray();
		for(int piso=0; piso < miArreglo.length; piso = piso + 1)
		{
			System.out.println(miArreglo[piso]);
		}
		
		// 3. Codificar mensaje con mas de 1 valor para buscar y reemplazar
		char[] letrasBusqueda = {'a', 'z', '1', 'T'};
		char[] letrasReemplazo = {'A', 'Z', '#', '.'};
		String miPalabra = "la ecuacion respuesTa es: z = z + T111;";
		String palabraCodificada = convertidor.codificar(miPalabra, letrasBusqueda, letrasReemplazo);
		
		// 4. Escribir codigo que convierta una palabra a morse
		String textoNormal = "aeiou";
		String textoMorse = convertidor.convertirAMorse(textoNormal);
		if (textoMorse == ".- . .. --- ..-")
		{
			System.out.print("textoNormal="+ textoNormal);
			System.out.print(" en morse es textoMorse="+ textoMorse);
		}
		
	}

}
