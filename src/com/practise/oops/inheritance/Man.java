package com.practise.oops.inheritance;

public class Man extends Human{
    int height;
    String name;

    public Man(String color, String country, int age, int height, String name) {
        super(color, country, age);
        this.height = height;
        this.name = name;
    }
    @Override
    void show(){
        System.out.println("Man");
        super.show();
    }
}
