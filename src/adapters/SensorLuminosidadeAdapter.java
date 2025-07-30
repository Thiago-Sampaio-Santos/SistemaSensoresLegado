package adapters;

import core.Sensor;
import core.SensorLuminosidade;

public class SensorLuminosidadeAdapter implements Sensor {
    private SensorLuminosidade sensor = new SensorLuminosidade();

    public String getTipo() {
        return sensor.getTipo();
    }

    public String lerDados() {
        return sensor.lerDados();
    }
}

