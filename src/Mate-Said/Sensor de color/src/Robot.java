import java.text.DecimalFormat;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.EV3UltrasonicSensor;
import lejos.robotics.SampleProvider;
import lejos.utility.Delay;
public class Robot {
	EV3ColorSensor  sensor;
	EV3LargeRegulatedMotor motorD;
    EV3LargeRegulatedMotor motorI;
    EV3UltrasonicSensor eyes;
	public Robot ()
	{
		sensor = new  EV3ColorSensor(SensorPort.S4);
		motorD = new EV3LargeRegulatedMotor(MotorPort.C);
		motorI = new EV3LargeRegulatedMotor(MotorPort.B);
		eyes = new EV3UltrasonicSensor(SensorPort.S1);
	}
	public void ReconocerColor()
	{
		SampleProvider sp = sensor.getColorIDMode();
	    String Color = null; 
		 while(true){
			    float[] sample = new float [sp.sampleSize()];
	        	sp.fetchSample(sample, 0);
	        	if(sample[0]==0)
	        	{
	        		 Color = "Rojo" ;	        	
	        		 rutaR(Color);
	        		 leer(Color);
	        	}
	        	else if(sample[0]==1)
	        	{
	        		 Color = "Verde";
	        		 rutaV(Color);
	        		 leer(Color);
	        	}
	        	else if(sample[0]==2)
	        	{
	        		 Color = "Azul";
	        		 rutaA(Color);
	        		 leer(Color);
	        	}
	        	else if(sample[0]==3)
	        	{
	        		 Color = "Amarillo";
	        		 rutaY(Color);
	        		 leer(Color);
	        	}
                } 
                }
	public void rutaR(String Color)
	{
		        System.out.println(Color);
		        if(Color == "Rojo"){
		        int G = 90;
	            double x = 0;
	            x = (int)((G*G)/2);
	            int G1 = 270;
	            double x1 = 0;
	            x1 = (int)((G1*G1)/2);
	            int G2 = 200;
	            double x2 = 0;
	            x2 = (int)((G2*G2)/2);
	            motorI.setSpeed(motorI.getMaxSpeed());
        	    motorD.setSpeed(motorD.getMaxSpeed());
        	    motorI.rotate(-G, true);
                motorD.rotate(G);
                motorI.rotate(720, true);
                motorD.rotate(720);
                motorI.rotate(G1, true);
                motorD.rotate(-G1);   
                motorI.rotate(720, true);
                motorD.rotate(720);
                motorI.rotate(-G2, true);
                motorD.rotate(G2);   
                Delay.msDelay(9);
    	       }	      
	           }
	public void rutaV(String Color)
	           {
		       System.out.println(Color);
		       if(Color == "Verde"){
    	       motorI.setSpeed(motorI.getMaxSpeed());
    	       motorD.setSpeed(motorD.getMaxSpeed());
    	       motorI.rotate(360, true);
               motorD.rotate(360);
               Delay.msDelay(9);
	           }
} 
    public void rutaA(String Color) 
               {
    	       System.out.println(Color);
    	       if(Color == "Azul"){
 	           motorI.setSpeed(motorI.getMaxSpeed());
 	           motorD.setSpeed(motorD.getMaxSpeed());
 	           motorI.rotate(360, true);
               motorD.rotate(-460);
               Delay.msDelay(9);    	
               }
               }
               public void rutaY(String Color) 
               {
               System.out.println(Color);   
               if(Color == "Amarillo"){
               motorI.setSpeed(motorI.getMaxSpeed());
               motorD.setSpeed(motorD.getMaxSpeed());
               motorI.rotate(360, true);
               motorD.rotate(360);
               Delay.msDelay(9);    	
    }
    }
    public void leer(String Color){
                if(Color != null){
               	float[] muestras = new float[eyes.sampleSize()];
                eyes.fetchSample(muestras, 0);
               	double distancia = muestras[0] * 100;
                DecimalFormat decimal = new DecimalFormat("0.00");
           	    System.out.println("Distance: " + decimal.format(distancia));
           	   	Delay.msDelay(1000);
                       	int D = 0;
                       	int S = 0;
                        double x = distancia;
                        D = (int)(((360*x)-2300)/17);
                       	S = D ;
                       	motorI.setSpeed(motorI.getMaxSpeed());
                       	motorD.setSpeed(motorD.getMaxSpeed());
                       	motorI.rotate(D, true);
                        motorD.rotate(D);
           }
                else{
                	System.out.println(Color = null);
                }
}
}
