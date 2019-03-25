/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mouselistner;



import java.awt.*;
import java.awt.event.*;
import static java.lang.System.out;
//import static java.lang.System.in;
/**
 *
 * @author Nikhil
 */
public class MouseListner {

    /**
     * @param args the command line arguments
     */
  // package com.tutorialspoint.gui;






//class MouseListner {
   private Frame mainFrame;
   private Label headerLabel;
   private Label statusLabel;
   private Panel controlPanel;

   public MouseListner(){
      prepareGUI();
   }


	static
	{
		out.println("Hii There welcome to MouseListner");
	}
   static public void main(String... args)
   {
      MouseListner  MouseListner = new MouseListner();  
      MouseListner.showMouseMotionListenerDemo();
   }

   public void prepareGUI(){
      mainFrame = new Frame("Java AWT Examples");
      mainFrame.setSize(400,400);
      mainFrame.setLayout(new GridLayout(3, 1));
      mainFrame.addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent windowEvent){
            System.exit(0);
         }        
      });    
   
      headerLabel = new Label();
      headerLabel.setAlignment(Label.CENTER);
      statusLabel = new Label();        
      statusLabel.setAlignment(Label.CENTER);
      statusLabel.setSize(350,100);

      
     
      
      
      
      
      controlPanel = new Panel();
      controlPanel.setLayout(new FlowLayout());

      mainFrame.add(headerLabel);
      mainFrame.add(controlPanel);
      mainFrame.add(statusLabel);
      mainFrame.setVisible(true);  
   }

   public void showMouseMotionListenerDemo(){
      headerLabel.setText("Clezaar");      
     

      Panel panel = new Panel();      
      panel.setBackground(Color.magenta);
      panel.setLayout(new FlowLayout());        
      panel.addMouseMotionListener(new CustomMouseMotionListener());

      Label msglabel = new Label();
      msglabel.setAlignment(Label.CENTER);
      msglabel.setText("Welcome to Clezaar Corporation");
      panel.add(msglabel);

      controlPanel.add(panel);

      mainFrame.setVisible(true);  
   }   

    private static class Lable {

        public Lable() {
        }
    }

   class CustomMouseMotionListener implements MouseMotionListener {

      @Override
      public void mouseDragged(MouseEvent e) {
         statusLabel.setText("Mouse Dragged: ("+e.getX()+", "+e.getY() +")");
      }

      @Override
      public void mouseMoved(MouseEvent e) {
         statusLabel.setText("Mouse Moved: ("+e.getX()+", "+e.getY() +")");
      }  //  
   }  //closing of class CoustomMouseMotionListner    
}

