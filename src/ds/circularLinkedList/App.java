package ds.circularLinkedList;

import ds.singlylinkedlist.SingleLinkedList;

public class App {
    public static void main(String[] args) {
        CircularLinkedList mylist = new CircularLinkedList();
        mylist.insertFirst( 100 );
        mylist.insertFirst( 50 );
        mylist.insertFirst( 90 );
        mylist.insertFirst( 88 );
        mylist.deleteFirst();
        mylist.insertFirst( 100 );
        mylist.insertLast( 139224 );
        mylist.displayList();
    }
}
