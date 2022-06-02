/* 
*An abstract class has a constructor which prints "This is constructor of abstract class",
*an abstract method named 'a_method' and a non-abstract method which prints "This is a normal
*method of abstract class". A 'Subclass' inherits the abstract class and has a method named
*'a_method' which prints "This is an abstract method".
*Now create an object of 'Subclass' and call the abstract method and the non-abstract method. 
*/

abstract class Abs{
    Abs(){
        System.out.println("This is constructor of abstract class");
    }
    public abstract void a_method();
    public void normal() {
        System.out.println("This is a normal method of abstract class");
    }
}
class Sub_class extends Abs{
    public void a_method() {
        System.out.println("This is an abstract method");
    }
}
public class Inheritance02 {
    public static void main(String[] args) {
    Sub_class s1obj = new Sub_class();
    s1obj.a_method();
    s1obj.normal();
    }  
}
