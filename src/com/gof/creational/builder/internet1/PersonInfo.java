package com.gof.creational.builder.internet1;

/*
 * 제약사항: 이 객체는 한 번 생성되면 읽기(read)만 가능해야 한다 -> getter만 사용할 수 있다.
 */
public class PersonInfo {
    private String name ;
    private Integer age ;
    private String favoriteColor ;
    private String favoriteAnimal ;
    private Integer favoriteNumber ;

    public PersonInfo(String name, Integer age, String favoriteColor, String favoriteAnimal, Integer favoriteNumber) {
        this.name = name;
        this.age = age;
        this.favoriteColor = favoriteColor;
        this.favoriteAnimal = favoriteAnimal;
        this.favoriteNumber = favoriteNumber;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public String getFavoriteAnimal() {
        return favoriteAnimal;
    }

    public Integer getFavoriteNumber() {
        return favoriteNumber;
    }

    public String getPersonInfo() {
        String personInfo = String.format("name: %s, age: %d, favoriteColor: %s, favoriteAnimal: %s, favoriteNumber: %d"
                , name, age, favoriteColor, favoriteAnimal, favoriteNumber);
        return personInfo;
    }
}
