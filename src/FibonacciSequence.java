import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
//            int n = 50;
//            int t1 = 0;
//            int t2 = 1;
//            System.out.print("First " + n + " terms: ");
//
//            for (int i = 1; i <= n; ++i)
//            {
//                System.out.print(t1 + " + ");
//
//                int sum = t1 + t2;
//                t1 = t2;
//                t2 = sum;
//            }

        //create a property for n. n is going to be any number that is input by the user
        //a and b = 0 and 1 because the sequence starts with 0 and 1
        int n;
        int a = 0;
        int b = 1;
        System.out.print("Please input a number :");
        //Create a Scanner so that the user can input a number
        Scanner s = new Scanner(System.in);
        //I have an error telling me that "Variable n might not have been initialized.
        //That happened because the program reads from top to bottom.
        //n cannot be initialized after it is printed out
        n = s.nextInt();
        System.out.print("First " + n + " terms: ");

        System.out.print("Fibonacci Sequence ");

        //Create a for loop to loop from 1 to what ever n is(what ever the user chooses)
        for (int i = 1; i <= n; i++) {
            int sum = a + b;
            //Not sure why a=b yet
            //Oh it's because the program starts out with 1 1. b=1 and sum = a + b = 1 too
            a = b;
            b = sum;

            System.out.print(a + " + ");
        }


    }
}

