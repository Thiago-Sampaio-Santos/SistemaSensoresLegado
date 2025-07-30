package core;
public class DisplayConsole {
    public void mostrarSensor(Sensor sensor) {
        System.out.println(sensor.getTipo() + ": " + sensor.lerDados());
    }
}

