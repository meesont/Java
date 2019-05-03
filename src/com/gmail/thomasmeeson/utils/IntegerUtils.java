/*
 * Copyright (c) 2019. Thomas Meeson
 */

package com.gmail.thomasmeeson.utils;

import java.util.Random;

public class IntegerUtils {

    /**
     * A method for generating a random integer within a min/max range
     * @param min Minimum integer value for range
     * @param max Maximum integer value for range
     * @return Random integer within range of min and max
     * @throws IllegalArgumentException Minimum integer must be smaller than maximum integer
     */
    public int getRandIntInRange(int min, int max) throws IllegalArgumentException{
        if(min >= max){
            throw new IllegalArgumentException("Max must be greater than min");
        } else {
            Random r = new Random();
            return r.nextInt((max-min)+1) + min;
        }
    }
}
