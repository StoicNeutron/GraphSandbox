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
                // add test
                startNode.visited = true;
                return startNode.adjacencies.get(i).globalIndex;
            }
        }
        return -2;
    }
    
    //Depth First Search Algorithm + Manhatan Value
    public int GreedyDFS(Node startNode, Node destinationNode){
        
        if(startNode.ID.equalsIgnoreCase(destinationNode.ID)){
            return -1;
        }
        
        double xVal = startNode.xCoordinate - destinationNode.xCoordinate;
        double yVal = startNode.yCoordinate - destinationNode.yCoordinate;
        double mValue = Math.sqrt(xVal*xVal + yVal*yVal);
        int adjacentIndex = 0;
        int index = 0;
        for(int i = 0; i < startNode.adjacencies.size(); i++){
            if(startNode.adjacencies.get(i).visited == false){
                double xVal2 = startNode.adjacencies.get(i).xCoordinate - destinationNode.xCoordinate;
                double yVal2 = startNode.adjacencies.get(i).yCoordinate - destinationNode.yCoordinate;
                double tempVal = Math.sqrt(xVal2*xVal2 + yVal2*yVal2);
                if(tempVal < mValue){
                    index = startNode.adjacencies.get(i).globalIndex;
                    adjacentIndex = i;
                }
               
            }
        }
        if(mValue != Math.sqrt(startNode.xCoordinate * destinationNode.xCoordinate + startNode.yCoordinate * destinationNode.yCoordinate)){
            startNode.adjacencies.get(adjacentIndex).visited = true;
            // add test
            startNode.visited = true;
            return index;
        }else{
            return -2;
        }
    }
    
    
    // low key one test
    public int lowKeyGreedyDFS(Node startNode, Node destinationNode){
        
        if(startNode.ID.equalsIgnoreCase(destinationNode.ID)){
            return -1;
        }
        
        double xVal = startNode.xCoordinate - destinationNode.xCoordinate;
        double yVal = startNode.yCoordinate - destinationNode.yCoordinate;
        double mValue = Math.sqrt(xVal*xVal + yVal*yVal);
        int adjacentIndex = -1;
        int index = 0;
        for(int i = 0; i < startNode.adjacencies.size(); i++){
            if(startNode.adjacencies.get(i).visited == false){
                double xVal2 = startNode.adjacencies.get(i).xCoordinate - destinationNode.xCoordinate;
                double yVal2 = startNode.adjacencies.get(i).yCoordinate - destinationNode.yCoordinate;
                double tempVal = Math.sqrt(xVal2*xVal2 + yVal2*yVal2);
                if(tempVal < mValue){
                    index = startNode.adjacencies.get(i).globalIndex;
                    adjacentIndex = i;
                    break;
                }
               
            }
        }
        if(mValue != Math.sqrt(startNode.xCoordinate * destinationNode.xCoordinate + startNode.yCoordinate * destinationNode.yCoordinate)){
            if(adjacentIndex == -1){
                
                return DFS(startNode, destinationNode);
            }
            startNode.adjacencies.get(adjacentIndex).visited = true;
            // add test
            startNode.visited = true;
            return index;
        }else{
            if(adjacentIndex != -1){
                startNode.adjacencies.get(adjacentIndex).visited = true;
            // add test
            startNode.visited = true;
            return index;
            }
            return -2;
        }
    }
    
    //Breadth First Search Algorithm
    public void BFS(Node startNode, Node destinationNode){
        
        
    }
}
