
public class Robot 
{	
	Acciones acb = new Acciones();
	
	String colorA;
	public String avisarColor()
	 {
		boolean colorNoConocido = true;
		String colorA = "";
		while(colorNoConocido){
		int numero = acb.detectarColor();
		
			System.out.println(numero);
			
			 
			 if(acb.detectarColor() == 0)
			 {
				 colorA = "Rojo";
				 colorNoConocido = false;
			 }	
			
		}
		
		 return colorA;
	 }
	
	public void avanzarRojo()
	{
		
		int color = acb.detectarColor();
		
		if(color == 0)
		{
			
			acb.girar(34);
			acb.avanzar(30);
			acb.girar(-50);
			acb.avanzar(30);
			acb.girar(40);
			int g = acb.detectarDistancia();
			acb.avanzar(g);
			
			
		}
	}
	 

}
