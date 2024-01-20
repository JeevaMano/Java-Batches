package Dec23;
import java.util.Scanner;

public class Ifelseex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        System.out.println("enter the username");
        String username=sc.nextLine();
        System.out.println("Enter the Password");
        String pass=sc.nextLine();
        if(username.equals(pass))
        {
            System.out.println("Welcome to Home page");
        }
        else{
            System.out.println("User name and Password is wrong");
        }

    
    }
    
}
