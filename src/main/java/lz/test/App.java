package lz.test;

import lz.test.service.HelloWorldService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * main entrance
 */
public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);
    @Autowired
    private static HelloWorldService helloWorldService;

    public static void main( String[] args ) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application_context.xml");
        helloWorldService = (HelloWorldService) applicationContext.getBean("helloWorldService");

        String name = "siyu";
        String hiMsg = helloWorldService.sayHello(name);
        logger.info(hiMsg);
    }
}
