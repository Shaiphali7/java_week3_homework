/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry
 */
package hoomworkWeek3;

import java.util.Scanner;

public class Programme8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any character between A and F");
        char ch = s.next().charAt(0);
        compareCharacter(ch);
        s.close();

    }

    public static void compareCharacter(char ch) {
        if (ch == 'A' || ch == 'a') {
            System.out.println("City is Amsterdam");
        } else if (ch == 'B' || ch == 'b') {
            System.out.println("City is Bhopal");
        } else if (ch == 'C' || ch == 'c') {
            System.out.println("City is Calcutta");
        } else if (ch == 'D' || ch == 'd') {
            System.out.println("City is Damoh");
        } else if (ch == 'E' || ch == 'e') {
            System.out.println("City is Ellora");
        } else if (ch == 'F' || ch == 'f') {
            System.out.println("City is Frankfurt");
        } else {
            System.out.println("its invalid character");
        }
    }
}