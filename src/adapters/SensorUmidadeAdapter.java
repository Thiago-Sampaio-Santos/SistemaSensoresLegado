package adapters;

import core.Sensor;
import core.SensorUmidade;

public class SensorUmidadeAdapter implements Sensor {
    private SensorUmidade sensor = new SensorUmidade();

    public String getTipo() {
        return sensor.getTipo();
    }

    public String lerDados() {
        return sensor.lerDados();
    }
}

