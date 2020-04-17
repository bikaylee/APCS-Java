import java.util.*;
/**
 * The recursive computation of Fibonacci numbers can be speeded up
 * significantly by keeping track of the values that have already been computed.
 * Provide an implementation of the fib method that uses this strategy.
 * Whenever you return a new value, also store it in an auxiliary array. 
 * However, before embarking on a computation, 
 * consult the array to find whether the result has already been computed.
 * Compare the running time of your improved implementation 
 * with that of the original recursive implementation and the loop implementation.
 */

public class Fib
{
    private long[] array;
    public Fib()
    {
        array = new long[92];
    }

    public long fib(int n)
    {
        if(array.length > n)
        {
            if(n <= 2)  //base case
            {
                return 1;
            }
            else  // simplified call
            {
                array[n] =  (fib(n-1) + fib(n-2));
                return array[n];
            }

        }
        else
        {
            return array[n];
        }


    }

    //         if( n <= 1)
    //         {
    //             if(array.length <= 1)
    //             {
    //                 array[n] = n;
    //                 return n;
    //             }
    //         }
    //        
    //         else
    //         {
    //             if(n <= 2)  //base case
    //             {
    //                 return 1;
    //             }
    //             else  // simplified call
    //             {
    //                 return (fib(n-1) + fib(n-2));
    //             }
    //         }
    //          else if()
    //         {
    //             long fibonacci = array[n];
    //             return array[n];
    //         }

    //     public static long fib(int n)
    //     {
    //         if (n <= 2) return 1;
    //         long fold = 1;
    //         long fold2 = 1;
    //         long fnew = 1;
    //         for (int i = 3; i <= n; i++)
    //         {
    //             fnew = fold + fold2;
    //             fold2 = fold;
    //             fold = fnew;
    //         }
    //         return fnew;
    //     }
}
