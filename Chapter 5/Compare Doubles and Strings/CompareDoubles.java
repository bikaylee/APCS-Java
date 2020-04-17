
/**
 * Program to experiment with comparing doubles
 * 
 * @author Kaylee Deng
 * @version 10-6-2015
 */
public class CompareDoubles
{
    public static void main(String[] args)
    {
        double number = 2.0;
        double root = Math.sqrt(number);
        double rootSquared = root * root;
        final double EPSILON = 1E-14; // EPSILON is a very small number.
        
        //if (number == rootSquared) do not use for doubles
        if (Math.abs(number - rootSquared)<EPSILON)
        {
            System.out.println(number + " is close enough to " + rootSquared);
        }
        else
        {
            System.out.println(number + " is not close enough to " + rootSquared);
        }

    }
}
