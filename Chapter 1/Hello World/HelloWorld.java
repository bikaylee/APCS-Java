
public class HelloWorld //<- class declaration
{
    //below is the class declaration
    public static void main(String[] args)
    {
        //this the body of the method main
        System.out.println("Hello, World");
        anotherMethod();
        anotherMethod();
    }
    
    public static void anotherMethod()
    {
        System.out.println("Hello from another Method");
    }
}