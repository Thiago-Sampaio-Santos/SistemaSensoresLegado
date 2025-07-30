package adapters;

import core.Sensor;
import core.SensorTemperatura;

public class SensorTemperaturaAdapter implements Sensor {
    private SensorTemperatura sensor = new SensorTemperatura();

    public String getTipo() {
        return sensor.getTipo();
    }

    public String lerDados() {
        return sensor.lerDados();
    }
}

