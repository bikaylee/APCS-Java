/**Given a class Square with an instance variable width, 
 * provide a recursive getArea method. 
 * Construct a square whose width is one less
 * than the original and call its getArea method.
 */

public class Square
{
    public Square()
    {
    }

    public int getArea(int width)
    {
        if(width <= 0)
        {
            return 0;
        }
        else
        {
            return  width + (width -1) + getArea(width -1);
        }
    }
}

