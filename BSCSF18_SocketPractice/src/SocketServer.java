
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anzar
 */
public class SocketServer {
    
    ServerSocket ss;
    Socket soc;
    Socket soc2;
    DataInputStream in;
    DataOutputStream out;
     DataInputStream in2;
    DataOutputStream out2;

    public SocketServer(int port) 
    {
        try {
            //server port ready for work
            ss = new ServerSocket(port);
            System.out.println("Server listening on  "+ port);
            
            //accept connection
            soc = ss.accept();
            // if ServerSocket acept request it will create socket object
            System.out.println("connected ...");
             soc2 = ss.accept();
            
            in = new DataInputStream(soc.getInputStream());
            in2 = new DataInputStream(soc2.getInputStream());
            
            
            out = new DataOutputStream(soc.getOutputStream());// jo message bhejna ha wo is stream k zariye jaye ga 
            out2 = new DataOutputStream(soc2.getOutputStream());// jo message bhejna ha wo is stream k zariye jaye ga 
            
            Scanner keyboard = new Scanner(System.in);
            
            // line for receive client data
            String receiveFromClient ;
            String sendToClient="";
            String receiveFromClient2 ;
            String sendToClient2="";
            
            while ( !(receiveFromClient = in.readUTF()).equalsIgnoreCase("quit") && !(receiveFromClient2 = in2.readUTF()).equalsIgnoreCase("quit"))
            { 
                 //print what receive from server
                System.out.println("Client: "+receiveFromClient); 
                System.out.println("Client2: "+receiveFromClient2); 
                
                
                // send to client 
                sendToClient = keyboard.nextLine();
                out.writeUTF(sendToClient);
                
            } 
            keyboard.close();
            out.close();
            in.close();
            soc.close();
            System.out.println("Server closing connection");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
    
    public static void main(String[] args) {
        SocketServer ss = new SocketServer(4444);
    }
    
    
}
