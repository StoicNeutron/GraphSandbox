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
    
    //Depth First Search Algorithm
    public int DFS(Node startNode, Node destinationNode){
        
        if(startNode.ID.equalsIgnoreCase(destinationNode.ID)){
            return -1;
        }
        
        for(int i = 0; i < startNode.adjacencies.size(); i++){
            if(startNode.adjacencies.get(i).visited == false){
                startNode.adjacencies.get(i).visited = true;
                return startNode.adjacencies.get(i).globalIndex;
            }
        }
        return -2;
    }
    
    //Breadth First Search Algorithm
    public void BFS(Node startNode, Node destinationNode){
        
        
    }
}
