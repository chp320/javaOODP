package com.oodp.wikibooks.ex_yes_di;

public class DiDemo {
    public static void main(String[] args) {
        DevWay devWay = new UseBatch();
        Developer developer = new Developer(devWay);
        
        System.out.println(developer.getDevWay());
    }
}
