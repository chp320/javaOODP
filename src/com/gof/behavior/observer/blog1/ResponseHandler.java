package com.gof.behavior.observer.blog1;

import java.util.Observable;
import java.util.Observer;  /* 옵저버 */

public class ResponseHandler implements Observer {

    private String resp ;

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof String) {
            resp = (String) arg;
            System.out.println("\nReceived Response: " + resp);
        }
    }
}
