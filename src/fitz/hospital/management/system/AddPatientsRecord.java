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

/**
 *
 * @author EFE ROBERT
 */
public class AddPatientsRecord extends javax.swing.JFrame {

    /**
     * Creates new form AddPatientsRecord
     */
    public AddPatientsRecord() {
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
        jPanel7 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel34 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        patcategory = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NEW PATIENTS");
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(248, 248, 248));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 122, 122));

        jPanel4.setBackground(new java.awt.Color(69, 69, 69));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(102, 102, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Narkisim", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Patients");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 110, 30));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 720, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 770));

        jPanel7.setBackground(new java.awt.Color(0, 122, 122));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 1380, 50));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 240, -1));

        jLabel16.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        jLabel16.setText("Surname :");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 60, 20));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 240, -1));

        jLabel17.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        jLabel17.setText("Patient Type :");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, -1, 20));
        jPanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 240, -1));

        jLabel18.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        jLabel18.setText("Registration Date :");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, 20));

        jLabel19.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        jLabel19.setText("Other Names :");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 90, 20));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 240, -1));

        jLabel20.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        jLabel20.setText("Address :");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 60, 20));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 240, -1));

        jLabel21.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        jLabel21.setText("Sex :");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 40, 20));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 160, 240, -1));

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
        jTable1.setRowHeight(35);
        jTable1.setRowMargin(5);
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 620, 1190, 100));

        jLabel22.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        jLabel22.setText("D.O.B :");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 50, 20));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, 240, 100));

        jLabel23.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        jLabel23.setText("Nationality :");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, -1, 20));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, 240, -1));

        jLabel24.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        jLabel24.setText("Database Record");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 590, 110, 20));
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, 240, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 600, 610, 10));

        jLabel25.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        jLabel25.setText("Ethnic Group :");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, 90, 20));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 600, 530, 10));

        jLabel26.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        jLabel26.setText("Civil State :");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 70, 20));
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, 240, -1));
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 160, 240, -1));

        jLabel27.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        jLabel27.setText("Place of Work :");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 200, 90, 20));
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 200, 240, -1));

        jLabel28.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        jLabel28.setText("Occupation :");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, 80, 20));

        jLabel29.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        jLabel29.setText("Occupation :");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 80, 20));
        jPanel2.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 320, 240, -1));

        jLabel30.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        jLabel30.setText("Next of Kin :");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 80, 20));
        jPanel2.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 360, 240, -1));

        jLabel31.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        jLabel31.setText("Relationship :");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, 80, 20));
        jPanel2.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 400, 240, -1));

        jLabel32.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        jLabel32.setText("Religion :");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 240, 60, 20));
        jPanel2.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 240, 240, -1));

        jLabel33.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        jLabel33.setText("N.K address :");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 80, 20));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 240, 100));

        jLabel34.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        jLabel34.setText("Phone Number :");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 100, 20));
        jPanel2.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 280, 240, -1));

        jLabel35.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        jLabel35.setText("N.K Contact no. :");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 560, 100, 20));
        jPanel2.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 560, 240, -1));

        jLabel36.setFont(new java.awt.Font("Narkisim", 0, 12)); // NOI18N
        jLabel36.setIcon(new javax.swing.ImageIcon("C:\\Users\\EFE ROBERT\\Downloads\\LATEST ICONS\\right_circular1.png")); // NOI18N
        jLabel36.setText("ATTACH PHOTO ");
        jLabel36.setToolTipText("Click me !");
        jLabel36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel36.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel36.setIconTextGap(10);
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 370, 140, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel2.setText("                       NO IMAGE SOURCE !");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 32, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 110, 230, 240));

        patcategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        jPanel2.add(patcategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 240, -1));

        jLabel37.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        jLabel37.setText("Patient Category :");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, 20));

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
            .addGap(0, 770, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        setExtendedState(AddPatientsRecord.MAXIMIZED_BOTH);
        
        try {
  String url="jdbc:derby://localhost:1527/FITZ HOSPITAL";//this is a connection string
 String username="ROBERT";
String password="ROBERT";
Connection con = DriverManager.getConnection(url, username, password);// this is a driver which enables you to connect with the database
Statement stmt = con.createStatement();// the code that makes it to insert into the database
String query= "select ID from PATCATEGORY  ";
ResultSet rs=stmt.executeQuery(query);

while(rs.next()){

String name=rs.getString("ID");
patcategory.addItem(name);

}

        } catch (SQLException ex) {
          
        }  
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(AddPatientsRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPatientsRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPatientsRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPatientsRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPatientsRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JComboBox<String> patcategory;
    // End of variables declaration//GEN-END:variables
}
