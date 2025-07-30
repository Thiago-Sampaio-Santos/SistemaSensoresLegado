package factories;
import core.Sensor;
import core.SensorFactory;
import core.SensorUmidade;

public class UmidadeFactory extends SensorFactory {

    @Override
    public Sensor criarSensor() {
        return new SensorUmidade();
    }
}

