package com.assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TemperatureConverterTest {
    //creating converter object
    private final TemperatureConverter converter = new TemperatureConverter();
    private final double delta = 0.001;

    @Test
    void celsiusToFahrenheit() {
        assertEquals(32.0, converter.celsiusToFahrenheit(0.0), delta);
    }

    @Test
    void fahrenheitToCelsius() {
        assertEquals(100.0, converter.fahrenheitToCelsius(212.0), delta);
    }

    @Test
    void celsiusToKelvin() {
        assertEquals(273.15, converter.celsiusToKelvin(0.0), delta);
    }
}