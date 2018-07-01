import java.io.*;
import java.net.*;
import java.util.*;

public class SocketText {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Socket s=new Socket("localhost",3333);  
        DataInputStream din=new DataInputStream(s.getInputStream());  
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
       Scanner sc = new Scanner(System.in);
       int a,b;
       a = sc.nextInt();
        dout.writeInt(a);
        b=din.read();
        System.out.println(a+" * 2 = "+b);
        dout.close();  
        s.close();  
    }
    
}