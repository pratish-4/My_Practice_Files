package NewPackage;

import java.util.*;

/**'Number' class
 *Declare a parameterised constructor in the Number class that will take the real and imaginary parts of a number as input.
 *The Number class should contain the getter and setter methods for getting and setting the real and imaginary parts of a number.
 *Create two more classes ‘NewPackage.Complex’ and ‘NewPackage.PurelyImaginary’.
 *Class NewPackage.Complex extends the Number class and checks if the input number is complex or not using checkComplex().
 The NewPackage.PurelyImaginary class inherits the NewPackage.Complex class and decides if the input number is purely imaginary
 using checkPurelyImaginaryNumber().

 Input: Your program should take the following input:
 The first line will be the real part of the number.
 The next line will contain the imaginary part of the number.

 Output: The output of your program will consist of four lines:
 The first line will display the imaginary part of the input number.
 The next line will print “The given number is complex” if the number is complex; else, it will print “The given number is real”.
 The third line will display the number in the standard format, which is:
 x + iy.
 4. The last line will display “The number is purely imaginary” if the number is purely imaginary; else, it will print
 “The number is not purely imaginary”.


 Note: If the number is purely imaginary then print only the imaginary part of it like “i8”

 Sample Input:
 5
 1.6
 Sample Output:
 1.6
 The given number is complex
 5.0+i1.6
 The number is not purely imaginary */
/**
 * NewPackage.NumberClass
 */
class NumberClass {
        //Constructor
        int real, imaginary;
        NumberClass(int real, int imaginary){
                int n;
        }
        public int getReal(){
                return real;
        }
        public void setImaginary(int imaginary) {
                imaginary = this.imaginary;
        }
        public int getImaginary() {
                return imaginary;
        }
        public void setReal(int real) {
                real = this.real;
        }
        public void checkComplex() {
        }
}
class Complex extends NumberClass{

        Complex(int real, int imaginary) {
                super(real, imaginary);

        }

        public void checkComplex() {
                if (imaginary ==0){
                        System.out.println("The given number is complex");
                }
                else{ System.out.println("The given number is real");}
        }
}
class PurelyImaginary extends Complex{
        PurelyImaginary (int real, int imaginary){
                super(real, imaginary);
        }
        public void checkPurelyImaginaryNumber() {
                if(real == 0){
                        System.out.println("The number is purely imaginary");
                }
                else{System.out.println("The given number is real");}
        }
}
/**
 * NewPackage.ComplexNumber
 */
public class ComplexNumber {

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int r = sc.nextInt();
                int i = sc.nextInt();
                NumberClass n1c = new Complex(r,i);
                System.out.println(n1c.getImaginary());
                n1c.checkComplex();
                System.out.println(n1c.getReal()+"+i"+n1c.getImaginary());
                PurelyImaginary c1c = new PurelyImaginary(n1c.getReal(),n1c.getImaginary());
                c1c.checkPurelyImaginaryNumber();
        }
}
