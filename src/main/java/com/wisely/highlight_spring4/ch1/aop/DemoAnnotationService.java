package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * Created by wp on 18-8-18.
 */
@Service
public class DemoAnnotationService {
    @Action(name="注解方式拦截的add操作")
    public void add(){}
}
