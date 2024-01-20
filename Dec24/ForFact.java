package Dec24;
import java.util.*;
public class ForFact {
    public static void main(String[] args) {
        int fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n number");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("The Factorial of "+n+" is "+fact);


    }
    
}
