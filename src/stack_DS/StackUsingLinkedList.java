package stack_DS;

public class StackUsingLinkedList {
    Node head;
    int size;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }

    StackUsingLinkedList(){
        head = null;
        size =0;
    }

    // Adding Element(push)
    public void push(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    // Removal of Element
    public int pop(){
        // Checking UnderFlow
        if(head == null){
            System.out.println("Stack is Empty");
            return -1;
        }
        int result  = head.data;
        head = head.next;
        size--;
        return result;
    }

    // getting peek Element
    public int peek(){
        // Checking Underflow
        if(head == null){
            System.out.println("Stack is Emopty");
            return -1;
        }
        return head.data;
    }

    // isEmpty
    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }

    // Checking size
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack = new StackUsingLinkedList();
        // Adding Element
        // Removing Element
        // peek Element
        // isEmpty
        // size
        System.out.println(stack.isEmpty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.getSize());
        stack.push(60);
        System.out.println(stack.peek());

    }



}
