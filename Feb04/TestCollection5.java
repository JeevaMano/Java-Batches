package Feb04;

import java.lang.*;
import java.util.*;	
class Student1 implements Comparable<Student1>
{
	
	   int id;
       String name;
       int age;
	public Student1(int id, String name, int age) {
		
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
	
	@Override
	public int compareTo(Student1 o) {
		if(age==o.age)
		{
			return 0;
		}
		else if(age>o.age)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	
	}
	
	
}


public class TestCollection5 {
    
    public static void main(String[] args) {

        ArrayList<Student1>al=new ArrayList<Student1>();
		al.add(new Student1(101,"JEeva",29));
		al.add(new Student1(102,"kowsig",27));
		al.add(new Student1(103,"Natraj",22));
		al.add(new Student1(104,"Sai",23));
		
		Collections.sort(al);
		for(Student1 s11:al)
		{
			System.out.println(s11.id+" "+s11.name+" "+s11.age);
		}
		
	}
}


        

