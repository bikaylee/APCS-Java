import java.util.Scanner;
/**
 * Program to experiment with if / else if /else statements
 * 
 * @author Kaylee Deng
 * @version 10-6-2015
 */
public class Earthquake
{
    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter earthquake magnitude " );
        double magnitude = in.nextDouble();

        if (magnitude >= 8.0)
        {
            System.out.println("Most buildings fall!");

        }
        else if (magnitude >= 7.0)
        {
            System.out.println("Many buidings destroyed!");
        }
        else if (magnitude >= 6.0)
        {
            System.out.println("Many buiding considerably damaged");
        }
        else if (magnitude >= 4.5)
        {
            System.out.println("Damage to poorly constructed buildings");
        }
        else
        {   
            System.out.println("little or no damage!");
        }

    }

}
