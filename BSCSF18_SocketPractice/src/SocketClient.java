
import java.io.DataInputStream;
import java.io.DataOutputStream;
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
public class SocketClient {
    Socket soc;
    DataInputStream in;
    DataOutputStream out;  //  it will convert the data into the stream format in irder t send it to server site

    public SocketClient(String addr, int port) 
    {
        try {
            
            soc = new Socket(addr, port);
            
           // System.out.println("connected to server");
            System.out.println("client connected");
            
            Scanner keyboard = new Scanner(System.in);
            out = new DataOutputStream(soc.getOutputStream());// jo message bhejna ha wo is stream k zariye jaye ga 
                       // i will mention that i want to send my data to the socket and i use outport port to send data to server
            
             in = new DataInputStream(soc.getInputStream());
                     
             String line = "";
            String receiveFromServer="";
            
            while (!line.equalsIgnoreCase("quit"))
            { 
                
                line = keyboard.nextLine();
                out.writeUTF(line);
                
                if(!line.equalsIgnoreCase("quit"))// if client send quit it will stop receiving from server
                { 
                   receiveFromServer = in.readUTF();
                   System.out.println("Server: "+receiveFromServer);
                }
                
            } 
            in.close();
            out.close();
            keyboard.close();
            System.out.println("client closing");
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public static void main(String[] args) {
        SocketClient sc = new SocketClient("127.0.0.1", 4444);
    }
    
    
}
