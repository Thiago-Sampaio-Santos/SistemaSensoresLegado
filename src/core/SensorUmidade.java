package core;
public class SensorUmidade implements Sensor{

    @Override
    public String getTipo() {
        return "Umidade";
    }

    @Override
    public String lerDados() {
        return "55%";
    }
    
}

