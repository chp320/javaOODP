package com.gof.structural.proxy.ver2;

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("loading...  " + fileName);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Thread.sleep fall in error!");
        }
    }

    @Override
    public void displayImage() {
        System.out.println("display: " + fileName);
    }
}
