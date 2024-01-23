package com.mytests.spring.springautowiredimplementationsnavigation;

// NavigateToAutowiredCandidates suggests only usages in `InjectInterfaces`;
// the implementations injection (in `InjectImplementations`) are ignored
public interface SingleImplementationService {

    String getId();
}
