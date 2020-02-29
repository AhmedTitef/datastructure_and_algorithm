package ds.singlylinkedlist;

public class SingleLinkedList {
    private Node first;



    public SingleLinkedList (){

    }

    public boolean isEmpty(){
        return (first == null );

    }

    //used to insert at the beginning of the list

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    public Node deleteFirst(){
        Node temp = first;
        first = first.next;
        return temp;
    }
    public  void displayList(){
        System.out.println("List (first --> last");
        Node current  = first;
        while (current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println("{ " + current + " }");
    }

    public void insertLast(int data){
        Node current = first;
        while (current.next!=null){
            current = current.next;
        }
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    }
}

