package com.charan.demo.game;

import org.springframework.context.annotation.*;


//@ComponentScan("package com.charan.demo.game;")

@Configuration
@ComponentScan
public class GamingAppLauncherApplication {
    
    public static void main(String[] args)
    {
        try(var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
//            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        };

    }
}


//        var gameMario = new MarioGame();
//        var gameSuper = new SuperContraGame();
//        var gamePac = new PacMan();
//        var gameRunner = new GameRunner(gamePac);
//        gameRunner.run();