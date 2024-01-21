package Jan21;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOut {
    public static void main(String[] args) throws IOException {
         FileOutputStream fout=new FileOutputStream("C:\\Users\\HP\\Desktop\\testout.txt");    
                 fout.write(65);    
                 fout.close();    
                 System.out.println("success...");    
    }
    
}
