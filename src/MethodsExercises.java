import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {




        System.out.println(addition(5, 5));
        System.out.println(subtraction(10, 5));
        System.out.println(multiplication(10, 35));
        System.out.println(division(10, 5));
        System.out.println(modulus(13, 7));
        System.out.println(getInteger(4, 7));


    }


    public static int addition(int number1, int number2) {
        return number1 + number2;
    }

    public static int subtraction(int number1, int number2) {
        return number1 - number2;
    }

    public static int multiplication(int number1, int number2) {
        return number1 * number2;
    }

    public static int division(int number1, int number2) {
        return number1 / number2;
    }

    //When you divide by zero using modulus you get zero.
    public static int modulus(int number1, int number2) {
        return number1 % number2;
    }


    public static int getInteger(int min, int max) {
        //prompt user for an integer in range of min and max
        //register the integer
        //check if registered integer is within range of min and max
            //if it is -> return the registered integer
            //if not -> start from the beginning of the body of code
        Scanner bob = new Scanner(System.in);
        int zach;
        do{
            System.out.println("Enter a number between "+min+" and "+max+": ");
            zach = bob.nextInt();
        }while(zach < min || zach > max);
        return zach;
    }

//    public static void factorial() {
//        // prompt user for input between 1 and 10
//        System.out.println("Enter a number between 1 and 10");
//        int imp = getInteger(1,10);
//        // take in number and use that number to calculate factorial
//            //take input
//        //display the factorial result
//    }
}


