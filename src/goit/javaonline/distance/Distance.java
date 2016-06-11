package goit.javaonline.distance;

/**
 * Created by Родион on 10.06.2016.
 */
public class Distance {

    public double dotDistance (int x1, int x2, int y1, int y2) {

        return (Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
    }
}

