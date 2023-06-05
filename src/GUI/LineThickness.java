/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author stoicneutron
 */
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class LineThickness extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        
        // Set the desired line thickness
        float thickness = 3.5f;
        g2d.setStroke(new BasicStroke(thickness));
        
        // Draw a line with the new thickness
        int x1 = 50, y1 = 50, x2 = 200, y2 = 200;
        g2d.drawLine(x1, y1, x2, y2);
    }
}