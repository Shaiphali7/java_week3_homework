/**
 * 20. Write a Java program to test if an array contains a specific value
 */
package hoomworkWeek3;

public class Programme20 {
    public static boolean searchArray(int arr[], int item) {
        for (int i = 0; i < arr.length; i++) {
            if (item == arr[i]) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args)
    {
        int myArray[] = {2011, 2012, 2020, 2008, 2100};
        System.out.println("Is 2011 is in myArray? "+searchArray(myArray, 2011));
        System.out.println("Is 2011 is in myArray? "+searchArray(myArray, 1900));

    }
}
