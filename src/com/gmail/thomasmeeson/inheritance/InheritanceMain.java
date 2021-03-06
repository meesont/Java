/*
 * Copyright (c) 2019. Thomas Meeson
 */

package com.gmail.thomasmeeson.inheritance;

public class InheritanceMain {


    public static void main(String[] args) {
        Sheep redSheep = new Sheep("Tom", 20, Classification.OMNIVORE, "RED");
        Sheep greenSheep = new Sheep("TheSheep", 20, Classification.HERBIVORE, "GREEN");
        Sheep defaultSheep = new Sheep("Sheepy", 19, Classification.OMNIVORE);

        Dog dog = new Dog("The dog", 9, Classification.OMNIVORE, "Rottwiler");
        dog.eat(); // calls Dog.eat(), and in turn calls the super method Animal.eat()
    }
}
