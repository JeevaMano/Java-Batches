package Feb04;
import java.util.*;
import java.util.stream.Collectors;
class Student2
{
	int rollno;
	String name;
	int age;
	Student2(int rollno,String name,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	public String toString()
	{
		return rollno+" "+name+" "+age;
	}
}
class AgeComparator implements Comparator<Student2>
{
	@Override
	public int compare(Student2 s1,Student2 s2)
	{
		if(s1.age==s2.age)
			return 0;
		else if(s1.age>s2.age)
			return 1;
		else
			return -1;
	}
}
class NameComparator implements Comparator<Student2>
{
	@Override
	public int compare(Student2 s1,Student2 s2)
	{
		return s1.name.compareTo(s2.name);
	}
}

public class TestCollection6 {
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student2> al=new ArrayList<Student2>();
		al.add(new Student2(101,"Vijay",23));
		al.add(new Student2(106,"Ajay",27));
		al.add(new Student2(105,"Jai",21));
		
		System.out.println("Sorting by Age");
		
		Collections.sort(al,new AgeComparator());
		
		for(Student2 a:al)
		{
			System.out.println(a);
		}

}
}
