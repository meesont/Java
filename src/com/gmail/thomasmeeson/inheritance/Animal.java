/*
 * Copyright (c) 2019. Thomas Meeson
 */

package com.gmail.thomasmeeson.inheritance;

public class Animal {

    String name;
    int age;
    Classification classification;

    /**
     * Constructor for the Animal class
     * @param name The name of the animal
     * @param age The age of the animal
     * @param classification The classification of the animal, choice of Herbivore, Omnivore and Carnivore
     */
    public Animal(String name, int age, Classification classification) {
        this.name = name;
        this.age = age;
        this.classification = classification;
    }

    /**
     * Default constructor, uses this keyword to call the other constructor
     */
    public Animal() {
        this("Default", 10, Classification.UNKNOWN);
    }

    /**
     *
     * @return The name of the animal
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name The name of the animal
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return The age of the animal
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @param age The age of the animal
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @return The classification of the animal
     */
    public Classification getClassification() {
        return classification;
    }

    /**
     *
     * @param classification The classification of the animal
     */
    public void setClassification(Classification classification) {
        this.classification = classification;
    }

    public void eat() {
        System.out.println("Animal.eat() called");
    }


}
