package Interfaces2;

import java.awt.Rectangle;

public class DataSetMeasurerTester {

    /**
     * Main method.
     * @param args unused
     */
    public static void main(String[] args) {

        // Rectangle
        Measurer m = new RectangleMeasurer();
        DataSetv2 data = new DataSetv2(m);
        data.add(new Rectangle(5, 10, 20, 25));
        data.add(new Rectangle(10, 20, 30, 40));
        Rectangle rect = (Rectangle) data.getMaximum();
        System.out.println(rect.getWidth()); // 30.0 expected

        // Circle
        Measurer m2 = new CircleMeasurer();
        DataSetv2 data2 = new DataSetv2(m2);
        data2.add(new Circle(10));
        data2.add(new Circle(5));
        Circle circ = (Circle) data2.getMaximum();
        System.out.println(circ.getArea());

    }
}

