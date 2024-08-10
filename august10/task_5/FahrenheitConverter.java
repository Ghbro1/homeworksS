package august10.task_5;

public class FahrenheitConverter implements Converter {
    @Override
    public double getConvertedValue(double baseValue) {
        return baseValue * 9 / 5 + 32;
    }
}
