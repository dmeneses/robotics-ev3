
public class Colores {

	int[] colorrojo;
	int[] colorverde;
	int[] colorazul;
	int[] coloramarillo;
	public Colores(int[]rojo,int[] azul,int[] verde,int[] amarillo)
	{
	colorrojo=rojo;
	colorverde=verde;
	colorazul=azul;
	coloramarillo=amarillo;
	}
	public int[] elegirRuta(String color)		
	{
		int[] giros = {};
	
		if (color == "rojo"){
			giros = colorrojo;
		}
		int[] giros1;
		if (color == "verde"){
			giros = colorverde;
		}
		int[] giros2;
		if (color == "azul"){
			giros1 = colorazul;
		}
		int[] giros3;
		if (color == "amarillo"){
			giros = coloramarillo;
		}
		
		return giros;
	}	
		
		
	}
