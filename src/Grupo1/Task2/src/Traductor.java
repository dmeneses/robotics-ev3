
public class Traductor {
	public String traducirMorse(String Morse){
		String laLetra= "a";
		if(laLetra== "a"){
		Morse =laLetra;
		}
	return Morse;
	}
	public String traducirPalabraMorse(String morse2){
		String traducido= "pan";
		if(traducido== "pan"){
			morse2 = traducido;
		}
		
		return morse2 ;
		
	}
 	  
	  public static String convertirOracionAMorse(String oracion) {
	        if (estaVacia(oracion)) {
	            return "";
	        } else {
	            
	            String resultado = "";
	            
	            String palabras[] = oracion.split(" ");

	            for (int i = 0; i < palabras.length; i++) {
	                resultado += convertirMensajeAEspañol (palabras[i]);

	                if (i + 1 < palabras.length)
	                    resultado += " / ";
	            }

	            return resultado;
	        }
	    }

	    public static String convertirMensajeAEspañol(String palabra) {
	        String resultado = "";
	        
	       
	        for (int i = 0; i < palabra.length(); i++) {
	             
	            resultado += convertirCaracterAMorse(palabra.charAt(i));

	            if (i + 1 < palabra.length())
	                resultado += " ";
	        }

	        return resultado;
	    }

	    public static String letrasMorse[] = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
	            "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };

	    public static String numerosMorse[] = { "-----", ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..",
	            "----." };

	    public static String convertirCaracterAMorse(char caracter) {
	       
	        if (Character.isLetter(caracter)) {
	            char caracterMinuscula = Character.toLowerCase(caracter);
	            return letrasMorse[caracterMinuscula - 'a'];
	        } else if (Character.isDigit(caracter)) {
	            return numerosMorse[caracter - '0'];
	        } else {
	            return " ";
	        }
	    }

	    public static boolean estaVacia(String cadena) {
	        for (int i = 0; i < cadena.length(); i++)
	            if (!Character.isWhitespace(cadena.charAt(i)))
	                return false;

	        return true;
	    }
	   
	  {System.out.println(convertirOracionAMorse("clase java  "+ " "));}

   /*  public String traducirLacadena(char[] morse3){
    	char espacio=' ';
    	int guardarEspacio=0;
    	int inicio=0;
    	String resultado= " ";
    	String porcion  = " ";
          for (int i = 0;i<=morse3.length;i++){
        	  if (morse3[i]==' '){
        		  guardarEspacio=i;
        		  for(int j = inicio;j<=guardarEspacio;j++){
        			  porcion= porcion +morse3[j]; 
        		  }
        		  inicio=guardarEspacio +1;
        	  }
        	  resultado=resultado + porcion;
        	  
          }
    	System.out.println(resultado);
    	return resultado;*/
    
}
