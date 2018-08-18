package Core_Java02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Diamond
{
    public static void main(String args[]) throws IOException
    {
        System.out.print("Enter the no of rows of the Series : ");
        InputStreamReader isr=new InputStreamReader(System.in);

        BufferedReader br=new BufferedReader(isr);

        int rows=Integer.parseInt(br.readLine());
        int space=Integer.parseInt(br.readLine());

        int star=1;

        for (int i=1; i<rows;i++)
        {
            for (int j=1;j<space;j++)
            {
                System.out.print(" ");

            }
            for (int k=1;k<=star;k++)
            {
                System.out.print("*");
            }
            System.out.println();
            if (i<(rows/2))
            {
                star=star+2;
                space=space-1;
            }
            else
            {
                star=star-2;
            }

        }

    }
}
