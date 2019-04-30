
public class PruebaCarro {

	public static void main(String[] args) {
		float colorRojo = 0.0f;
		float colorAzul = 2.0f;
		float colorVerde = 1.0f;
		int[] gradosRojo = { 90, -334, 260 };
		int[] gradosAzul = { 330, -350, 110 };
		int[] gradosVerde = { -180, 510, -310 };
		double distanciaFijaRecorrido = 30;// centimetros

		Carro carritoSara = new Carro();
		boolean detecteColor = false;
		float colorDetectado = 0;
		while (detecteColor == false) {
			colorDetectado = carritoSara.detectarColor();
			if (colorDetectado == colorRojo || colorDetectado != colorRojo
					|| colorDetectado != colorAzul
					|| colorDetectado != colorVerde) {
				colorDetectado = carritoSara.detectarColor();
				detecteColor = true;
			}

			if (colorDetectado == colorRojo) {
				for (int piso = 0; piso < 3; piso = piso + 1) {
					int grado = gradosRojo[piso];
					carritoSara.girar(grado);
					carritoSara.avanzar(distanciaFijaRecorrido);
				}
			}

			else if (colorDetectado == colorVerde) {
				for (int piso = 0; piso < 3; piso = piso + 1) {
					int grado = gradosVerde[piso];
					carritoSara.girar(grado);
					carritoSara.avanzar(distanciaFijaRecorrido);
				}
			} else if (colorDetectado == colorAzul) {
				for (int piso = 0; piso < 3; piso = piso + 1) {
					int grado = gradosAzul[piso];
					carritoSara.girar(grado);
					carritoSara.avanzar(distanciaFijaRecorrido);
				}
			}
			boolean detecteSiguiente = false;
			double distanciaDetectada = 0;
			while (detecteSiguiente == false) {
				distanciaDetectada = carritoSara.detectarObstaculo();
				detecteSiguiente = true;
				carritoSara.detectarObstaculo();
			}
		}
	}

}
