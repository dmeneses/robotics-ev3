import lejos.hardware.Button;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;


public class CarritoConSensores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EV3LargeRegulatedMotor motor1;
		motor1=new EV3LargeRegulatedMotor(MotorPort.C);
		
		EV3LargeRegulatedMotor motor2=new EV3LargeRegulatedMotor(MotorPort.B);
		
		EV3TouchSensor sensorTouch; 
		sensorTouch=new EV3TouchSensor(SensorPort.S1);
		
		
		SampleProvider muestrasCapturadasTouch=  sensorTouch.getTouchMode();
		
		boolean sensorTouchDetectoToque=false;
		
		while (sensorTouchDetectoToque==false){
			System.out.println("esperando a que pase algo");
		
		float[]datosDelSensor=new float [muestrasCapturadasTouch.sampleSize()];
		
		muestrasCapturadasTouch.fetchSample(datosDelSensor,0);
		
		if (datosDelSensor[0]==0);{
		
			System.out.println("0 equivale a que no hubo toque");
		}
		
		if(datosDelSensor[0]!= 0){
			System.out.println(datosDelSensor[0]+"equivale a que hubo un toque");
			sensorTouchDetectoToque=true;
			
		}
		 System.out.println("deje de esperar");
			Button.waitForAnyPress();
	
			 
			if(sensorTouchDetectoToque==true){
			 
				 
				 
			 
				double diametroRueda=5.5;
				double circunferencia=Math.PI* diametroRueda;
				double LadoLargo=120;
				double rotacionLadoLargo=LadoLargo/circunferencia;
				LadoLargo=(int)(rotacionLadoLargo* 360);
				
				 double ladoCorto=60;
				 double rotacionLadoCorto=ladoCorto/circunferencia;
				 int gradosLadoCorto=(int)(rotacionLadoLargo* 360);
				
				
		}
			
			System.out.println("esperando para cerrar el programa");
			Button.waitForAnyPress();
	}
}}

		
		
		
		
	

	

