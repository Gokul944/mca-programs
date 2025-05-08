import java.awt.*;
import java.awt.event.*;
public class awtEg extends Frame implements ActionListener{
TextField t1=new TextField(10);
TextField t2=new TextField(10);
TextField t3=new TextField(10);
TextField result=new TextField(20);
Button b1=new Button("Find max");
public awtEg()
{
setLayout(new FlowLayout());
add(new Label ("Num 1"));
add(t1);
add(new Label ("Num 2"));
add(t2);
add(new Label ("Num 3"));
add(t3);
add(b1);
add(result);
b1.addActionListener(this);
setSize(250,250);
setTitle("Max of three numbers");
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
int n1=Integer.parseInt(t1.getText());
int n2=Integer.parseInt(t2.getText());
int n3=Integer.parseInt(t3.getText());
int max=Math.max(n1,Math.max(n2,n3));
result.setText("Max="+max);
}
public static void main(String[] args)
{
new awtEg();
}
}
