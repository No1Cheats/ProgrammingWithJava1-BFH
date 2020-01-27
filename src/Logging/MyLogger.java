package Logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyLogger {

    // Log Formatter
    static private MyLogFormatter simpleFormatter;
    // Log Handler (to a file)
    static private FileHandler logfile;

    static public void setup() throws IOException {
        // get the global logger to configure it
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

        // set log level to INFO
        logger.setLevel(Level.INFO);
        logfile = new FileHandler("logs.txt");

        // set our custom formatter
        simpleFormatter = new MyLogFormatter();
        logfile.setFormatter(simpleFormatter);
        logger.addHandler(logfile);
    }
}
