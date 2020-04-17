
public class JapaneseFlag
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
        //Math.PI * Math.pow(width/3/2,2)
        //boolean circle = contains(width /2, height/2, width/3, height/2);
        //x >= width /3 && x <= 2*(width/3) && y >= height/4 && y <= 3*(height/4)
        //new Ellipse2D.Int( width /2, height/2, width/3, height/2)
        //the center of the circle is (300,200) which is ( width/2, height/2)
        //x == width/2 && y == height/2
        int centerX = width/2;
        int centerY = height/2;
        int r = width/3/2;
        //x = Math.cos(theta) * Math.sqrt(2) * width + centerX
        if ( r*r >= Math.pow((x-centerX),2)+ Math.pow((y-centerY),2))
        {
            return Color.RED;
        }
        else 
        {
            return Color.WHITE;
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
    public JapaneseFlag(int width, int height)
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
