package ds.queue;

public class App {
    public static void main(String[] args) {
        Queue myQueue = new Queue( 5 );
        myQueue.insert( 100 );
        myQueue.insert( 1000 );
        myQueue.insert( 2 );
        myQueue.insert( 19 );
        myQueue.insert( 233 );
       // myQueue.insert( 233 );
        System.out.println(myQueue.remove());



        myQueue.view();
    }
}
