package lz.test;

import lz.test.service.IHelloWorldService;
import lz.test.service.impl.HelloWorldServiceImpl;
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
    private static HelloWorldServiceImpl helloWorldServiceImpl;

    public static void main( String[] args ) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application_context.xml");
//        helloWorldService = (IHelloWorldService) applicationContext.getBean("helloWorldServiceImpl");

        String name = "siyu";
        String hiMsg = helloWorldServiceImpl.sayHello(name);
        logger.info(hiMsg);
    }
}
