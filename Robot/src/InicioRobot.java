
public class InicioRobot 
{
	public static void main(String[] args) 
	{
		Robot40 Robot1;
		Robot1= new Robot40(2.5, 12.5);
		//Robot1.avanzarCentimetros(587);
		//Robot1.avanzarCentimetros(260);
		//Robot1.avanzarCentimetros(40);
		//Robot1.avanzarCentimetros(120);
		//Robot1.avanzarCentimetros(-320);)
		
		//repetir hasta detectar pulsador 1
		while (true)
		{
			
			if(Robot1.detectarPulsador()==1){
				int x= Robot1.detectardistancia();
					
			}
		}
		
		
	}
}
