/*
 * Copyright (c) 2019. Thomas Meeson
 */

package com.gmail.thomasmeeson.inheritance;

public class Dog extends Animal {

    private String breed;

    public Dog(String name, int age, Classification classification, String breed) {
        super(name, age, classification);
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        super.eat();
    }
}
