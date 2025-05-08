package graphics;
import java.util.*;
public class circle
{
  int r;
  double a;
  Scanner sc=new Scanner(System.in);
  public void area()
  {
   System.out.println("Enter the radius:");
   r=sc.nextInt();
   a=3.14*r*r;
  }
  public void display()
  {
   System.out.println("The area of circle:"+a);
  }
}
