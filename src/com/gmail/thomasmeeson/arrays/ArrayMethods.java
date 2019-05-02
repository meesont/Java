/*
 * Copyright (c) 2019. Thomas Meeson
 */

package com.gmail.thomasmeeson.arrays;

import com.gmail.thomasmeeson.utils.IntegerUtils;

public class ArrayMethods {

    private IntegerUtils iu = new IntegerUtils();

    /**
     *
     * @param size Size of the array to create
     * @param min Minimum integer value for range of integers to fill array with
     * @param max Maximum integer value for range of integers to fill array with
     * @return Int array of size {@param size} filled with values between {@param min} and {@param max}
     */
    public int[] produceRandomFilledArray(int size, int min, int max){
        int[] a = new int[size];

        for (int i = 0; i < a.length; i++) {
            a[i] = iu.getRandIntInRange(min, max);
        }

        return a;
    }

    /**
     * Outputs each element in an int array
     * @param arr Integer array to be output to console
     */
    public void printArray(int[] arr) {
        for (int a :
                arr) {
            System.out.println(a);
        }
    }

    /**
     * Outputs each element in a char array
     * @param arr Char array to be output to console
     */
    public void printArray(char[] arr) {
        for (char a :
                arr) {
            System.out.println(a);
        }
    }

}
