/**
 * 18. Write a Java program to sum values of an array
 */
package hoomworkWeek3;

public class Programme18
{
    public static void main(String[] args)
    {
    int a[] ={10,15,20,25,30,35};
    int sum=0;
    for(int i=0;i< a.length;i++)
    {
        sum=sum+a[i];
    }
        System.out.println("Sum of all array element is: "+sum);
    }

}
