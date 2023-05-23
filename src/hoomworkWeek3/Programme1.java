/**
 * 1. Write a java program that tells us that Input number is odd or even?
 *  HINT: use ternary operator (? :)
 */
package hoomworkWeek3;

import java.util.Scanner;

public class Programme1
{
public static void main(String[] args)
{
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the number");
    int number=s.nextInt();
    String result = oddAndEvenNum(number);
    System.out.println("Entered number is "+result);
    s.close();
}
public static String oddAndEvenNum(int a)
{
    String result= a%2==0 ? "Even" : "Odd";
    return result;
}
}
