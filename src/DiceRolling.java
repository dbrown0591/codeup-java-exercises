import java.util.Random;
import java.util.Scanner;

public class DiceRolling {
    public static void main(String[] args){

//        Ask the user to enter the number of sides for a pair of dice.
        System.out.println("Enter a number of sides for the dice");
//        Prompt the user to roll the dice.
        int n;
        Scanner scan = new Scanner(System.in);
            n = scan.nextInt();
       int dice1=(int)(n * Math.random()+1);
       int dice2=(int)(n* Math.random()+1);
       int sumOfDice = dice1+dice2;

        System.out.println("Total " + sumOfDice);
//        "Roll" two n-sided dice, display the results of each, and then ask the
//         user if he/she wants to roll the dice again.
//        Use static methods to implement the method(s) that generate the random numbers.
//        Use the .random method of the java.lang.Math class to generate random numbers.

    }
}
