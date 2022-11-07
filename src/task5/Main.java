package task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entTemperature = new Scanner(System.in);
        int temperatureInCelsius = entTemperature.nextInt();
        ConverterTemperature temperature = new ConverterTemperature();

        temperature.convert(temperatureInCelsius);
    }
}
