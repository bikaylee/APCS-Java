
/**
 * Program to experiment with comparing doubles
 * 
 * @author Kaylee Deng
 * @version 10-6-2015
 */
public class CompareDoublesStrings
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

        String str1 = "Geo";
        String str2 = "rge";
        String name1 = str1 + str2;
        String name2 = "George";
        //if (name1 == name2) Do not use == for Strings
        if (name1.equals(name2))
        {
            System.out.println(name1 + " is the same as " + name2);
        }
        else
        {
            System.out.println(name1 + " is not the same as " + name2);
        }
        
    }
}