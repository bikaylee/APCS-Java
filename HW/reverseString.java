
public class reverseString
{

    public reverseString()
    {
    }
    
    public String reverse(String text)
    {
        if(text.length() == 0)
            return text;
        else 
        {    
            int num = text.length();
            String str1 = text.substring(0, num-1);
            String str = text.substring(num-1, num);
            return str + reverse(str1);
        }
    }
}
