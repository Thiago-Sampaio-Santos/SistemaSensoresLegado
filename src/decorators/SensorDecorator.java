package decorators;

import core.Sensor;

public class SensorDecorator implements Sensor {
    protected Sensor sensor;

    public SensorDecorator(Sensor sensor) {
        this.sensor = sensor;
    }

    public String getTipo() {
        return sensor.getTipo();
    }

    public String lerDados() {
        return sensor.lerDados();
    }
}

