package com.api.rest.helloworld.service;


import org.springframework.stereotype.Service;

@Service
public class MessageService implements IMessageService {

    @Override
    public String Sayhello() {
        return "Hello from Implemented Method";
    }
}
