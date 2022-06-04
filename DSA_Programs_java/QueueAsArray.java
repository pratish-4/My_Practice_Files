public class QueueAsArray {
    int arr[];
    int front;
    int rear;
    QueueAsArray(int n){
        arr = new int[n];
        // front = -1;
        // rear = -1;
        front = 0;
        rear = 0;
 
    }
    public void insert(int data){
        // if(rear == arr.length-1){
        //     System.out.println("overflow can't insert "+data);
        // }
        if(rear == arr.length){
            System.out.println("overflow can't insert "+data);
        }
        else{
            // rear++;
            // arr[rear] = data;
            arr[rear] = data;
            rear++;
        }
    }
    public int Delete(){
        if(rear == front){
            // rear =-1;
            // front =-1;
            rear =0;
            front =0;
            System.out.println("underflow");
            return -123;
        }
        else{
            // front++;
            // int del = arr[front];
            // //-123 is garbage value for this program
            // arr[front] = -123;
 
            int del = arr[front];
            //-123 is garbage value for this program
            arr[front] = -123;
            front++;
            return del;
        }
    }
    public void print(){
        for(int i = front ;i< rear;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        QueueAsArray myQueue =  new QueueAsArray(5);
        myQueue.insert(5);
        myQueue.insert(1);
        myQueue.insert(3);
        myQueue.insert(8);
        myQueue.insert(15);
        myQueue.insert(54);
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
 