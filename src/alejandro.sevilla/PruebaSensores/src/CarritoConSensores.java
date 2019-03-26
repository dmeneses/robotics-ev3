import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;


public class CarritoConSensores {

	public static void main(String[] args) {
		// mi carrito tiene dos motores declarar las variables de motores
		EV3LargeRegulatedMotor motorD;
		motorD = new EV3LargeRegulatedMotor(MotorPort.C);
		
		EV3LargeRegulatedMotor motorI = new EV3LargeRegulatedMotor(MotorPort.B);
		
		//LE DECIMOS QUE TIENE UN SENSOR
		EV3TouchSensor sensorTouch;
		sensorTouch = new EV3TouchSensor(SensorPort.S1);
		//capturar lo que el sensor detecto
		SampleProvider muestrasCapturadasTouch = sensorTouch.getTouchMode();
	
		//usamos la condicional boolean tiene dos valores (si ,no)
		boolean sensorTouchDetectoToque = false;
		// mientras el sensor no detecte toque 
		//esperamos a que ocurra algo
		//o que cambia a true
		while (sensorTouchDetectoToque == false ){
			System.out.println("esperando a que pase algo");
			
			//creamos una contenedora para recibir los datos del sensor
			float[] datosDelSensor = new float[muestrasCapturadasTouch.sampleSize()];
			
			//le pido al sensor lo que haya detectado
			muestrasCapturadasTouch.fetchSample(datosDelSensor, 0);
			//analizar datos del sensor
			//preguntar si el dato enviado porel sensor
			//preguntar  si el valor preguntamos si la condicional se cumple o no
			if (datosDelSensor[0] == 0){
				System.out.println("o equivale a que no hubo toque");
			}
			//preguntar si el valor es diferente a 0
			if (datosDelSensor[0]!= 0){
				System.out.println(datosDelSensor[0] + "equivale a que hubo toque");
				sensorTouchDetectoToque = true;
			}
			
		}
		System.out.println("deje de esperar");
	
		
		//Si detectamos que se presiono el touch entonce hacer que el carro gire 120*60
		if (sensorTouchDetectoToque == true){
			
			double distanciaAMover = 120;
			double distanciaAMover2 = 60;
			int grados = 0;
			double diametroRueda = 5.5; //de gomita a gomita en cm
			double circunferencia = Math.PI*diametroRueda;
			double numeroDeRotaciones = distanciaAMover/circunferencia;
			grados = (int)(numeroDeRotaciones*360);
			//los grados que le paso al rotate
			int grados2 = 0;
			double diametroRueda2 = 5.5; //de gomita a gomita en cm
			double circunferencia2 = Math.PI*diametroRueda2;
			double numeroDeRotaciones2 = distanciaAMover2/circunferencia2;
			grados2 = (int)(numeroDeRotaciones2*360);
			//System.out.println("es" + grados);
			//System.out.println("es" + numeroDeRotaciones);
			// mover motores
			int gradosGiro = 400;
			motorD.setSpeed(500);
			motorD.rotate(grados2, true);
			motorI.setSpeed(500);
			motorI.rotate(grados2);
			motorD.stop();
			motorD.rotate(gradosGiro);
			Sound.beepSequenceUp();
			
			motorD.setSpeed(500);
			motorD.rotate(grados, true);
			motorI.setSpeed(500);
			motorI.rotate(grados);
			motorD.stop();
			motorD.rotate(gradosGiro);
			Sound.beepSequenceUp();
			
			motorD.setSpeed(500);
			motorD.rotate(grados2, true);
			motorI.setSpeed(500);
			motorI.rotate(grados2);
			motorD.stop();
			motorD.rotate(gradosGiro);
			Sound.beepSequenceUp();
			
			motorD.setSpeed(500);
			motorD.rotate(grados, true);
			motorI.setSpeed(500);
			motorI.rotate(grados);
			motorD.stop();
			motorD.rotate(gradosGiro);
			Sound.beepSequenceUp();
			
			
		}
		
		//cerrar el programa
		System.out.println("esperando para cerrar motores");
		Button.waitForAnyPress();
		motorD.close();
		motorI.close();
		}
				//describir el rectangulo
	}

