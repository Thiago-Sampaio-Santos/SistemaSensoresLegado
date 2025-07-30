package factories;
import core.Sensor;
import core.SensorFactory;
import core.SensorTemperatura;

public class TemperaturaFactory extends SensorFactory {

    @Override
    public Sensor criarSensor() {
        return new SensorTemperatura();
    }
}
