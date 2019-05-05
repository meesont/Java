/*
 * Copyright (c) 2019. Thomas Meeson
 */

package com.gmail.thomasmeeson.io;

import java.util.Scanner;

public class UserInput {

    public void userInputTest(){
        Scanner scanner = new Scanner(System.in); // System.in is the standard java input stream
        System.out.println("Enter your name: ");
        String nxtLine = scanner.nextLine();

        System.out.println("hello " + nxtLine);
    }

}
