package Jan07;

class A
{
    void show()
    {
        System.out.println("I am in A");
    }
    void show1()
    {
        System.out.println("Jeeva");
    }
}

class B extends A
{
    void show()
    {
        super.show();
        System.out.println("I am in B");
    }
}
public class DownCasting {
    public static void main(String[] args) {
        
        B a=new B();
        a.show();
        a.show1();
        //A a=new B();

       // B b=new A();



    }
    
}
