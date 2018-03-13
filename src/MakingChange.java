public class MakingChange {

    public static void main(String[] args){
        int money = 109;

        while(money > 0){
            if(money >= 25){
                System.out.println("Quarter");
                money -= 25;
            }
            else if (money >= 10){
                System.out.println("Dime");
                money -= 10;
            }
            else if(money >= 5){
                System.out.println("Nickle");
                money -= 5;
            }
            else if(money >= 1){
                System.out.println("Penny");
                money -= 1;
            }
        }
    }
}
