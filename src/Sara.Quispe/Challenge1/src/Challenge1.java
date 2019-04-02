import lejos.hardware.Button;
 
 

public class Challenge1 {

	public static void main(String[] args) {
 
		
		EV3TouchSensor sensorTouch; 
		sensorTouch=new EV3TouchSensor(SensorPort.S1);
		 
		EV3UltrasonicSensor ojitos = new EV3UltrasonicSensor(SensorPort.S2);
		
		EV3LargeRegulatedMotor motorB = new EV3LargeRegulatedMotor(MotorPort.B);
		EV3LargeRegulatedMotor motorC = new EV3LargeRegulatedMotor(MotorPort.C);

		System.out.println("presionar el SensorTouch");
		
		SampleProvider muestrasCapturadasTouch= sensorTouch.getTouchMode();
		
		boolean sensorTouchDetectoToque=false;
		
		while (sensorTouchDetectoToque==false){
			
		System.out.println("esperando a que pase algo");
		
		float[]datosDelSensor=new float [muestrasCapturadasTouch.sampleSize()];
		
		muestrasCapturadasTouch.fetchSample(datosDelSensor,0);
		
		if (datosDelSensor[0]==0);{
		
			System.out.println("0 equivale a que no hubo toque");
		}
		
		if(datosDelSensor[0]!= 0){
			System.out.println(datosDelSensor[0]+"equivale a que hubo un toque");
			sensorTouchDetectoToque=true;
			
	
		System.out.println("deje de esperar");
			Button.waitForAnyPress();
	
			//el carrito se mueva describiendo un rectangulo de lados
			//120 cm * 60cm
			
			if(sensorTouchDetectoToque==true){
			 

		Sound.beepSequenceUp();
		SampleProvider muestrasCapturadasOjitos;
		muestrasCapturadasOjitos = ojitos.getDistanceMode();

		float distanciaAlOtroCarrito = 0;
		while (distanciaAlOtroCarrito != Float.POSITIVE_INFINITY) {
			
			float[] datosOjitos = new float[muestrasCapturadasOjitos.sampleSize()];
			muestrasCapturadasOjitos.fetchSample(datosOjitos, 0);
			System.out.println("dato enviado por sensor =" + distanciaAlOtroCarrito);

			double distanciaCM = distanciaAlOtroCarrito * 100;

			int grados = 0;
			double diametroRueda = 5.5;
			double circunferencia = Math.PI * diametroRueda;
			double numeroDeRotaciones = distanciaCM / circunferencia;
			grados = (int) (numeroDeRotaciones * 360);

			int velocidad = 500;
			motorB.setSpeed(velocidad);
			motorB.rotate(grados, true);
			motorC.setSpeed(velocidad);
			motorC.rotate(grados);

		}
		motorB.stop();
		motorC.stop();

		ojitos.close();
	
		motorB.close();
		motorC.close();
		Sound.beepSequenceUp();

	}
}

