///*
//*We have to calculate the area of a rectangle, a square and a circle.
//*Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea'
//*taking two parameters,'SquareArea'and'CircleArea' taking one parameter each.
//*The parameters of 'RectangleArea'are its length and breadth, that of 'SqaureArea'
//*is its side and that of 'CircleArea' is its radius. Now create another class 'Area01'
//*containing all the three methods 'RectangleAre','SquareArea'and 'CircleArea'for printing
//*the area of rectangle, sqaure and circle respectively. Create an object of class 'Area01'
//*and call all the three methods.
//*/
//abstract class Shape{
//    public Shape(Object o) {
//    }
//
//    public abstract double rectarea(double l, double b);
//    public abstract double squarearea(double s);
//    public abstract double circlearea(double r);
//}
//public class Area01 extends Shape{
//
//    public double rectarea(double l, double b) {
//        double area = l * b;
//        return area;
//    }
//    public double squarearea(double s) {
//        double area = s * 2;
//        return area;
//    }
//    public double circlearea(double r){
//        double area = 2 * 3.14 * r;
//        return area;
//    }
//    public static void main(String[] args) {
//        Area01 a1 = new Area01();
//        System.out.println(a1.rectarea(6, 4));
//        System.out.println(a1.squarearea(4));
//        System.out.printf("%.2f",a1.circlearea(5));
//    }
//
//}
