package com.mytests.spring.springautowiredimplementationsnavigation;

import org.springframework.stereotype.Service;

 
@Service
public class FooService implements FooBarService {
    @Override
    public String getId() {
        return "foo";
    }
}
