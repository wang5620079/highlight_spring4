package com.wisely.highlight_spring4.ch1.javaconfig;

import com.wisely.highlight_spring4.ch1.javaconfig.FunctionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wp on 18-8-18.
 */
@Configuration
public class JavaConfig {
    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }

    @Bean
    public UseFunctionService useFunctionService(){
        UseFunctionService useFunctionService= new UseFunctionService();
        useFunctionService.setfunctionService(functionService());
        return useFunctionService;
    }

}
