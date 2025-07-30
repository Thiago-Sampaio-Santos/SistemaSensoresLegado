package decorators;

import core.Sensor;

public class AlertaDecorator extends SensorDecorator {
        public AlertaDecorator(Sensor sensor) {
        super(sensor);
    }

    @Override
    public String lerDados() {
        String dados = sensor.lerDados();
        if (getTipo().equals("Temperatura")) {
            double valor = Double.parseDouble(dados.replace(" °C", ""));
            if (valor > 50) {
                System.out.println("⚠️ ALERTA: Temperatura acima do limite!");
            }
        }
        return dados;
    }
}

