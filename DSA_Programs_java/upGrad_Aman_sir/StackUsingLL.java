import org.jcp.xml.dsig.internal.SignerOutputStream;

public class StackUsingLL {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data =  data;
            next = null;
        }
    }
    StackUsingLL(){
        head= null;
    }
    public void insert(int data){
        if(head == null){
            head =  new Node(data);
        }
        else{
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
    }
    public int Delete(){
        if(head == null){
            System.out.println("stack underflow");
            return -1;
        }
        Node temp = head;
        head = head.next;
        temp.next = null;
        return temp.data;

    }
    public void print(){
        if(head == null){
            System.out.println("Stack is empty");
        }
        else{
            Node temp =  head;
            while(temp != null){
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        StackUsingLL stack1 = new StackUsingLL();
        stack1.insert(1);
        stack1.insert(2);
        stack1.insert(3);
        stack1.insert(4);
        stack1.insert(5);
        stack1.insert(6);
        stack1.print();
        int del = stack1.Delete();
        System.out.println("deleted element "+del);
        stack1.print();
        del = stack1.Delete();
        System.out.println("deleted element "+del);
        stack1.print();
        del = stack1.Delete();
        System.out.println("deleted element "+del);
        stack1.print();
        del = stack1.Delete();
        System.out.println("deleted element "+del);
        stack1.print();
        del = stack1.Delete();
        System.out.println("deleted element "+del);
        stack1.print();
        del = stack1.Delete();
        System.out.println("deleted element "+del);
        stack1.print();
        del = stack1.Delete();
        System.out.println("deleted element "+del);
        stack1.print();
    }
}
