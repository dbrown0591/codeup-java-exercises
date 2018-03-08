import java.util.Scanner;

public class ConvertGrades {

    public static void main(String[] args){
        //Convert given numbers grades into letter grades

        System.out.println("Please enter a number grade. Enter a number any number from 0 to 100.");
        Scanner sc = new Scanner(System.in);
        int grades = sc.nextInt();

            if(grades>=99){
                System.out.println("A+");
            }
            else if(grades>=88){
                System.out.println("A");
            }
            else if(grades>=80){
                System.out.println("B");
            }
            else if(grades>=67){
                System.out.println("C");
            }
            else if(grades>=60){
                System.out.println("D");
            }
            else if(grades<=59){
                System.out.println("F");
            }
            System.out.println("Would you like to continue? Y/N");


            while(true) {
                Scanner scn = new Scanner(System.in);
                String enterGrade = scn.nextLine();
                if (enterGrade.equalsIgnoreCase("y")) {
                    System.out.println("Please input another number");
                    Scanner sc1 = new Scanner(System.in);
                    int input = sc1.nextInt();

                    if (input>=99){
                        System.out.println("A+");
                    }
                    else if (input>=88) {
                        System.out.println("A");
                    }
                    else if (input>=80) {
                        System.out.println("B");
                    }
                    else if (input>=67) {
                        System.out.println("C");
                    }
                    else if (input>=60) {
                        System.out.println("D");
                    }
                    else if (input<=59) {
                        System.out.println("F");
                    }

                }
                else if (enterGrade.equalsIgnoreCase("n")) {
                    System.out.println("Good bye!!! Thank you for playing!!!");
                    break;
                }
                System.out.println("Do you want to continue Y/N?");
            }



    }
}
