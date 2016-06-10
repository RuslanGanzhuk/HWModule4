package goit.javaonline;

import goit.javaonline.distance.Distance;
import goit.javaonline.square.Square;
import goit.javaonline.temperature.Temperature;

/**
 * Created by Родион on 10.06.2016.
 */
public class Runner {

    public static void main(String[] args) {

        Square square = new Square();
        Temperature temperature = new Temperature();
        Distance distance = new Distance();


        System.out.println("Площадь круга = " + square.squareCircle(4.0));
        System.out.println("Площадь прямоугольника = " + square.squareRectangle(4.0, 2.0));
        System.out.println("Площадь треугольника = " + square.squareTringle(8.0, 4.0));
        System.out.println("Расстояние между точками = " + distance.dotDistance(4, 6, 7, 8));
        System.out.println("Температура в Фаренгейтах = " + temperature.temperatureCelsiusToFahrenheit(4.0));
        System.out.println("Температура в Цельсии = " + temperature.temperatureFahrenheitToCelsius(10.0));

    }
}
