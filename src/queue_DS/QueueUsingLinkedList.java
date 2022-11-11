package queue_DS;

public class QueueUsingLinkedList {
    Node front;
    Node rear;
    int size;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    QueueUsingLinkedList(){
        front = null;
        rear = null;
        size =0;
    }

    // Adding Element (enqueue)
    public void enqueue(int data){
        Node newNode = new Node(data);
        if(front == null){
            front = rear = newNode;
            size++;
            return;
        }
        rear.next = newNode;
        rear = newNode;
        size++;
    }

    // Removal of Element(dequeue)
    public int dequeue(){
        if(front == null){
            System.out.println("Queue is Empty");
            return -1;
        }
        int result = front.data;
        front = front.next;
        size--;
        return result;

    }

    // 1st Element of the Queue
    public int getFirst(){
        if(front == null){
            System.out.println("Queue is Empty");
            return -1;
        }
        return front.data;
    }

    // is Empty
    public boolean isEmpty(){
        if(front == null){
            return true;
        }
        return false;
    }

    // size


    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();

        // Adding Element (from rear End)
        // Removing Element (front End)
        // First Element
        // is Empty
        // size

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println(queue.getSize());
        System.out.println(queue.getFirst());
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());
        System.out.println(queue.getFirst());
        System.out.println(queue.getSize());

    }

}
