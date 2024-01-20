package Dec23;
import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the a value");
        a=sc.nextInt();
        System.out.println("enter the a value");
        b=sc.nextInt();
        System.out.println("Enter the Choices");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            c=a+b;
            System.out.println(c);
            break;
            case 2:
            c=a-b;
            System.out.println(c);
            break;
            case 3:
            c=a*b;
            System.out.println(c);
            break;
            case 4:
            c=a/b;
            System.out.println(c);
            break;
            default:
            System.out.println("Invalid");
        }

    }
    
}
