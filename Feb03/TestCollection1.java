package Feb03;

import java.util.*;
public class TestCollection1 {
    public static void main(String[] args) {
        List a=new ArrayList();
        //ArrayList a=new ArrayList();

        List a1=new ArrayList();//downcasting

        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);


        a1.add(10);
        a1.add("Jeeva");
        a1.add(30);
        a1.add(30.5);
        a1.add(40000);
        a1.add(true);

        System.out.println(a);
        System.out.println(a1);



    }
    
}
