package Jan07;
class Second
{
    public int add(int...a)
    {
        int sum=0;
        
        for(int s:a)
        {
            sum=sum+s;
        }
        return sum;
    }
}

public class VariableLength {
    public static void main(String[] args) {
        Second s=new Second();
        int d[]={10,20};
        System.out.println(s.add(d));
    }
    
}
