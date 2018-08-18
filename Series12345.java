//Program to print
//123456789
//12345678
//1234567
//123456
//12345
//1234
//123
//12
//1
package Core_Java02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Series12345
{
    public static void main(String args[]) throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);

        System.out.print("Enter the No of rows in Series : ");
        int rows=Integer.parseInt(br.readLine());
        for (int i=1;i<=rows;i++){
            for (int j=1;j<=(rows-i+1);j++)
            {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
