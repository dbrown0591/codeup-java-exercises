import java.util.Random;
import java.util.Scanner;

public class HighLowGuessingGame {
    public static void main(String[] args){
//    Game picks a random number between 1 and 100.
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int number = rand.nextInt(100);
        int guess = -1;

        while(guess != number){
//    Prompts user to guess the number
        System.out.println("Please input a number");
            guess = scan.nextInt();

//    If user's guess is more than the number, it outputs "LOWER"
            if(guess<number){
                System.out.println("Too low please try again");
            }
//    If user's guess is less than the number, it outputs "HIGHER"
            else if(guess>number){
                System.out.println("Too high please try again");
            }
//    If a user guesses the number, the game should declare "GOOD GUESS!"
            else{
                System.out.println("Correct, the number was " + number);
            }

        }
//    All user inputs are validated

    }
}
