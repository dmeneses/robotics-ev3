import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;


 
public class PruebaRobot {
	public static void main(String[] args) {
		
		
		EV3LargeRegulatedMotor motorB = new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor motorD = new EV3LargeRegulatedMotor(MotorPort.D);
		EV3LargeRegulatedMotor lapiz = new EV3LargeRegulatedMotor(MotorPort.A);
		
		 
		Robot robot = new Robot();
		boolean terminarCodigo = false;
		char[] codigoEnMorse = new char[200];
		int contadorCaracter = 0;
		while (terminarCodigo  == false) {
			terminarCodigo = robot.pedirDatosAlPulsadorTerminar();
			//System.out.println("terminarCodigo =" +  terminarCodigo);
			char caracter = robot.pedirDatosAlPulsadorCodigo();
			//System.out.println("caracter =" +  caracter);
			codigoEnMorse[contadorCaracter] = caracter;
			contadorCaracter = contadorCaracter + 1;
		}
		System.out.println("Termine de ingresar codigo Morse");
		for(int i = 0; i < codigoEnMorse.length; i = i+1){
			System.out.println(codigoEnMorse[i]);
		}
		TraductorMorse traductor = new TraductorMorse();
		String enEspaniol = traductor.convertirAEspaniol(codigoEnMorse);
		System.out.println(enEspaniol);
		robot.dibujarMorse(codigoEnMorse);
		 
		  Lapiz DibujarMorse= new  Lapiz();
	}

	 
	
	
	

}