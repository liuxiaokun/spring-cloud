package com.fred.demo.demoeurekaclientconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author liuxiaokun
 * @version 1.0.0
 * @date 2018-06-15
 */
@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/route")
    public String route() {

        String result = restTemplate.getForObject("http://first-service-provider/first", String.class);
        return result;
    }
}
