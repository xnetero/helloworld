package com.api.rest.helloworld.Contoller;

import com.api.rest.helloworld.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Hello")
public class ControllerForService {

    @Autowired
    @Qualifier("turnon")
    private IMessageService service;

    @GetMapping("/One")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/two")
    public String serviceHey() {
        return service.Sayhello();
    }
}
