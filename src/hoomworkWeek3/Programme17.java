/**
 * 17. Write a Java program to sort a numeric array and a string array.
 */
package hoomworkWeek3;

import java.util.Arrays;

public class Programme17 {
    public static void main(String[] args) {
        int[] numArray = {90, 70, 12, 7, 23, 0};
        String[] stArray = {"Total", "Apple", "Pear", "Melon"};
        System.out.println("Number array before: "+ Arrays.toString(numArray));
        Arrays.sort(numArray);
        System.out.println("Number array after sorting: "+Arrays.toString(numArray));
        System.out.println("String array before: "+Arrays.toString(stArray));
        Arrays.sort(stArray);
        System.out.println("String array after sorting: "+Arrays.toString(stArray));

    }
}
