package Structure;

import java.util.ArrayList;

/**
 *This class represent the entire graph formed by nodes(JButtons), all graph algorithms will be implement here.
 * @author stoicneutron
 */
public class Graph {
    
    // ArrayList of all the nodes(JButtons)
    public ArrayList<Node> graph;
    public int totalNodes;
    
    
    // constructor
    public Graph(){
        this.graph = new ArrayList<>();
        this.totalNodes  = 0;
    }
    
    /* Methods */
    
    public void constructEdge(boolean complete){
        
        if(complete){
            
        }
    }
    
    //Depth First Search Algorithm
    public void DFS(Node startNode, Node destinationNode){
        
        
    }
    
    //Breadth First Search Algorithm
    public void BFS(Node startNode, Node destinationNode){
        
        
    }
}
