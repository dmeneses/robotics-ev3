

public class Auto {
int numeroventanas ;
String color ;
String marca;
double velocidad;
boolean estaensendido;
public Auto (String uncolor,String unamarca,int vel,boolean aranque){
	
	color = uncolor;
	marca=unamarca;
	velocidad = vel;
	estaensendido= aranque;
}
public void arancarAuto()
{
estaensendido= true;
System.out.println("rum");


}
public String obtenercolor(){
	
	System.out.println(color);
	return color;
	
	
	
}
public double acelerar(double ac)
{
	velocidad=(velocidad +ac);

return velocidad;
}
}
