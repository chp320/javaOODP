package com.gof.structural.composite.somuchthingsTistory;

public class CompositePatternDemo {
    public static void main(String[] args) {

        MenuComponent pancakeHouseMenu = new Menu("팬케이크 하우스 메뉴", "아침 메뉴");
        MenuComponent dinerMenu = new Menu("점심 식당 메뉴", "점심 메뉴");
        MenuComponent cafeMenu = new Menu("카페 메뉴", "카페 메뉴");
        MenuComponent dessertMenu = new Menu("디저트 메뉴", "맛있는 디저트");

        MenuComponent allMenus = new Menu("전체 메뉴", "전체 메뉴");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        pancakeHouseMenu.add(new MenuItem(
                "팬케이크 세트 A", "우리 가게 대표 메뉴", true, 2.99));
        pancakeHouseMenu.add(new MenuItem(
                "팬케이크 세트 B", "두 번째로 출시한 팬케이크 세트 메뉴", true, 2.99));
        pancakeHouseMenu.add(new MenuItem(
                "레귤러 팬케이크 세트", "달걀 후라이와 소시지가 들어가 있는 팬케이크", false, 3.19));

        dinerMenu.add(new MenuItem(
                "점심 세트 A", "우리 가게 대표 메뉴", true, 2.95));
        dinerMenu.add(new MenuItem(
                "점심 세트 B", "두 번째로 출시한 점심 세트 메뉴", true, 2.95));
        dinerMenu.add(new MenuItem(
                "핫도그 세트", "양파, 치즈, 많은 양념이 들어간 핫도그", false, 3.15));

        cafeMenu.add(new MenuItem(
                "아메리카노", "원두의 향이 느껴지는 아메리카노", true, 1.29));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem(
                "애플 파이", "바삭바삭한 애플 파이", true, 1.59));

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
    }
}
