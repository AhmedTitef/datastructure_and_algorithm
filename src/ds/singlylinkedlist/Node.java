package ds.singlylinkedlist;

public class Node {
    public int data;
    public Node next;
   //         +------+------+    +------+------+
    //        | data | next-|--->| data | null |
     //       +------+------+    +------+------+


    public void displayNode(){
        System.out.println(" { " + data + " }");
    }

}
