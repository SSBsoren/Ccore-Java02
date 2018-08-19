package Core_Java02;

import java.util.Scanner;

public class Count_zero_one
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num,one=0,zero=0,rem;

        System.out.print("Enter the Number : ");
        num=sc.nextInt();
        while (num !=0)
        {
            rem=num%10;
            if(rem==0)
                zero++;
            else
                if (rem==1)
                    one++;
                num/=10;

        }
        System.out.println("Number of zeros : "+zero);
        System.out.println("Number of ones : "+one);
    }
}
