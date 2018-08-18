package com.wisely.highlight_spring4.ch1.javaconfig;

import com.wisely.highlight_spring4.ch1.javaconfig.FunctionService;

/**
 * Created by wp on 18-8-18.
 */
public class UseFunctionService {
    FunctionService functionService;
    public void setfunctionService(FunctionService functionService){
        this.functionService=functionService;
    }
    public String SayHello(String world){
        return functionService.sayHello(world);
    }
}
