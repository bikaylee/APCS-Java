import java.util.Scanner;
/**
 * Method to test Elevator methods
 * 
 * @author Kaylee Deng
 * @version 10-5-2015
 */
public class ElevatorTester
{
    public static void main (String[] args)
    {
        Elevator elevator1 = new Elevator();

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Floor: ");
        if(in.hasNextInt())
        {
            int desiredFloor = in.nextInt();
            if (desiredFloor == 13 || desiredFloor < 1 || desiredFloor > 20)
            {
                System.out.println("Invalid floor");
            }
            else
            {
                elevator1.pressDesiredFloor(desiredFloor);
                System.out.println("Actual Floor = " + elevator1.getActualFloor());
            }
        }
        else
        {
            System.out.println("Not an integer");
        }
    }

}
