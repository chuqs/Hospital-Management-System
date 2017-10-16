/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitz.hospital.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author EFE ROBERT
 */
public class EmployeesRecord extends javax.swing.JFrame {

    /**
     * Creates new form EmployeesRecord
     */
    public EmployeesRecord() {
        initComponents();
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lblpic = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        nonclinical = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        clinical = new javax.swing.JTable();
        txtuser = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jTextField3 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EMPLOYEES RECORDS");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(248, 248, 248));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 122, 122));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(69, 69, 69));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 0, -1, -1));

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Narkisim", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Employees");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 140, 30));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 50));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblpic.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblpic.setText("                  NO IMAGE SOURCE !");
        jPanel8.add(lblpic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 240));

        jPanel3.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 211, 240));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 740));

        jPanel7.setBackground(new java.awt.Color(0, 122, 122));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 1380, 50));

        nonclinical.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nonclinical.setFont(new java.awt.Font("Narkisim", 0, 12)); // NOI18N
        nonclinical.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        nonclinical.setRowHeight(35);
        nonclinical.setRowMargin(5);
        jScrollPane1.setViewportView(nonclinical);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 1130, 220));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 1180, 10));

        jLabel8.setFont(new java.awt.Font("Narkisim", 0, 12)); // NOI18N
        jLabel8.setText("Search conditions");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, -1, 20));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 10, 50));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 910, 10));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 70, 10, 50));
        jPanel2.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 70, 480, 10));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 290, 10));

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 10, 40));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 480, 10));

        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 10, 40));
        jPanel2.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 480, 10));

        clinical.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        clinical.setFont(new java.awt.Font("Narkisim", 0, 12)); // NOI18N
        clinical.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clinical.setRowHeight(35);
        clinical.setRowMargin(5);
        clinical.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clinicalMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(clinical);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 1130, 270));

        txtuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtuserKeyPressed(evt);
            }
        });
        jPanel2.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, 150, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 255));
        jLabel15.setText("CLINICAL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 100, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 0));
        jLabel12.setText("NON-CLINICAL");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel12)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 450, 150, -1));

        jLabel16.setFont(new java.awt.Font("Narkisim", 0, 12)); // NOI18N
        jLabel16.setText("Type Surname Here :");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, 20));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 440, 480, 10));

        jLabel9.setFont(new java.awt.Font("Narkisim", 0, 12)); // NOI18N
        jLabel9.setText("Search conditions");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, -1, 20));
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 290, 10));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 460, 150, -1));

        jLabel17.setFont(new java.awt.Font("Narkisim", 0, 12)); // NOI18N
        jLabel17.setText("Type Surname Here :");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, -1, 20));
        jPanel2.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 490, 910, 10));

        jSeparator18.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 10, 50));

        jSeparator19.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 440, 10, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1414, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1414, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        setExtendedState(EmployeesRecord.MAXIMIZED_BOTH);
        
        try {
  String url="jdbc:derby://localhost:1527/FITZ HOSPITAL";//this is a connection string
 String username="ROBERT";
String password="ROBERT";
Connection con = DriverManager.getConnection(url, username, password);// this is a driver which enables you to connect with the database
Statement stmt = con.createStatement();// the code that makes it to insert into the database
String name1="CLINICAL";

String query= "select TITLE, FIRST_NAME AS FIRSTNAME,LAST_NAME AS SURNAME, DOB AS BIRTHDATE,STATE_OF_ORIGIN AS STATE, PHONE, QUALIFICATION,DATE_OF_EMPL AS EMP_DATE, DEPARTMENT, SPECIALTY from EMPLOYEES where CATEGORY='"+name1+"'";
ResultSet rs=stmt.executeQuery(query);

clinical.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
          JOptionPane.showMessageDialog (null, ex.toString());// try and catch enable your application will not break
        }  
                        
    
        
            try {
  String url="jdbc:derby://localhost:1527/FITZ HOSPITAL";//this is a connection string
 String username="ROBERT";
String password="ROBERT";
Connection con = DriverManager.getConnection(url, username, password);// this is a driver which enables you to connect with the database
Statement stmt = con.createStatement();// the code that makes it to insert into the database

String name2="NON-CLINICAL";
String query= "select TITLE, FIRST_NAME AS FIRSTNAME,LAST_NAME AS SURNAME, DOB AS BIRTHDATE,STATE_OF_ORIGIN AS STATE, PHONE, QUALIFICATION,DATE_OF_EMPL AS EMP_DATE, DEPARTMENT, SPECIALTY from EMPLOYEES where CATEGORY='"+name2+"'";
ResultSet rs=stmt.executeQuery(query);

nonclinical.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
          
        }  
          
        
        
        
    }//GEN-LAST:event_formWindowOpened

    private void txtuserKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuserKeyPressed
        // TODO add your handling code here:
        
        
        try {
  String url="jdbc:derby://localhost:1527/FITZ HOSPITAL";//this is a connection string
 String username="ROBERT";
String password="ROBERT";
Connection con = DriverManager.getConnection(url, username, password);// this is a driver which enables you to connect with the database
Statement stmt = con.createStatement();// the code that makes it to insert into the database

String name1="CLINICAL";
String query= "select TITLE, FIRST_NAME AS FIRSTNAME,LAST_NAME AS SURNAME, DOB AS BIRTHDATE,STATE_OF_ORIGIN AS STATE, PHONE, QUALIFICATION,DATE_OF_EMPL AS EMP_DATE, DEPARTMENT, SPECIALTY from EMPLOYEES  where FIRST_NAME LIKE '%"+txtuser.getText()+"%' and CATEGORY='"+ name1+"'";
ResultSet rs=stmt.executeQuery(query);

clinical.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
          
        }  
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_txtuserKeyPressed

    private void clinicalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clinicalMouseClicked
        // TODO add your handling code here:
         try {
  String url="jdbc:derby://localhost:1527/FITZ HOSPITAL";//this is a connection string
 String username="ROBERT";
String password="ROBERT";
Connection con = DriverManager.getConnection(url, username, password);// this is a driver which enables you to connect with the database
Statement stmt = con.createStatement();// the code that makes it to insert into the database

String name2="CLINICAL";
String query= "select * EMPLOYEES where CATEGORY='"+name2+"'";
ResultSet rs=stmt.executeQuery(query);

if (rs.next())
{

    
    String get=rs.getString(22);
    
    
ImageIcon icon=new ImageIcon(get);
        lblpic.setIcon(icon);



}

        } catch (SQLException ex) {
          
        }  
     
 
        
        
    }//GEN-LAST:event_clinicalMouseClicked

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        // TODO add your handling code here:
        
         try {
  String url="jdbc:derby://localhost:1527/FITZ HOSPITAL";//this is a connection string
 String username="ROBERT";
String password="ROBERT";
Connection con = DriverManager.getConnection(url, username, password);// this is a driver which enables you to connect with the database
Statement stmt = con.createStatement();// the code that makes it to insert into the database

String name1="NON-CLINICAL";
String query= "select TITLE, FIRST_NAME AS FIRSTNAME,LAST_NAME AS SURNAME, DOB AS BIRTHDATE,STATE_OF_ORIGIN AS STATE, PHONE, QUALIFICATION,DATE_OF_EMPL AS EMP_DATE, DEPARTMENT, SPECIALTY from EMPLOYEES  where FIRST_NAME LIKE '%"+jTextField3.getText()+"%' and CATEGORY='"+ name1+"'";
ResultSet rs=stmt.executeQuery(query);

nonclinical.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
          
        }  
    }//GEN-LAST:event_jTextField3KeyPressed

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
            java.util.logging.Logger.getLogger(EmployeesRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeesRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeesRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeesRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeesRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable clinical;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblpic;
    private javax.swing.JTable nonclinical;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}