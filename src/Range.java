package PACKAGE_NAME;

import java.util.Scanner;

public class Range {

    public static void main(String[] args){


        System.out.println(getInteger(1,10));
    }
    public static int getInteger(int min, int max) {
        System.out.println("Please enter a number between " + min + " and " + max);
        //I would like to return a string. Saying try again.
        int userInput;

        int no = 0;

        Scanner input = new Scanner(System.in);
        userInput = input.nextInt();

        if (userInput <= min || userInput >= max) {
            return no;
        }
        else{
            return userInput;
        }

    }
}
