package Dec24;

import java.util.*;
public class Whileex2 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int temp=n;

        int rem,rev=0;

        while(n!=0)
        {
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(temp==rev)
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Its not a palindrome");
        }

    }    
}
