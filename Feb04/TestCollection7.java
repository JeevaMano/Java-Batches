package Feb04;
import java.util.*;
import java.util.stream.Collectors;
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
public class TestCollection7 {
    public static void main(String[] args) {


        Student s1=new Student(101,"Mohan",30);
        Student s2=new Student(102,"Karthick",20);

        Student s3=new Student(103,"Immanuel",18 );

        Student s4=new Student(104,"Sathish",40);


        Collection<Student> a=new HashSet<Student>();

        a.add(s1);
        a.add(s2);
        a.add(s3);
        a.add(s4);

        // for(Student s:a)
        // {
        //     System.out.println(s);

        // }

        //a.forEach(al->System.out.println(al));

        List<Integer> agefil2 =a.stream()
.filter(p -> p.age > 21)
.map(p->p.age)
.collect(Collectors.toList());
			System.out.println(agefil2);

       
        
    }
    
}