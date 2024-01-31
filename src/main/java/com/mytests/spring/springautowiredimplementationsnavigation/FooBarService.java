package com.mytests.spring.springautowiredimplementationsnavigation;

// NavigateToAutowiredCandidates suggests only usages in `InjectInterfaces`;
// the implementations injection (in `InjectImplementations`) are ignored - fixed

// qualified injections (in both `InjectInterfaces` and `InjectImplementations`) are ignored
public interface FooBarService {
    String getId();
}
