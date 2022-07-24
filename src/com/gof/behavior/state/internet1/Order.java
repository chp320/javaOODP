package com.gof.behavior.state.internet1;

import java.util.HashMap;

/**
 * 상태 값에 따라 변경될 객체를 처리하는 메서드를 구현
 */
public class Order {
    private HashMap<String, State> state ;

    public Order() {
        this.state = new HashMap<>(){
            {
                put("ORDER", new StateOrder());
                put("PAY", new StatePay());
                put("ORDERED", new StateOrdered());
                put("FINISH", new StateFinish());
            }
        } ;
    }

    public void process(String status) {
        this.state.get(status).process();
    }
}
