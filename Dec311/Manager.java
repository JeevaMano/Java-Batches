package Dec311;

import Dec31.*;
class ManagerTest extends Employee
{
      String dept;

      public void setter()
      {
        super.setter();
        dept="Faculty";
      }
      public void display()
      {
        super.display();
      }



}
public class Manager extends Employee {

    public static void main(String[] args) {

        Manager m=new Manager();
        m.setter();
        m.display();
        
    }
  

    
}
