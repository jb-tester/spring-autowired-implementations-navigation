package com.mytests.spring.springautowiredimplementationsnavigation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class InjectImplementations {

    @Autowired
    private FooService fooService;

    @Autowired
    private BarService barService;

    @Autowired
    private SingleImpl singleImpl;


}
