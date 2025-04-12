/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recipemaker01;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.time.Duration;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author A
 */
public class LoadingAnimationPage extends JPanel {
    
    private double rotation =0.0;
    
    public LoadingAnimationPage(){
        Timer timer =new Timer(10,(e)->{
            
            rotation +=0.02;
            repaint();
        
        });
        
        timer.start();
        
    
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        Graphics2D g2D= (Graphics2D)g;
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        int size =Math.min(getWidth(), getHeight());
        int centerX=getWidth()/2;
        int centerY=getHeight()/2;
        
        g2D.setColor(Color.WHITE);
        g2D.fillRect(0, 0, getWidth(), getHeight());
        
        int loadersize = size/2;
        int loadRadius =loadersize/2;
        
        g2D.setColor(Color.decode("#854f1d"));
        g2D.setStroke(new BasicStroke(5));
        
        
        for (int i =0; i<12;i++){
            
            double angle=2*Math.PI*i/12;
            double startX =centerX + Math.cos(angle+rotation)*loadRadius;
            double startY =centerY + Math.sin(angle+rotation)*loadRadius;
            double endX =centerX + Math.cos(angle+rotation)*(loadRadius - 20);
            double endY =centerY + Math.sin(angle+rotation)*(loadRadius-20);
            
            g2D.drawLine((int)startX,(int)startY,(int)endX, (int)endY);
            
        
        }
        
        
        
    }

    
   
    public static void main(String[] args){
    
    JFrame form =new JFrame();
    form.setTitle("LoadingAnimationPage");
    form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    form.setSize(300, 300);
    form.setLocationRelativeTo(null);
    form.add(new LoadingAnimationPage());
    form.setVisible(true);
    
    }




}

   

