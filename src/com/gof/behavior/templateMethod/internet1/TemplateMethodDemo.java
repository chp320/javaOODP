package com.gof.behavior.templateMethod.internet1;

public class TemplateMethodDemo {
    public static void main(String[] args) {
        Game game = null ;

        game = new Cricket();
        game.play();

        System.out.println();

        game = new Football();
        game.play();
    }
}
