import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.robotics.SampleProvider;

public class Robot {

	EV3TouchSensor touchterminar = new EV3TouchSensor(SensorPort.S2);
	SampleProvider MuestrasCapturadas = touchterminar.getTouchMode();

	public boolean terminarya() {
		boolean terminar = false;

		System.out.print("esperando a que pase algo");
		float[] datosDelSensor = new float[MuestrasCapturadas.sampleSize()];
		MuestrasCapturadas.fetchSample(datosDelSensor, 0);
		if (datosDelSensor[0] != 0) {
			System.out.println(datosDelSensor[0] + " equivale a que hubo toque");
			terminar = true;

		}

		return terminar;

	}
}