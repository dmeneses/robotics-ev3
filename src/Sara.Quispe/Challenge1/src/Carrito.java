import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.UnregulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.*;
import lejos.robotics.SampleProvider;

public class Carrito {
	EV3ColorSensor sensorColor=new EV3ColorSensor(SensorPort.S1);
	EV3LargeRegulatedMotor motorB = new EV3LargeRegulatedMotor(MotorPort.B);
	EV3LargeRegulatedMotor motorD = new EV3LargeRegulatedMotor(MotorPort.D);
	
	double diametroRueda=5.5;
	

	public float detectarColor(){
		SampleProvider muestrasCapturadasColor= sensorColor.getColorIDMode();
		float[]datosDelSensor=new float [muestrasCapturadasColor.sampleSize()];
		muestrasCapturadasColor.fetchSample(datosDelSensor,0);
		float color=datosDelSensor[0];
		System.out.println("color="+ color);
		return color;
	}
	
		public void avanzar(double distanciaAvance){
		
		}
		

		public void girar(int gradoGiro){
		
		 //motorD.rotate(50);
		
		int distanciaAvance1 = 10;
		int grados1=0;
		double diametroRueda1=5.5;
		double circunferencia1=Math.PI* diametroRueda;
		double numeroDeRotaciones1=distanciaAvance1/circunferencia1;
		grados1=(int)(numeroDeRotaciones1* 360);
		 
		int velocidad1=200;
		motorB.setSpeed(velocidad1);
		motorB.rotate(grados1,true);
		motorD.setSpeed(velocidad1);
		motorD.rotate(grados1);
		 
		motorD.rotate(150);
		
		int distanciaAvance2 = 25;
		int grados2=0;
		double diametroRueda2=5.5;
		double circunferencia2=Math.PI* diametroRueda;
		double numeroDeRotaciones2=distanciaAvance2/circunferencia2;
		grados2=(int)(numeroDeRotaciones2* 360);
		 
		int velocidad2=200;
		motorB.setSpeed(velocidad2);
		motorB.rotate(grados2,true);
		motorD.setSpeed(velocidad2);
		motorD.rotate(grados2);
		 
		motorD.rotate(500);
		int distanciaAvance = 30;
		int grados=0;
		double diametroRueda=5.5;
		double circunferencia=Math.PI* diametroRueda;
		double numeroDeRotaciones=distanciaAvance/circunferencia;
		grados=(int)(numeroDeRotaciones* 360);
		 
		int velocidad=200;
		motorB.setSpeed(velocidad);
		motorB.rotate(grados,true);
		motorD.setSpeed(velocidad);
		motorD.rotate(grados);
		
		motorD.rotate(-300);
		int distanciaAvance3= 5;

		int velocidad3=200;
		motorB.setSpeed(velocidad);
		motorB.rotate(grados,true);
		motorD.setSpeed(velocidad);
		motorD.rotate(grados);
		
		motorB.stop();
		motorD.stop();
		
		motorB.close();
		motorD.close();
		
		
		
		
			
	  	
	}
}