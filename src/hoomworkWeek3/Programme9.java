/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly use switch statement if
 * any other alphabet should be invalid entry.
 */
package hoomworkWeek3;

import java.util.Scanner;

public class Programme9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any alphabet between A to F");
        char ch = s.next().charAt(0);
        compareCharacter(ch);
        s.close();
    }

    public static void compareCharacter(char ch) {
        switch (ch) {
            case 'A':

                System.out.println("City is Amsterdam");
            break;
            case 'B':

                System.out.println("City is Bhopal");
            break;
            case 'C':

                System.out.println("City is Calcutta");
            break;
            case 'D':

                System.out.println("City is Damoh");
            break;
            case 'E':

                System.out.println("City is Ellora");
            break;
            case 'F':

                System.out.println("City is Frankfurt");
            break;
            default:
                System.out.println("Its not a valid cahracter");
        }
    }
}
