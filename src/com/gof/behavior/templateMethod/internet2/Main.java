package com.gof.behavior.templateMethod.internet2;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay display1 = new CharDisplay('H');
        AbstractDisplay display2 = new StringDisplay("Hello, World!");
        AbstractDisplay display3 = new StringDisplay("안녕하세요.");

        display1.display();
        display2.display();
        display3.display();
    }
}
