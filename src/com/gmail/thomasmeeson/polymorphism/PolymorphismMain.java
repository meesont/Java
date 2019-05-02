/*
 * Copyright (c) 2019. Thomas Meeson
 */

package com.gmail.thomasmeeson.polymorphism;

public class PolymorphismMain {


    public static void main(String[] args) {
        Sheep redSheep = new Sheep("Tom", 20, Classification.OMNIVORE, "red");
        Sheep defaultSheep = new Sheep("Sheepy", 19, Classification.OMNIVORE);
        Animal dog = new Sheep("Bob", 20, Classification.CARNIVORE);
    }
}
