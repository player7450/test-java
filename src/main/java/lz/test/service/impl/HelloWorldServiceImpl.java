package lz.test.service.impl;

import lz.test.service.HelloWorldService;
import org.springframework.stereotype.Component;

/**
 * Created by liuzheng on 16/7/20.
 */
@Component(value = "helloWorldService")
public class HelloWorldServiceImpl implements HelloWorldService {
    public String sayHello(String name) {
        String hiMsg = "hi, " + name;
        return hiMsg;
    }
}
