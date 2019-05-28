import lejos.hardware.Sound;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;

 
public class Clase2 {
	EV3ColorSensor sensorColor= new  EV3ColorSensor(SensorPort.S1);
	EV3UltrasonicSensor ojitos= new EV3UltrasonicSensor(SensorPort.S4);
	EV3LargeRegulatedMotor motorA=new  EV3LargeRegulatedMotor(MotorPort.B);
	EV3LargeRegulatedMotor motorD=new  EV3LargeRegulatedMotor(MotorPort.D);
	EV3LargeRegulatedMotor motorlapiz = new EV3LargeRegulatedMotor(MotorPort.C );
	int distancia1 = 80;
	 double diametrorueda=5.5;
	double circunferencia=Math.PI*diametrorueda;
 
	
	public  float detectarColor() {
		SampleProvider muestrasCapturadasColor = sensorColor.getColorIDMode();
		float[] datosDelSensor = new float[muestrasCapturadasColor.sampleSize()];
		muestrasCapturadasColor.fetchSample(datosDelSensor, 0);
		float color = datosDelSensor[0];
		System.out.println("color=" + color);
		 
		return color;  
	}

	public void avanzar() {
		double diametrorueda=5.5;
		double circunferencia=Math.PI* diametrorueda;
		double distancia=10;
		int grados =0;
		double numeroderotaciones=distancia/circunferencia;
		grados =(int)(numeroderotaciones*360);
		int velocidad = 500;
		motorA.setSpeed(velocidad);
		motorA.rotate(grados, true);
		motorD.setSpeed(velocidad);
		motorD.rotate(grados);

	}
	public  void Stop() {
	
		motorA.stop();
		motorD.stop();
	 
		
/*public double detectarObstaculo() {
		
		float distanciaAlObstaculo = 0;

		while (distanciaAlObstaculo == 0) {
			float[] datosOjitos = new float[ultrasonic.sampleSize()];
			 ultrasonic.fetchSample(datosOjitos, 0);
			distanciaAlObstaculo = datosOjitos[0];
			System.out.println("dato enviado por sensor ="+ distanciaAlObstaculo);
			distanciaAlObstaculo=(distanciaAlObstaculo*100)/2;
		}
			int grados = 0;
			double circunferencia1 = Math.PI * diametroRueda;
			double numeroDeRotaciones = distanciaAlObstaculo / circunferencia1;
			grados = (int) (numeroDeRotaciones * 360);

			int velocidad = 200;
			motorA.setSpeed(velocidad);
			motorA.rotate(grados, true);
			motorD.setSpeed(velocidad);
			motorD.rotate(grados);
			  
		
		  
		return distanciaAlObstaculo;*/


 
}
	public void vuelta(){
		
		int grados =260;
		int velocidad = 400;
		motorA.setSpeed(velocidad);
		motorD.rotate(grados, true);
		motorD.setSpeed(velocidad);
		motorD.rotate( -1 * 410);
		motorA.stop();
		motorD.stop();
	}
	public float detectarDistancia(){
		SampleProvider muestrascapturadasOjitos;
		muestrascapturadasOjitos = ojitos.getDistanceMode();
	    float distanciaAlaobstaculo = 0;	
	    float[] datosojitos= new float[muestrascapturadasOjitos.sampleSize()];
	    muestrascapturadasOjitos.fetchSample(datosojitos, 0);
	    distanciaAlaobstaculo= datosojitos[0];
	    System.out.println("dato enviado por sensor ="+ distanciaAlaobstaculo);
	    distanciaAlaobstaculo = distanciaAlaobstaculo*100;
		float resultado = distanciaAlaobstaculo ;
		return resultado;
		}
	public void ataque(){
		int grados1 = 0;
    	double numeroderotaciones=distancia1/circunferencia;
    	grados1 =(int)(numeroderotaciones*360);
		motorlapiz.setSpeed(800);
		motorlapiz.rotate(-80);
		motorA.setSpeed(800);
		motorA.rotate(grados1,true);
		motorD.setSpeed(800);
		motorD.rotate(grados1);
    	motorlapiz.setSpeed(800);
    	motorlapiz.rotate(80);
    	motorA.stop();
    	motorD.stop();
        motorlapiz.close();
        Sound.beepSequenceUp();  	
        Delay.msDelay(2000);	  
	}
	
	
 
}
