package Dec31;
import java.util.*;
public class Employee{

     public int id;
    String name;
    int salary;

    public void setter()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Employee id");
        id=sc.nextInt();
        System.out.println("Enter the Employee Name");
        name=sc.next();
        System.out.println("Enter the Employee Salary");
        salary=sc.nextInt();


    }
    public void display()
    {
        System.out.println("The Employee id"+id);
        System.out.println("the Employee Name"+name);
        System.out.println("The Employee Salary is"+salary);
    }



}
 



