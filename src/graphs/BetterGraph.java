package graphs;

public class BetterGraph {

    Vertex[] arrayOfLists;
    int indexCounter = 0;
    boolean undirected = true;

    class Node{
        public int vertexIdx;
        public Node next;
        public  Node (int vertexIdx , Node node){
            this.vertexIdx = vertexIdx;
            next = node;
        }
    }
    class Vertex {//|vertex: "name" -> adjList|
        String name;
        Node adjList; //adjacentNode to the main vertex
        Vertex (String name , Node aNode){
            this.name = name;
            this.adjList = aNode;

        }
    }


    public  BetterGraph (int vCount, String graphType){
        if (graphType.equals( "directed" )){
            undirected = false;
        }

        arrayOfLists = new Vertex[vCount];
    }
    public void addVertex(String vertexName){
        arrayOfLists[indexCounter] = new Vertex( vertexName , null );
        indexCounter ++;
    }
    public void addEdge (String srcVertexName, String destVertexName){

        int V1Idx = indexForName( srcVertexName );
        int V2Idx = indexForName( destVertexName );
        arrayOfLists[V1Idx].adjList  = new Node( V2Idx, arrayOfLists[V1Idx].adjList );
        // ^^ we are assigning a new Node to that exisiting list that is coming from that vertex
        //and next list after that V2idx is all the componenets of that vertex 2
        // |v1 we made an edge to v2 => then => include all the v2 components|
        if (undirected){
            arrayOfLists[V2Idx].adjList = new Node( V1Idx , arrayOfLists[V2Idx].adjList );
        }
    }

    int indexForName(String name){
        for (int v = 0 ; v < arrayOfLists.length ; v++){
            if(arrayOfLists[v].name.equals( name )){
                return v;
            }
        }
        return -1;
    }

    public void print(){
        System.out.println();
        for (int v = 0; v< arrayOfLists.length ; v++ ){
            System.out.println(arrayOfLists[v].name);
            for (Node aNode = arrayOfLists[v].adjList ; aNode!= null ; aNode = aNode.next){
                System.out.println(" --> " + arrayOfLists[aNode.vertexIdx].name);

            }

            System.out.println("\n");
        }
    }

}
