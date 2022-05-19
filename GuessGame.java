import java.util.*;
/**
 * GuessGame
 */
public class GuessGame {
    public static void main(String[] args) {
        //taking input from the user

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer between 1 to 100");
        int input = sc.nextInt();

        //Generating a random number using Random class

        Random rnd = new Random();
        int rand = rnd.nextInt(10)+1;
        System.out.println(rand);
        
        while(true){
            if (rand > input){
                System.out.println("Too low, Guess again !!");
            }
            if(rand < input) {
                System.out.println("Too High, Guess again !!");
            }
            if (rand == input){
                System.out.println("Your guess is correct, You WON !!");
            } break;
        }

    }
    
}