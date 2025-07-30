package decorators;

import core.Sensor;

public class LogDecorator extends SensorDecorator {
    public LogDecorator(Sensor sensor) {
        super(sensor);
    }

    @Override
    public String lerDados() {
        String dados = sensor.lerDados();
        System.out.println("[LOG] Leitura de " + getTipo() + ": " + dados);
        return dados;
    }
}

