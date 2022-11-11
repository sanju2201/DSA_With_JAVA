package stack_DS;

public class StackUsingArray {
    public int arr[];
    public int capacity;
    public int top;

    StackUsingArray(int capacity){
        this.capacity = capacity;
        arr = new int[capacity];
        top =-1;
    }
    // Adding Element in a stack(push)
    public void push(int data){
        // Checking Overflow
        if(top == capacity-1){
            System.out.println("Stack is Full");
            return;
        }
        top++;
        arr[top] = data;
    }

    // Removing Element from stack(pop)
    public int pop(){
        // Checking Underflow
        if(top ==-1){
            System.out.println("Stack is Empty");
            return -1;
        }
        int result  = arr[top];
        top--;
        return result;
    }

    // getting peek Element
    public int peek(){
        if(top ==-1){
            System.out.println("stack is Empty");
            return -1;
        }
        return arr[top];
    }

    // Checking isEmpty
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }

    // Getting size of the stack
    public int size(){
        return top+1;
    }


    public static void main(String[] args) {
        StackUsingArray stack = new StackUsingArray(10);
        // Adding Element in a Stack
        // Remove element from  a stack
        // getting peek Element
        // isEmpty
        // size of the Stack
        System.out.println(stack.isEmpty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.size());


    }

}
