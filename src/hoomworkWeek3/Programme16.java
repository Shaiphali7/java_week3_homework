/**
 * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */
package hoomworkWeek3;

import java.util.Scanner;

public class Programme16
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter any number");
        int num=s.nextInt();
        checkNumber(num);
        s.close();
    }
    public static void checkNumber(int num)
    {
       if(num>0)
       {
           System.out.println("Number is positive");
       }
       else if(num<0)
    {
        System.out.println("Number is negative");
    }
       else if(num==0)
       {
           System.out.println("Number is zero");
       }
    }
}
