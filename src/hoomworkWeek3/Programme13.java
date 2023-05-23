/**
 * 13. Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY…..SUNDAY of the week accordingly by using switch.
 *  NOTE: if number is out of selection Print message “Week contains 1 to 7 days”
 */
package hoomworkWeek3;

import java.util.Scanner;

public class Programme13
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter any number between 1 to 7");
        int num=s.nextInt();
        switchDayMethod(num);

    }
    public static void switchDayMethod(int num)
    {
switch(num){
    case 1:
        System.out.println("Its Monday");
        break;
    case 2:
        System.out.println("Its Tuesday");
        break;
    case 3:
        System.out.println("Its Wednesday");
        break;
    case 4:
        System.out.println("Its Thursday");
        break;
    case 5:
        System.out.println("Its Friday");
        break;
    case 6:
        System.out.println("Its Saturday");
        break;
    case 7:
        System.out.println("Its Sunday");
        break;
    default:
        System.out.println("Week contains 1 to 7 days");
        break;


}
    }
}
