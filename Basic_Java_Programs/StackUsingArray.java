public class StackUsingArray{
    private  int arr[];
    private int top;
    StackUsingArray(int n){
        arr = new int[n];
        top = -1;
    }
    public void insert(int data){
        
        if(top+1 == arr.length){
            System.out.println("stack overflow");
            return;
        }
        top++;
        arr[top] = data;
    }
    public int Delete(){
        if(top == -1){
            System.out.println("stack underflow");
            return -1;
        }
        int del = arr[top];
        arr[top] = -123;
        top--;
        return del;
    } 
    public static void main(String[] args) {
        StackUsingArray stack1 =  new StackUsingArray(5);
        stack1.insert(1);
        stack1.insert(2);
        stack1.insert(3);
        stack1.insert(4);
        stack1.insert(5);
        stack1.insert(6);
        stack1.printStack();
        int del=stack1.Delete();
        System.out.println("deleted value"+del);
        stack1.printStack();
        stack1.Delete();
        stack1.printStack();
        stack1.Delete();
        stack1.printStack();
        stack1.Delete();
        stack1.printStack();
        stack1.Delete();
        stack1.printStack();
        stack1.Delete();
        stack1.printStack();
        stack1.Delete();
        
    }
    public void printStack(){
        for (int i = 0; i <= top; i++) {
            
            System.out.print(arr[i]+" ");
            if(i == top){
                System.out.println();
            }
        }
    }

}
