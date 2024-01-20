package Jan13;


interface A
{
	public void one();
	int a=10;
}
interface B
{
	public void two();
	int b=20;
}

class C implements A,B
{
	public void one()
	{
		System.out.println("Hello world");
	}
	public void two()
	{
		//b=30;
		System.out.println(a+b);
	}
}
public class InterfaceExample
{
	public static void main(String...args)
	{
		C c=new C();
		c.one();
		c.two();
	}
}
