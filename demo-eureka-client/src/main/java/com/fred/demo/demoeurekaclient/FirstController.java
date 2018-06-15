package com.fred.demo.demoeurekaclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuxiaokun
 * @version 1.0.0
 * @date 2018-06-15
 */
@RestController
public class FirstController {

    @GetMapping("/first")
    public String first() {

        return "first";
    }
}
