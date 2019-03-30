import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3GyroSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;


public class JuniorEV3 {

	public static void main(String[] args) {
		//inicializamos motores 
		EV3GyroSensor lineaRecta = new EV3GyroSensor(SensorPort.S2);
		EV3LargeRegulatedMotor motorD = new EV3LargeRegulatedMotor(MotorPort.C);
		EV3LargeRegulatedMotor motorI = new EV3LargeRegulatedMotor(MotorPort.B);
		EV3TouchSensor sensorTouch  = new EV3TouchSensor(SensorPort.S1);
		EV3UltrasonicSensor ojitos = new EV3UltrasonicSensor(SensorPort.S4);
		//capturar lo que el sensor detecto
		SampleProvider muestrasCapturadasTouch = sensorTouch.getTouchMode();
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
		
				sensorTouchDetectoToque = true;
			}
			
		}
		
	
		if (sensorTouchDetectoToque == true){
			
			
			Sound.beepSequence();
			//sensor preparate para sacar fotos
			SampleProvider muestrasCapturadasOjitos = ojitos.getDistanceMode();
			
			float distanciaAlObstaculo = Float.POSITIVE_INFINITY;
			//captura mientras la distancia al obstaculo sea 0
			
			while(distanciaAlObstaculo == Float.POSITIVE_INFINITY){
				//float[] datosOjitos = new float [muestrasCapturadasOjitos.sampleSize()];
				//muestrasCapturadasOjitos.fetchSample(datosOjitos, 0);
				//distanciaAlObstaculo = datosOjitos[0];
				//System.out.println("dato enviado por el sensor ="+ distanciaAlObstaculo);	
				if(distanciaAlObstaculo == Float.POSITIVE_INFINITY){
					
					double distanciaInfinty = 35;
					int gradosI = 0;
					double diametroRueda = 5.5;
					double circunferencia = Math.PI*diametroRueda;
					double numeroDeRotaciones = distanciaInfinty /circunferencia;
					gradosI = (int)(numeroDeRotaciones*360);
					
					motorD.setSpeed(300);
					motorD.rotate(gradosI, true);
					motorI.setSpeed(300);
					motorI.rotate(gradosI);
					
					float[] datosOjitos = new float [muestrasCapturadasOjitos.sampleSize()];
					muestrasCapturadasOjitos.fetchSample(datosOjitos, 0);
					distanciaAlObstaculo = datosOjitos[0];
					System.out.println("dato enviado por el sensor ="+ distanciaAlObstaculo);
				}
				
			}
			double distanciaCM = distanciaAlObstaculo*100;
			int grados = 0;
			double diametroRueda = 5.5;
			
			double circunferencia = Math.PI*diametroRueda;
			double numeroDeRotaciones = distanciaCM /circunferencia;
			grados = (int)(numeroDeRotaciones*340);

			Sound.beepSequenceUp();
		
			
			motorD.setSpeed(300);
			motorD.rotate(grados, true);
			motorI.setSpeed(300);
			motorI.rotate(grados);
				
			ojitos.close();
			motorD.close();
			motorI.close();
			lineaRecta.close();
			
			Sound.beepSequence();
			Button.waitForAnyPress();
					
				
			
		}

	}

}
