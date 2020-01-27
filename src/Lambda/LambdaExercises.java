package Lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExercises {

    public static List<Integer> list;

    public static void threeTimes() {
        list.replaceAll(x -> 3*x);
    }

    public static void tenTimes() {
        list.replaceAll(x -> 10*x);
    }

    public static void rightDigit() {
        list.replaceAll(x -> x%10);
    }

    public static void square() {
        list.replaceAll(x -> x*x);
    }

    public static void root(){
        list.replaceAll(x -> (int)Math.sqrt(x)); //Cast because sqrt() should be applied to Doubles not ints
    }

    public static void main(String[] args) {
        list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(42);
        list.add(155);

        System.out.println(list);
        threeTimes();
        System.out.println(list);
        rightDigit();
        System.out.println(list);
        square();
        System.out.println(list);
        root();
        System.out.println(list);
        tenTimes();
        System.out.println(list);
    }


}
