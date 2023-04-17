package com.api.rest.helloworld.service;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("turnon")
//@Primary
public class MessageService2 implements IMessageService{


    @Override
    public String Sayhello() {
        return "second impl";
    }
}
