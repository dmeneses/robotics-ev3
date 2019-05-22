package robozumo;

import lejos.hardware.motor.Motor;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;

public class Acciones {
	
	double radio = 3;
	double gabo = 2.8;
	double eje = 20;
	EV3ColorSensor ojito = new EV3ColorSensor(SensorPort.S4);
	SampleProvider luz = ojito.getRedMode();
	EV3UltrasonicSensor vision = new EV3UltrasonicSensor(SensorPort.S1);	
	double iluz;

	 float[] muestras = new float[luz.sampleSize()];
	 double distancia;
	 
	   public double detectarColor()
	    {
	    	 // while(true)
	    	 // {
	    		  luz.fetchSample(muestras, 0);
	    		  iluz = muestras[0];
	    		  
	    		  if (iluz < 0.2)
	    		  {
	    			  System.out.println("sigo en la cancha");
	    			  System.out.println(iluz);
	    		  }
	    		  else
	    		  {
	    			  System.out.println("estoy apunto de perder");
	    			  Delay.msDelay(1000);
	    		  }
	    		  return iluz;
	    	  //}
	    }
	   
	   public void girar(int grados)
	    {
	    	double perimetrog = eje * Math.PI;
	    	double giro = grados * perimetrog / 360;
	    	double perimetro = radio * Math.PI * 2;
	    	double gradito = giro * 360 / perimetro;
	    	
	    	Motor.B.rotate((int)gradito, true);
	    	Motor.C.rotate((int)-gradito);
	    }
	    
	   
	   public void avanzar()
	    {
	    	/*double perimetro = gabo * Math.PI * 2;
	    	double grados = distancia * 360 / perimetro;*/
	    	
	    	Motor.B.backward();
	    	Motor.C.backward();
	    	/*Motor.B.rotate((int)grados, true);
	    	Motor.C.rotate((int)grados);*/
	    	//Motor.B.setSpeed(Motor.B.getMaxSpeed());
	    	//Motor.C.setSpeed(Motor.C.getMaxSpeed());
	    	
	    }
	   
	   public double detectarDistancia()
	    {
	    	float[] muestrasV = new float [vision.sampleSize()];
	    	vision.fetchSample(muestrasV, 0);
	    	distancia = muestrasV[0] * 100;
	    	return distancia;
	    }
	   
	   public void RompeTormentas(int grados2)
	   {
		   
		   Motor.D.rotate(grados2);
	   }
	   
	   public void parar()
	   {
		   Motor.B.stop(true);
		   Motor.C.stop();
	   }
	   
	   public void retroceder()
	   {
		   Motor.B.forward();
		   Motor.C.forward();
	   }
	    
}