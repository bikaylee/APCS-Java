import java.util.Scanner;
/**
 * @author Kaylee 
 * @version 10-19-2015
 */
public class H2O
{   
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("C for celsius or F for Fahrenheit: ");
        String symbol = in.nextLine();

        if (symbol.equals("C"))
        {
            System.out.print("The water temperature in Celsius: ");
            double c = in.nextDouble();
            if (c < 0.0)
            {
                System.out.println("The water is in the state of solid.");
            }
            else if (c > 0.0 && c < 100.0)
            {
                System.out.println("The water is in the state of liquid.");
            }
            else
            {
                System.out.println("The water is in the state of gaseous.");
            }
        }
        else
        {
            System.out.print("The degree in Fahrenheit: ");
            double f = in.nextDouble();
            if (f < 32.0)
            {
                System.out.println("The water is in the state of solid.");
            }
            else if (f >32.0 && f < 212.0)
            {
                System.out.println("The water is in the state of liquid.");
            }
            else
            {
                System.out.println("The water is in the state of gaseous.");
            }
        }
    }
}

    
    