
/**
 * Write a description of class sg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HW6R
{
    public static void main (String[] args)
    {
        // R 6.1 , 6.10, 6.15, 6.19
        int n = 100;
        int i = 0;
        int square = 0;
        while (square < n )
        {
            square = i*i;
            if(square < n)
            {
                i++;
                System.out.println(square);
            }
        }

        //         int n = 100;
        //         int i = 0;
        //         int num = 0;
        //         while (num < n)
        //         {
        //             num = num+10;
        //             if(num < n)
        //             {
        //                 if( num%10 == 0)
        //                 {
        //                     System.out.println(num);
        //                 }
        //             }
        // 
        //         }
        //         int n = 100;
        //         int i = 0;
        //         int square = 0;
        //         while (square < n )
        //         {
        //             square = i*i;
        //             if(square < n)
        //             {
        //                 i = i +2;
        //                 System.out.println(square);
        //             }
        //         }
        //         int s = 0;
        //         int i = 1;
        //         while(i <= 10)
        //         {
        // 
        //             s = s + i;
        //             System.out.println(s);
        //             i++;
        //         }
        // 
        //         int s = 0;
        //         for(int i = 1; i <= 10; i++)
        //         {
        //             s = s + i;
        //             System.out.println(s);
        //         }
        // 
        //         int n = 1;
        //         for (int i = 2; i < 5; i++)
        //         {
        //             n = n + i;
        //             System.out.print(n);
        //         }
        // 
        //         int i;
        //         double n = 1/2;
        //         for (i = 2; i <= 5; i++)
        //         {
        //             n = n + 1.0 / i;
        // 
        //             System.out.println(n);
        //         }
        //         double x = 1;
        //         double y = 1;
        //         int i = 0;
        //         do 
        //         {
        //             y = y/2;
        //             x = x + y;
        //             i++;
        //         }
        //         while (x <1.8);
        //         System.out.print(i);
        //     }
        //     double x = 1;
        //     double y = 1;
        //     int i = 0;
        //     while (y >= 1.5)
        //     {
        //         x = x /2;
        //         y = x + y;
        //         i ++;
        //     }
        //     System.out.print(i);
    }
}
