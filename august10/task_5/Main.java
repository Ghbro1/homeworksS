package august10.task_5;

public class Main {
    public static void main(String[] args) {
        double celsiusTemperature = 35.0;

        Converter celsiusConverter = new CelsiusConverter();
        Converter kelvinConverter = new KelvinConverter();
        Converter fahrenheitConverter = new FahrenheitConverter();

        System.out.println("Температура в градусах Цельсия: " + celsiusConverter.getConvertedValue(celsiusTemperature));
        System.out.println("Температура в Кельвинах: " + kelvinConverter.getConvertedValue(celsiusTemperature));
        System.out.println("Температура в Фаренгейтах: " + fahrenheitConverter.getConvertedValue(celsiusTemperature));
    }
}
