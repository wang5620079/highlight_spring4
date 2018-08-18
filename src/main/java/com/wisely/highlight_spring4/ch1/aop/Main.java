package com.wisely.highlight_spring4.ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wp on 18-8-18.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);

        demoAnnotationService.add();
        demoMethodService.add();
        context.close();

    }
}
