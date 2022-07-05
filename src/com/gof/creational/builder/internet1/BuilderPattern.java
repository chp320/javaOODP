package com.gof.creational.builder.internet1;

public class BuilderPattern {
    public static void main(String[] args) {
        PersonInfoBuilder personInfoBuilder = new PersonInfoBuilder();
        // 빌더 패턴을 통해 순서에 상관없이 객체 생성 가능하고, 사용자 관점에서 명시적으로 이해 가능
        PersonInfo result = personInfoBuilder
                .setName("MISTAKE")
                .setFavoriteAnimal("cat")
                .setFavoriteColor("black")
                .setAge(16)
                .build() ;
        System.out.println(result.getPersonInfo());
    }
}
