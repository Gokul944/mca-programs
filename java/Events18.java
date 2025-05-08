import java.awt.*;
import java.awt.event.*;
public class Events18 extends Frame implements MouseListener, MouseMotionListener, KeyListener, WindowListener 
{
 String message = "";
 public Events18() 
 {
  setTitle("All Events Demo");
  setSize(500, 300);
  setVisible(true);
  addMouseListener(this);
  addMouseMotionListener(this);
  addKeyListener(this);
  addWindowListener(this);
  setFocusable(true);
 }
 public void paint(Graphics g) 
 {
  g.drawString(message, 50, 150);
 }
 public void mouseClicked(MouseEvent e) 
 {
  message = "Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")";
  repaint();
 }
 public void mousePressed(MouseEvent e) 
 {
  message = "Mouse Pressed";
  repaint();
 }
 public void mouseReleased(MouseEvent e) 
 {
  message = "Mouse Released";
  repaint();
 }
 public void mouseEntered(MouseEvent e) 
 {
  message = "Mouse Entered";
  repaint();
 }
 public void mouseExited(MouseEvent e) 
 {
  message = "Mouse Exited";
  repaint();
 }
 public void mouseMoved(MouseEvent e) 
 {
  message = "Mouse Moved";
  repaint();
 }
 public void mouseDragged(MouseEvent e) 
 {
  message = "Mouse Dragged";
  repaint();
 }
 public void keyTyped(KeyEvent e) 
 {
  message = "Key Typed: " + e.getKeyChar();
  repaint();
 }
 public void keyPressed(KeyEvent e) 
 {
  message = "Key Pressed: " + e.getKeyChar();
  repaint();
 }
 public void keyReleased(KeyEvent e) 
 {
  message = "Key Released: " + e.getKeyChar();
  repaint();
 }
 public void windowOpened(WindowEvent e) 
 {
  System.out.println("Window Opened");
 }
 public void windowClosing(WindowEvent e) 
 {
  System.out.println("Window Closing");
  dispose();
 }
 public void windowClosed(WindowEvent e) 
 {
  System.out.println("Window Closed");
 }
 public void windowIconified(WindowEvent e) 
 {
  System.out.println("Window Minimized");
 }
 public void windowDeiconified(WindowEvent e) 
 {
  System.out.println("Window Restored");
 }
 public void windowActivated(WindowEvent e) 
 {
  System.out.println("Window Activated");
 }
 public void windowDeactivated(WindowEvent e) 
 {
  System.out.println("Window Deactivated");
 }
 public static void main(String[] args) 
 {
  new Events18();
 } 
}
