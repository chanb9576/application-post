import java.awt.*;
import javax.swing.*;

public class AnimationPanel1 extends JPanel{
  //properties
  
  
  //methods
  //let's override how the boring JPanel paints
  //let's paint the panel the way we want
  public void paintComponent(Graphics g){
    g.fillOval(200,200,100,100);
    g.setColor(Color.BLUE);
    g.fillRect(0,0,40,40);
    g.setColor(new Color(200,30,100));
    g.drawString("drawing", 300,300);
  }
  
  //constructor
  public AnimationPanel1(){
    super();
  }
}