package lz.test;

import com.google.common.collect.Lists;
import lz.test.service.IHelloWorldService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * main entrance
 */
public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);
    @Autowired
    private static IHelloWorldService helloWorldService;

    public static void main( String[] args ) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application_context.xml");
        helloWorldService = (IHelloWorldService) applicationContext.getBean("helloWorldServiceImpl");

        String name = "siyu";
        String hiMsg = helloWorldService.sayHello(name);
        logger.info(hiMsg);

        testNull();
    }

    public static void testNull() {
        List<String> abc = null;
//        abc = Lists.newArrayList("a", "b", "c");
        for (String str : abc) {
            System.out.println(str);
        }
    }
}
