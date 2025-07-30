package core;
public class SensorLuminosidade implements Sensor {

    @Override
    public String getTipo() {
        return "Luminosidade";
    }

    @Override
    public String lerDados() {
        return "1200 lux";
    }
    
}

