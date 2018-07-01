import java.io.*;
import java.net.*;

/**
 *
 * @author all
 */
public class Server {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{  
        ServerSocket ss=new ServerSocket(3333);  
        Socket s=ss.accept();  
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
        int num1,mul;
        num1 = br.read();
        mul = num1 * 2;
        dout.writeInt(mul);
        s.close();  
        ss.close();  
    }
    
}