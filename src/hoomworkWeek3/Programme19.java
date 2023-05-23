/**
 * 19. Write a Java program to calculate the average value of array elements.
 */
package hoomworkWeek3;

public class Programme19
{
    public static void main(String[] args)
    {
        int arr[] ={11,15,21,26,27,34};
        int sum=0;
        for(int i=0;i< arr.length;i++)
        {
            sum=sum+arr[i];
        }
        double avg=sum/arr.length;
        System.out.println("Average value of array elements is: "+avg);
}
}
