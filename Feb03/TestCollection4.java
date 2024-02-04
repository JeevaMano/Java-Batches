package Feb03;

import java.util.*;

class Student
{
    int id;
    String name;
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    int age;

    public String toString()
    {
        return id+" "+name+" "+age;
    }
}
public class TestCollection4 {
    public static void main(String[] args) {


        Student s1=new Student(101,"Mohan",30);
        Student s2=new Student(102,"Karthick",40);

        Student s3=new Student(103,"Immanuel",22);

        Student s4=new Student(104,"Sathish",40);


        Collection<Student> a=new HashSet<Student>();

        a.add(s1);
        a.add(s2);
        a.add(s3);
        a.add(s4);

        for(Student s:a)
        {
            System.out.println(s);

        }
       
        
    }
    
}
