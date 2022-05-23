import java.util.Scanner;

class Shape{
    public void display(){
        System.out.println("This is a Circle");
    }

}
class Triangle extends Shape{
    public void display(){
        System.out.println("This is a Triangle");
    }
}
class Square{
    public void display(){
        System.out.println("This is a Square");
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n==0){
            Shape s1 = new Shape();
            s1.display();
        } else if (n==3) {
            Shape s2 = new Triangle();
            s2.display();
        } else if (n==4) {
            Square s3 = new Square();
            s3.display();
        }else {
            System.out.println("Please input valid sides");
        }
    }
}