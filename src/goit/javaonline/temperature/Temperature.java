package goit.javaonline.temperature;

/**
 * Created by Родион on 10.06.2016.
 */
public class Temperature {

    public double temperatureCelsiusToFahrenheit(double fahrenheit) {

        return ((fahrenheit - 32) / 8 );
    }

    public double temperatureFahrenheitToCelsius(double celsius) {

        return (1.8 * celsius + 32);
    }
}
