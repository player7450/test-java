package lz.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * main entrance
 */
public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args ) {
        String hiMsg = "hi, siyu!";
        logger.info(hiMsg);
    }
}
