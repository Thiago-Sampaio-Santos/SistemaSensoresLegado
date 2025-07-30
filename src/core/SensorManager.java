package core;
import java.util.ArrayList;
import java.util.List;

public class SensorManager {
    private static SensorManager instancia;
    private List<Sensor> sensores = new ArrayList<>();

    private SensorManager() {}

    public static SensorManager getInstancia() {
        if (instancia == null) {
            instancia = new SensorManager();
        }
        return instancia;
    }

    public void adicionarSensor(Sensor sensor) {
        sensores.add(sensor);
    }

    public List<Sensor> getSensores() {
        return sensores;
    }
}

