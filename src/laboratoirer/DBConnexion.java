/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratoirer;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author PCexpress
 */
public class DBConnexion {
  
    static String username="root";
    static String password="";
    static Connection con=null;
    static String Con_string="jdbc:mysql://localhost/lribdd";
    public static Connection ConnectBD(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        con= (Connection) DriverManager.getConnection(Con_string, username, password);
        System.out.println("connected");
        return con;
       }
  catch(Exception e)
    {
       JOptionPane.showMessageDialog(null,e);
            return null;}
        }
    
    
}

