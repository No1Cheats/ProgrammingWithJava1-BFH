package Logging;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SomeClass {

    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);


    public void method1() {

        try {
            // ... something that can throw an exception
            int i = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            LOGGER.log(Level.SEVERE, "This String is not a number.", e);
        }

    }

    public static void main(String[] args) {
        SomeClass obj = new SomeClass();
        try {
            MyLogger.setup();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Problems with creating the log files");
        }
        obj.method1();
    }


}
