package queue_DS;

public class QueueUsingArray {
    int arr[];
    int capacity;
    int rear;

    QueueUsingArray(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        rear =-1;
    }

    // Adding element in a queue (enqueue)
    public void enqueue(int data){
        // Checking Overflow
        if(rear == capacity-1){
            System.out.println("Queue is Full");
            return;
        }
        rear++;
        arr[rear] = data;
    }

    //  Removing element from queue (dequeue)

    public int dequeue(){
        if(rear == -1){
            System.out.println(" Queue is Empty");
            return -1;
        }
        int result = arr[0];
       //front  [2,3,4,4] rear

        for(int i=0;i<rear;i++){
            arr[i] = arr[i+1];
        }
        rear--;
        return result;
    }

    // getting 1st Element

    public int getFront(){
        if(rear == -1){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[0];
    }

    // isEmpty

    public boolean isEmpty(){
        if(rear == -1){
            return true;
        }
        return false;
    }

    // get Size
    public int getSize(){
        return rear+1;
    }

    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(10);
        // Adding element in a queue (enqueue)
        //  Removing element from queue (dequeue)
        // getting 1st Element
        // isEmpty

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        // [20,30,30]
        //  f   r

        System.out.println(queue.getFront());
        System.out.println(queue.getSize());
        System.out.println(queue.dequeue());
        System.out.println(queue.getSize());
        System.out.println(queue.getFront());


    }

}
