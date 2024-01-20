package Jan07;

class Student
{
    int id;
    String name;
   public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
static String College="Itvedant Chennai";

static void ChangeCollegeName()
{
    College="Itvedant Mumbai";
}

public void show()
{
    System.out.println(id+" "+name+" "+College);
}
   
}
public class StaticVariableTest {
    public static void main(String[] args) {
        
        Student s1=new Student(101, "Jeeva");
        s1.show();
        Student.ChangeCollegeName();
        Student s2=new Student(102,"Sathish");
        s2.show();
    }
    
}
