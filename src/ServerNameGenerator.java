import java.util.Random;

public class ServerNameGenerator {


    public static void main(String[] args){
    String[] adjectives = {"quick", "brave", "calm", "eager", "gentle", "happy", "delightful", "small", "large", "high","young"};


    String[] nouns = {"mother", "father","sister","bother","cousin","son","niece","nephew","grandmother","grandfather"};

        int rnd = new Random().nextInt(adjectives.length);
        int ran = new Random().nextInt(adjectives.length);
        System.out.println( "Your server name is " + adjectives[rnd] + " " + nouns[ran]);


    }
}
