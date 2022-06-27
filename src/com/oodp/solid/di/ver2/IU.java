package com.oodp.solid.di.ver2;

public class IU extends Singer {
    @Override
    public void sayHello() {
        System.out.println("안녕하세요. 아이유에요!");
    }

    @Override
    public void playLists() {
        String[] lists = {"Celebrity", "Blueming", "밤편지", "금요일에 만나요", "좋은날"};

        System.out.println("======== 곡 리스트 ========");
        for (String list : lists) {
            System.out.println(list);
        }
        System.out.println();
    }
}
