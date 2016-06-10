package goit.javaonline.square;

/**
 * Created by Родион on 10.06.2016.
 */
public class Square {

    public double squareTringle (double side,double hight) {

        return (0.5 * side * hight);
    }

    public double squareRectangle (double lenght, double weght) {

        return (lenght * weght);
    }

    public double squareCircle (double radius) {

        return (Math.PI * (Math.pow(radius,2)));
    }
}
