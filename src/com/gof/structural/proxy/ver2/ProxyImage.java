package com.gof.structural.proxy.ver2;

public class ProxyImage implements Image {

    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void displayImage() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.displayImage();
    }
}
