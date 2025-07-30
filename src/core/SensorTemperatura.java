package core;
public class SensorTemperatura implements Sensor {

    @Override
    public String getTipo() {
        return "Temperatura";
    }

    @Override
    public String lerDados() {
        return "36.5 °C";
    }
    
}

