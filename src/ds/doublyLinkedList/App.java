package ds.doublyLinkedList;

import ds.circularLinkedList.CircularLinkedList;

public class App {
    public static void main(String[] args) {
        DoublyLinkedList mylist = new DoublyLinkedList();
        mylist.insertFirst( 100 );
        mylist.insertFirst( 50 );
        mylist.insertFirst( 90 );
        mylist.insertFirst( 88 );
        mylist.insertAfter( 50, 32131 );
        mylist.insertFirst( 100 );
        mylist.insertLast( 139224 );
        mylist.displayForward();
    }
}
