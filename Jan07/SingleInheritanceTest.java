package Jan07;

class Employee
{
    int id;
    String name;
    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    int salary;
    
    public int getSalary()
    {
        return salary;
    }
}
class Manager extends Employee
{
    String dept;
    public Manager(int i,String n, int s, String d)
    {
        super(i,n,s);
        this.dept=d;
    }

    public int getSalary()

    {
        
        if(dept=="Faculty")
        {
            return salary+5000;
        }
        else if(dept=="HR"|| dept=="Admin")
        {
            return salary+3000;
        }
        else
        {
            return salary;
        }
    
        
    }

}

public class SingleInheritanceTest {
    public static void main(String[] args) {
        Manager m=new Manager(01,"Jeeva",49999,"Faculty");
        System.out.println(m.getSalary());
        Manager m1=new Manager(01,"Jeeva",49999,"HR");
        System.out.println(m1.getSalary());

    

    }
    
}
