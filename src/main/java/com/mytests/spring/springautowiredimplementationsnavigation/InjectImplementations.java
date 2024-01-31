package com.mytests.spring.springautowiredimplementationsnavigation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class InjectImplementations {

    @Autowired
    private FooService fooService;

    @Autowired @Qualifier("fooService")
    private FooService fooServiceQualified;

    @Autowired
    private BarService barService;

    @Autowired @Qualifier("barService")
    private BarService barServiceQualified;

    @Autowired
    private SingleImpl singleImpl;

    @Autowired @Qualifier("singleImpl")
    private SingleImpl singleImplQualified;



}
