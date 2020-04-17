
public class Manager extends Employee
{
    String department;
 
    public Manager(String name, int salary, String dep)
    {
       super(name, salary);
       this.department = dep;
    }
    
    public String getDepartment()
    {
        return department;
    }
    
    public String toString()
    {
        return super.toString() + "  " + getDepartment() ;
    }
}
