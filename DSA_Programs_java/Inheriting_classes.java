package NewPackage;

class Employee{
    String name;
    int age;
    public Employee(String n,int a){
        this.name = n;
        this.age = a;
    }


}
class Manager extends  Employee{
    Manager(String name,int age){
        super(name,age);
    }
    public void call(){
        System.out.println("I am a Manager"+"My name is :"+name);
    }

}
class Supervisor extends Manager{
    Supervisor (String name,int age,String dept){
        super(name,age);k
    }
    public void call(){
        System.out.println("I am a Supervisor"+"My name is :"+name);
    }

}
public class Inheriting_classes {
    public static void main(String[] args) {
        Manager m1 = new Supervisor("Ram",30,"Planning");
        m1.call();
    }
}
