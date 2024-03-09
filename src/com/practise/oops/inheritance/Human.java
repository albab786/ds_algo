package com.practise.oops.inheritance;

public class Human {
    String color;
    String country;
    int age;


    public Human(String color, String country, int age) {
        this.color = color;
        this.country = country;
        this.age = age;
    }
    void show(){
        System.out.println("human");
    }
}
