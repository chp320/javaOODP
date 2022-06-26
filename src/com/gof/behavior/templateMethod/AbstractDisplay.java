package com.gof.behavior.templateMethod;

/**
 * Template Method 패턴은 '추상 메서드'를 사용해서 처리 골격(와꾸)를 결정하고 sub class에서 구체화하는 방식
 * - 로직을 "공통화" 할 수 있는 장점이 있다.
 * Template Method 패턴 vs Strategy 패턴
 * - Template Method 는 '상속'을 이용해서 프로그램의 동작을 변경 (상위 클래스에서 큰 흐름을 결정, 하위 클래스에서 구체적인 흐름을 결정)
 * - Strategy 는 '위임'을 이용해서 프로그램의 동작을 변경 (알고리즘 전체를 변경)
 */
public abstract class AbstractDisplay {
    public abstract void open();

    public abstract void print();

    public abstract void close();

    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
