package NewPackage;

/**
 * Description
Write and design a program as per the given instructions:
Create a class ‘Cards’ and define suitable class variables for it.
Create a class ‘ClassicGame’ and define suitable class variables for it.
The constructor of the class ‘ClassicGame’ will take two cards as input and compare them.
First, compare the values on the cards; the card having the number 2 will lose to the card having the number 3.
If the numbers on the cards are the same, compare the suits of the two cards. The suits in order of priority are:
Spades > Diamond > Hearts > Clubs
Increase the point of the winner card by 1 and print the scores.

Input: Your program will take the following as input from the user:
Suit of card 1 as a string
The number on card 1.
Boolean value that represent its color (true=white and false= black)
Suit of card 2 as a string 
The number on card 2.
Boolean value that represent its color (true=white and false= black)

Output: The output will display the points of the two players.

Sample Input
hearts
3
true
diamonds
4
false

Sample Output
points of player 1: 0 
points of player 2: 1 

 */

 class Cards{
    int value;
    String suit;
    boolean color;
    public void setCards(int r, String suit, boolean color) {
        this.value = r;
        this.suit = suit;
        this.color = color;

 }
     //Write your code here.

     int getSuitPriority(String suitString) {

        //Write your code here.

    }


}
 class ClassicGame{

 }
public class Source01 {

    
}
