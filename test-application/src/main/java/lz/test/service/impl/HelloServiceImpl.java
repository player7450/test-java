package lz.test.service.impl;

import lz.test.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * Created by liuzheng on 16/7/20.
 */
@Service(value = "helloService")
public class HelloServiceImpl implements HelloService {
    public String sayHello(String name) {
        String hiMsg = "hi, " + name;
        return hiMsg;
    }
}
