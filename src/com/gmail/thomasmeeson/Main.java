/*
 * Copyright (c) 2019. Thomas Meeson
 */

package com.gmail.thomasmeeson;

import com.gmail.thomasmeeson.networking.URLs;
import com.gmail.thomasmeeson.utils.IntegerUtils;

import java.io.IOException;
import java.util.Arrays;

public class Main {

//    static ArrayMethods am = new ArrayMethods();
    private static IntegerUtils iu;
    private static URLs url;


    static {
        url = new URLs();
        iu = new IntegerUtils();
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        try {
            url.urlGetter("https://www.quora.com/");

        } catch (IOException e) {
            e.printStackTrace();
        }
//        arrays();
    }

    private static void arrays(){
//        int[] a = {1, 2, 3, 4, 5};

        int n = 20;
        int[] a = new int[n];
        int[] b = new int[50];

        for(int i = 0; i<a.length; i++){
            a[i] = iu.getRandIntInRange(0, 1000);
            b[i] = iu.getRandIntInRange(0, 20000);
        }

        for(int c: a){
            System.out.print(c + " ");
        }

        System.out.println();

        Arrays.sort(a);

        int arrLen = a.length;
        System.out.println("Length of array: " + arrLen);


//        char[] arr = new char[0];
//        char[] arr1 = new char[1];
//        char[] arr2 = new char[-1];
//        char[] arr3 = new char[10000000000000];
//        char[] arr4 = {'a', 'b', 'c', 'd'};


    }

    private static void refTypes(){
        String s1 =  new String("Hello");
        String s2 = new String("Hello");
        String s3 = s1;

        System.out.println(s1 == s2);
        System.out.println(s3 == s1);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }


}
