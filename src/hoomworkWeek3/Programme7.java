/**
 * 7. Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 *  Sales amount >= 50,000 35%
 *  Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
package hoomworkWeek3;

import java.util.Scanner;

public class Programme7
{
    static float saleAmount,saleCommission;
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter sale Id");
        int saleId=s.nextInt();
        System.out.println("Enter seller's name");
        String sellerName=s.next();
        System.out.println("Enter Sale Amount");
        float saleAmount=s.nextFloat();
        System.out.println("Enter salary basic");
        float salaryBasic=s.nextFloat();
        saleCommission=saleCommission(saleAmount);
        System.out.println("Sale Commission = "+saleCommission);

    }
    public static float saleCommission(float saleAmount)
    {
        if(saleAmount>=50000)
        {
           return saleCommission =saleAmount * 0.35F;
        }
        else if(saleAmount>=30000)
        {
            return saleCommission =saleAmount * 0.20F;
        } else if (saleAmount>=20000)
        {
          return saleCommission=saleAmount * 0.10F;
        } else if (saleAmount>=10000)
        {
           return saleCommission=saleAmount * 0.05F;
        }
        else if (saleAmount<10000)
        {
            return saleCommission=saleAmount * 0.02F;
        }
        else return saleCommission=0.00F;
    }
}
