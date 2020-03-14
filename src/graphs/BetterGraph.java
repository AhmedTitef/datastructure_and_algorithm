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
    class Vertex {
        String name;
        Node adjList;
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

    }

}
