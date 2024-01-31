package com.mytests.spring.springautowiredimplementationsnavigation;

// NavigateToAutowiredCandidates suggests only usages in `InjectInterfaces`;
// the implementations injection (in `InjectImplementations`) are ignored - fixed

// NavigateToAutowiredCandidates should include the @Qualifier-annotated injections
// actually only not qualified ones are suggested
public interface SingleImplementationService {

    String getId();
}
