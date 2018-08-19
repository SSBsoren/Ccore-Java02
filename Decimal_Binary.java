package Core_Java02;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Decimal_Binary
{
    public static int pow(int n, int p)
    {
        int res=1;
        for(int i=0;i<=p;i++)
        {
            res=res*n;
        }
        return res;
    }
    public static void main(String args[]) throws IOException {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("DECIMAL TO BINARY");
        System.out.print("Enter the Decimal Number :");
        int num=Integer.parseInt(br.readLine());
        int p=0;
        int i=0;
        while (num>0)
        {
            p=((num % 2)*pow(10,i))+p;
            num=num/2;
            i++;
        }
        System.out.println(" Binary Number is :"+p);
    }
}
