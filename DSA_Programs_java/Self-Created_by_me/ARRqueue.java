
public class ARRqueue {
    int arrDemo[];
    int front = -1;
    int rear = -1;
    ARRqueue(int length){
        arrDemo = new int [length];
    }

    public void pushForARRqueue(int data) {
        if(rear == arrDemo.length){
            System.out.println("Overflow Queue");
        }
        else {
        rear ++;
        arrDemo[rear]= data;
        }
    }
    public void popForARRqueue() {
        if(front == rear){
            System.out.println("Underflow Queue");
        }
        else{
        front++;
        arrDemo[front] = -123;
        }
    }
    public void printForARRqueue() {
        for (int i = 0; i < rear; i++) {
            front++;
            System.out.println(arrDemo[front]);
        }
    }
    public static void main(String[] args) {
        ARRqueue arr = new ARRqueue(6);
        arr.pushForARRqueue(0);
        arr.pushForARRqueue(1);
        arr.pushForARRqueue(2);
        arr.pushForARRqueue(3);
        arr.pushForARRqueue(4);
        arr.pushForARRqueue(5);
        arr.printForARRqueue();
                
    }
}