/**
 * 2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */
package hoomworkWeek3;

import java.util.Scanner;

public class Programme2 {
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Please Enter any year");
        int year=s.nextInt();
        Programme2 obj=new Programme2();
        obj.leapYearmethod(year);
        s.close();

    }

    public void leapYearmethod(int a) {
        if (a % 4 == 0) {
            System.out.println("Given year is a leap year");
        } else {
            System.out.println("Given year is not a leap year");

        }
    }
}