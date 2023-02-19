package bt;

import java.util.Scanner;

public class Bt3 
{

  public static void tinhtiendien()
  {
   float sodien,tien;
   Scanner sc = new Scanner(System.in);
   System.out.println("nhap so dien : ");
   sodien = sc.nextFloat();
   if ( sodien < 50)
   {
       tien = sodien*1000;
   }
   else 
   {
       tien = 50*1000+(sodien-50)*1200;
   }
   System.out.println("so tien can phai tra la " +tien);
  }
   public static void main(String[] arg)
   {
       tinhtiendien();
   }
}