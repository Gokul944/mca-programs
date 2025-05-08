package graphics;
import java.util.*;
public class rectangle
{
  int l,b,a;
  Scanner sc=new Scanner(System.in);
  public void area()
  {
   System.out.println("Enter the length:");
   l=sc.nextInt();
   System.out.println("Enter the breadth:");
   b=sc.nextInt();
   a=l*b;
  }
  public void display()
  {
   System.out.println("The area of rectangle:"+a);
  }
  
