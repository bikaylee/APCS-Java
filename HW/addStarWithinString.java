
public class addStarWithinString

{

    public addStarWithinString()
    {
    }

    public String addStar(String str)
    {
        if(str.length() <= 1)
        {
            return str;
        }
        else
        {
            String first = str.substring(0,1);
            String root = str.substring(1,str.length());
            return first + "*" + addStar(root);
           
        }
    }
}
