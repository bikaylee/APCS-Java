import java.util.Scanner;
/**
 * Write a description of class companyName here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Paycheck
{   
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your hours: ");
        double wage = in.nextDouble();
        double hourlyWage = 9.25;
        
        if (wage <= 40.0 && wage > 0)
        {
            double salary = wage * hourlyWage;
            System.out.println("Your salary is: $" + salary);
        }
        else if ( wage > 40.0)
        {   
            double salary = 40.0 * hourlyWage;
            double overTimeWage = (1.50 * hourlyWage) * (wage - 40) + salary;
            System.out.println("Your overtime work salary is: $" + overTimeWage);
        }
        else
        {
            System.out.println("Your were on vacation this week = no salary!");
        }
        
            }
    }
