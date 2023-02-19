package bt;

import java.util.Scanner;

public class Bt2
{
  public static void ptb2()
  {
    float a,b,c,delta;
 Scanner sc = new Scanner (System.in);
 System.out.println("Nhap a b c");
 a= sc.nextFloat();
 b= sc.nextFloat();
 c= sc.nextFloat();
 delta = (float) (Math.pow(b, 2)-4*a*c);
 
   if(a == 0 )
   {
       float x =(float) -c/b;
       System.out.println("nghiem cua phuong trinh la " +x);
               
   }
   else 
   {
       if (delta < 0 )
       {
           System.out.println("Phuong trinh vo nghiem");
       }
       if (delta == 0)
       {
           float x = (float) -b/(2*a);
           System.out.println("Phuong trinh co nghiem kep : "+x);
       }
       if (delta>0)
       {
           float x1 = (float)(-b-Math.sqrt(delta)/(2*a));
           float x2 = (float)(-b+Math.sqrt(delta)/(2*a));
           System.out.println("phuong trinh co 2 nghiem la "+x1);
           System.out.println(" va "+x2);
       }
       
       
   }
 
  }
  public static void main(String[] arg)
   {
       ptb2();
   }
}