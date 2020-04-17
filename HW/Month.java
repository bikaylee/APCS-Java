
public class Month
{
    private int month;
    public Month(int m)
    {
        month = m;
    }

    public int getLength()
    {
        if (month%2 > 0)
        {
            return 31;
        }
        else if (month%2 == 0 && month > 2)
        {
            return 30;
        } 
        else
        {
            return 28;
        }
        
    }
}
