package factories;
import core.Sensor;
import core.SensorFactory;
import core.SensorLuminosidade;

public class LuminosidadeFactory extends SensorFactory {

    @Override
    public Sensor criarSensor() {
        return new SensorLuminosidade();
    }   
}

