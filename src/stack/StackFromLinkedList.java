package stack;

public class StackFromLinkedList {
    Node head;
    int size;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next =null;
        }
    }
    StackFromLinkedList(){
        head = null;
        size =0;
    }

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public int peek(){
        if(head == null){
            System.out.println("Stack is Empty");
            return -1;
        }
        return head.data;
    }

    public int pop(){
        if(head == null){
            System.out.println("Stack is Empty");
            return -1;
        }
        int res = head.data;
        size--;
        head = head.next;
        return res;
    }

    public boolean isEmpty(){
        if(head == null){
            return true;
        }
        return false;
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        StackFromLinkedList stk = new StackFromLinkedList();

        stk.push(50);
        stk.push(30);
        stk.push(10);
        System.out.println(stk.pop());
        System.out.println(stk.peek());
        System.out.println(stk.isEmpty());
        System.out.println(stk.getSize());



    }


}
