package task5;

public class ConverterTemperature {
    int celsius = 0;
    final int KELVIN = 273;
    final int FAHRENHEIT = 32;

    void convert(int celsius){
        System.out.println("To kelvin: " + (celsius+KELVIN));
        System.out.println("To fahrenheit:" + (celsius+FAHRENHEIT));
    }

}
