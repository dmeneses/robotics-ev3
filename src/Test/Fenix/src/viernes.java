import lejos.hardware.motor.Motor;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;

//import java.util.Timer;

//import lejos.hardware.port.SensorPort;
//import lejos.hardware.sensor.EV3TouchSensor;
//import lejos.robotics.SampleProvider;
//import lejos.utility.Delay;
//import lejos.utility.Stopwatch;


public class viernes 

{

	
	double gabo = 1.2;
	double tara = 10;
	
	
    
    double distancia;
    
    public void caminar(int distancia)
    {
    	double perimetro = gabo * Math.PI * 2;
    	double grados = distancia * 360 / perimetro;
    	
    	Motor.B.rotate((int)grados, true);
    	Motor.C.rotate((int)grados);
    	/*Motor.B.setAcceleration(900);
    	Motor.C.setAcceleration(900);*/
    	Motor.B.setSpeed(50);
    	Motor.C.setSpeed(50);
    	
    }
    
    public void moverbrazo(int distancia)
    {
    	//double perimetro = tara * Math.PI * 2;
    	//double grados = distancia * 360 / perimetro;
    	
    	Motor.A.rotate(distancia);
    	
    	//Motor.A.setSpeed(750);
    	
    	
    }
	
 }
  
    



