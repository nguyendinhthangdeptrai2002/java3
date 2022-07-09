/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide5;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tu Ech
 */
public class QLSinhVien extends javax.swing.JFrame {
    private String header[] = {"MãSV", "Họ tên", "Email","Số ĐT","Giới tính",
        "Địa chỉ","Hình"};
    private DefaultTableModel tblModel = new DefaultTableModel(header, 0);
    public QLSinhVien() {
        initComponents();
        loadDataToJTable();
        DoDulieuLenComponent(0);
    }
    public void UpdateHinh(String image)
    {
        ImageIcon image1 = new ImageIcon("src\\sof203\\Assignment\\images\\"+image);
        Image im = image1.getImage();
        ImageIcon icon=new ImageIcon(im.getScaledInstance(lblHinh.getWidth(), 
                lblHinh.getHeight(), im.SCALE_SMOOTH));
        lblHinh.setIcon(icon);
    }
    String DB_URL="jdbc:sqlserver://localhost;databaseName=SOF203;user=sa;password=";
    public void loadDataToJTable(){
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try { 
             conn = DriverManager.getConnection(DB_URL);
             String sql = "select * from STUDENTS";      
             st = conn.createStatement();
             rs = st.executeQuery(sql);
             Vector sv = null;
             tblModel.setRowCount(0);
             // Nếu student không tồn tại
             if (rs.isBeforeFirst() == false) {
                JOptionPane.showMessageDialog(this, "Chua co sinh vien!");
                return;
             }
             // Trong khi chưa hết dữ liệu
             while (rs.next()) {
               sv = new Vector();
               sv.add(rs.getString("MASV"));
               sv.add(rs.getString("Hoten"));
               sv.add(rs.getString("Email"));
               sv.add(rs.getString("SoDT"));
               sv.add(rs.getBoolean("Gioitinh"));
               sv.add(rs.getString("Diachi"));
               sv.add(rs.getString("Hinh"));
               // Thêm một dòng vào table model
               tblModel.addRow(sv);
             }
             tblSinhvien.setModel(tblModel); // Thêm dữ liệu vào table
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
              try {
                if (conn != null) {
                  conn.close();
                }
                if (st != null) {
                 st.close();
                }
                if (rs != null) {
                 rs.close();
                }
               } catch (Exception ex) {
                 ex.printStackTrace();
               }    
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
        txtMaSV = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtHoten = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSoDT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDiachi = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        lblHinh = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblSinhvien = new javax.swing.JTable();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Sinh Viên");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("MaSV:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));
        getContentPane().add(txtMaSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 158, -1));

        jLabel2.setText("Họ tên:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));
        getContentPane().add(txtHoten, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 158, -1));

        jLabel3.setText("Email:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 160, -1));

        jLabel4.setText("Số ĐT:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));
        getContentPane().add(txtSoDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 158, -1));

        jLabel5.setText("Địa chỉ:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        txtDiachi.setColumns(20);
        txtDiachi.setRows(5);
        jScrollPane1.setViewportView(txtDiachi);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 190, 75));

        jLabel6.setText("Giới tính:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, -1, -1));

        buttonGroup1.add(rdoNam);
        rdoNam.setSelected(true);
        rdoNam.setText("Nam");
        getContentPane().add(rdoNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        buttonGroup1.add(rdoNu);
        rdoNu.setText("Nữ");
        getContentPane().add(rdoNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(363, 70, 110, 130));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Quản Lý Sinh Viên");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        tblSinhvien.setModel(new javax.swing.table.DefaultTableModel(
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
        tblSinhvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSinhvienMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblSinhvien);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 590, 190));

        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sof203/Assignment/icons/Add.png"))); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        getContentPane().add(btnNew, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 90, -1));

        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sof203/Assignment/icons/Save.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 100, -1));

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sof203/Assignment/icons/Delete.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, -1, -1));

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sof203/Assignment/icons/Edit.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void DoDulieuLenComponent(int row){
        if(row<0){
            return;
        }
        txtMaSV.setText(tblSinhvien.getValueAt(row, 0).toString());
        txtHoten.setText(tblSinhvien.getValueAt(row, 1).toString());
        txtEmail.setText(tblSinhvien.getValueAt(row, 2).toString());
        txtSoDT.setText(tblSinhvien.getValueAt(row, 3).toString());
        Boolean gioitinh = Boolean.parseBoolean(tblSinhvien.getValueAt(row, 4).toString());
        if(gioitinh){
            rdoNam.setSelected(true);
        }else
            rdoNu.setSelected(true);
        txtDiachi.setText(tblSinhvien.getValueAt(row, 5).toString());
        UpdateHinh(tblSinhvien.getValueAt(row, 6).toString());
    }
    
    private void tblSinhvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSinhvienMouseClicked
        // TODO add your handling code here:
        int row = tblSinhvien.getSelectedRow();
        DoDulieuLenComponent(row);
    }//GEN-LAST:event_tblSinhvienMouseClicked

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
         String sql = "delete from STUDENTS where MASV=?";
         System.out.println(sql);
         Connection conn = null;
         PreparedStatement ps = null;
         try {
              conn = DriverManager.getConnection(DB_URL);
              ps = conn.prepareStatement(sql);
              ps.setString(1, txtMaSV.getText());              
              ps.execute();              
              JOptionPane.showMessageDialog(this, "Delete thành công!");                            
         } catch (Exception e) {
              e.printStackTrace();
              JOptionPane.showMessageDialog(this, "Fail ...");
         } finally {
               try {
                    if (conn != null) {
                     conn.close();
                    }
                    if (ps != null) {
                     ps.close();
                    }
               } catch (Exception ex2) {
                ex2.printStackTrace();
               }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed
    public void reset(){
        txtDiachi.setText("");
        txtEmail.setText("");
        txtHoten.setText("");
        txtMaSV.setText("");
        txtSoDT.setText("");
        txtMaSV.requestFocus();
    }
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
            java.util.logging.Logger.getLogger(QLSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLSinhVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHinh;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblSinhvien;
    private javax.swing.JTextArea txtDiachi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoten;
    private javax.swing.JTextField txtMaSV;
    private javax.swing.JTextField txtSoDT;
    // End of variables declaration//GEN-END:variables
}