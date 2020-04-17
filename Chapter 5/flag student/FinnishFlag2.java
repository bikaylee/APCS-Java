

public class FinnishFlag2
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
        if ( x <= 1 * width/ 3)
        {
            return Color.BLUE;
        }
        else if ( x >= 1* width/3 && y <= 1 *height /2)
        {
            return Color.BLACK;
        }
        else 
        {
            return Color.WHITE;
        }
        //         if ( x < 5* width / 18)
        //         {
        //             if( y < 4 *height /11)
        //             {
        //                 return Color.WHITE;
        //             }
        //             else if ( y > 7 * height /11)
        //             {
        //                 return Color.WHITE;
        //             }
        //             else 
        //             {
        //                 return Color.BLUE;
        //             }
        //         }
        //         else if (x > 8* width /18)
        //         {
        //            if( y < 4 *height /11)
        //             {
        //                 return Color.WHITE;
        //             }
        //             else if ( y > 7 * height /11)
        //             {
        //                 return Color.WHITE;
        //             }
        //             else 
        //             {
        //                 return Color.BLUE;
        //             }
        //         }
        //         else 
        //         {
        //             return Color.BLUE;
        //         }

    }

    /**
     * This is the constructor of the flag.  It can come after
     * the other methods but we usually put it first.  Don't 
     * worry about the code here.
     * 
     * If you are making other flags, you will have to change
     * the name of the constructor to match the class.
     */
    public FinnishFlag2(int width, int height)
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
