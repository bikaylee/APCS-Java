
public class FrenchFlag
{
    private Picture pic;
    private int width;
    private int height;
    /**
     * Method getColorAt - returns the proper color in the proper location for the
     * Indonesian flag
     * @param  x,y the location of the pixel.  0,0 is top left and we count downward.
     * @return  returns the proper color at that location
     */
    public Color getColorAt(int x, int y)
    {
        // To do:  Determine what color should be at what pixel.  Return the Color.
        if ( x <= width/3)
        {
            return Color.BLUE;
        }
        else if( x <= 2*(width/3))
        {
            return Color.WHITE;
        }
        else 
        {   
            return Color.RED;
        }
    }

    /**
     * This is the constructor of the flag.  It can come after
     * the other methods but we usually put it first.  Don't 
     * worry about the code here.
     * 
     * If you are making other flags, you will have to change
     * the name of the constructor to match the class.
     */
    public FrenchFlag(int width, int height)
    {
        this.width = width;
        this.height = height;
        pic = new Picture(width, height);
        pic.draw();
        for (int x = 0; x < width; x++)
        {
            for (int y = 0; y < height; y++)
            {
                Color c = getColorAt(x, y);
                pic.setColorAt(x, y, c);
            }
        }
    }
}
