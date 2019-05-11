import lejos.hardware.Button;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.utility.Stopwatch;

	public class Telegrafo
	{
		float[] muestrasboton;
		EV3TouchSensor boton;
		Stopwatch watch;
	
	public Telegrafo ()
	{
		watch = new Stopwatch ();
		boton = new EV3TouchSensor (SensorPort.S1);
		muestrasboton = new float [boton.sampleSize()];
	}
	
	//si retorna 1 es punto
	//si retorna 2 es linea
	//si retorna 3 es espacio
	public int insertarmorse()
	{
		
		boton.fetchSample(muestrasboton, 0);
		
		watch.reset();
		while (muestrasboton[0] == 1)
		{
			boton.fetchSample(muestrasboton, 0);
			
		}
		
		int tiempo = watch.elapsed();
		
		
		if (tiempo >= 300)
		{
			System.out.println("linea");
			return 2;
		}
		else 
		{
			if (tiempo > 0)
			{
			System.out.println("punto");
			return 1;
			}
			else
			{
				int boton = Button.waitForAnyPress();
				if(boton == Button.ID_ESCAPE)
				{
					return 3;
				}
				else{
				System.out.println("???");
				}
			}
		}
		return 0;
		
	}
}