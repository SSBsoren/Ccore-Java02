//Prrogram to add between 2 number without using Arithmetic Operator

package Core_Java02;

import java.util.Scanner;

public class Add
{
    public static void main(String args[])
    {
        System.out.println("Add The Number between Two Numbers.");
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the First Number : ");
        int num1=sc.nextInt();

        System.out.print("Enter Second number : ");
        int num2=sc.nextInt();

        while (num2>0 )
        {
            num1++;
            num2--;

        }
        System.out.println("Sum of num1 and num2 is : "+num1);
    }

}
