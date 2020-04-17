
/**
 * Write a description of class Loop here.
 * 
 * @author Kaylee Deng   
 * @version 10-24-2015
 */
public class Loop
{
    public static void main (String[] args)
    {
        int num = 2;
        int sum = 0;
        while( num <= 100)
        {
            sum = num + sum;
            num = num + 2;
            System.out.println(sum);
        }
        

        
    }
}
