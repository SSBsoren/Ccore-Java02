//Program to calculate the perfect Number
package Core_Java02;

import java.util.Scanner;

public class Perfect
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num= scanner.nextInt();

        int sum=0;
        int temp=num;
        while (num>0)
        {
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        if (sum==temp)
            System.out.println("Yes Number is perfect ");
        else
            System.out.println("Not perfect no ...");
    }
}
