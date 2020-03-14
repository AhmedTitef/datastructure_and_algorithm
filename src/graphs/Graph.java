package graphs;

import java.util.ArrayList;

public class Graph {
    private int vCount; //number of vertices
    private int eCount; //number of edges

    private ArrayList [] adjacents; //array of integer lists

    public Graph (int vCount){
        this.vCount = vCount;
        this.eCount = 0;
        adjacents = new ArrayList[vCount];

        for (int i = 0; i< vCount ; i++){
            adjacents[i] = new ArrayList(  ); //at every empty slot we are making an array list at that index

        }
    }

    public int getVertextCount(){
        return vCount;
    }

    public int getEdgeCount(){
        return eCount;
    }

    public void addEdge(int src , int dest){
        adjacents[src].add( dest ); //we are adding to that list of arrays a destination
        eCount++;
    }

    public Object [] adj(int src){ //this is returns to us who is adjacent to that src
        return adjacents[src].toArray(); //toArray is to print out all the components of that array associated with that array in an object

    }

}
