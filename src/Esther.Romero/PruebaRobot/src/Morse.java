
public class Morse {
	String convertirAMorse(String codigoMorse) {
		 /*String vacio = ""; String[] codigo = {"._", "_..."}; String[]
		 abecedario = {"a", "b"};
		 
		 ArrayList<String> morse = morse.split(" ");
		 
		 arreglo = {"._.", ".._", ".."}*/
			
		
		String vacio = "";
		for (int i = 0; i < 200; i = i + 1) {
			
		}

		switch (codigoMorse) {
		case "._":
			vacio = vacio + 'A';
			break;
		case "_...":
			vacio = vacio + 'B';
			break;
		case "_._.":
			vacio = vacio + 'C';
			break;
		case "_..":
			vacio = vacio + 'D';
			break;
		case ".":
			vacio = vacio + 'E';
			break;
		case ".._.":
			vacio = vacio + 'F';
			break;
		case "__.":
			vacio = vacio + 'G';
			break;
		case "....":
			vacio = vacio + 'H';
			break;
		case "..":
			vacio = vacio + 'I';
			break;
		case ".___":
			vacio = vacio + 'J';
			break;
		case "_._":
			vacio = vacio + 'K';
			break;
		case "._..":
			vacio = vacio + 'L';
			break;
		case "__":
			vacio = vacio + 'M';
			break;
		case "_.":
			vacio = vacio + 'N';
			break;
		case "___":
			vacio = vacio + 'O';
			break;
		case ".__.":
			vacio = vacio + 'P';
			break;
		case "__._":
			vacio = vacio + 'Q';
			break;
		case "._.":
			vacio = vacio + 'R';
			break;
		case "...":
			vacio = vacio + 'S';
			break;
		case "_":
			vacio = vacio + 'T';
			break;
		case ".._":
			vacio = vacio + 'U';
			break;
		case "..._":
			vacio = vacio + 'V';
			break;
		case ".__":
			vacio = vacio + 'W';
			break;
		case "_.._":
			vacio = vacio + 'X';
			break;
		case "_.__":
			vacio = vacio + 'Y';
			break;
		case "__..":
			vacio = vacio + 'Z';
			break;
		default:
			vacio = vacio + codigoMorse;

			break;
		}
		for(int piso = 0; piso < 200; piso = piso +1 )
		{
			char caracter = vacio.charAt(piso);
		}
		return vacio;
	}
}