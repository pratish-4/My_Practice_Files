/**
 *Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200
 * are deposited in banks A, B & C respectively. 'BankA','BankB'and'BankC' are subclasses of 
 * class 'Bank', each having a method named 'getBalance'. Call this method by creating an object
 * of each of the three classes.
 */

abstract class Bank{
  public abstract int getBalance();
}

class BankA{
   int balance = 100;
   public int getBalance(){
     return balance;
   }
}
class BankB{
  int balance = 150;
  public int getBalance(){
    return balance;
}
}
class BankC{
  int balance = 200;
  public int getBalance(){
    return balance;
}
}

public class InheritanceBank {
  public static void main(String[] args) {
    BankA ba = new BankA();
   System.out.println(ba.getBalance()); 
    BankB bb = new BankB();
   System.out.println( bb.getBalance());
    BankC bc = new BankC();
   System.out.println(bc.getBalance());
   }
    
}
