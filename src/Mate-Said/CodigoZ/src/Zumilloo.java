


import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;


public class Zumilloo {
	 
	EV3ColorSensor color;
	EV3TouchSensor  sensorI;
	EV3TouchSensor  sensorD;
	EV3MediumRegulatedMotor motor;
	EV3LargeRegulatedMotor motorD;
    EV3LargeRegulatedMotor motorI;
    SampleProvider sp;
	float[] sample;
	
	   public Zumilloo()
	   {

		    color = new EV3ColorSensor(SensorPort.S3);
		    sensorI = new  EV3TouchSensor(SensorPort.S2);
			sensorD= new  EV3TouchSensor(SensorPort.S4);
			motorD = new EV3LargeRegulatedMotor(MotorPort.C);
	        motorI = new EV3LargeRegulatedMotor(MotorPort.B);
			motor = new EV3MediumRegulatedMotor(MotorPort.D);
	   }  
	public void verCancha(){
	    girar(179);
		SampleProvider luz = color.getRedMode();
		float[] muestras = new float[luz.sampleSize()];	
		SampleProvider sp = sensorI.getTouchMode();
	    SampleProvider spD = sensorD.getTouchMode();
	    boolean BotonActivoD;
	    boolean BotonActivoI;
			while(true){
				float[] sample = new float [spD.sampleSize()];
	        	spD.fetchSample(sample, 0);
	        	if(sample[0]==0)
	        	{
	        		BotonActivoD = false;
	        	}
	        	else
	        	{
	        		BotonActivoD = true;
	        	}   
	            if(BotonActivoD==true){
	            CostadoDerecho();
	            }
	            float[] sample1 = new float [sp.sampleSize()];
	        	sp.fetchSample(sample1, 0);
	        	if(sample1[0]==0)
	        	{
	        		BotonActivoI = false;
	        	}
	        	else
	        	{
	        		BotonActivoI = true;
	        	}   
	            if(BotonActivoI==true){
	            CostadoIzquierdo();
	            }
	            luz.fetchSample(muestras, 0);
				float iluz = muestras[0];
				if (iluz < 0.2 )
				{
					System.out.println("sigo en la cancha");
					avanzarennegro(6);
					 
					
				}
				else{
					System.out.println("estoy fuera debo entrar");
					Delay.msDelay(0);
					retro(20);
					girar(180);
				
				}
			palanca1();
			}
		} 
	public void palanca1 (){
		motor.setSpeed(motorI.getMaxSpeed());
    	motor.setSpeed(motorD.getMaxSpeed());
		motor.forward();
		motor.forward();
	}
public void retro(int cm){
		
		double radio = 2.8;
		int grados = 360;
		double perimetro = 2 * Math.PI * radio;
		int retro = (int) ((cm * grados) / perimetro);
		motorI.setSpeed(motorI.getMaxSpeed());
		motorD.setSpeed(motorD.getMaxSpeed());
		motorI.rotate(-retro,true);
		motorD.rotate(-retro);
	}
  public void avanzarennegro (int cm){
	  motorI.setSpeed(motorI.getMaxSpeed());
	  motorD.setSpeed(motorD.getMaxSpeed());
	  motorI.forward();
	  motorD.forward(); 
  }

	 
public void avanzar(int cm){
		double radio = 2.8;
		int grados = 360;
		double perimetro = 2 * Math.PI * radio;
		int Avanzar = (int) ((cm * grados) / perimetro);
	    motorI.setSpeed(motorI.getMaxSpeed());
   	    motorD.setSpeed(motorD.getMaxSpeed());
		motorI.rotate(Avanzar,true);
		motorD.rotate(Avanzar);		
	}	
public void girar(int grados){
		double radio = 7.2504;
		double perimetro = 2 * Math.PI * radio;
		double SM = (int)((perimetro * grados) / 360);
		double perimetro1 =  2 * Math.PI * 2.8;
		int girarGrados = (int) ((SM * 360) / perimetro1);
	    motorI.setSpeed(motorI.getMaxSpeed());
   	    motorD.setSpeed(motorD.getMaxSpeed());
		motorI.rotate(-girarGrados,true);
		motorD.rotate(girarGrados);
  }
    public void CostadoIzquierdo (){ 	
    	motorD.setSpeed(motorD.getMaxSpeed());
    	motorD.rotate(720);	
    }
  public void CostadoDerecho(){
	    motorI.setSpeed(motorI.getMaxSpeed());
	    motorI.rotate(720);
  }    	    
}

   


