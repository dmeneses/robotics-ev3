import lejos.hardware.Button;
import lejos.hardware.motor.Motor;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;


public class Imagine1 
{
     public static void main(String args[]) {
	
     
  
    EV3UltrasonicSensor ojos ;
    ojos = new EV3UltrasonicSensor(SensorPort.S2);
    float []muestras = new float[ojos.sampleSize()];
    
    EV3TouchSensor pulsador ;
    pulsador = new EV3TouchSensor(SensorPort.S1);
    float []muestrasPulsador = new float[pulsador.sampleSize()];

    
    
	    pulsador.fetchSample(muestrasPulsador, 0);	
	    System.out.println("pulsador "+ muestrasPulsador[0]);
	
	    ojos.fetchSample(muestras, 0);	

	    double distancia = muestras[0]*100;
	    
	    System.out.println("distancia "+ distancia);

	    //avanzar en centimetros
	    
	    //perimetro 2 X Math.PI X Radio
	    //double perimetro = 2 * 3.1416 * 3;
	    //regla tres 360 ----- perimetro
	    //			 ?   ----- distancia
	    
	    //?
	    double grados = distancia * 18.40; 
	    Motor.B.setSpeed(50);
	    Motor.C.setSpeed(50);
	    Motor.B.rotate((int)grados, true);
	    Motor.C.rotate((int)grados);
	    Button.waitForAnyPress();
      }  
    }


