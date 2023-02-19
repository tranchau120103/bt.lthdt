package bt;

import java.util.Scanner;

public class Bt6 
{
    public static void xephang()
    {
        float n;
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap so diem ");
        n = sc.nextFloat();
                
        if (n < 5 )
        {
        System.out.println("Kem");
        }
        else 
        
            if (n>=5 && n<=7)
            {
                System.out.println(" Trung Binh ");
            }
            else 
                if( n>=7 && n<=8 )
                {
                    System.out.println("Kha");
                }
        
                else 
                   System.out.println("Gioi"); 
      
    }
    public static void main(String[] arg)
    {
        xephang();
    }
}
