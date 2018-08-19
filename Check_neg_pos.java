package Core_Java02;

import java.util.Scanner;

public class Check_neg_pos
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        if (num >> 31 == 0) {
            System.out.println("Positive ");
        } else
            System.out.println("Negative");

    }
}
