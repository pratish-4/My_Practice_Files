public class LLqueue {
    // Creating a node class for the linked list
    Node front;
    Node rear;
    class Node{
        Node next;
        int data;
        // Parametric Constructor for Node
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void pushForLLqueue(int data) {
        Node n1 = new Node(data);
        if(rear == null && front == null){
            rear = n1;
            front = n1;
        }
        else {
            rear.next = n1;
            rear =n1;
        }
    }
    public void popForLLqueue() {
        if(rear == null && front == null){
            System.out.println("UnderFlow Queue");
        }
        else{
            Node newFront = front.next;
            front = newFront;
        }
    }
    public void peekForLLqueue() {
        if(rear ==null){
            System.out.println("No nodes to peek");
        }
        else {
            System.out.println(rear.data);
        }
    }
    public void printForLLqueue() {
        if(rear == null){
            System.out.println("No nodes to print");
        }
        else {
            Node temp = front;
            while(temp !=null ){
                System.out.println(temp.data+" ");
                temp = temp.next;
            }
            
        }
    }

    public static void main(String[] args) {
        LLqueue LL01 = new LLqueue();
        LL01.pushForLLqueue(34);
        LL01.pushForLLqueue(28);
        LL01.pushForLLqueue(64);
        LL01.printForLLqueue();
        System.out.println("Just pop 1");
        LL01.popForLLqueue();
        LL01.printForLLqueue();
    }
    
}
