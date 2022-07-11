package com.gof.structural.adapter.volt;

public class SocketObjectAdapterImpl implements SocketAdapter {

    // using composition for adapter pattern
    private Socket socket = new Socket();

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        Volt v = socket.getVolt();
        return convertVolt(v, 10);
    }

    @Override
    public Volt get3Volt() {
        Volt v = socket.getVolt();
        return convertVolt(v, 40);
    }

    private Volt convertVolt(Volt volt, int value) {
        return new Volt(volt.getVolt() / value);
    }
}
