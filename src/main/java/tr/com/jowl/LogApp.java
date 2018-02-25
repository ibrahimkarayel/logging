package tr.com.jowl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogApp {
    private static Logger logger = LoggerFactory.getLogger(LogApp.class);

    public static void main(String[] args) {
        logger.debug("Debug Global log message");
        logger.info("Info Global log message");
        logger.error("Error Global log message");

        int i=0;
        int entry[] =new int[]{1,3,5,7,8};
        logger.debug("Entry number: " + i + " is " + String.valueOf(entry[i]));


    }
}
