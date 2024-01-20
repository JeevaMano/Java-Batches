package Jan13;

import java.util.Scanner;

abstract class ram
{
    abstract void HomePage();
    
    public void Simple()
    {
        System.out.println("Hello ");
    }
}

class LoginPage extends ram
{
    public void HomePage()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the USer Name");
        String user=sc.next();
        System.out.println("Enter the Password");
        String pass=sc.next();

        if(user.equals(pass))
        {
            Simple();
        }
        else
        {
            System.out.println("Error");
        }
    }
}
public class AbstractionTest {
    
    public static void main(String[] args) {

        ram r;
        r=new LoginPage();//Vitual Method Invocation
        r.HomePage();
        
        
        LoginPage l=new LoginPage();
         l.HomePage();
        
    }
}
