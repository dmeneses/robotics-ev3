package ejercicios;

import java.text.SimpleDateFormat;

public class numero {

	public static void main(String[] args) {
		numero fechaActual = new numero();
		    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		    String hoy = formato.format(2019);
		    String fecha_nac = "1995";
			String[] dat1 = fecha_nac.split("/");
		    String[] dat2 = hoy.split("/");
		    int años = Integer.parseInt(dat2[2]) - Integer.parseInt(dat1[2]);
		    int mes = Integer.parseInt(dat2[1]) - Integer.parseInt(dat1[1]);
		    if (mes < 0) {
		      años = años - 1;
		    } else if (mes == 0) {
		      int dia = Integer.parseInt(dat2[0]) - Integer.parseInt(dat1[0]);
		      if (dia > 0) {
		        años = años - 1;
		      }
		    }
		    System.out.println("años");
		    return;
		  }
		 
		
		/*int Jose;
		
		Jose = Año1;
	
	        Año1 = 1995;
	        Año2 = 2019;  
	 
	        System.out.println("Jose tiene en: ");
	        System.out.println("Jose tiene en: ");
	        */
	
	
	}


