import lejos.hardware.Button;


public class PruebaTraductor {

	public static void main(String[] args) {
		Button.waitForAnyPress();

		System.out.println("el mensaje morse es traducido y es =");
		
		Button.waitForAnyPress();

		Button.waitForAnyPress();
		
		String morse= "._";
		Traductor traducir= new Traductor();
		String palabra= traducir.traducirMorse(morse);
		if (palabra== "a"){
		System.out.println(morse +"la traduccion del morse es = "  +palabra);
		}
		Button.waitForAnyPress();
		String Elmorse=" ._ _  . _   _ .";
		palabra= traducir.traducirPalabraMorse(Elmorse);
		if (palabra=="pan"){
			System.out.println(Elmorse + " es traducido el morse y es = "+ palabra );
		}
		Button.waitForAnyPress();
		/*char[] CadenaMorse= {'_' , ' ' , '.' , '_' , ' '};
		palabra = traducir.traducirLacadena(CadenaMorse);
		boolean resultado=(palabra=="ta");*/
		
 		 
		Button.waitForAnyPress();
	}
   
}