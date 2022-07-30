package com.solid.isp.ex01.before;

/**
 * 인쇄 기능만 필요한 '현대프린터'기기.
 * 복합기 인터페이스를 구현하다보니 복사/팩스 기능은 불필요하여 호출 시 UnsupportedOperationException을 발생시킨다.
 * 만약 이를 모르는 클라이언트에서 복사/팩스 기능을 호출한다면 오류 발생한다.
 * ----------------------------------------------------------------------------------------
 * '현대프린터'는 불필요한 책임(복사/팩스)을 가지고 있다. -> SOLID 중 SRP 위배!
 */
public class 현대프린터 implements 복합기 {
    @Override
    public void 인쇄() {
        System.out.println("인쇄!");
    }

    @Override
    public void 복사() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void 팩스() {
        throw new UnsupportedOperationException();
    }
}
