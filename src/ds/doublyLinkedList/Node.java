package ds.doublyLinkedList;

public class Node {
    public int data;
    public Node next;
   //         +------+------+    +------+------+
    //        | data | next-|--->| data | null |
     //       +------+------+    +------+------+

    public Node previous;

    public void displayNode(){
        System.out.println(" { " + data + " }");
    }

}
