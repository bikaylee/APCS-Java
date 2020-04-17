
/**
 * Write a description of class gdfshd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProductPrinterTest
{
        public static void main(String[] args)
        {
        ProductPrinter product;
        product = new ProductPrinter();
        
        
        String name = product.getName("Toaster");
        System.out.println("Actual name is " + name);
        System.out.println("Expected name is Toaster");
        
        double initPrice = product.getPrice(29.95);
        System.out.println("Actual price is " + initPrice);
        System.out.println("Expected name is 29.95");
        
        
        double finalPrice = product.reducePrice(5.00);
        System.out.println("Actual reducePrice is " + finalPrice);
        System.out.println("Expected name is 24.95");
    }
}

