/**
 * 6. Write a java program to input any number and find out if it’s odd or even
 */
package hoomworkWeek3;

import java.util.Scanner;

public class Programme6
{

    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter any integer number");
        int num=s.nextInt();
        evenAndOdd(num);
    }
    public static void evenAndOdd(int num)
    {
    if(num%2==0)
    {
        System.out.println("Entered number is even");
    }
    else {
        System.out.println("Entered number is Odd");
    }
    }
}
