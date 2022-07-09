/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dinh thang
 */
public class lab5bai2 extends javax.swing.JFrame {

    /**
     * Creates new form lab5bai2
     */
    ArrayList<Student> list  = new ArrayList<Student>();
    int current=0;
    String userName="sa";
    String password="123";
    String url ="jdbc:sqlserver://localhost:1433;databaseName=QLSINHVIEN";
   
    public lab5bai2() {
        initComponents();
       loadDataToArray();
        Display(current);
        setLocationRelativeTo(this);
    }
 public void Display(int i){
     Student sv = list.get(i);
     txtdiachi.setText(sv.Diachi);
     txtemail.setText(sv.Email);
     txthoten.setText(sv.Hoten);
     txtmasv.setText(sv.MaSV);
     txtsodt.setText(sv.SoDT);
     boolean gt = sv.Gioitinh;
     if(gt==true){
         RDONAM.setSelected(true);
     }else{
         RDONU.setSelected(true);
     }
 }
     
    public void loadDataToArray(){
        try {
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           Connection con =DriverManager.getConnection(url, userName, password);
           Statement st = con.createStatement();
           String sql ="select * from STUDENTS";
           ResultSet rs =st.executeQuery(sql);
           list.clear();
            while (rs.next()) {
                String masv =rs.getString(1);
                 String hoten =rs.getString(2);
                  String email =rs.getString(3);
                   String sodt =rs.getString(4);
                    boolean gt =rs.getBoolean(5); 
                    String diachi =rs.getString(6);
                    Student sv = new  Student(masv, hoten, email, sodt, diachi, gt);
                    list.add(sv);
                    
                
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txttimkiem = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        btnnew = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        RDONAM = new javax.swing.JRadioButton();
        RDONU = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        txtmasv = new javax.swing.JTextField();
        txthoten = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtsodt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdiachi = new javax.swing.JTextArea();
        btnnext = new javax.swing.JButton();
        btnpreview = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();
        btnfist = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("QUẢN LÝ USERS");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("MÃ SV:");

        btnsearch.setForeground(new java.awt.Color(102, 102, 255));
        btnsearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\dinh thang\\Downloads\\Search.png")); // NOI18N
        btnsearch.setText("search");
        btnsearch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(btnsearch)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txttimkiem)
                    .addComponent(btnsearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        btnnew.setIcon(new javax.swing.ImageIcon("C:\\Users\\dinh thang\\Downloads\\Button White Add.png")); // NOI18N
        btnnew.setText("NEW");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });

        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Delete.png"))); // NOI18N
        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Save.png"))); // NOI18N
        btnsave.setText("SAVE");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnupdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\dinh thang\\Downloads\\AAAAAA.png")); // NOI18N
        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        jLabel3.setText("GIỚI TÍNH ");

        buttonGroup1.add(RDONAM);
        RDONAM.setText("NAM");

        buttonGroup1.add(RDONU);
        RDONU.setText("NỮ");

        jLabel4.setText("ĐỊA CHỈ:");

        txtemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtemailActionPerformed(evt);
            }
        });

        jLabel5.setText("Ma sv:");

        jLabel6.setText("HỌ TÊN ");

        jLabel7.setText("EMAIL");

        jLabel8.setText("SODT");

        txtdiachi.setColumns(20);
        txtdiachi.setRows(5);
        jScrollPane1.setViewportView(txtdiachi);

        btnnext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fast_forward.png"))); // NOI18N
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnpreview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/rewind.png"))); // NOI18N
        btnpreview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreviewActionPerformed(evt);
            }
        });

        btnlast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/skip_forward.png"))); // NOI18N
        btnlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlastActionPerformed(evt);
            }
        });

        btnfist.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/skip_backward.png"))); // NOI18N
        btnfist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfistActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5))
                                        .addGap(27, 27, 27))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel4))
                                        .addGap(29, 29, 29)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtmasv)
                                        .addComponent(txthoten)
                                        .addComponent(txtemail)
                                        .addComponent(txtsodt)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(RDONAM)
                                            .addGap(18, 18, 18)
                                            .addComponent(RDONU)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnfist, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnpreview, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnnext, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnlast, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnnew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btndelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnupdate, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtmasv, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnew, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btndelete))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnupdate))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtsodt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RDONAM)
                            .addComponent(RDONU)
                            .addComponent(jLabel3)))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnfist, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnnext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnlast, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpreview, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtemailActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed
        // TODO add your handling code here:
        current=list.size()-1;
        Display(current);
    }//GEN-LAST:event_btnlastActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        // TODO add your handling code here:
        current++;
        if(current >= list.size()){
            JOptionPane.showMessageDialog(null,"đâng ở cuối");
            return;
        }
        Display(current);
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnpreviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreviewActionPerformed
        // TODO add your handling code here:
        
          current--;
          if(current==0){
              JOptionPane.showMessageDialog(this, "bạn đang ở đầu");
             
          }
        Display(current);  
        
        
      
       
    }//GEN-LAST:event_btnpreviewActionPerformed

    private void btnfistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfistActionPerformed
        // TODO add your handling code here:
         current=0;
        if(current <0){
            JOptionPane.showMessageDialog(null," đang ở đầu danh sách");
            return;
        }
        Display(current);
    }//GEN-LAST:event_btnfistActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        if(txtmasv.getText().equals("")){
            JOptionPane.showMessageDialog(this,"nhập mã sv");
            txtmasv.requestFocus();
            return;           
        }
        try {
            if(JOptionPane.showConfirmDialog(this,"bạn muốn xóa ư")==JOptionPane.OK_OPTION){
                
           
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con =DriverManager.getConnection(url,userName,password);
            String sql ="delete from STUDENTS where MaSV =?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1,txtmasv.getText());
            st.execute();
            JOptionPane.showMessageDialog(this, "delete thành công");
            con.close();
            Display(current--); 
            }
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"error");
        }
        
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        // TODO add your handling code here:
        txtdiachi.setText("");
        txtemail.setText("");
        txthoten.setText("");
        txtmasv.setText("");
        txtsodt.setText("");
    }//GEN-LAST:event_btnnewActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        if(txtmasv.getText().equals("")){
            JOptionPane.showMessageDialog(this,"nhập mã sv");
            txtmasv.requestFocus();
            return;
        }
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con =DriverManager.getConnection(url,userName,password);
            String sql=" update STUDENTS set HoTen=?,Email=?,SoDT=?,Diachi=?,"+"GioiTinh=? where MaSV=?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, txthoten.getText());
            st.setString(2, txtemail.getText());
            st.setString(3, txtsodt.getText());
            st.setString(4, txtdiachi.getText());
            boolean gt;
            if(RDONAM.isSelected())
                gt=true;
            else
                gt=false;
            st.setBoolean(5, gt);
            st.setString(6, txtmasv.getText());
            st.executeUpdate();
            JOptionPane.showMessageDialog(this,"update thành công");
            con.close(); loadDataToArray();
           
            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "error");
        }
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con = DriverManager.getConnection(url,userName, password);
            String sql ="insert into STUDENTS values(?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, txtmasv.getText());
            st.setString(2, txthoten.getText());    
            st.setString(3, txtemail.getText());
            st.setString(4, txtsodt.getText());
            boolean gt;
            if(RDONAM.isSelected())
                gt=true;
            else
                gt=false;
            st.setBoolean(5, gt);
            st.setString(6, txtdiachi.getText());
            st.executeUpdate();
            JOptionPane.showMessageDialog(this, "save thành công");
            con.close();
            loadDataToArray();
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this,"error");
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
                       
               int count = 0;
        if (txttimkiem.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Nhap ma can tim kiem!!!");
            txttimkiem.requestFocus();
            return;
        } else if(txttimkiem.getText()!=null){
            for (Student x : list) {                
            
                if (txttimkiem.getText().equals(x.MaSV)) {
                    txtmasv.setText(x.MaSV);
                    txthoten.setText(x.Hoten);
                    txtemail.setText(x.Email);
                    txtsodt.setText(x.SoDT);
                    if (x.Gioitinh) {
                        RDONAM.setSelected(true);
                    } else {
                        RDONU.setSelected(true);
                    }
                    txtdiachi.setText(x.Diachi);
                    count++;
                    JOptionPane.showMessageDialog(this," đã tìm thấy ");
                   return;
                   }}
                
                    JOptionPane.showMessageDialog(this, "méo thấy");
                
                        
        
         
        }     
    }//GEN-LAST:event_btnsearchActionPerformed

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
            java.util.logging.Logger.getLogger(lab5bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lab5bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lab5bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lab5bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lab5bai2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RDONAM;
    private javax.swing.JRadioButton RDONU;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnfist;
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnpreview;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtdiachi;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txtmasv;
    private javax.swing.JTextField txtsodt;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables
}