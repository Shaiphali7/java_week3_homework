/**
 * 5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 *  HRA = basic salary 10%
 *  DA = Basic salary 8%
 *  TA = Basic salary 9%
 *  PF= Basic salary 20%
 *  Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | TA 8% : 2250.0 |
 * | DA 9% : 2000.0 |
 * | PF - 20& : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================|
 */
package hoomworkWeek3;

import java.util.Scanner;

public class Programme5
{
   static String empName;
   static int empId;
   static float basicSalary;
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Employee name");
        empName= s.next();
        System.out.println("Enter Employee Id");
        empId= s.nextInt();
        System.out.println("Enter employee basic salary");
        basicSalary=s.nextFloat();
        Programme5 obj=new Programme5();
        float hra=hra(basicSalary);
        float da=da(basicSalary);
        float ta= obj.ta(basicSalary);
        float pf= obj.pf(basicSalary);
        float grossSalary=basicSalary+hra+ta+da-pf;
        System.out.println("_______________________________ |");
        System.out.println("| Salary Slip                   |");
        System.out.println("|------------------------------ |");
        System.out.println("| Employee Id   : "+ empId+"         |");
        System.out.println("| Employee Name : "+ empName+"     |");
        System.out.println("_______________________________ |");
        System.out.println("| Basic Salary  : "+basicSalary+"      |");
        System.out.println("| HRA 10%       : "+hra+"       |");
        System.out.println("| TA 8%         : "+ta+"        |");
        System.out.println("| DA 9%         : "+da+"        |");
        System.out.println("| PF 20%        : "+pf+"        |");
        System.out.println("______________________________|");
        System.out.println("| Gross Salary         : "+grossSalary+"|");
        System.out.println("|=============================|");
        s.close();

    }
    static float hra(float basicSalary)
    {
        float hra=basicSalary*0.1F;
        return hra;

    }
    public static float da(float basicSalary)
    {

        float da= basicSalary * 0.08F;
        return da;
    }
    public float ta(float basicSalary)
    {

        float ta= basicSalary * 0.09F;
        return ta;
    }
    public float pf(float basicSalary)
    {

        float pf= basicSalary * 0.2F;
        return pf;
    }

}
