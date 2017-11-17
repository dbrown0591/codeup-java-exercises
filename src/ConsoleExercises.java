



import java.util.Scanner;

public class ConsoleExercises {
    public static void main (String[]args){
        int number;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer");
        number = in.nextInt();
        System.out.println(number);

        String wordPlay;
        String wordPlay1;
        String wordPlay2;
        Scanner word = new Scanner(System.in);
        System.out.println("Enter three words");
        wordPlay = word.next();
        wordPlay1 = word.next();
        wordPlay2 = word.next();
        System.out.println(wordPlay);
        System.out.println(wordPlay1);
        System.out.println(wordPlay2);


        String write;
        Scanner scribble = new Scanner(System.in);
        System.out.println("Write a sentence:");
        write = scribble.nextLine();
        System.out.println(write);


        //How to convert a string into a double => Double.parseDouble()
        Scanner calculate = new Scanner(System.in);
        System.out.println("Give me the area of the classroom. First enter the length.");
        double length = calculate.nextDouble();
        System.out.println("Now enter the width.");
        double width = calculate.nextDouble();
        double area = length*width;
        double perimeter = 2*length + 2*width;
        System.out.println("Area of Rectangle is:"+area);
        System.out.println("The perimeter is: " + perimeter);
    }
}

//Inputting something that is not an integer will show a message "Exception in thread "main"
// java.util.InputMismatchException."
//Next method does not catch all of the string. Have to use .nextLine to capture all of a string.