import java.util.Scanner;
/**
 * Program to experiment with nested if statements
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TaxReturn
{
    // instance variables - replace the example below with your own
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter \"s\" for single.\"m\" for married: ");
        String status = in.next();
        System.out.print("Enter income: ");
        double income = in.nextDouble();

        double tax = 0.0;

        if (status.equals("s"))
        {
            if ( income <= 32000.0)
            {
                tax = income * 0.1;
            }
            else
            {
                tax = 3200.0 + (income - 32000.0) * 0.25;
            }
        }
        else
        {
            if (income <= 64000.0)
            {
                tax = income * 0.1;
            }
            else
            {
                tax = 6400.0 + (income - 64000.0) * 0.25;
             
            }
        }
        System.out.println("Your tax is " + tax);
    }
}
