import java.util.Scanner;
public class character
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = in.next();
        int x = word.length();
        int i = (int) Math.random()*x;
        int j = (int) Math.random()*(x -1)+(i+1);
        String first = word.substring(0, i);
        String middle = word.substring(i+1, j);
        String last = word.substring(j+1,x);
        word = first + word.charAt(j) + middle + word.charAt(i) +last;
       System.out.println(word);
    }
}
