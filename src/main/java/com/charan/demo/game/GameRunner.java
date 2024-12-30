package com.charan.demo.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class GameRunner {
    private GamingConsole game;

    public GameRunner(@Qualifier("SuperContraGameQualifier") GamingConsole game)
    {
//        System.out.println("GameRunner Object created............!");
        this.game = game;
    }

    public void run() {
        System.out.println("Running game "+game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
