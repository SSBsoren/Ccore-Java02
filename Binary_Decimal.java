package Core_Java02;

import java.util.Scanner;

public class Binary_Decimal
{
    public static int pow(int a, int b)
    {
        int res=1;
        for(int i=0;i<b;i++)
        {
            res=res*a;
        }
        return res;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("BINARY TO DECIMAL");
        System.out.print("Enter the Binary Number :");
        int num=sc.nextInt();
        int res=0;
        int i=0;
        while (num>0)
        {
            res=((num % 2)*pow(2,i))+res;
            num=num/10;
            i++;
        }
        System.out.println(" Decimal Number is :"+res);
    }
}
