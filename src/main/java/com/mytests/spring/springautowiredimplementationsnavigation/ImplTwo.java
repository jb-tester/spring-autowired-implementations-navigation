package com.mytests.spring.springautowiredimplementationsnavigation;

import org.springframework.stereotype.Component;

// NavigateToAutowiredDependencies  should not consider the dependencies of same super type but different implicit qualifier:
// the 'implOne' field should not be suggested as candidate here
@Component
public class ImplTwo implements OneTwoService {
}
