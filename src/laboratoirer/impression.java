/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratoirer;

import java.text.*;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author PCexpress
 */
public class impression {
      public static void imprimerJtable(JTable jt,String titer){
    MessageFormat entete =new MessageFormat(titer);
    MessageFormat peid =new MessageFormat("page(0,number,integer)");
    try{
    jt.print(JTable.PrintMode.FIT_WIDTH,entete,peid);
    }catch(Exception e){
        JOptionPane.showMessageDialog(null,"Erreur :\n"+e,"Impression",JOptionPane.ERROR_MESSAGE);
    }
    
}
}
