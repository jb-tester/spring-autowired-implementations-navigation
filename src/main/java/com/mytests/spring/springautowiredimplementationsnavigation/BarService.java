package com.mytests.spring.springautowiredimplementationsnavigation;

import org.springframework.stereotype.Service;

 
@Service
public class BarService implements FooBarService {
    @Override
    public String getId() {
        return "bar";
    }
}
