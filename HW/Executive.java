
public class Executive extends Manager
{ 
    int bonus;
    public Executive(String name, int salary,String department)
    {
        super(name, salary, department);
    }

    public void setBonus(int bonus)
    {
        this.bonus = bonus;
    }

    public int getBonus()
    {
        return bonus;
    }
    
    public String toString()
    {
        return super.toString() + " " + this.getBonus();
    }
}
