/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package satriawan;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
/**
 *
 * @author Satriawan
 */
public class panggil extends JPanel {
    public void paintComponent (Graphics g){
        super.paintComponents(g);//memanggil paincomponent
        
        //memulai dari 0 sampai 360 derajat
        g.setColor(Color.RED);
        g.drawRect(15,36,80,80);
        g.setColor(Color.BLACK);
        g.drawArc(15,35,80,80,0,360);
        
        //memulai dari 0sampai 110 derajat
        g.setColor(Color.red);
        g.drawRect(100,35,80,80);
        g.setColor(Color.BLACK);
        g.drawArc(100,35,80,80,0,100);
        
        //memulaidari 0sampai-270 deraja
        g.setColor(Color.red);
        g.drawRect(185,35,80,80);
        g.setColor(Color.BLACK);
        g.drawArc(185,35,80,80,0,-270);
        
        //memulai dari 0 sampai 360 derajat
        g.fillArc(15,120,80,40,0,360);
        
        //memulai dari 270 sampai -90 derajat
        g.fillArc(100,120,80,40,270,-90);
        
        //memulai dari 0 samapi -270 derajat
        g.fillArc(185,120,80,40,0,-270);
        
    }//akhir metode paintcomponent
    
}
