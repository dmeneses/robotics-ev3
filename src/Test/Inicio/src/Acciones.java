import lejos.hardware.motor.Motor;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;


public class Acciones 
{
	double radio = 3;
	double gabo = 2.8;
	double eje = 13.5;
	EV3UltrasonicSensor vision = new EV3UltrasonicSensor(SensorPort.S1);
    EV3ColorSensor ojito = new EV3ColorSensor(SensorPort.S4);
    
    
    double distancia;
    
    int color;
    SampleProvider gabriel = ojito.getColorIDMode();
    
    public void girar(int grados)
    {
    	double perimetrog = eje * Math.PI;
    	double giro = grados * perimetrog / 360;
    	double perimetro = radio * Math.PI * 2;
    	double gradito = giro * 360 / perimetro;
    	
    	Motor.B.rotate((int)gradito, true);
    	Motor.C.rotate((int)-gradito);
    	/*Motor.B.setAcceleration(500);
    	Motor.C.setAcceleration(500);
    	Motor.B.setSpeed(Motor.B.getMaxSpeed());
    	Motor.C.setSpeed(Motor.C.getMaxSpeed());*/
    }
    
    public void avanzar(int distancia)
    {
    	double perimetro = gabo * Math.PI * 2;
    	double grados = distancia * 360 / perimetro;
    	
    	Motor.B.rotate((int)grados, true);
    	Motor.C.rotate((int)grados);
    	/*Motor.B.setAcceleration(900);
    	Motor.C.setAcceleration(900);*/
    	Motor.B.setSpeed(550);
    	Motor.C.setSpeed(550);
    	
    }
    
    public double detectarDistancia()
    {
    	float[] muestrasV = new float [vision.sampleSize()];
    	vision.fetchSample(muestrasV, 0);
    	distancia = muestrasV[0] * 100;
    	return distancia;
    }
    
    public int detectarColor()
    {
    	  float[] muestrasC = new float [gabriel.sampleSize()];
    	  ojito.fetchSample(muestrasC, 0);
    	  color = (int)muestrasC[0];
    	  System.out.println("numero" + muestrasC);
    	  return color;
    	  
    	 
    	
    }
    
    public void kungFuPanda(int distancia)
    {
    	double perimetro = gabo * Math.PI * 2;
    	double grados = distancia * 360 / perimetro;
    	
    	Motor.B.rotate((int)grados, true);
    	Motor.C.rotate((int)grados);
    	Motor.B.setAcceleration(750);
    	Motor.C.setAcceleration(750);
    	Motor.B.setSpeed(950);
    	Motor.C.setSpeed(950);
    	
    } 
  
    
    
    
    
    
    
    
    
    
    

}
