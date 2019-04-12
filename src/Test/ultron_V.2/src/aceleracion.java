import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;


public class aceleracion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EV3LargeRegulatedMotor motorB = new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor motorC = new EV3LargeRegulatedMotor(MotorPort.C);
		int grados = 90;
		double radio = 3.65;
		double eje = 16;
		 /* EV3TouchSensor sensor = new EV3TouchSensor(SensorPort.S4);
		  
		  motorB.setAcceleration(350);
  			motorC.setAcceleration(350);
		  
		  SampleProvider sp = sensor.getTouchMode();
	       boolean botonActivado;
         EV3UltrasonicSensor ojos;
         ojos = new  EV3UltrasonicSensor (SensorPort.S1);
         float[] muestras = new float[ojos.sampleSize()];
         
         while(true)
         {
        	 float[] sample = new float [sp.sampleSize()];
      	   sp.fetchSample(sample, 0);
      	   if (sample[0] == 0){
      		   botonActivado = false;
      	   }else{
      		   botonActivado = true;
      	   }
      	   if (botonActivado == true){
      			//double distancia = 60;
      			//int grados = (int)distancia * 360 / 17;
      			motorB.setSpeed(350);
      			motorB.forward();
      			motorC.setSpeed(350);
      			//motorC.forward();
      			//Delay.msDelay(3600);
      		    //motorB.rotate(grados, true);
      			//motorC.rotate(grados);
      			//double distancia = 40;
      			//int grados = (int)distancia * 360 / 17;
        	 ojos.fetchSample(muestras, 0);
        	 double distancia = muestras[0] * 100;
        	 double centimetros = distancia - 4; 
        		int grados = (int)centimetros * 360 / 17;
        		motorB.rotate(grados, true);
        		motorC.rotate(grados);
        		motorB.setAcceleration(300);
        		motorC.setAcceleration(300);
      	    
        		
        	 
        	 System.out.println("Distancia: " + distancia);*/
		double perimetrog = eje * Math.PI;
    	double giro = grados * perimetrog / 360;
    	double perimetro = radio * Math.PI * 2;
    	double gradito = giro * 360 / perimetro;
    	
    	motorB.rotate((int)gradito, true);
    	motorC.rotate((int)-gradito);
        	 
         }
	//}




	//}




}


