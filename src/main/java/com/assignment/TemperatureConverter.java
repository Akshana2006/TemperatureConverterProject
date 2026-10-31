package com.assignment;

public class TemperatureConverter {

    public double celsiusToFahrenheit(double celsius) {
        double fahrenheit =  (celsius * 9.0 / 5.0) + 32;
        return fahrenheit;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        double celsius =  (fahrenheit - 32) * 5.0 / 9.0;
        return celsius;
    }

    public double celsiusToKelvin(double celsius) {
        double kelvin = celsius + 273.15;
        return kelvin;
    }
}
