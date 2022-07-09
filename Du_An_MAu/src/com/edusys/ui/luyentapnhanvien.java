/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.ui;

import com.edusys.DAO.nhanvienDAO;
import com.edusys.entity.nhanvien;
import com.edusys.utils.MsgBox;
import com.sun.rowset.internal.Row;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dinh thang
 */
public class luyentapnhanvien extends javax.swing.JFrame {

    /**
     * Creates new form luyentapnhanvien
     */
   
            
    public luyentapnhanvien() {
        initComponents();
        init();
        
      
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtmanhanvien = new javax.swing.JTextField();
        txthoten = new javax.swing.JTextField();
        txtmatkhau1 = new javax.swing.JPasswordField();
        txtmatkhau2 = new javax.swing.JPasswordField();
        rdotruongphong = new javax.swing.JRadioButton();
        rdonhanvien = new javax.swing.JRadioButton();
        rdonam = new javax.swing.JRadioButton();
        rdonu = new javax.swing.JRadioButton();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnmoi = new javax.swing.JButton();
        btnfirt = new javax.swing.JButton();
        btnprev = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbldanhsach = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("mã nhân viên:");

        jLabel2.setText("mật khẩu: ");

        jLabel3.setText("xác nhân mk:");

        jLabel4.setText("giới tính :");

        jLabel5.setText("vai trò :");

        jLabel6.setText("họ tên :");

        txtmatkhau1.setText("jPasswordField1");

        txtmatkhau2.setText("jPasswordField1");

        buttonGroup1.add(rdotruongphong);
        rdotruongphong.setText("trưởng phòng");

        buttonGroup1.add(rdonhanvien);
        rdonhanvien.setText("nhân viên");

        buttonGroup2.add(rdonam);
        rdonam.setText("nam");

        buttonGroup2.add(rdonu);
        rdonu.setText("nữ");

        btnthem.setText("thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnsua.setText("sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setText("xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnmoi.setText("mới");
        btnmoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoiActionPerformed(evt);
            }
        });

        btnfirt.setText("<");
        btnfirt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfirtActionPerformed(evt);
            }
        });

        btnprev.setText("<<");
        btnprev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprevActionPerformed(evt);
            }
        });

        btnnext.setText(">>");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnlast.setText(">");
        btnlast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdonam)
                                .addGap(18, 18, 18)
                                .addComponent(rdonu))
                            .addComponent(txthoten, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                            .addComponent(txtmanhanvien)
                            .addComponent(txtmatkhau1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdotruongphong)
                                .addGap(18, 18, 18)
                                .addComponent(rdonhanvien))
                            .addComponent(txtmatkhau2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnthem)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnsua)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnxoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnmoi)
                        .addGap(54, 54, 54)
                        .addComponent(btnfirt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnprev)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnnext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnlast)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtmanhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2))
                    .addComponent(txtmatkhau1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtmatkhau2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rdotruongphong)
                    .addComponent(rdonhanvien))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rdonam)
                    .addComponent(rdonu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthem)
                    .addComponent(btnsua)
                    .addComponent(btnxoa)
                    .addComponent(btnmoi)
                    .addComponent(btnfirt)
                    .addComponent(btnprev)
                    .addComponent(btnnext)
                    .addComponent(btnlast))
                .addGap(32, 32, 32))
        );

        jTabbedPane1.addTab("cập nhật", jPanel1);

        tbldanhsach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "manv", "matkhau", "hoten", "gioitinh", "vaitro"
            }
        ));
        tbldanhsach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbldanhsachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbldanhsach);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 5, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Danh sách", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 35, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:
        insert();
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoiActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_btnmoiActionPerformed

    private void btnfirtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfirtActionPerformed
        // TODO add your handling code here:
        first();
    }//GEN-LAST:event_btnfirtActionPerformed

    private void btnprevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprevActionPerformed
        // TODO add your handling code here:
        prev();
    }//GEN-LAST:event_btnprevActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        // TODO add your handling code here:
        next();
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnlastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlastActionPerformed
        // TODO add your handling code here:
        last();
    }//GEN-LAST:event_btnlastActionPerformed

    private void tbldanhsachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldanhsachMouseClicked
        // TODO add your handling code here:
      
            
        
        if(evt.getClickCount()==1){
            this.Row = tbldanhsach.getSelectedRow();
            this.edit();    
        }
        
    }//GEN-LAST:event_tbldanhsachMouseClicked

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
            java.util.logging.Logger.getLogger(luyentapnhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(luyentapnhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(luyentapnhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(luyentapnhanvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new luyentapnhanvien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfirt;
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnmoi;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprev;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnxoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rdonam;
    private javax.swing.JRadioButton rdonhanvien;
    private javax.swing.JRadioButton rdonu;
    private javax.swing.JRadioButton rdotruongphong;
    private javax.swing.JTable tbldanhsach;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txtmanhanvien;
    private javax.swing.JPasswordField txtmatkhau1;
    private javax.swing.JPasswordField txtmatkhau2;
    // End of variables declaration//GEN-END:variables
    nhanvienDAO dao = new nhanvienDAO() {};
   int  Row  = -1;
    void init(){
        setLocationRelativeTo(null);
        filltable();
        updatestatus();
    }
 
    void insert(){
        nhanvien nv = getform();
        try {
           dao.insert(nv); 
           filltable();
           
           MsgBox.alert(this, "thêm mới thành công");
        } catch (Exception e) {
            MsgBox.alert(this, "thêm mới thất bại");
        }
        
        
    }
    void update(){
        nhanvien nv = getform();
        try {
            dao.update(nv);
            filltable();
            MsgBox.alert(this, "cập nhật thành công");
            
        } catch (Exception e) {
            MsgBox.alert(this, "cập nhật thất bại");
        }
    }
    void delete(){
        String manv = txtmanhanvien.getText();
        try {
               dao.delete(manv);
                MsgBox.alert(this, "xóa thành công");
        } catch (Exception e) {
             MsgBox.alert(this, "xóa thất bại");
        }
     
        
    }
    void filltable(){
        DefaultTableModel model =(DefaultTableModel) tbldanhsach.getModel();
         model.setRowCount(0);
         try {
            
             List<nhanvien> list = dao.selectAll();
             for(nhanvien nv : list){
                 Object[] row ={
                   nv.getMaNV(),
                     nv.getMatKhau(),
                     nv.getHoTen(),
                     nv.getGioitinh()?"nam":"nữ",
                     nv.getVaiTro()?"trưởng phòng": "nhân viên"
                 };
                 model.addRow(row);
             }
             tbldanhsach.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
             MsgBox.alert(this,"lỗi");
        }
        
    }
     void first(){
        this.Row = 0;
        this.edit();
    }
    void prev(){
        if(this.Row > 0){
            this.Row--;
            this.edit();
        }
    }
    void next(){
        if(this.Row < tbldanhsach.getRowCount() - 1){
            this.Row++;
            this.edit();
        }
    }
    void last(){
        this.Row = tbldanhsach.getRowCount() - 1;
        this.edit();
    }
    void edit(){
   
                  
        String manv = (String) tbldanhsach.getValueAt(this.Row, 0);
        nhanvien nv = dao.selectById(manv);
        this.setform(nv);
        jTabbedPane1.setSelectedIndex(0);
        this.updatestatus();
     
    } 
    void clear(){
        nhanvien nv = new nhanvien();
        setform(nv);
        this.Row=-1;
        this.updatestatus();
    }
    void updatestatus(){
        boolean edit =(this.Row>=0);
        boolean first=(this.Row==0);
        boolean last =(this.Row ==tbldanhsach.getRowCount());
        txtmanhanvien.setEditable(!edit);
        btnthem.setEnabled(!edit);
        btnxoa.setEnabled(edit);
        btnsua.setEnabled(edit);
           btnfirt.setEnabled(edit && !first);
        btnprev.setEnabled(edit && !first);
        btnnext.setEnabled(edit && !last);
        btnlast.setEnabled(edit && !last);
    }
    void setform(nhanvien nv){
        txthoten.setText(nv.getHoTen());
        txtmanhanvien.setText(nv.getMaNV());
        txtmatkhau1.setText(nv.getMatKhau());
        txtmatkhau2.setText(nv.getMatKhau());
        rdonam.setSelected(nv.getGioitinh());
        rdonu.setSelected(!nv.getGioitinh());
        rdotruongphong.setSelected(nv.getVaiTro());
        rdonhanvien.setSelected(!nv.getVaiTro());
    }
    nhanvien getform(){
        nhanvien nv = new nhanvien();
        nv.setMaNV(txtmanhanvien.getText());
        nv.setHoTen(txthoten.getText());
        nv.setMatKhau( new String(txtmatkhau1.getPassword()));
        nv.setGioitinh(rdonam.isSelected());
        nv.setVaiTro((rdotruongphong.isSelected()));
        return nv;
    }


}