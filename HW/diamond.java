
/**
 * Write a description of class diamond here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class diamond
{
    public static void main (String[] args)
    {
        int a = 1;
        int sideLength = 4;
        int width = sideLength * 2 -1;
        int halfwidth = width/2;
        //makes the middle column
        for ( int i = 0; i < width; i++)
        {
            for (int left = 0; left < width; left++)
            {
                System.out.print(" ");
                
            }
            for (int center = 0; center < a; center++)
            {
                System.out.print("*");
            }
            System.out.println();
            a += 2; 
            halfwidth -= 1;
        }
        a = width - 2;
        halfwidth = 1;
        for (int i = 0; i < sideLength; i++) 
        {
            for (int j = 0; j < halfwidth; j++) 
            {
                System.out.print(" ");
            }
            for (int j = 0; j < a; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
