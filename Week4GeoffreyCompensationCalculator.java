/*
 * Geoffrey Kinder - Week 4 - Compensation Calculator
 * Week 4 Tasks: 
 * The application will now compare the total annual compensation of at least two salespersons.
 * It will calculate the additional amount of sales that each salesperson must achieve to match or exceed the higher of the two earners.
 * The application should ask for the name of each salesperson being compared.
 * The application should have at least one class, in addition to the application's controlling class.
 * The source code must demonstrate the use of Array or ArrayList.
 * There should be proper documentation in the source code.
 */
package week4.geoffrey.compensationcalculator;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Kyle
 */
public class Week4GeoffreyCompensationCalculator {

    public static Double[] TotalAnnualCompensation;
    public static String[] SalesPersonName;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        {
        //Creates the SalesPersonName array that will store the Salesperson Names Entered
        String[] SalesPersonNameArray = new String[2];
        Scanner name = new Scanner(System.in);

            System.out.println("Please Enter The Name Of The First Salesperson:");
            SalesPersonNameArray[0] = name.next();

            System.out.println("Please Enter The Name Of The Next Salesperson:");
            SalesPersonNameArray[1] = name.next();

        //Creates the TotalAnnualCompensation array that will store the Total Annual Compensation Amounts Entered
        Double[] TotalAnnualCompensationArray = new Double[2];
        Scanner compensation = new Scanner(System.in);

            System.out.println("Please Enter The Total Annual Compensation for " +SalesPersonNameArray[0]);
            TotalAnnualCompensationArray[0] = compensation.nextDouble();

            System.out.println("Please Enter The Total Annual Compensation for " +SalesPersonNameArray[1]);
            TotalAnnualCompensationArray[1] = compensation.nextDouble();
        }        
        Double CalculateTotal1 = (TotalAnnualCompensation[0] - TotalAnnualCompensation[1]);
        Double CalculateTotal2 = (TotalAnnualCompensation[1] - TotalAnnualCompensation[0]);
    
        //if-else if-else Statements That Will Calculate The Salesperson Who Exceeded The Other
        if (TotalAnnualCompensation[0] > TotalAnnualCompensation[1])
            {
            PrintStream printf;
            printf = System.out.printf("This year %s[0] Exceeded The Sales of %s[1] By $%f"
                    ,SalesPersonName[0], SalesPersonName[1], CalculateTotal1);
            }
        else if (TotalAnnualCompensation[1] > TotalAnnualCompensation[0])
            {
            PrintStream printf;
            printf = System.out.printf("This year %s[1] Exceeded The Sales of %s[0] By $%f"
                    ,SalesPersonName[1], SalesPersonName[0], CalculateTotal2);
            }
        else
            {
            System.out.println("Neither Salesperson Exceeded The Other");
            }
        }
  }