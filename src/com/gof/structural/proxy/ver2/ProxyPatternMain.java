package com.gof.structural.proxy.ver2;

public class ProxyPatternMain {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("test1.jpg");
        Image image2 = new ProxyImage("test2.jpg");

        image1.displayImage();
        image2.displayImage();
    }
}
