package Core_Java02;

import java.util.Scanner;

public class Decimal_Octal {
    public static int pow(int n, int p)
    {
        int res=1;
        for(int i=0;i<=p;i++)
        {
            res=res*n;
        }
        return res;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("DECIMAL TO OCTAL");
        System.out.print("Enter the Decimal Number :");
        int num=sc.nextInt();
        int p=0;
        int i=0;
        while (num>0)
        {
            p=((num % 2)*pow(8,i))+p;
            num=num/8;
            i++;
        }
        System.out.println(" OCTAL Number is :"+p);
    }
}

