import java.util.Scanner;

public class TableOfPowers {
    public static void main(String[] args) {

        System.out.println("Please enter a number ");
        Scanner sc = new Scanner(System.in);

        int numEntered = sc.nextInt();

        System.out.println("Here is you table!");

        System.out.println("|Number | Squared | Cubed");
        System.out.println("|-------|-------- |------");

        for (int i = 1; i <= numEntered; i++) {
            String outPut = " ";
            outPut += String.format("|%-7d", i);
            outPut += String.format("|%-9d", i * i);
            outPut += String.format("|%d", i * i * i);
            System.out.println(outPut);

        }

        System.out.println("Do you want to continue Y/N?");

        while(true){
                Scanner scn = new Scanner(System.in);
                String userInput = scn.next();
            if (userInput.equalsIgnoreCase("y")) {
                System.out.println("Please enter a number.");
                Scanner sc1 = new Scanner(System.in);
                int num = sc1.nextInt();

                System.out.println("Here is you table!");

                System.out.println("|Number | Squared | Cubed");
                System.out.println("|-------|-------- |------");

                for (int j = 1; j <= num; j++) {
                    String replay = "";
                    replay += String.format("|%-7d", j);
                    replay += String.format("|%-9d", j * j);
                    replay += String.format("|%d", j * j * j);
                    System.out.println(replay);
                }


            } else if (userInput.equalsIgnoreCase("n")) {
                System.out.println("Good bye!! Thank you for playing!!");
                break;
            }
            System.out.println("Do you want to continue Y/N?");
        }

    }

}
