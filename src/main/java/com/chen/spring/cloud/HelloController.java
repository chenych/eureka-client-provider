package com.chen.spring.cloud;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenych on 2018/11/28.
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String home() {
        return "This is a trivial service that demonstrates how a Eureka Client can register with a Eureka Server";
    }

}
