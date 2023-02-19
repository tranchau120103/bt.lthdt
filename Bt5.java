package bt;

import java.util.Scanner;

public class Bt5 {
    public static void sochinhphuong()
    {
        int a ;
        Scanner sc = new Scanner(System.in);
        System.out.println(" nhap a  ");
        a= sc.nextInt();
        float cp = (float)Math.sqrt(a);
        if (cp == Math.sqrt(a))
        {
            System.out.println(" day la so chinh phuong");
        }
        else
        {
           System.out.println(" ko phai la so chinh phuong ");
            
        }
        
    }
    public static void main (String[] arg)
    {
        sochinhphuong();
    }
}