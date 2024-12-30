package com.charan.demo.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraGameQualifier")
public class SuperContraGame implements GamingConsole {


    @Override
    public void up()
    {
        System.out.println("up");
    }

    @Override
    public void down()
    {
        System.out.println("Sit down");
    }

    @Override
    public void left()
    {
        System.out.println("Go back");
    }

    @Override
    public void right()
    {
        System.out.println("Shoot a bullet");
    }

}