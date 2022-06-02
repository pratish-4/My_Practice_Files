public class StackusingArr {
    String [] name;
    int top = -1;
    StackusingArr(int len){
        name = new String [len];
    }

        // Method for adding elements in the stacked type array
    public void addElements(String names) {
            if(top ==name.length){
                System.out.println("Stack Overflow : elements cannot be added");
                return;
            }
            else {
                top++;
                name[top]=names;
            }
    }
        // Method for deleting the elements from the stacked array
    public void deleteElements(){
        if(top == -1){
         System.out.println("Stack Underflow : no elements for delete");
        ;
        }
        else {
            name[top] = "";
            top --;
        }
    }
        // Method for printing the stacked array
    public void print() {
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    } 
    public static void main(String[] args) {
        StackusingArr Students = new StackusingArr(5);
        Students.addElements("Pratish");
        Students.addElements("Abhyuday");
        Students.addElements("Pawan");
        Students.addElements("Rahul");
        Students.addElements("Prathamesh");
        Students.print();
        Students.deleteElements();
        Students.print();
    }
}
