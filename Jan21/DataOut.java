package Jan21;

//to write primitive Java data types to the output stream in a machine-independent way.


import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOut {
    public static void main(String[] args) throws IOException,FileNotFoundException {
         FileOutputStream file = new FileOutputStream("testout1.txt");  
        DataOutputStream data = new DataOutputStream(file);  
        data.writeInt(65);  
        data.flush();  
        data.close();  
        file.close();
        System.out.println("Succcess...");  
    }
    
}
