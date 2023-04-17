package com.api.rest.helloworld.Contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@Controller
@ResponseBody
public class Sayhey {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }


}
