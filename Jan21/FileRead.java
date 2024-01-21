package Jan21;

import java.io.*;
public class FileRead {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        FileInputStream fin=new FileInputStream("testout.txt");    
                int i=fin.read();  
                System.out.print((char)i);    
      
                fin.close();    
    }
    
}
