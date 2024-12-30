package com.charan.demo.examples.a2Ex1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;





@Configuration
@ComponentScan
public class ExerciseSpringContextLauncherApplication {


    public static void main(String[] args)
    {
        try(var context =
                    new AnnotationConfigApplicationContext
                            (ExerciseSpringContextLauncherApplication.class)) {

//            Arrays.stream(context.getBeanDefinitionNames())
//                    .forEach(System.out::println);

            System.out.println(context.getBean(BusinessCalculationService.class).findmax());

        };

    }
}