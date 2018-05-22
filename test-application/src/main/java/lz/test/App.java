package lz.test;

import lz.test.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

/**
 * main entrance
 */
public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);
    @Resource
    private static HelloService helloService;

    public static void main( String[] args ) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application_context.xml");
        helloService = (HelloService) applicationContext.getBean("helloService");

        String name = "siyu";
        String hiMsg = helloService.sayHello(name);
        logger.info(hiMsg);
    }

    public static void foo() {
        
    }

}
