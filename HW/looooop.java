
/**
 * Write a description of class looooop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class looooop
{
    //public static void main (String[] args)
    //{
    //         int sum = 0;
    //         for (int i = 2; i <= 100; i = i + 2)
    //         {
    //             sum = sum + i;
    //         }
    //         System.out.println(sum);

    //         int sum = 0;
    //         int square = 0;

    //         for (int i = 0; i <= 100; i++)
    //         {
    //             square = i*i;
    //             sum = sum + square;
    //         }
    //         System.out.println(sum);

    //         for (int power = 0; power <= 20; power++)
    //         {
    //             double product = Math.pow(2, power);
    //             System.out.println(product);
    //         }

    //         public int oddNum( int a, int b) 
    //         {
    //         int sum = 0;
    //         for (int i = a; i <= b; i++)
    //         {
    //             if(i%2 != 0)
    //             {
    //                 sum = sum + i;
    //             }
    //         }
    //         return sum;
    //     }

    public int num(int a)
    {
        int sum = 0;
        int length = String.valueOf(a).length();
        for(int count = 0; count <= length; count++)
        {
            int digit = (int) a%10;
            a = a/10;
            if(digit%2 != 0)
            {
                sum = digit + sum;
            }
        }
        return sum;
    }
    // }

}

