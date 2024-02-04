package Feb03;

import java.util.*;
public class TestCollection3 {
    public static void main(String[] args) {

        Map<Integer,String> a=new HashMap<>();

        a.put(101,"Jeeva");
        a.put(102,"Karthick");
        a.put(103,"Sowmiya");
        a.put(101,"Immanuel");

        System.out.println(a);

        Map<Integer,String> a1=new TreeMap<>();

        a1.put(101,"Jeeva");
        a1.put(102,"Karthick");
        a1.put(103,"Sowmiya");
        a1.put(101,"Immanuel");

        System.out.println(a1);
        
    }
    
}
