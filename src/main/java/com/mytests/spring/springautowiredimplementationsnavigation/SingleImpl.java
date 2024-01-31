package com.mytests.spring.springautowiredimplementationsnavigation;

import org.springframework.stereotype.Service;

// Navigate To Autowired Candidates is ok: all injection points are detected
@Service
public class SingleImpl implements SingleImplementationService {
    @Override
    public String getId() {
        return "single";
    }
}
