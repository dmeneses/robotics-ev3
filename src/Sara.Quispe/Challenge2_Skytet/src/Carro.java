import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;


public class Carro {
	EV3ColorSensor sensorColor=new EV3ColorSensor(SensorPort.S1);
	EV3UltrasonicSensor ultrasonic=new EV3UltrasonicSensor(SensorPort.S2);
	EV3LargeRegulatedMotor motorB = new EV3LargeRegulatedMotor(MotorPort.B);
	EV3LargeRegulatedMotor motorD = new EV3LargeRegulatedMotor(MotorPort.D);
	SampleProvider muestrasCapturadas=ultrasonic.getDistanceMode();
	
	//double diametroRueda=5.5;
	 
	public float detectarColor(){
		
		SampleProvider muestrasCapturadasColor= sensorColor.getColorIDMode();
		float[]datosDelSensor=new float [muestrasCapturadasColor.sampleSize()];
		muestrasCapturadasColor.fetchSample(datosDelSensor,0);
		float color=datosDelSensor[0];
		System.out.println("color="+ color);
		return color;
	}
	public void avanzar(double distancia){
		
	}
	
	public void girar(int grados){
		
		//girar usando el valor de la variable gradogiro
	}
	

		
	public double detectarObstaculo(){
			 
		float distanciaAlObstaculo = Float.POSITIVE_INFINITY/2;
			while (distanciaAlObstaculo == Float.POSITIVE_INFINITY){
				float [] datosOjitos=new float[muestrasCapturadas.sampleSize()];
				muestrasCapturadas.fetchSample(datosOjitos,0);
				distanciaAlObstaculo=datosOjitos[0];
				
				distanciaAlObstaculo=Float.POSITIVE_INFINITY;
				
				double distanciaCM = distanciaAlObstaculo*100;
				
				int grados=0;
				double diametroRueda=5.5;
				double circunferencia=Math.PI* diametroRueda;
				double numeroDeRotaciones=distanciaCM/circunferencia;
				grados=(int)(numeroDeRotaciones* 360);
				
			
				int velocidad=500;
				motorB.setSpeed(velocidad);
				motorB.rotate(grados,true);
				motorD.setSpeed(velocidad);
				motorD.rotate(grados);
				
				motorB.stop();
				motorD.stop();
				
				motorB.close();
				motorD.close();
				
				
				return distanciaAlObstaculo;
			}
			return distanciaAlObstaculo;
		 
		}
		 
		 

}
