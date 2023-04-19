package ByteStreams;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LAB4 {
    public static void main(String[] args) {
        String s = "Hello world!";
        byte[] b = s.getBytes();
        try {
            FileOutputStream file = new FileOutputStream("data.dat");
            BufferedOutputStream output = new BufferedOutputStream(file);
            output.write(b);
            output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
        Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE, null, ex);
    }
        try {
            FileInputStream file = new FileInputStream("data.dat");
            BufferedInputStream input = new BufferedInputStream(file);
            int ch;
            while((ch=input.read())!=-1){
                System.out.println((char)ch);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LAB4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
