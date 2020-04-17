
/**
 * Write a description of class gfgsdsd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProductPrinter
{
    private double price;
    public ProductPrinter()
    {
        price = 0.0;
       }
       
    public String getName(String name)
    {
        return name;
    }

    public double getPrice(double amount)
    {
        this.price = amount;
        return price;
    }

    
    public double reducePrice(double amount)
    {
        price = price - amount;
        return price;
    }
}

