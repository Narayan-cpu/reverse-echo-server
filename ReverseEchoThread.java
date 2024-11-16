
package reverseechothread;
import java.io.*;
import java.net.*;

/**
 *
 * @author narayan
 */
public class ReverseEchoThread extends Thread{
         
    Socket stk;
    public void run(){
        try{
          BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps =new PrintStream(stk.getOutputStream());
        
        String msg;
        StringBuilder sb;
        do{
            msg=br.readLine();
            sb= new StringBuilder(msg);
            sb.reverse();
            msg=sb.toString();
            ps.println(msg);
        }while(!msg.equals("dne"));
        System.out.println("Server Closed");
        stk.close();
        }catch(Exception e){};
    }
    /**
     * @param args the command line arguments
     * 
     *
     */
    public static void main(String[] args) throws Exception  {
       
           ServerSocket ss=new ServerSocket(2000);
        Socket stk ;
        ReverseEchoThread re;
        do{
           stk= ss.accept();
           System.out.println("Server Started for client !!");
           re=new ReverseEchoThread();
           re.start();
            
        }while(true);
     
      
    }
    
}


class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
    
        Socket stk = new Socket("localhost",2000);
        BufferedReader Kebw=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps =new PrintStream(stk.getOutputStream());
       
        String msg;
        
        do{
            msg=Kebw.readLine();
            ps.println(msg);
            msg=br.readLine();
            System.out.println("From Server "+msg);
        }while(!msg.equals("dne"));
        stk.close();
    }
    
}
