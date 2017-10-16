
package fitz.hospital.management.system;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class Addemployees extends javax.swing.JFrame {

   
    public Addemployees() {
        initComponents();
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtfname = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        nationality = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        qualification = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        user = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        designation = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        dob = new com.toedter.calendar.JDateChooser();
        sex = new javax.swing.JComboBox<>();
        txtlname = new javax.swing.JTextField();
        state = new javax.swing.JTextField();
        language = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        civilstate = new javax.swing.JTextField();
        religion = new javax.swing.JTextField();
        specialty = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblpic = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        remark = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        emp_table = new javax.swing.JTable();
        jLabel32 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        empdate = new com.toedter.calendar.JDateChooser();
        department = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        category = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("NEW EMPLOYEES");
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

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Narkisim", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("EMPLOYEES");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 110, 30));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 690, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 740));

        jPanel7.setBackground(new java.awt.Color(0, 122, 122));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 1380, 50));

        jLabel10.setFont(new java.awt.Font("Narkisim", 0, 12)); // NOI18N
        jLabel10.setText("DEPARTMENT :");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, -1, 20));

        jLabel11.setFont(new java.awt.Font("Narkisim", 0, 12)); // NOI18N
        jLabel11.setText("FIRSTNAME :");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, 20));
        jPanel2.add(txtfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 260, -1));

        jLabel12.setFont(new java.awt.Font("Narkisim", 0, 12)); // NOI18N
        jLabel12.setText("LASTNAME :");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, 20));

        jLabel13.setFont(new java.awt.Font("Narkisim", 0, 12)); // NOI18N
        jLabel13.setText("ADDRESS/ RESIDENCE :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 140, 20));

        jLabel15.setFont(new java.awt.Font("Narkisim", 0, 12)); // NOI18N
        jLabel15.setText("D.O.B :");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, -1, 20));

        jLabel16.setFont(new java.awt.Font("Narkisim", 0, 12)); // NOI18N
        jLabel16.setText("SEX :");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, -1, 20));

        jLabel19.setFont(new java.awt.Font("Narkisim", 0, 12)); // NOI18N
        jLabel19.setText("STATE OF ORIGIN :");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, -1, 20));

        jLabel20.setFont(new java.awt.Font("Narkisim", 0, 12)); // NOI18N
        jLabel20.setText("LANGUAGE :");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, -1, 20));

        jLabel21.setFont(new java.awt.Font("Narkisim", 0, 12)); // NOI18N
        jLabel21.setText("PHONE :");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 540, -1, 20));

        jLabel22.setFont(new java.awt.Font("Narkisim", 0, 12)); // NOI18N
        jLabel22.setText("CIVIL STATE :");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 580, -1, 20));

        jLabel23.setFont(new java.awt.Font("Narkisim", 0, 12)); // NOI18N
        jLabel23.setText("RELIGION :");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 620, -1, 20));

        jLabel24.setFont(new java.awt.Font("Narkisim", 0, 12)); // NOI18N
        jLabel24.setText("NATIONALITY :");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, -1, 20));
        jPanel2.add(nationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 130, 260, -1));

        jLabel25.setFont(new java.awt.Font("Narkisim", 0, 12)); // NOI18N
        jLabel25.setText("QUALIFICATION :");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, -1, 20));
        jPanel2.add(qualification, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, 260, -1));

        jLabel26.setFont(new java.awt.Font("Narkisim", 0, 12)); // NOI18N
        jLabel26.setText("DATE OF EMPLOYMENT :");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, -1, 20));

        jLabel27.setFont(new java.awt.Font("Narkisim", 0, 12)); // NOI18N
        jLabel27.setText("CATEGORY :");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, -1, 30));

        user.setFont(new java.awt.Font("Narkisim", 0, 12)); // NOI18N
        user.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel2.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 260, -1));

        jLabel28.setFont(new java.awt.Font("Narkisim", 0, 12)); // NOI18N
        jLabel28.setText("SPECIALTY :");
        jPanel2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, -1, 20));

        designation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                designationActionPerformed(evt);
            }
        });
        jPanel2.add(designation, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, 260, -1));

        jLabel29.setFont(new java.awt.Font("Narkisim", 0, 12)); // NOI18N
        jLabel29.setText("DESIGNATION :");
        jPanel2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, -1, 20));

        jLabel30.setFont(new java.awt.Font("Narkisim", 0, 12)); // NOI18N
        jLabel30.setIcon(new javax.swing.ImageIcon("C:\\Users\\EFE ROBERT\\Downloads\\LATEST ICONS\\right_circular1.png")); // NOI18N
        jLabel30.setText("ATTACH PHOTO ");
        jLabel30.setToolTipText("Click me !");
        jLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel30.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel30.setIconTextGap(10);
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 390, 140, 30));

        jLabel31.setFont(new java.awt.Font("Narkisim", 0, 12)); // NOI18N
        jLabel31.setText("REMARK :");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, -1, 20));

        address.setColumns(20);
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 260, -1));

        dob.setDateFormatString("yyyy-MM-dd");
        jPanel2.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 260, -1));

        sex.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Male", "Female" }));
        jPanel2.add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 260, -1));
        jPanel2.add(txtlname, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 260, -1));
        jPanel2.add(state, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 460, 260, -1));
        jPanel2.add(language, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, 260, -1));
        jPanel2.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 540, 260, -1));
        jPanel2.add(civilstate, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, 260, -1));
        jPanel2.add(religion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, 260, -1));

        specialty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specialtyActionPerformed(evt);
            }
        });
        jPanel2.add(specialty, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 290, 260, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblpic.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblpic.setText("                  NO IMAGE SOURCE !");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblpic, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblpic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 130, 210, 240));

        remark.setColumns(20);
        remark.setRows(5);
        jScrollPane2.setViewportView(remark);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 370, 260, 70));

        emp_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        emp_table.setRowHeight(40);
        emp_table.setRowMargin(5);
        jScrollPane3.setViewportView(emp_table);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 660, 1120, 70));

        jLabel32.setFont(new java.awt.Font("Narkisim", 0, 12)); // NOI18N
        jLabel32.setText("TITLE :");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, -1, 20));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 470, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 118, 470, -1));

        jLabel33.setFont(new java.awt.Font("Narkisim", 0, 12)); // NOI18N
        jLabel33.setText("Username :");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 470, 60, 20));

        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });
        jPanel2.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 470, 170, -1));

        jLabel34.setFont(new java.awt.Font("Narkisim", 0, 12)); // NOI18N
        jLabel34.setText("Password :");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 510, 60, 20));
        jPanel2.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 510, 170, -1));

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\EFE ROBERT\\Downloads\\LATEST ICONS\\save2.png")); // NOI18N
        jButton1.setText("                      SAVE");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton1.setIconTextGap(50);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 540, 230, 40));
        jPanel2.add(empdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 210, 260, -1));

        department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(department, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, 260, -1));

        jLabel35.setFont(new java.awt.Font("Narkisim", 0, 14)); // NOI18N
        jLabel35.setIcon(new javax.swing.ImageIcon("C:\\Users\\EFE ROBERT\\Downloads\\LATEST ICONS\\clear_filters.png")); // NOI18N
        jLabel35.setText("Clear Form");
        jLabel35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel35MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 470, 100, -1));

        category.setFont(new java.awt.Font("Narkisim", 0, 12)); // NOI18N
        category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "NON-CLINICAL", "CLINICAL" }));
        category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryActionPerformed(evt);
            }
        });
        jPanel2.add(category, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 260, 30));

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

     private void source(){
    
     try {
  String url="jdbc:derby://localhost:1527/FITZ HOSPITAL";//this is a connection string
 String username="ROBERT";
String password="ROBERT";
Connection con = DriverManager.getConnection(url, username, password);// this is a driver which enables you to connect with the database
Statement stmt = con.createStatement();// the code that makes it to insert into the database
String query= "select * from EMPLOYEES where FIRST_NAME='"+txtfname.getText()+"'";
ResultSet rs=stmt.executeQuery(query);


if (rs.next()){

String varable;

varable=("select all From Info@varable;");



}

emp_table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
          
        }  
                        
    }
     
     
     
     
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
      setExtendedState(Addemployees.MAXIMIZED_BOTH);
   try {
  String url="jdbc:derby://localhost:1527/FITZ HOSPITAL";//this is a connection string
 String username="ROBERT";
String password="ROBERT";
Connection con = DriverManager.getConnection(url, username, password);// this is a driver which enables you to connect with the database
Statement stmt = con.createStatement();// the code that makes it to insert into the database
String query= "select CATEGORYNAME from CATEGORY ORDER BY CATEGORYNAME ASC ";
ResultSet rs=stmt.executeQuery(query);

while(rs.next()){

String name=rs.getString("CATEGORYNAME");
user.addItem(name);

}

        } catch (SQLException ex) {
          
        }  

        
    }//GEN-LAST:event_formWindowOpened

    private void designationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_designationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_designationActionPerformed

    private void specialtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specialtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_specialtyActionPerformed

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserActionPerformed

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        // TODO add your handling code here:
        
          JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        String filename=f.getAbsolutePath();
        ImageIcon icon=new ImageIcon(filename);
        lblpic.setIcon(icon);
        
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        try {
            
            
           
            String url="jdbc:derby://localhost:1527/FITZ HOSPITAL";//this is a connection string
            String username="ROBERT";
            String password="ROBERT";
            Connection con = DriverManager.getConnection(url, username, password);// this is a driver which enables you to connect with the database
            Statement stmt = con.createStatement();// the code that makes it to insert into the database
            String query= "insert into EMPLOYEES(TITLE,FIRST_NAME,LAST_NAME,ADDRESS,DOB,SEX,STATE_OF_ORIGIN,LANGUAGE_SPOKEN,PHONE,CIVIL_STATE,RELIGION,NATIONALITY,QUALIFICATION,DATE_OF_EMPL,DEPARTMENT,SPECIALTY,DESIGNATION,CATEGORY,USERNAME,PASSWORD,PHOTO,REMARK)values('"+user.getSelectedItem()+"','"+txtfname.getText()+"','"+txtlname.getText()+"','"+address.getText()+"','"+dob.getDate()+"','"+sex.getSelectedItem()+"','"+state.getText()+"','"+language.getText()+"','"+phone.getText()+"','"+civilstate.getText()+"','"+religion.getText()+"','"+nationality.getText()+"','"+qualification.getText()+"','"+empdate.getDate()+"','"+department.getSelectedItem()+"','"+specialty.getText()+"','"+designation.getText()+"','"+category.getSelectedItem()+"','"+txtuser.getText()+"','"+txtpassword.getText()+"','"+lblpic.getIcon()+"','"+remark.getText()+"')";
            stmt.execute(query);// normal query in database
            
            
            JOptionPane.showMessageDialog(null,"EMPLOYEE DETAILS ADDED SUCCESSFULLY !");

       
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog (null, ex.toString());// try and catch enable your application will not break
        }

     source();   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel35MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel35MouseClicked

    private void categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryActionPerformed
        // TODO add your handling code here:
        
        
       
    }//GEN-LAST:event_categoryActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
        
        
        
        
        
    }//GEN-LAST:event_userActionPerformed

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
            java.util.logging.Logger.getLogger(Addemployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addemployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addemployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addemployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Addemployees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JComboBox<String> category;
    private javax.swing.JTextField civilstate;
    private javax.swing.JComboBox<String> department;
    private javax.swing.JTextField designation;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTable emp_table;
    private com.toedter.calendar.JDateChooser empdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JTextField language;
    private javax.swing.JLabel lblpic;
    private javax.swing.JTextField nationality;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField qualification;
    private javax.swing.JTextField religion;
    private javax.swing.JTextArea remark;
    private javax.swing.JComboBox<String> sex;
    private javax.swing.JTextField specialty;
    private javax.swing.JTextField state;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtlname;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtuser;
    private javax.swing.JComboBox<String> user;
    // End of variables declaration//GEN-END:variables





}