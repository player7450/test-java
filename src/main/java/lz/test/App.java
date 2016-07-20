package lz.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args ) {
        String hiMsg = "hi, siyu!";
        logger.info(hiMsg);
    }
}
