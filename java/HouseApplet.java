import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class HouseApplet extends Applet implements MouseListener

{
 Color doorColor = Color.BLUE;
 
 public void init()
 {
  addMouseListener(this);
  setSize(400,400);
 }
 
 public void paint(Graphics g)
 {
  g.setColor(Color.GRAY);
  g.fillRect(100,150,200,150);
  
  g.setColor(Color.DARK_GRAY);
  int[] x ={90,200,310};
  int[] y={150,70,150};
  g.fillPolygon(x,y,3);
  
  g.setColor(doorColor);
  g.fillRect(180,220,40,80);
  
  g.setColor(Color.WHITE);
  g.fillRect(120,180,30,30);
  g.fillRect(250,180,30,30);
 }
 
 public void mouseClicked(MouseEvent e)
 {
  if(doorColor == Color.RED)
  {
   doorColor = Color.BLUE;
   repaint();
  }
  else if(doorColor == Color.BLUE)
  { 
   doorColor = Color.RED;
   repaint();
  } 
 }
 
 public void mousePressed(MouseEvent e) {}
 public void mouseReleased(MouseEvent e) {}
 public void mouseEntered(MouseEvent e) {}
 public void mouseExited(MouseEvent e) {}
}
 
 
 
 
 
