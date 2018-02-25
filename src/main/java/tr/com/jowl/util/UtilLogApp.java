package tr.com.jowl.util;


import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UtilLogApp {

    private static Logger logger = Logger.getLogger(UtilLogApp.class.getName());
    private static FileHandler fh;

    static {
        try {
            fh = new FileHandler("util.log");
        } catch (IOException e) {

        }
    }

    public static void main(String[] args) {
        logger.addHandler(fh);
        logger.setLevel(Level.ALL);

        logger.info("Do something");
        try {
            badMethod();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "trouble", e);
        }
        logger.fine("done");
    }

    public static void badMethod() throws Exception {
        throw new Exception("Im bad method");
    }

}
