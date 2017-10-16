/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitz.hospital.management.system;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author EFE ROBERT
 */
public class UserInfoScan extends javax.swing.JFrame {

    /**
     * Creates new form UserInfoScan
     */
    public UserInfoScan() {
        initComponents();
        CurrentDate();
    }

    public void CurrentDate(){
    
    Calendar cal= new GregorianCalendar();
    int month = cal.get(Calendar.MONTH);
    int year = cal.get(Calendar.YEAR);
    int day = cal.get(Calendar.DAY_OF_MONTH);
    date_txt.setText(day+"/"+(month+1)+"/"+year)     ;
    
    
    
    int second = cal.get(Calendar.SECOND);
    int minute = cal.get(Calendar.MINUTE);
    int hour = cal.get(Calendar.HOUR);
    time_txt.setText(hour+":"+(minute)+":"+second)     ;
    
    
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        date_txt1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        date_txt2 = new javax.swing.JLabel();
        date_txt = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        time_txt = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BUACRACY APPROVER PROCESS");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Narkisim", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 0));
        jLabel2.setText("USER INFO APPEAR HERE (SCAN & SIGN APPROVER)");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        jLabel3.setText("Send to Other(s) for Approval :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Narkisim", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 410, -1));

        jLabel4.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\EFE ROBERT\\Downloads\\LATEST ICONS\\low_priority1.png")); // NOI18N
        jLabel4.setText("IMPORT SCANNED DOCUMENT");
        jLabel4.setToolTipText("Click me !");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 240, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 250, 410, -1));

        jLabel5.setFont(new java.awt.Font("Narkisim", 0, 12)); // NOI18N
        jLabel5.setText("Path Name:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 60, 20));

        jLabel6.setFont(new java.awt.Font("Narkisim", 0, 12)); // NOI18N
        jLabel6.setText("Short Notes :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 70, 20));

        jLabel7.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\EFE ROBERT\\Downloads\\LATEST ICONS\\time.png")); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 30, 30));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        date_txt1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        date_txt1.setForeground(new java.awt.Color(255, 255, 255));
        date_txt1.setText("jLabel8");
        jPanel3.add(date_txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 4, 140, 20));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 170, 30));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        date_txt2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        date_txt2.setForeground(new java.awt.Color(255, 255, 255));
        date_txt2.setText("jLabel8");
        jPanel5.add(date_txt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 4, 140, 20));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 170, 30));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 70, 170, 30));

        date_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        date_txt.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(date_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 150, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, 170, 30));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 410, -1));

        jLabel8.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\EFE ROBERT\\Downloads\\LATEST ICONS\\date_to.png")); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, 30, 30));

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        time_txt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        time_txt.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.add(time_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 5, 140, 20));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 170, 30));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\EFE ROBERT\\Downloads\\LATEST ICONS\\refresh_shield.png")); // NOI18N
        jLabel9.setText("Refresh All");
        jLabel9.setToolTipText("");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel10.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\EFE ROBERT\\Downloads\\LATEST ICONS\\paper_plane.png")); // NOI18N
        jLabel10.setText("Send Scanned Document For Approval");
        jLabel10.setToolTipText("Send button !");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 310, 140));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\EFE ROBERT\\Downloads\\LATEST ICONS\\25b.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 570));

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

        setSize(new java.awt.Dimension(876, 614));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(UserInfoScan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserInfoScan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserInfoScan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserInfoScan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserInfoScan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date_txt;
    private javax.swing.JLabel date_txt1;
    private javax.swing.JLabel date_txt2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel time_txt;
    // End of variables declaration//GEN-END:variables
}
