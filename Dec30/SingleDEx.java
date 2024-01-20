package Dec30;

import java.util.Scanner;

public class SingleDEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Array Size");
        int size=sc.nextInt();
        int a[]=new int[size];
        int sum=0;
        for (int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
            sum=sum+a[i];

        }
        System.out.println("The sum of Array Elements"+sum);
        double avg=sum/size;
        System.out.println("the Average of Array elements"+avg);
    }
    
}
