package Interfaces2;

/*
 * CircleMeasurer implements specific callback for Rectangles.
 * It implements the Measurer interface.
 */


public class CircleMeasurer implements Measurer{

    @Override
    public double measure(Object anObject) {
        Circle circle = (Circle) anObject;
        return circle.getArea();
    }
}
