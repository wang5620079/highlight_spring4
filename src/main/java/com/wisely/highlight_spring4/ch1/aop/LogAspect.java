package com.wisely.highlight_spring4.ch1.aop;

import java.lang.reflect.Method;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.aspectj.lang.reflect.MethodSignature;

/**
 * Created by wp on 18-8-18.
 */
@Aspect
@Component
public class LogAspect {
    @Pointcut("@annotation(com.wisely.highlight_spring4.ch1.aop.Action)")
    public void  annotationPointCut(){};

    @After("annotationPointCut()") //4
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截 " + action.name()); //5
    }

    @Before("execution(* com.wisely.highlight_spring4.ch1.aop.DemoMethodService.*(..))") //6
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截,"+method.getName());

    }
}
