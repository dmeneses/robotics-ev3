import lejos.hardware.motor.Motor;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;


public class Acciones 
{
	double radio = 3.65;
	double eje = 16;
	EV3UltrasonicSensor vision = new EV3UltrasonicSensor(SensorPort.S1);
    EV3ColorSensor ojito = new EV3ColorSensor(SensorPort.S4);
    
    
    int distancia;
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
    	
    }
    
    public void avanzar(int distancia)
    {
    	double perimetro = radio * Math.PI * 2;
    	double grados = distancia * 360 / perimetro;
    	
    	Motor.B.rotate((int)grados, true);
    	Motor.C.rotate((int)grados);
    }
    
    public int detectarDistancia()
    {
    	float[] muestrasV = new float [vision.sampleSize()];
    	vision.fetchSample(muestrasV, 0);
    	distancia = (int)muestrasV[0] * 100;
    	System.out.println("distancia" + muestrasV);
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
    
    

}
