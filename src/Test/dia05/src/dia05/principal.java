package dia05;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Auto carro = new Auto("rojo", "nissan", 1, 80, true, "Rojo", 50);
      Auto peta = new Auto("blanco", "volkswagen", 5, 20, false, "Azul", 70);
      String[] lista = { "ultrasonicSensor", "touchSensor", "tr" };
      Robo bowser = new Robo(peta, lista);
      
      carro.arrancarAuto();
      peta.arrancarAuto();
      carro.devolverunColor();
     
      bowser.encenderAuto();
      bowser.mostrarLista();
      
      //double velocidad = peta.acelerar(10);
	}

}
