import util.Input;
public class ArrayExercises {

    public static int getRandomIntBetween(int min, int max) {
        int randomNum = min + (int) (Math.random() * (max - min));
        System.out.println("Input a" + min + " and " + max);
        return randomNum;



    }

    public static void main(String[] args) {

//        ArrayExercises name1 = new ArrayExercises();
//        name1.getRandomIntBetween(1,10);
        int[] number = new int[100];
        for (int i = 0; i < number.length; i++) {
            number[i] = (int) (Math.random() * 100 + 1);
            System.out.println(number[i]);
        }



    }
}