/**
 * 3. Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________
 */
package hoomworkWeek3;

import java.util.Scanner;

public class Programme3
{
public int maths,science,english,rollNum;
String name;
public boolean checkMarks(int marks)
{

    if (0<marks && marks>100)
    {
        System.out.println("Invalid Input, Marks should between 0 to 100");
        return false;
    }
    else
        return true;
}
public int total(int maths,int science,int english)
{

    int sum =maths+science+english;
    return sum;
}
public double percentage(int maths,int science,int english)
{
    int sum=maths+science+english;
    double percent=(sum*100)/300;
    return percent;

}
public String result(double percent)
{
    if(35<=percent){
        return "pass";
    }
    else return "Fail";
}
public String grade(double percent){
    if(80<=percent)
    {
        return "A+";
    }
    else if(60<=percent)
    {
        return "A";
    }
    else if(50<=percent){
        return "B";
    }
    else if(35<=percent){ return "C";}
    else{return "Fail";}
}

    public static void main(String[] args)
    {
       Programme3 obj=new Programme3();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Employee name");
        obj.name=s.next();
        System.out.println("Enter Roll number");
        obj.rollNum=s.nextInt();
        System.out.println("Enter Maths mark");
        int maths=s.nextInt();
        boolean m1= obj.checkMarks(maths);
        System.out.println("Enter Science mark");
        int science=s.nextInt();
        boolean s1= obj.checkMarks(science);
        System.out.println("Enter English mark");
        int english=s.nextInt();
        double per=obj.percentage(maths,science,english);
        boolean e1= obj.checkMarks(english);
        if (m1==true && s1==true && e1==true)
        {
            System.out.println("|--------------------------------| ");
            System.out.println("|                                |");
            System.out.println("|           Mark Sheet           |");
            System.out.println("|________________________________|");
            System.out.println("| Name        :    "+obj.name+"     |");
            System.out.println("| Roll No     :    "+obj.rollNum+"            |");
            System.out.println("|_________________________________|");
            System.out.println("| Subjects    :  Marks            |");
            System.out.println("|---------------------------------|");
            System.out.println("| Math        :  "+ maths+"               |");
            System.out.println("| Science     :  "+ science+"             |");
            System.out.println("| English     :  "+ english+"             |");
            System.out.println("|_______________________________|");
            System.out.println("| Total       :  "+obj.total(maths,science,english)+"             |");
            System.out.println("|_______________________________|");
            System.out.println(" Percentage    :   "+obj.percentage(maths,science,english)+"        |");
            System.out.println("|  Result      :  "+obj.result(per)+"             |");
            System.out.println(" |  Grade      :    "+obj.grade(per)+"            |");
            System.out.println("|                                 |");
            System.out.println("|---------------------------------|");

        }
else {
            System.out.println("Invalid Input, Marks should between 0 to 100");
        }

    }
}
