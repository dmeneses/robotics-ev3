package afedo3;

import lejos.hardware.Button;

public class Inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //Pato pato1;
      //pato1 = new Pato(2.5, 12.5);
      //pato1.avanzarCentimetros(20);
      //pato1.avanzarCentimetros(30);  
      //pato1.avanzarCentimetros(20);
      //pato1.avanzarCentimetros(-54);
      // repetir hasta detectar pulsador en 1     
      /*while (true)
      {
    	  //si pulsador en 1 avanzar distancia detectada
    	  if (pato1.detectarPulsador()==1)
    	  {
    		  
			int x=pato1.detectarDistancia();
			System.out.println("Distancia " + x);
			pato1.avanzarCentimetros(x);
    	  }
      }*/
      //pato1.dibujarTriangulo(50);
	  Array ar = new Array();
	  ar.jugar();
      Button.waitForAnyPress();
	}

}