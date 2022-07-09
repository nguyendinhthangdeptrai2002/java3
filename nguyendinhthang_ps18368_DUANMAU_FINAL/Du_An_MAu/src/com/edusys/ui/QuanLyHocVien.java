/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.ui;

import DAO.KhoahocDAO;
import com.edusys.DAO.NguoiHocDAO;
import com.edusys.DAO.chuyendeDAO;
import com.edusys.DAO.hocvienDAO;
import com.edusys.entity.chuyende;
import com.edusys.entity.hocvien;
import com.edusys.entity.khoahoc;
import com.edusys.entity.nguoihoc;
import com.edusys.utils.Auth;
import com.edusys.utils.MsgBox;
import com.edusys.utils.xlmage;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author dinh thang
 */
public class QuanLyHocVien extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyHocVien
     */
    hocvienDAO hvdao= new hocvienDAO();
    chuyendeDAO cddao= new chuyendeDAO() {};       
     KhoahocDAO khdaAO = new KhoahocDAO();
    NguoiHocDAO nhdao= new NguoiHocDAO() {};

    public QuanLyHocVien() {
        initComponents();
        setIconImage(xlmage.getAppicon());
       
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cbochuyende = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        cbokhoahoc = new javax.swing.JComboBox<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblhocvien = new javax.swing.JTable();
        btnxoakhoikhoahoc = new javax.swing.JButton();
        btncapnhatdiem = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txttimkiem = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblnguoihoc = new javax.swing.JTable();
        btnthemvaokhoahoc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Học Viên");

        jLabel1.setText("Chuyên Đề");

        jLabel2.setText("Khóa Học");

        cbochuyende.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbochuyende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbochuyendeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(cbochuyende, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbochuyende, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        cbokhoahoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbokhoahoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbokhoahocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbokhoahoc, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbokhoahoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblhocvien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "stt", "MaHV", "MaNH", "Hoten", "Diem"
            }
        ));
        jScrollPane1.setViewportView(tblhocvien);

        btnxoakhoikhoahoc.setText("xóa khỏi khóa học");
        btnxoakhoikhoahoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoakhoikhoahocActionPerformed(evt);
            }
        });

        btncapnhatdiem.setText("cập nhật điểm");
        btncapnhatdiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncapnhatdiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnxoakhoikhoahoc)
                        .addGap(33, 33, 33)
                        .addComponent(btncapnhatdiem)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncapnhatdiem)
                    .addComponent(btnxoakhoikhoahoc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Học Viên ", jPanel3);

        jLabel3.setText("Tìm Kiếm");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        tblnguoihoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "MaNH", "Hoten", "Gioitinh", "Ngaysinh", "Dienthoai", "Email"
            }
        ));
        jScrollPane2.setViewportView(tblnguoihoc);

        btnthemvaokhoahoc.setText("thêm vào khóa học");
        btnthemvaokhoahoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemvaokhoahocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 71, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnthemvaokhoahoc)
                .addGap(22, 22, 22))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnthemvaokhoahoc)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Người Học", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(213, 213, 213))
            .addComponent(jTabbedPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncapnhatdiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncapnhatdiemActionPerformed
        // TODO add your handling code here:
      updatediem();
    }//GEN-LAST:event_btncapnhatdiemActionPerformed

    private void btnxoakhoikhoahocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoakhoikhoahocActionPerformed
        // TODO add your handling code here:
        removehocvien();
       
    }//GEN-LAST:event_btnxoakhoikhoahocActionPerformed

    private void btnthemvaokhoahocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemvaokhoahocActionPerformed
        // TODO add your handling code here:
        addhocvien();
    }//GEN-LAST:event_btnthemvaokhoahocActionPerformed

    private void cbokhoahocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbokhoahocActionPerformed
        // TODO add your handling code here:
     filltablehocvien();
    }//GEN-LAST:event_cbokhoahocActionPerformed

    private void cbochuyendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbochuyendeActionPerformed
        // TODO add your handling code here:
        fillcomboboxkhoahoc();
    }//GEN-LAST:event_cbochuyendeActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyHocVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyHocVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyHocVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyHocVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyHocVien().setVisible(true);
            }
        });
    }
    void fillcomboboxchuyende(){
        try {    
        DefaultComboBoxModel model =(DefaultComboBoxModel) cbochuyende.getModel();
        model.removeAllElements();
        List<chuyende> list = cddao.selectAll();
        for(chuyende cd : list){
            model.addElement(cd);
        }
        this.fillcomboboxkhoahoc();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
  
   
    void fillcomboboxkhoahoc(){
        DefaultComboBoxModel model =(DefaultComboBoxModel) cbokhoahoc.getModel();
        model.removeAllElements();
        chuyende cd = (chuyende) cbochuyende.getSelectedItem();
        if(cd != null){
            List<khoahoc> list = khdaAO.selectByChuyenDe(cd.getMaCD());
            for(khoahoc kh : list){
                model.addElement(kh);
            }
            this.filltablehocvien();
        }
    }
    void filltablehocvien(){
        try {
                 
        DefaultTableModel model =( DefaultTableModel) tblhocvien.getModel();
        model.setRowCount(0);
        khoahoc kh = (khoahoc) cbokhoahoc.getSelectedItem();
        if(kh != null){
            List<hocvien> list = hvdao.selectBykhoahoc(kh.getMaKH());
            for(int i=0;i<list.size();i++){
                hocvien hv = list.get(i);
                String hoten = nhdao.selectById(hv.getMaNH()).getHoTen();
                model.addRow(new Object[]{i+1,hv.getMaHV(),hv.getMaNH(),hoten,hv.getDiem()});
            }
          this.filltablenguoihoc();
        }
    
          } catch (Exception e) {
              e.printStackTrace();
        }
    }
    void filltablenguoihoc(){
        DefaultTableModel model =(DefaultTableModel) tblnguoihoc.getModel();
        model.setRowCount(0);
        khoahoc kh =(khoahoc) cbokhoahoc.getSelectedItem();
        String keyword = txttimkiem.getText();
        List<nguoihoc> list =nhdao.selectNotInCourse(kh.getMaKH(), keyword);
        for(nguoihoc nh : list){
            model.addRow(new Object[]{nh.getMaNH(),nh.getHoTen(),nh.getGioiTinh()?"Nam":"Nữ",
            nh.getNgaysinh(),nh.getDienThoai(),nh.getEmail()});        
        }
    }
    void addhocvien(){
        try {
        khoahoc kh = (khoahoc) cbokhoahoc.getSelectedItem();
        for(int row:tblnguoihoc.getSelectedRows()){
            hocvien hv = new hocvien();
            hv.setMaKH(kh.getMaKH());
            hv.setDiem(0);
            hv.setMaNH((String) tblnguoihoc.getValueAt(row, 0));
            hvdao.insert(hv);
        }
        this.filltablehocvien();
        this.jTabbedPane1.setSelectedIndex(0);
    }catch( Exception ee){
        ee.printStackTrace();
    }
    }
    void removehocvien(){
        if(!Auth.isManager()){
            MsgBox.alert(this, "bạn không có quyền xóa học viên");
        }
        else{
            if(MsgBox.confirm(this, "bạn muốn xóa các học viên được chọn?")){
                for(int row : tblhocvien.getSelectedRows()){
                    int mahv =(Integer)tblhocvien.getValueAt(row, 0);
                            hvdao.delete(mahv);
                }
                this.filltablehocvien();
            }
        }
    }
    
    void updatediem(){
        try {
            
       
        for(int i=0;i<tblhocvien.getRowCount();i++){
            int mahv =(Integer)tblhocvien.getValueAt(i, 1);
            hocvien hv = hvdao.selectByid(mahv);
            hv.setDiem((Double)tblhocvien.getValueAt(i, 4));
            hvdao.update(hv);
            
        }
        MsgBox.alert(this, "cập nhật điểm thành công!");
         } catch (Exception e) {
             e.printStackTrace();
        }
    }

    void init(){
        this.setLocationRelativeTo(null);
        this.fillcomboboxchuyende();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncapnhatdiem;
    private javax.swing.JButton btnthemvaokhoahoc;
    private javax.swing.JButton btnxoakhoikhoahoc;
    private javax.swing.JComboBox<String> cbochuyende;
    private javax.swing.JComboBox<String> cbokhoahoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblhocvien;
    private javax.swing.JTable tblnguoihoc;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables

}
