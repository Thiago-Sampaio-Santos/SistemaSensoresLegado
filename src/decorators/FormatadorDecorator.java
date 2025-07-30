package decorators;

import core.Sensor;

public class FormatadorDecorator extends SensorDecorator {
        public FormatadorDecorator(Sensor sensor) {
        super(sensor);
    }

    @Override
    public String lerDados() {
        String leituraOriginal = sensor.lerDados();

        // Exemplo: "Temperatura: 28.0°C" -> ">>> Temperatura atual: 28.0 graus Celsius <<<"
        String leituraFormatada = leituraOriginal
            .replace("°C", " graus Celsius")
            .replace(":", " atual:");

        return ">>> " + leituraFormatada + " <<<";
    }
}
