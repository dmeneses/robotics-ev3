
public class TraductorMorse {
	
			public static String convertirAEspaniol( codigoEnMorse) {
				String mensaje;
				String letras = "abcdefghijklmnopqrstuvwxyz";
				mensaje = mensaje.toLowerCase();
				String codigo[] = new String[60];
				String slash = "/";
				String morse = " ";
				codigo[0] = ".-";
				codigo[1] = "-...";
				codigo[2] = "-.-.";
				codigo[3] = "-..";
				codigo[4] = ".";
				codigo[5] = "..-.";
				codigo[6] = "--.";
				codigo[7] = "....";
				codigo[8] = "..";
				codigo[9] = ".---";
				codigo[10] = " ";
				for (int i = 0; i < mensaje.length(); i++) {
					if (mensaje.charAt(i) == ' ')
						morse = morse + slash + ' ';
					else {
						for (int j = 0; j < letras.length(); j++) {
							if (mensaje.charAt(i) == letras.charAt(j))
								morse = morse + codigo[j] + ' ';
						}
					}
				}
				return morse = morse.substring(1, morse.length());
			}
			
			public static String traducirMorse(String mensaje) {
				String letras = "abcdefghijklmnopqrstuvwxyz ";
				String codigo[] = new String[60];
				String morse = " ";
				codigo[0] = ".-";
				codigo[1] = "-...";
				codigo[2] = "-.-.";
				codigo[3] = "-..";
				codigo[4] = ".";
				codigo[5] = "..-.";
				codigo[6] = "--.";
				codigo[7] = "....";
				codigo[8] = "..";
				codigo[9] = ".---";
		        codigo[10] = "/";
				String oracion[] = mensaje.split(" ");
				int max = oracion.length;
				for (int i = 0; i < max; i++) {
					for (int j = 0; j < 60; j++)
						if (oracion[i].equals(codigo[j])) {
							morse = morse + letras.charAt(j);
							break;
						}
				}
				return morse = morse.substring(1, morse.length());
			}

}