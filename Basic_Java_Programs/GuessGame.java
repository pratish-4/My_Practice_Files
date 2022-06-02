import java.util.*;
/**
 * GuessGame
 */
public class GuessGame {
    public static void main(String[] args) {
     
        //Generating a random number using Random class
        Random rnd = new Random();
        int rand = rnd.nextInt(10)+1;
        System.out.println(rand);

           //taking input from the user
        Scanner sc = new Scanner(System.in);    
        
        while(true){
            System.out.println("Enter an integer between 1 to 100");
        int input = sc.nextInt();

            if(rand == input){
                System.out.println("Correct");
             break;
            }
            else if(rand > input){
                System.out.println("Too low");
            }
            else{
                System.out.println("Too High");
            }            
        }
        
    }
    
}