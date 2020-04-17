
/**
 * Class to simulate a basic elevator
 * 
 * @author Kaylee Deng
 * @version 10-5-2015
 */
public class Elevator
{
    private int actualFloor;

    /**
     * Constructor with no arguments. initializes 
     * actualFloor to 1.
     */
    public Elevator()
    {
        actualFloor = 1;
    }

    /**
     * Constructor with 1 argument. 
     * It is overload meaning that it has the same return type but different arguments.
     * (either different number of arguments or types)
     * 
     * @param initialFloor the intial floor
     */
    public Elevator(int initialFloor)
    {
        this.actualFloor = initialFloor;

    }

    public void pressDesiredFloor(int desiredFloor)
    {
        /** 
         * simulates a user pressing a floor button
         * 
         * @param desiredFloor the button that was pressed
         */
        /*
        if (desiredFloor > 13)
        {
        actualFloor = desiredFloor -1;
        }
        else
        { 
        actualFloor = desiredFloor;
        }
        }
         */
        actualFloor = desiredFloor;
        if (desiredFloor > 13)
        {
            actualFloor --;
        }
    }

    /**
     * returns floor of building
     * 
     * @return actual Floor of building
     */
    public int getActualFloor()
    {
        return actualFloor;
    }
}
