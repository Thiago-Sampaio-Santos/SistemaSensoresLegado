import core.DisplayConsole;
import core.Sensor;
import core.SensorFactory;
import core.SensorManager;
import decorators.AlertaDecorator;
import decorators.LogDecorator;
import factories.LuminosidadeFactory;
import factories.TemperaturaFactory;
import factories.UmidadeFactory;

public class Main {
    public static void main(String[] args) throws Exception {
        SensorManager manager = SensorManager.getInstancia();

        // Usando fábricas para criar sensores básicos
        SensorFactory temperaturaFactory = new TemperaturaFactory();
        SensorFactory umidadeFactory = new UmidadeFactory();
        SensorFactory luminosidadeFactory = new LuminosidadeFactory();

        // Decorando sensores com Log e Alerta (somente na temperatura)
        Sensor sensorTemperatura = new LogDecorator(new AlertaDecorator(temperaturaFactory.criarSensor()));
        Sensor sensorUmidade = new LogDecorator(umidadeFactory.criarSensor());
        Sensor sensorLuminosidade = new LogDecorator(luminosidadeFactory.criarSensor());

        // Adicionando sensores ao gerenciador
        manager.adicionarSensor(sensorTemperatura);
        manager.adicionarSensor(sensorUmidade);
        manager.adicionarSensor(sensorLuminosidade);

        // Exibindo dados dos sensores no console
        DisplayConsole console = new DisplayConsole();
        for (Sensor sensor : manager.getSensores()) {
            console.mostrarSensor(sensor);
        }
    }
}
