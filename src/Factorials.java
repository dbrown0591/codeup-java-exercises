import java.util.Scanner;

public class Factorials {
    public static void main(String[] args){

//    Prompt the user to enter an integer from 1 to 10.
        System.out.println("Enter a number between 1 and 10");
//    Display the factorial of the number entered by the user.
        int scan;
        int fact = 1;

        Scanner sc = new Scanner(System.in);
        scan = sc.nextInt();
        System.out.println("Great! You entered " + scan +"!");

//    Ask if the user wants to continue.
        System.out.println("Do you want to continue?");

//    Use a for loop to calculate the factorial.
        for(int i =1; i<=scan; i++){
            fact = fact*i;
        }
        System.out.println("Factorial of " + scan + "! is " + fact);
    }



//    Assume that the user will enter an integer, but verify it’s between 1 and 10.
//    Use the long type to store the factorial.
//    Continue only if the user agrees to.
//    A factorial is a number multiplied by each of the numbers before it.
}
