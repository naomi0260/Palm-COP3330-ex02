package example02;

/*
Create a program that prompts for an input string and displays output that shows the input string and the number of characters the string contains.

Example Output:
What is the input string? Homer
Homer has 5 characters.

Constraints:
Be sure the output contains the original string.
Use a single output statement to construct the output.
Use a built-in function of the programming language to determine the length of the string.

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
