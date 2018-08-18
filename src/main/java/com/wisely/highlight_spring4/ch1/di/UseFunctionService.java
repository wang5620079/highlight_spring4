package com.wisely.highlight_spring4.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wp on 18-8-18.
 */
@Service
public class UseFunctionService {
    @Autowired
    FunctionService functionService;
    public String sayHello(String word){
        return functionService.sayHello(word);
    }
}
