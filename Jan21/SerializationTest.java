package Jan21;


// Serialization is converting objects into byte streams that can be stored, 
// shared, and used by Java machines to reconstruct the objects.


// Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory. 
// This mechanism is used to persist the object.

import java.io.*;
class Student implements Serializable{  
    int id;  
    String name;  
    public Student(int id, String name) {  
     this.id = id;  
     this.name = name;  
    }  
   }  
public class SerializationTest {
    public static void main(String[] args) throws ClassCastException,ClassNotFoundException,FileNotFoundException,IOException{
        Student s1 =new Student(211,"ravi");  
  
        FileOutputStream fout=new FileOutputStream("f.txt");  
        ObjectOutputStream out=new ObjectOutputStream(fout);  
        
        out.writeObject(s1);  
        out.flush();  
        System.out.println("success");  

        //Deserialization
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));  
      Student s=(Student)in.readObject();  
      System.out.println(s.id+" "+s.name);  
    }
    
}
