package LinkedList_DS;

public class LL {
    Node head;
    int size;
    /*-----------------Node Class------------------*/
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            next = null;
            size++;
        }
    }
    /*-------------------Node Class-----------------*/

    LL(){
        size=0;
    }
    // addFirst
    public void addFirst(String data){
        Node newNode = new Node(data);
        // if any Node is not present
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // addLast
    public void addLast(String data){
        Node newNode = new Node(data);
        //if list is empty
        if(head == null){
            head = newNode;
            return;
        }

        Node curNode = head;
        while(curNode.next != null){
            curNode = curNode.next;
        }
        curNode.next = newNode;
    }

    // Printing a list
    public void printList(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node curNode = head;
        while(curNode != null){
            System.out.print(curNode.data +" --> ");
            curNode = curNode.next;
        }
        System.out.print("null");
        System.out.println();
    }

    // removeFirst
    public void removeFirst(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
    }

    // removeLast
    public void removeLast(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }

        // 1st way to reach at secondLast Node

//        Node prev = head;
//        Node current = head.next;
//        while(current.next !=null){
//            current = current.next;
//            prev = prev.next;
//        }
//        prev.next = null;

        // 2nd way to reach at secondLast Node
        Node secondlast = head;
        while(secondlast.next.next != null){
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }

    public static void main(String[] args) {
        // addFirst
        // addLast  (add)
        // removeFirst
        // removeLast
        // add(position, data)
        // remove(position)
        LL list = new LL();
        list.addFirst("is");
        list.addFirst("name");
        list.addFirst("my");
        list.addLast("sanju");
        list.addLast("manna");
        list.printList();
        list.removeLast();
        list.printList();
        list.removeFirst();
       list.removeLast();
        list.printList();


    }
}
