
/**
 * Write a description of class MultipleTable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MultiplicationTable
{
    public static void main(String [] args)
    {
        for (int i = 1; i <= 10; i++) 
        {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%10d",i*j);
            }
            System.out.println();
        }
    }
}
