package com.gof.behavior.templateMethod.internet2;

public class StringDisplay extends AbstractDisplay {

    private String string ;
    private int width ;

    public StringDisplay(String string) {
        this.string = string;
        this.width = string.getBytes().length;  // 생성자로 전달된 문자열의 바이트 길이를 할당
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    // 클래스 안에서만 호출되는 메서드
    private void printLine() {
        System.out.print("+");
        for (int i = 0; i < width; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
