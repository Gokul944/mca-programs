import java.applet.*;
import java.awt.*;
public class appletshape extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.black);
g.drawOval(10,20,100,100);
g.setColor(Color.yellow);
g.drawRect(90,150,140,150);
g.setColor(Color.blue);
g.drawLine(350,200,280,200);
}
}
