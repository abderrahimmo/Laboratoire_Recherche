/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package laboratoirer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author PCexpress
 */
public class page_equipe extends javax.swing.JFrame {
    public static Connection cnx =DBConnexion.ConnectBD();
    PreparedStatement prepared=null;
     ResultSet resultat=null;
    /**
     * Creates new form page_equipe
     */
    public page_equipe() {
        initComponents();
        setLocationRelativeTo(null);
        refresh1();
        refresh2();
        refresh3();
        refresh4();
        int1();
        int2();
        int3();
        int4();
        chef1();
        chef2();
        chef3();
        chef4();
        
    }
    public void refresh1(){
    Connection co=DBConnexion.ConnectBD();
    try{
    PreparedStatement pr=(PreparedStatement) co.prepareStatement("SELECT `Nom`, `Prenom`, `Grade`, `Email` FROM `membre` WHERE Numequipe=1");
    ResultSet rs=pr.executeQuery();
    jTable1.setModel(DbUtils.resultSetToTableModel(rs));
    }catch(SQLException ex)
    {
    Logger.getLogger(members.class.getName()).log(Level.SEVERE,null,ex);
    }
   }
    public void refresh2(){
    Connection co=DBConnexion.ConnectBD();
    try{
    PreparedStatement pr=(PreparedStatement) co.prepareStatement("SELECT `Nom`, `Prenom`, `Grade`, `Email` FROM `membre` WHERE Numequipe=2");
    ResultSet rs=pr.executeQuery();
    jTable2.setModel(DbUtils.resultSetToTableModel(rs));
    }catch(SQLException ex)
    {
    Logger.getLogger(members.class.getName()).log(Level.SEVERE,null,ex);
    }
   }
    public void refresh3(){
    Connection co=DBConnexion.ConnectBD();
    try{
    PreparedStatement pr=(PreparedStatement) co.prepareStatement("SELECT `Nom`, `Prenom`, `Grade`, `Email` FROM `membre` WHERE Numequipe=3");
    ResultSet rs=pr.executeQuery();
    jTable3.setModel(DbUtils.resultSetToTableModel(rs));
    }catch(SQLException ex)
    {
    Logger.getLogger(members.class.getName()).log(Level.SEVERE,null,ex);
    }
   }
    public void refresh4(){
    Connection co=DBConnexion.ConnectBD();
    try{
    PreparedStatement pr=(PreparedStatement) co.prepareStatement("SELECT `Nom`, `Prenom`, `Grade`, `Email` FROM `membre` WHERE Numequipe=4");
    ResultSet rs=pr.executeQuery();
    jTable4.setModel(DbUtils.resultSetToTableModel(rs));
    }catch(SQLException ex)
    {
    Logger.getLogger(members.class.getName()).log(Level.SEVERE,null,ex);
    }
   }
    public void int1(){
    Connection co = DBConnexion.ConnectBD();
    try {
        PreparedStatement pr = co.prepareStatement("SELECT `Nom` FROM `équipe` WHERE Numequipe=1");
        ResultSet rs = pr.executeQuery();
        if (rs.next()) {
            String nom = rs.getString("Nom");
            jTextField1.setText(nom);
        } else {
            jTextField1.setText("");
        }
    } catch (SQLException ex) {
        Logger.getLogger(members.class.getName()).log(Level.SEVERE, null, ex);
    }
   }
    public void int2(){
    Connection co=DBConnexion.ConnectBD();
     try {
        PreparedStatement pr = co.prepareStatement("SELECT `Nom` FROM `équipe` WHERE Numequipe=2");
        ResultSet rs = pr.executeQuery();
        if (rs.next()) {
            String nom = rs.getString("Nom");
            jTextField3.setText(nom);
        } else {
            jTextField3.setText("");
        }
    } catch (SQLException ex) {
        Logger.getLogger(members.class.getName()).log(Level.SEVERE, null, ex);
    }
   }
    public void int3(){
    Connection co=DBConnexion.ConnectBD();
     try {
        PreparedStatement pr = co.prepareStatement("SELECT `Nom` FROM `équipe` WHERE Numequipe=3");
        ResultSet rs = pr.executeQuery();
        if (rs.next()) {
            String nom = rs.getString("Nom");
            jTextField8.setText(nom);
        } else {
            jTextField8.setText("");
        }
    } catch (SQLException ex) {
        Logger.getLogger(members.class.getName()).log(Level.SEVERE, null, ex);
    }
   }
    public void int4(){
    Connection co=DBConnexion.ConnectBD();
     try {
        PreparedStatement pr = co.prepareStatement("SELECT `Nom` FROM `équipe` WHERE Numequipe=4");
        ResultSet rs = pr.executeQuery();
        if (rs.next()) {
            String nom = rs.getString("Nom");
            jTextField5.setText(nom);
        } else {
            jTextField5.setText("");
        }
    } catch (SQLException ex) {
        Logger.getLogger(members.class.getName()).log(Level.SEVERE, null, ex);
    }
   }
    public void chef1() {
    Connection co = DBConnexion.ConnectBD();
    try {
        PreparedStatement pr = co.prepareStatement("SELECT  `Nom`, `Prenom` FROM `membre` WHERE type=\"Chef d'equipe\" AND Numequipe=1");
        ResultSet rs = pr.executeQuery();
        if (rs.next()) {
            String nom = rs.getString("Nom");
            String prenom = rs.getString("Prenom");
            String fullName = nom + " " + prenom;
            jTextField2.setText(fullName);
        } else {
            jTextField2.setText("");
        }
    } catch (SQLException ex) {
        Logger.getLogger(members.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    public void chef2() {
    Connection co = DBConnexion.ConnectBD();
    try {
        PreparedStatement pr = co.prepareStatement("SELECT  `Nom`, `Prenom` FROM `membre` WHERE type=\"Chef d'equipe\" AND Numequipe=2");
        ResultSet rs = pr.executeQuery();
        if (rs.next()) {
            String nom = rs.getString("Nom");
            String prenom = rs.getString("Prenom");
            String fullName = nom + " " + prenom;
            jTextField4.setText(fullName);
        } else {
            jTextField4.setText("");
        }
    } catch (SQLException ex) {
        Logger.getLogger(members.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
     public void chef3(){
    Connection co = DBConnexion.ConnectBD();
    try {
        PreparedStatement pr = co.prepareStatement("SELECT  `Nom`, `Prenom` FROM `membre` WHERE type=\"Chef d'equipe\" AND Numequipe=3");
        ResultSet rs = pr.executeQuery();
        if (rs.next()) {
            String nom = rs.getString("Nom");
            String prenom = rs.getString("Prenom");
            String fullName = nom + " " + prenom;
            jTextField7.setText(fullName);
        } else {
            jTextField7.setText("");
        }
    } catch (SQLException ex) {
        Logger.getLogger(members.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
      public void chef4() {
    Connection co = DBConnexion.ConnectBD();
    try {
        PreparedStatement pr = co.prepareStatement("SELECT  `Nom`, `Prenom` FROM `membre` WHERE type=\"Chef d'equipe\" AND Numequipe=4");
        ResultSet rs = pr.executeQuery();
        if (rs.next()) {
            String nom = rs.getString("Nom");
            String prenom = rs.getString("Prenom");
            String fullName = nom + " " + prenom;
            jTextField6.setText(fullName);
        } else {
            jTextField6.setText("");
        }
    } catch (SQLException ex) {
        Logger.getLogger(members.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_close_50px.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1271, 0, 67, 72));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 157, -1, 145));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 418, -1, 215));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 151, 462, 151));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 418, -1, 215));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setText("Intitulé 1");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 51, 103, 37));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setText("Chef d'équipes");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 96, -1, 43));

        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 53, 380, 37));

        jTextField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 96, 340, 43));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel5.setText("Intitulé 2");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 320, 93, 36));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel6.setText("Chef d'équipes");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 371, -1, 39));

        jTextField3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 322, 380, 36));

        jTextField4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 373, 320, 39));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel7.setText("Intitulé 4");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 308, 134, 43));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel8.setText("Chef d'équipes");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 371, 134, 40));

        jTextField5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(818, 310, 390, 43));

        jTextField6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(892, 371, 316, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel9.setText("Chef d'équipes");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 96, 144, 43));

        jTextField7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(896, 96, 312, 43));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel10.setText("Intitulé 3");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 52, 130, 38));

        jTextField8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(818, 52, 390, 38));

        jPanel2.setBackground(new java.awt.Color(54, 33, 89));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Equpes de recherche");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_print_55px.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 486, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(468, 0, 270, 633));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_reply_all_arrow_55px.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 60, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
         System.exit(0);
         
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        Pagechoix CP = new Pagechoix();
                    CP.show();
                    dispose();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
            String titre1 = "liste des Equpes de recherche 1";
    impression.imprimerJtable(jTable1, titre1);
    
    String titre2 = "liste des Equpes de recherche 2";
    impression.imprimerJtable(jTable2, titre2);
    
    String titre3 = "liste des Equpes de recherche 3";
    impression.imprimerJtable(jTable3, titre3);
    
    String titre4 = "liste des Equpes de recherche 4";
    impression.imprimerJtable(jTable4, titre4);
    }//GEN-LAST:event_jLabel12MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(page_equipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(page_equipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(page_equipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(page_equipe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new page_equipe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
