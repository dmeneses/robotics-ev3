
public class Prueba {

	public static void main(String[] args) {
		 
		// Escriba un programa que dado un numero
		//cualquiera del 1 al 7 muestre los dias de la semana
		//si el numero es 1 el programa debe mostrar
		//domingo, si es 2 lunes, y asi sucesivamente...
		
		
		//declarar una variable del tipo int
		int numero;
		numero=1;
		String nombreDia="";
		//if=para verificar y preguntar
		if(numero==1){
			nombreDia="Lunes";
		}
		else if (numero==2){
			nombreDia="Martes";
		}
		else if (numero==3){
			nombreDia="Miercoles";
		}
		else if (numero==4){
			nombreDia="Jueves";
		}
		else if (numero==5){
			nombreDia="Viernes";
		}
		else if (numero==6){
			nombreDia="Sabado";
		}
		else if (numero==7){
			nombreDia="Domingo";
		}
		//cualquier otro valor
		else{
			nombreDia="No conozco ese dia";
		}
		System.out.print("numero" + numero + nombreDia);
		

	}

}