public class QueueAsLL {
    Node front;
    Node rear;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    public void insert(int data){
        if(rear == null){
            front = new Node(data);
            rear =  front;
        }
        else{
            Node newNode=  new Node(data);
            rear.next = newNode;
            rear=  newNode;
        }
    }
    public int Delete(){
        if(front == null){
            System.out.println("underflow");
            return -123;
        }
        else{
            if(front == rear){
                int del =  front.data;
                front =  null;
                rear = null;
                return del;
            }
            Node temp = front;
            front = front.next;
            temp.next = null;
            return temp.data;
        }
    }
    public void print(){
 
            Node temp = front;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
 
    }
    public static void main(String[] args) {
        QueueAsLL myQueue = new QueueAsLL();
        myQueue.insert(5);
        myQueue.insert(4);
        myQueue.insert(6);
        myQueue.insert(8);
        myQueue.insert(2);
        myQueue.print();
        myQueue.Delete();
        myQueue.print();
        myQueue.Delete();
        myQueue.print();
        myQueue.Delete();
        myQueue.print();
        myQueue.Delete();
        myQueue.print();
        myQueue.Delete();
        myQueue.print();
        myQueue.Delete();
        myQueue.print();
 
    }
 
}
 