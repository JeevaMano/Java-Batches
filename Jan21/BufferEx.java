package Jan21;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferEx {
    public static void main(String[] args) throws IOException, FileNotFoundException{
        FileOutputStream fout=new FileOutputStream("testout.txt");    
         BufferedOutputStream bout=new BufferedOutputStream(fout);    
         String s="Welcome to jeevaJAVA";    
         byte b[]=s.getBytes();    
         bout.write(b);    
         bout.flush();    //to clear the memory
         bout.close();    
         fout.close();    
         System.out.println("success"); 
    }
    
}
