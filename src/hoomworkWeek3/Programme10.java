/**
 * 10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else
 */
package hoomworkWeek3;

import java.util.Scanner;

public class Programme10 {
     static int num1,num2;
     static char ch;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter any two number");
         num1 = s.nextInt();
         num2 = s.nextInt();
        System.out.println("Enter any symbol from +,-,* and /");
        ch = s.next().charAt(0);
        Programme10 obj= new Programme10();
        obj.operatorProgramme(num1,num2,ch);
        s.close();
    }
    public void operatorProgramme(int num1,int num2,char ch)
    {

        if(ch=='+')
        {
           int sum=num1+num2;
            System.out.println("Addition + of two number is:  "+num1+" + "+num2+" = "+sum);
        }
        else if(ch=='-')
        {
            int min=num1-num2;
            System.out.println("Subtraction - of two number is:  "+num1+" - "+num2+" = "+min);
        }
        else if(ch=='*')
        {
            int mul=num1*num2;
            System.out.println("Multiplication * of two number is:  "+num1+" * "+num2+" = "+mul);

        }
        else if(ch=='/')
        {
           int div=num1/num2;
            System.out.println("Division / of two number is: "+num1+" / "+num2+" = "+div);
        }
        else
        {
            System.out.println("Didn't enter the right operator");
        }
}
}
