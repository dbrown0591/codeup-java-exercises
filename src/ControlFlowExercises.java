import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i < 15){
//            i++;
//            System.out.println(i);

//            int j = 0;
//            do {
//                j += 2;
//                System.out.println(j);
//
//            } while (j < 100);

//                int m = 105;
//                do{
//                    m -= 5;
//                    System.out.println(m);
//                }while(m > 10);
//
//                    long k = 2;
//                do{
//                    System.out.println(k);
//                    k *= k;
//                }while(k <= 1000000);

//        for (long i = 2; i < 1000000; i *=i){
//            System.out.println(i);
//        }
//
//        for (int i = 100; i >= 10; i -= 5){
//            System.out.println(i);
//        }


//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else {
//                System.out.println(i);
//
//            }
//        }


        Scanner sc = new Scanner(System.in);

        System.out.print("What number would you like to fo up to?");
        int userInt = sc.nextInt();

        System.out.println("\nHere is your table");
        System.out.println("\nnumber | squared | cubed");
        System.out.println("------ | ------- | -----");


        for(int i = 1; i<=userInt; i+=1){
            String output = "";
            output += String.format("|%-7d", i);
            output += String.format("|%-9d", i*i);
            output += String.format("|%d", i*i*i);
            System.out.println(output);
        }
//        Scanner sc = new Scanner(System.in);
//        String userChoice;
//
//        System.out.println("Please enter a numeric grade: ");
//        int gradeEntered = sc.nextInt();
//        char letterGrade = ' ';
//
//        if (gradeEntered >= 88){
//            letterGrade = 'A';
//        }
//        else if(gradeEntered >= 80){
//            letterGrade = 'B';
//        }
//        else if(gradeEntered >= 67){
//            letterGrade = 'C';
//        }
//        else if(gradeEntered >= 60){
//            letterGrade = 'D';
//        }
//        else if(gradeEntered >= 0){
//            letterGrade = 'F';
//        }
//        System.out.println(letterGrade);

    }
}



