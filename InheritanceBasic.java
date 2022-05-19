/**
 * Create an abstract class 'Parent' with a method 'message'. It has two subclasses
 * each having a method with the same name 'message' that prints "This is first subclass"
 * and "This is Second subclass" respectively.
 * Call this method by creating an object of each subclasses.
 * 
 */
abstract class Parent{
     public void message() {
     
    }
}
class subclass01 extends Parent{
    public  void message() {
        System.out.println("This is First subclass");
    }
}
class subclass02 extends Parent{
    public void message() {
        System.out.println("This is Second subclass");
    }
}
public class InheritanceBasic {
    public static void main(String[] args) {
        subclass01 s1 = new subclass01();
        s1.message();
        subclass02 s2 = new subclass02();
        s2.message();
    }
}
