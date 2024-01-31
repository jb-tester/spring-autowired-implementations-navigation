package com.mytests.spring.springautowiredimplementationsnavigation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class InjectInterfaces {

    @Autowired
    private FooBarService fooService;

    @Autowired
    private FooBarService barService;

    @Autowired
    private SingleImplementationService singleImpl;

    @Autowired @Qualifier("fooService")
    private FooBarService fooServiceQualified;

    @Autowired @Qualifier("barService")
    private FooBarService barServiceQualified;

    @Autowired @Qualifier("singleImpl")
    private SingleImplementationService singleImplQualified;


}
