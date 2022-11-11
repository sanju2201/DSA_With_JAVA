package queue;

public class QueueUsingLinkedList {
    Node front;
     Node rear;
     int size;
    class Node {
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
        size = 0;
    }

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

    public int dequeue(){
        if(front == null){
            System.out.println("Queue is empty");
            return -1;
        }
        int result = front.data;
        front = front.next;
        size--;
        return result;
    }

    public int peek(){
        if(front == null){
            System.out.println("Queue is Empty");
            return -1;
        }
        return front.data;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();
        // Adding Element (enqueue)
        // Removal Element (dequeue)
        // peek element // size

        queue.enqueue(50);
        queue.enqueue(40);
        queue.enqueue(30);
        queue.enqueue(20);
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.getSize());

    }
}
