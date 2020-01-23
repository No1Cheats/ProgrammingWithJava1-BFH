package Streams;

import java.util.function.Function;

/*
 * Example based on https://www.baeldung.com/java-8-functional-interfaces
 */

public class TestProgram2 {

    public static void main(String[] args) {

        /*
         * Function interface:
         * Example 1: Integer is the parameter, String is
         * the return type.
         */
        Function<Integer, String> intToString1 = (x -> x.toString());
        // is the same as:
        Function<Integer, String> intToString = Object::toString;

        /*
         * Example 2: String is the parameter, String is the return type
         */
        Function<String, String> quote = s -> "'" + s + "'";

        /*
         * The Function interface has a default compose method, to combine functions
         */
        Function<Integer, String> quoteIntToString = quote.compose(intToString);

        /*
         * Apply method of the Function to actually use it
         */
        System.out.println(quoteIntToString.apply(5));

    }

}
