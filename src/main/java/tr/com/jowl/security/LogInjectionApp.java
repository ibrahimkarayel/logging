package tr.com.jowl.security;

import org.owasp.esapi.ESAPI;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tr.com.jowl.LogApp;

public class LogInjectionApp {
    private static final Logger logger = LoggerFactory.getLogger(LogApp.class);

    public static void main(String[] args) {
        logRedirect("viewCart");
        logRedirect("prev=viewCart\n[INFO ] 2018-02-26 22:15:15.379 [main] LogApp - [ibrahim] Account successfully created ");

        logWithdraw("300");
        logWithdraw("300 \n[INFO ] 2018-02-26 22:25:28.797 [main] LogApp -Amount reversed successfully");
    }

    private static void logRedirect(String previousPage) {
        logger.info("Previous page from request was:{} ", previousPage);
    }

    private static void logWithdraw(String amount) {
        logger.info("Amount credited  {}", amount);
    }

    public String encode(String message) {
        message = message.replace('\n', '_').replace('\r', '_')
                .replace('\t', '_');
        message = ESAPI.encoder().encodeForHTML(message);
        return message;
    }
}
