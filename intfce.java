import java.util.*;
interface shape
{
 float area();
 int  perimeter();
}
class rectangle implements shape
{
 
 
  float area(float l,float b)
 {
    float ar=l*b;
    return ar;
   
 }
  double perimeter(double l,double  b)
 {
    double peri=2*(l+b);
    return peri;
 }
}
class circle implements shape
{
   float area(float r)
   {
    double ac=3.14*r*r;
    return ac;
   }
   double  perimeter(double r)
   {
     double pc=2*3.14*r;
     return pc;
   }
}
class intfce
{
   public static void main(String args[])
   {
    
    Scanner sc=new Scanner(System.in);
    
    rectangle rec=new rectangle();
    while(true)
    {
      
      System.out.println("---Menu---\n1.Area of circle\n2.Area of rectangle\n3.Perimeter of circle\n4.Perimeter of rectangle");
      System.out.println("Enter your choice:");
      int ch=sc.nextInt();
      switch(ch)
      {
        case 1:
               System.out.println("Enter the radius:");
               float r=sc.nextFloat();
               circle c=new circle(r);
               System.out.println("Area of circle:"+c.area(r));
              
        case 2:
               System.out.println("Enter the length:");
               float l=sc.nextFloat();
               System.out.println("Enter the breadth:");
               float b=sc.nextFloat();
               System.out.println("Area of rectangle:"+rec.area(l,b));
       case 3:
                System.out.println("Enter the radius:");
                float r=sc.nextFloat();
                circle c=new circle(r);
                System.out.println("Perimeter of circle:"+c.perimeter(r));
       case 4:import java.util.*;
interface shape
{
 float area();
 int  perimeter();
}
class rectangle implements shape
{
 
 
  float area(float l,float b)
 {
    float ar=l*b;
    return ar;
   
 }
  double perimeter(double l,double  b)
 {
    double peri=2*(l+b);
    return peri;
 }
}
class circle implements shape
{
   float area(float r)
   {
    double ac=3.14*r*r;
    return ac;
   }
   double  perimeter(double r)
   {
     double pc=2*3.14*r;
     return pc;
   }
}
class intfce
{
   public static void main(String args[])
   {
    
    Scanner sc=new Scanner(System.in);
    
    rectangle rec=new rectangle();
    while(true)
    {
      
      System.out.println("---Menu---\n1.Area of circle\n2.Area of rectangle\n3.Perimeter of circle\n4.Perimeter of rectangle");
      System.out.println("Enter your choice:");
      int ch=sc.nextInt();
      switch(ch)
      {
        case 1:
               System.out.println("Enter the radius:");
               float r=sc.nextFloat();
               circle c=new circle(r);
               System.out.println("Area of circle:"+c.area(r));
              
        case 2:
               System.out.println("Enter the length:");
               float l=sc.nextFloat();
               System.out.println("Enter the breadth:");
               float b=sc.nextFloat();
               System.out.println("Area of rectangle:"+rec.area(l,b));
       case 3:
                System.out.println("Enter the radius:");
                float r=sc.nextFloat();
                circle c=new circle(r);
                System.out.println("Perimeter of circle:"+c.perimeter(r));
       case 4:
              System.out.println("Enter the length:");
               float l=sc.nextFloat();
               System.out.println("Enter the breadth:");
               float b=sc.nextFloat();
               System.out.println("Perimeterof rectangle:"+rec.perimeter(l,b));
         }
         
        }
     }
  }
        
              System.out.println("Enter the length:");
               float l=sc.nextFloat();
               System.out.println("Enter the breadth:");
               float b=sc.nextFloat();
               System.out.println("Perimeterof rectangle:"+rec.perimeter(l,b));
         }
         
        }
     }
  }
        
