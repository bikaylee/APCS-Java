
/**
 * Write a description of class R here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class R
{
    public static void main (String[] args)
    {
        //         String s = "*";
        //         String t = " ";
        //int sideLength= 4;
        //         int max = sideLength*2 -1;
        //         final int NMAX = max;
        //         final double XMAX = max;
        //         for(int x = 0; x < sideLength; x++)
        //         {
        //             for (int y = 0; y < max/2; y++)
        //             {
        //                 System.out.print(s);
        //             }
        //             System.out.println();
        //         }
        // 
        int sideLength= 4;
        int width = sideLength * 2 - 1;
        int halfWidth = width / 2;
        int n = 1;
        for (int i = 0; i < sideLength; i++) 
        {
            for (int j = 0; j < halfWidth; j++) 
            {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            n += 2;
            halfWidth -= 1;
        }
        n = width - 2;
        halfWidth = 1;
        for (int i = 0; i < sideLength; i++) 
        {
            for (int j = 0; j < halfWidth; j++) 
            {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) 
            {
                System.out.print("*");
            }
            System.out.println();
            n -= 2;
            halfWidth += 1;
        }
    }
}

