
public class Pruebita {

	public static void main(String[] args) {
		// escriba un programa
		
		int numero ;
		numero = 7;
		String nombreDia = "";
		if (numero == 1){
			nombreDia = "lunes" ;	
		}
		else if (numero == 2){
			nombreDia = "martes";
		}
		
		else if (numero == 3 ){
			nombreDia = "miercoles";
		}
		else if (numero == 4){
			nombreDia = "jueves";
		}
		else if (numero == 5){
			nombreDia = "viernes";
		}
		else if (numero == 6){
			nombreDia = "sabado";
		}
		else if (numero == 7){
			nombreDia = "domingo";
		}
		else{
			nombreDia = "no se conoce ese dia";
		}
		System.out.println("numero "+ numero + " es el dia "+ nombreDia);
		}

	}


