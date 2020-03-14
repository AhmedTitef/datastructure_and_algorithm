package graphs;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
//        Graph graph = new Graph( 5 );
////        graph.addEdge( 4, 2 );
////        graph.addEdge( 2, 3 );
////        graph.addEdge( 3, 2 );
////        graph.addEdge( 1, 4 );
////        graph.addEdge( 1, 5 );
////
////        int edge = graph.getEdgeCount();
////        int vertex = graph.getVertextCount();
////
////        System.out.println( Arrays.toString( graph.adj( 1 ) ) );


        BetterGraph betterGraph = new BetterGraph( 5 , "directed");
        betterGraph.addVertex( "state" );

    }
}
