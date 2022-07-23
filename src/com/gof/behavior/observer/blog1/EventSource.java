package com.gof.behavior.observer.blog1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Observable;    /* 옵저버에게 신호를 보내는 주체 */

/**
 * 설명)
 * - 옵저버 패턴은 객체의 상태 변화를 관찰하는 '옵저버'의 목록을 객체에 등록 후 변화가 있을 때마다
 *   메서드 등을 통해 객체가 직접 목록의 각 옵저버에게 통지하도록 하는 디자인 패턴.
 * - 주로 분산 이벤트 핸들링 시스템을 구현하는데 사용. 발행/구독 모델로 알려져 있음.
 *
 * 참고) https://m.blog.naver.com/dktmrorl/222091486735
 */
public class EventSource extends Observable implements Runnable {
    @Override
    public void run() {
        try {
            final InputStreamReader isr = new InputStreamReader(System.in);
            final BufferedReader br = new BufferedReader(isr);
            while (true) {
                final String response = br.readLine();
                setChanged();
                notifyObservers(response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
