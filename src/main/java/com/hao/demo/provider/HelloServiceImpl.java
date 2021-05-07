package com.hao.demo.provider;

import com.hao.demo.api.service.HelloService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Component
@Service
public class HelloServiceImpl implements HelloService {


    @Override
    public String sayHello(String s) {
        return "Hello" + s;
    }
}
