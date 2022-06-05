/**
 * LLstack // Insertion at the beggining and deletion at the beginning.
 */
public class LLstack {
    // Node class
    Node top;
       class Node{
        String data;
        Node next;
    // Parametric constructor for the node
    Node (String data){
        this.data = data;
        this.next = null;
      }
    }

    public void pushForLLstack(String data) {
        Node newNode = new Node(data);
        if(top == null){
            top = newNode;
        }
        else{
            newNode.next = top;
            top = newNode;
        }
    }

    public void popForLLstack() {
        if (top == null){
            System.out.println("Stack Underflow");
        }
        else{
            top = top.next;
        }
    }

    public void printForLLstack(){
        Node temp = top;
        while(temp !=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LLstack obj = new LLstack();
        obj.pushForLLstack("Pratish");
        obj.pushForLLstack("Kumar");
        obj.pushForLLstack("Mohapatra");
        obj.printForLLstack();
        obj.popForLLstack();
        obj.printForLLstack();
    }
}