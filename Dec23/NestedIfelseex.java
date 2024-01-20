package Dec23;
public class NestedIfelseex {
    public static void main(String[] args) {

        int a=10,b=20,c=30;

        if(a>b)
        {
            if(a>c)
            {
                System.out.println("A is big");
            }
            else{
                System.out.println("C is big");
            }
        }
        else{
            if (b>c)
            {
                System.out.println("B is big");
            }
            else{
                System.out.println("c is big");
            }
        }
        
    }
    
}
