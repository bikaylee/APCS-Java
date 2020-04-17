
/**
 * HW5 (E5.14)
 * 
 * @author Kaylee 
 * @version 10-19-2015
 */
public class Date
{
    private int months;
    private int day;

    public Date(int m, int d)
    {
        months = m;
        day = d;
    }

    public void getSeason()
    {
        if (months <=3 && months >=1)
        {
            System.out.println("The season is Winter.");
        }
        else if (months <= 6 && months >=4)
        {
            System.out.println("The season is Spring.");
        }
        else if (months <= 9 && months >= 7)
        {
            System.out.println("The season is Summer.");
        }
        else // if (months <= 12 && months >= 10)
        {
            System.out.println("The season is Fall.");
        }
        if (months%3 == 0 && day >= 21)
        {
            if( months <=3 && months >=1)
            {
                System.out.println("The season is Spring.");
            }
            else if (months <= 6 && months >=4)
            {
                System.out.println("The season is Summer.");
            }
            else if (months <= 9 && months >= 7)
            {
                System.out.println("The season is Fall.");
            }
            else 
            {
                System.out.println("The season is Winter.");
            }
            
        }
        else 
            {
                System.out.println("Error.");
            }
        }
    }

