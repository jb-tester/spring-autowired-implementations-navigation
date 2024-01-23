package com.mytests.spring.springautowiredimplementationsnavigation;

import org.springframework.stereotype.Service;

@Service
public class SingleImpl implements SingleImplementationService {
    @Override
    public String getId() {
        return "single";
    }
}
