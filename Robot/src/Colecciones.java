

public class Colecciones 
{
	Robot40 robot1;
	int[] azul;
	int[] rojo;
	int[] verde;
	int[] amarillo;
	
	public Colecciones()
	{	robot1=new Robot40(2.55, 12.3);
		azul =new int[3];
		azul[0]=60;
		azul[1]=-120;
		azul[2]=60;
rojo=new int[3];
rojo[0]=50;
rojo[1]=-70;
rojo[2]=20;

verde=new int[3];
verde[0]=80;
verde[1]=90;
verde[2]=100;

amarillo=new int[3];
amarillo[0]=120;
amarillo[1]=150;
amarillo[2]=200;

}
	
	public void empezar()
	{//boolean entro = false;
		//robot1.avanzarCentimetros(x);
			int nc=robot1.detectarcolor();
			if(nc==2)
			{
				System.out.println("azul");
				robot1.girarGrados(azul[0]);
				robot1.avanzarCentimetros(20);
				robot1.girarGrados(azul[1]);
				robot1.avanzarCentimetros(20);
				robot1.girarGrados(azul[2]);
				int x=robot1.detectardistancia()-3;
				robot1.avanzarCentimetros(x);
				//entro = true;
					
			}
			if(nc==0)
			{
				System.out.println("rojo");
				robot1.girarGrados(rojo[0]);
				robot1.avanzarCentimetros(60);
				robot1.girarGrados(rojo[1]);
				robot1.avanzarCentimetros(60);
				robot1.girarGrados(rojo[2]);
				int x=robot1.detectardistancia();
				robot1.avanzarCentimetros(x);
				//entro = true;
							
			}
			if(nc==1)
			{
				System.out.println("verde");
				robot1.girarGrados(verde[0]);
				robot1.avanzarCentimetros(20);
				robot1.girarGrados(verde[1]);
				robot1.avanzarCentimetros(20);
				robot1.girarGrados(verde[2]);
				int x=robot1.detectardistancia();
				robot1.avanzarCentimetros(x);
				//entro = true;
				
			}
			if(nc==3)
			{
				System.out.println("amarillo");
				robot1.girarGrados(amarillo[0]);
				robot1.avanzarCentimetros(20);
				robot1.girarGrados(amarillo[1]);
				robot1.avanzarCentimetros(20);
				robot1.girarGrados(amarillo[2]);
				int x=robot1.detectardistancia();
				robot1.avanzarCentimetros(x);
				//entro = true;
			}
			
			
			/*if(entro)
			{
				int x=robot1.detectardistancia();
				System.out.println("distancia " + x);
				robot1.avanzarCentimetros(x);
				entro = false;
			}*/
			
		}
	
	}

