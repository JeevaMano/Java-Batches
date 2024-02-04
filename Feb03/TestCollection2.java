package Feb03;

import java.util.*;
public class TestCollection2 {
    public static void main(String[] args) {

        Set a=new HashSet();

        a.add(10);
        a.add(20);
        a.add(30);
        a.add(10);
        a.add(20);


        Set s=new TreeSet();

        s.add("Black shirt");
        s.add("Blue shirt");
        s.add("Red shirt");
        s.add("Gray shirt");
        s.add("Pink shirt");
        s.add("Black shirt");


        System.out.println(a.size());
        System.out.println(s.size());

        System.out.println(a);
        System.out.println(s);




        
    }
    
}
