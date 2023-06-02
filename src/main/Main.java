package main;

import GUI.GraphSandboxUI;
import javax.swing.JButton;
import java.awt.Graphics;
import java.util.*;
import Structure.*;

/**
 * This is a main function of the project.
 * @author stoicneutron
 */
public class Main {
    
    public static void main(String args[]) {
        
        /* DO NOT CHANGE! - Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GraphSandboxUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraphSandboxUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraphSandboxUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraphSandboxUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        GraphSandboxUI UI = new GraphSandboxUI();
        
        /* DO NOT CHANGE! - Create and display the GUI */
        java.awt.EventQueue.invokeLater(new Runnable() {
           
            @Override
            public void run() {
                UI.setVisible(true);
                
            }
        });
        
        // All Backend Implementation start here:
        
        // All the JButtons List in it right order.
        ArrayList<JButton> jButton_List = new ArrayList<>();
        Graph graph = new Graph();
        connectNodes(jButton_List, UI.getJButtons());
        constructGraph(graph, jButton_List);
        
    }
    
    /* All Backend methods start here: */
    
    // This method will store the Jbuttons list from GUI to the ArrayList
    private static void connectNodes(ArrayList<JButton> jButton_List, JButton[] list){
        
        for(int i = 0; i < list.length; i++){
            jButton_List.add(list[i]);
        }
    }
    
    private static void constructGraph(Graph graph, ArrayList<JButton> jButton_List){
        
        for(int i = 0; i < jButton_List.size(); i++){
            
            Node node = new Node(jButton_List.get(i));
            graph.graph.add(node);
        }
        // update graph TotalNodes
        graph.totalNodes = graph.graph.size();
    }
     
}
