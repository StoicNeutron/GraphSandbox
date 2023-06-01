/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structure;

import java.util.LinkedList;
import javax.swing.JButton;

/**
 *
 * @author stoicneutron
 */
public class Node {
    
    private JButton node;
    private LinkedList<JButton> adjacencies = new LinkedList<JButton>();
    
    public Node(JButton button){
        node = button;
    }
    
    // getters
    public String getNodeID(){
        
        return node.getText();
    }
    
    public JButton getJButton(){
        
        return this.node;
    }
    
    public String getAdjacencyList(){
        
        String string = "";
        JButton temp = adjacencies.getFirst();
        for(int i = 0; i < adjacencies.size(); i++){
            string = string + temp.getText() + "; ";
            temp = adjacencies.get(i);
        }
        
        return string;
    }
    
    public int getNumOfAdjacency(){
        
        return adjacencies.size();
    }
    
}
