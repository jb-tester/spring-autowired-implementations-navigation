package com.mytests.spring.springautowiredimplementationsnavigation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class InjectInterfaces {

    @Autowired
    private FooBarService fooService;

    @Autowired
    private FooBarService barService;

    @Autowired
    private SingleImplementationService singleImpl;


}
