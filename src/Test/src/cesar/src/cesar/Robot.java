package cesar;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;


public class Robot {

	EV3ColorSensor luz;
	EV3LargeRegulatedMotor motorA;
	 EV3LargeRegulatedMotor motorD;
	 EV3UltrasonicSensor ojos;
	  int rotacion ;
	 int girar;
	 int retroceder;
	 ModoAtaque atk;
	 
	 
public Robot(){
	motorA = new EV3LargeRegulatedMotor(MotorPort.A);
	  motorD = new EV3LargeRegulatedMotor(MotorPort.D);
	 luz = new EV3ColorSensor(SensorPort.S2);
	 atk = new ModoAtaque();
     
}
	 




public void buscarEnemigo()
{
	
 
	 rotacion=(int) 360*(815/360);
	 girar = rotacion;
	 motorA.rotate(girar,true);
	 motorD.rotate(- girar);
	 //atk.irhaciarobot(ojos, motorA, motorD);
	 atk.retrocederatacar(motorA,motorD);

 
}
	
	 
	 
	 
	 
	 
	public void seguirencancha()
	{
		 
		 
		 
		while(true)
		{
		SampleProvider sp = luz.getRedMode();
		float[] muestras = new float [sp.sampleSize()];
		sp.fetchSample(muestras,0);
		float iluz = muestras[0];
		if (iluz < 0.2)
		{
		System.out.println("sigo en cancha");	
		System.out.println(iluz);
		motorA.forward();
		motorD.forward();
		}
		else
		{
			retroceder = 50 * 360/17;
			motorA.rotate(retroceder,true);
			motorD.rotate(retroceder);
			 motorA.setSpeed(1200);
			 motorD.setSpeed(1200);
			 buscarEnemigo();
			
			
			
		}
			
		}
	}





	
	
}
