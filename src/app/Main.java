package app;

public class Main {

    public static void main(String[] args){

        System.out.println("Temperature unit converter");

        double fahrenheit = 75;
        double convCelsius = convertFahrenheitToCelsius(fahrenheit);
        double convFahrenheit = convertCelsiusToFahrenheit(convCelsius);
        System.out.printf("\n%.2f fahrenheit is equivalent to %.2f celsius", fahrenheit, convCelsius);
        System.out.printf("\n%.2f celsius is equivalent to %.2f fahrenheit\n", convCelsius, convFahrenheit);
    }

    public static double convertFahrenheitToCelsius(double fahrenheit){
        double celsius = (fahrenheit - 32) * 5/9;
        return celsius;
    }

    public static double convertCelsiusToFahrenheit(double celsius){
        double fahrenheit = (celsius * 9/5) + 32;
        return fahrenheit;
    }
}
