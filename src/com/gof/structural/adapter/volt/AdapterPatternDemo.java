package com.gof.structural.adapter.volt;

/**
 * reference
 * https://readystory.tistory.com/125
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {
        runClassAdapter();
//        runObjectAdapter();
    }

    private static void runClassAdapter() {
        SocketAdapter socketAdapter = new SocketClassAdapterImpl();
        Volt v3 = getVolt(socketAdapter, 3);
        Volt v12 = getVolt(socketAdapter, 12);
        Volt v120 = getVolt(socketAdapter, 120);

        System.out.println("v3.getVolt() = " + v3.getVolt());
        System.out.println("v12.getVolt() = " + v12.getVolt());
        System.out.println("v120.getVolt() = " + v120.getVolt());
    }

    private static Volt getVolt(SocketAdapter sa, int i) {
        switch (i) {
            case 120:
                return sa.get120Volt();
            case 12:
                return sa.get12Volt();
            case 3:
                return sa.get3Volt();
            default:
                throw new IllegalArgumentException("Unknown i " + i);
        }
    }

}
