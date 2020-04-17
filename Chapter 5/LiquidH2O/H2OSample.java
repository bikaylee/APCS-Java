
/**
 * Class to model a sample of H2O
 * 
 * @author Kaylee Deng
 * @version 10-15-2015
 */
public class H2OSample
{
    //instance variable
    private double temp;
    //possible instance variables: pH, salinity, bacteriaCount

    /**
     * Construstor with one construction  argument
     * 
     * @param initTemp initial temperature of the sample (c)
     */
    public H2OSample(double initTemp)
    {
        this.temp = initTemp;
    }

    /**
     * Method to determine if the sample is a liquid
     * 
     * @return boolean that is true if the sample is a liquid
     */
    public boolean isLiquid()
    {
        return this.temp > 0 && this.temp < 100;
        
        //boolean isLiquid = this.temp > 0 && this.temp < 100;

        //         boolean isLiquid = false;
        //         if (this.temp > 0 && this.temp < 100)
        //         {
        //             isLiquid = true;
        //         }

        //         return isLiquid;
    }
}
