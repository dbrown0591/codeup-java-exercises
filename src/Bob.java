import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        System.out.println("Say something to Bob");
        Scanner scan =new Scanner(System.in);

        String userInput =scan.nextLine();

        //Bob answers 'Sure'. if you ask him a question.
        boolean endsWithQuestionMark = userInput.endsWith("?");

        //Bob answers "Whoa, chill out! if you yell(Yelling is all uppercase or ending with a  ! character
        boolean isYelling = userInput.equals(userInput.toUpperCase()) || userInput.endsWith("!");

        //Bob say "Fine. Be that way" if you don't actually say anythig
        boolean didNotSayAnything = userInput.trim().isEmpty();

        if(endsWithQuestionMark){
            System.out.println("Sure");

        } else if(didNotSayAnything){
            System.out.println("Fine. Be that way");

        }else if(isYelling){
            System.out.println("Whoa, chill out");
        } else {
            System.out.println("Whatever");
        }

        }



    }

