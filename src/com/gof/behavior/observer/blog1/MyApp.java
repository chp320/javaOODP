package com.gof.behavior.observer.blog1;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("Enter Text > ");

        // 이벤트 발행 주체를 생성 - stdin으로부터 문자열을 입력받음
        final EventSource eventSource = new EventSource();

        // 옵저버 생성
        final ResponseHandler responseHandler = new ResponseHandler();

        // 옵저버가 발행 주체가 발행하는 이벤트를 구독하게 함 (즉, 관찰하는 대상을 등록)
        eventSource.addObserver(responseHandler);

        // 이벤트 발행 쓰레드 시작
        Thread thread = new Thread(eventSource);
        thread.start();
    }
}
