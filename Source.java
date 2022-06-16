import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Queue;

// In java, you can use an inbuilt Queue using the Linked class
// Here, the convention changes a bit -
// Java queues don't have enqueue and dequeue methods; these operations are carried out using the following methods:
// Enqueuing: add(x), Throws an exception if it fails to insert the object, i.e. when the queue is full
// Dequeuing: remove(), Throws an exception if the queue is empty
// peek(): Returns the head of the queue. It would return null if the queue is empty
// isEmpty(): Returns true if the queue is empty
// You may read more here - https://docs.oracle.com/javase/tutorial/collections/interfaces/queue.html

 class Source {
  public static void main(String[] args) {
    Queue numbers = new LinkedList();
     List(numbers);
     numbers.poll();
     numbers.poll();
     numbers.poll();
     numbers.poll();
     numbers.poll();
     numbers.poll();
     numbers.poll();
     numbers.offer(1);
     numbers.offer(4);
     numbers.offer(9);
     numbers.offer(14);
     numbers.offer(15);
     
     //numbers.offer(1);
    
    
    // Write your code here
    // You should only add some numbers, dequeue, or peek to change the elements in the queue 
    // so that the queue becomes [1,4,9,14,15]  
    
    System.out.println(numbers);
  }
  
  public static void List(Queue numbers) {
    int i = 0;
    while(i <= 12) {
        if(i%2==0) {
        numbers.add(i); // 0,1,2,4,6,
        }
        i++;
    }
  }
  
}


