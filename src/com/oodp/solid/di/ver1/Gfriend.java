package com.oodp.solid.di.ver1;

public class Gfriend extends Singer {
    @Override
    public void sayHello() {
        System.out.println("안녕하세요. 여자친구에요!");
    }

    @Override
    public void playLists() {
        String[] lists = {"시간을 달려서", "오늘부터 우리는", "유리구슬", "여름여름해"};

        System.out.println("======== 곡 리스트 ========");
        for (String list : lists) {
            System.out.println(list);
        }
        System.out.println();
    }
}
