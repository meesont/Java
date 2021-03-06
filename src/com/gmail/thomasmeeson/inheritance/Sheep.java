/*
 * Copyright (c) 2019. Thomas Meeson
 */

package com.gmail.thomasmeeson.inheritance;

public class Sheep extends Animal {

    private String woolColour;

    /**
     *
     * @param name Name of the sheep
     * @param age Age of the sheep
     * @param classification Classification of the sheep
     * @param woolColour Colour of the sheep's wool
     */
    public Sheep(String name, int age, Classification classification, String woolColour) {
        super(name, age, classification);
        this.woolColour = woolColour;
    }

    /**
     *
     * @param name Name of the sheep
     * @param age Age of the sheep
     * @param classification Classification of the sheep
     */
    public Sheep(String name, int age, Classification classification) {
        super(name, age, classification);
        this.woolColour = "WHITE";
    }

    /**
     *
     * @return Colour of the sheep's wool
     */
    public String getWoolColour() {
        return woolColour;
    }

    /**
     *
     * @param woolColour The colour of the sheep's wool
     */
    public void setWoolColour(String woolColour) {
        this.woolColour = woolColour;
    }
//
//    public Sheep breedSheep(Sheep mother, Sheep father) {
//        if(mother.equals(father)) {
//            return null;
//        } else {
//
//        }
//    }
}
