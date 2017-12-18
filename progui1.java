import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class progui1{
  //properties
  JFrame theframe;
  AnimationPanel1 thepanel;
  
  //methods
  
  
  //constructors
  public progui1(){
    thepanel = new AnimationPanel1();
    thepanel.setPreferredSize(new Dimension(500,500));
    thepanel.setLayout(null);
    
    theframe = new JFrame("pro GUI 1");
    theframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    theframe.setContentPane(thepanel);
    theframe.pack();
    theframe.setVisible(true);
  }
  
  //main method
  public static void main(String[] args){
    new progui1();
  }
}