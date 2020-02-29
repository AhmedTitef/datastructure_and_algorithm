package ds.singlylinkedlist;

public class App    {
    public static void main(String[] args) {
        SingleLinkedList mylist = new SingleLinkedList();
        mylist.insertFirst( 100 );
        mylist.insertFirst( 50 );
        mylist.insertFirst( 90 );
        mylist.insertFirst( 88 );
        mylist.displayList();
    }
}
