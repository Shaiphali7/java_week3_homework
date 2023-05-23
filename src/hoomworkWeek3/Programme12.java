/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol.
 */
package hoomworkWeek3;

import java.util.Scanner;

public class Programme12
{
char ch;

    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter any alphabet, number or symbol");
        Programme12 obj =new Programme12();
        obj.ch=s.next().charAt(0);
        whatValueis(obj.ch);
    }
    public static void whatValueis(char ch)
    {
if(ch>= 'a' && ch<= 'z' || ch>='A' && ch<='Z')
{
    System.out.println("Entered value is Alphabet "+ch);
}
else if(ch>= '0' && ch<='9')
{
    System.out.println("Entered value is number "+ch);
}
else
{
    System.out.println("Enterd value is Symbol "+ch);
}
    }
}
