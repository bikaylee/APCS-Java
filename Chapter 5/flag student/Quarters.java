
/**
 * Write a description of class fhgdf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Quarters

{
    public static void main(String[] args)
    {
        System.out.println( "Enter the number of quarters: ");
        int quarters = in.in.nextInt();
        if (in.hasNextInt() )
        { 
            total = total + quarters * 0.25;
            System.out.println("Total: " + total);
        }
        else
        {	
            System.out.println("Input error.");
        }
    }
}
