package graphics;
import java.util.*;
public class square
{
  int a,s;
  Scanner sc=new Scanner(System.in);
  public void area()
  {
   System.out.println("Enter the side:");
   s=sc.nextInt();
   a=s*s;
  }
   public void display()
  {
   System.out.println("The area of square:"+a);
  }
}

