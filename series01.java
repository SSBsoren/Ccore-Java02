//Program to Print the
//0
//10
//010
//1010
//01010
//101010
//0101010
package Core_Java02;

import java.util.Scanner;

public class series01
{
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the no of Series : ");
        int num=scanner.nextInt();

        for (int i=1;i<=num;i++)
        {
            for (int j=1;j<=i;j++)
            {
                if (((i+j)%2)==0)
                    System.out.print("0");
                else
                    System.out.print("1");

            }
            System.out.print("\n");
        }
    }
}
