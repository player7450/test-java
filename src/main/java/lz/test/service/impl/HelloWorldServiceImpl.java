package lz.test.service.impl;

import lz.test.service.IHelloWorldService;
import org.springframework.stereotype.Component;

/**
 * Created by liuzheng on 16/7/20.
 */
@Component
public class HelloWorldServiceImpl implements IHelloWorldService {
    public String sayHello(String name) {
        String hiMsg = "hi, " + name;
        return hiMsg;
    }
}
