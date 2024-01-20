package Jan07;
class First
{
    public First()
    {
        this(10,20);
       
        System.out.println("Hello Default Constructor");
    }
    public First(int a, int b)
    {
        this(10,20,30);
        System.out.println(a+b);
    }
    public First(int a, int b,int c)
    {
         System.out.println(a+b+c);
    }
}

public class ConstructO {
    public static void main(String[] args) {
        First f=new First();
        
    }

    
}
