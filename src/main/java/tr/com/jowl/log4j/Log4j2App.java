package tr.com.jowl.log4j;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2App {
    private static Logger logger = LogManager.getRootLogger();

    public static void main(String[] args) {
        logger.debug("Debug Log4j2 log message");
        logger.info("Info Log4j2 log message");
        logger.error("Error Log4j2 log message");

        try {
            badMethod();
        } catch (Exception e) {
            logger.error("something bad happen {}", e.getMessage());
        }

    }

    public static void badMethod() throws Exception {
        throw new Exception("Im bad method");
    }

}
