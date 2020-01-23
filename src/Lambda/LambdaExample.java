package Lambda;

import java.awt.Rectangle;

public class LambdaExample {

    public static void main(String[] args) {
        // Use Lambda Expression
        Measurer m = (Object obj) -> {
            Rectangle rect = (Rectangle) obj; // cast is necessary, because we get Objects
            return rect.getWidth() * rect.getHeight(); // area
        };
        DataSetv2 data = new DataSetv2(m);
        data.add(new Rectangle(5, 10, 20, 25));
        data.add(new Rectangle(10, 20, 30, 40));
        Rectangle rect = (Rectangle) data.getMaximum();
        System.out.println(rect.getWidth()); // 30.0 expected

        Measurer c = (Object obj)->{
            Rectangle rect2 = (Rectangle) obj;
            return rect2.getWidth()*rect2.getHeight(); //Area of the Rectangle
        };

        DataSetv2 data2 = new DataSetv2(c);
        data2.add(new Rectangle(5,5,5,5));
        Rectangle rect2 = (Rectangle) data.getMaximum();
        System.out.println(rect2.getWidth()); // 5 Expected
    }

}
