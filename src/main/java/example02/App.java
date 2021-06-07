package example02;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Naomi Palm
 */

import java.util.Scanner;

public class App {

    static Scanner input = new Scanner(System.in);

    public static void main(String args[]){
        App newApp = new App();

        String inputString = newApp.getString();
        int stringLength = newApp.getLength(inputString);
        newApp.outPutString(inputString, stringLength);

    }

    private String getString(){
        System.out.print("What is your name: ");
        return input.nextLine();
    }

    private int getLength(String input){
        return input.length();
    }

    private void outPutString(String input, int length){
        System.out.printf("%s has %d characters.", input, length);
    }

}
