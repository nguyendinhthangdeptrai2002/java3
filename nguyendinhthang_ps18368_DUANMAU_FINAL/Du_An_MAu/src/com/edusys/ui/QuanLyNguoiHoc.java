/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.ui;

import com.edusys.utils.xlmage;
import com.edusys.DAO.NguoiHocDAO;

import com.edusys.entity.nguoihoc;

import com.edusys.utils.Auth;
import com.edusys.utils.MsgBox;
import com.edusys.utils.XDate;


import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author dinh thang
 */
public class QuanLyNguoiHoc extends javax.swing.JFrame {

    // cấy ni lỗi insert ngày không được
    int row=-1;
    /**
     * Creates new form QuanLyNguoiHoc
     */private ArrayList<nguoihoc> list = new ArrayList<nguoihoc>();
           private String header[]={"maNH","Họ Và Tên","Ngày Sinh ","Giới Tính ","Điện Thoại","Email","ghi chú","MaNV","Ngày Đăng Ký"};
           private DefaultTableModel tableModel = new DefaultTableModel(header,0);
           int indexx =0;
           NguoiHocDAO dao = new NguoiHocDAO() {
     
       
     };
           
    public QuanLyNguoiHoc() {
        initComponents();
        setIconImage(xlmage.getAppicon());
        load();
    }
  
        void insert(){ 
        nguoihoc model = this.getForm();
        try { 
            dao.insert(model);
            this.load();
          
            MsgBox.alert(this, "Thêm mới thành công!"); 
        }  
        catch (Exception ex) { 
             MsgBox.alert(this, "Mã người học này đã có rồi. Hãy sử dụng mã khác!"); 
            ex.printStackTrace();           
        } 
        } 
         void update(){ 
         nguoihoc model = getForm();
        try { 
            dao.update(model); 
            this.load(); 
          MsgBox.alert(this, "Cập nhật thành công!"); 
        }  
        catch (Exception e) { 
            MsgBox.alert(this, "Cập nhật thất bại!"); 
        } 
    } 
             void delete(){ 
        if(MsgBox.confirm(this, "Bạn thực sự muốn xóa người học này?")){ 
            String manh = txtmanguoihoc.getText(); 
            try { 
                dao.delete(manh); 
                this.load(); 
                this.clear(); 
                MsgBox.alert(this, "Xóa thành công!"); 
            }  
            catch (RuntimeException e) { 
               MsgBox.alert(this, "Xóa thất bại! Người học này vẫn còn trong thời gian học"); 
            }             
        } 
    }
                private static final String EMAIL_PATTERN
            = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public static boolean verifyEmail(String email) {
        if (email == null) {
            return false;
        }
        return email.matches(EMAIL_PATTERN);
    }
  boolean flag=false;

  public boolean check() {
        if ((txtmanguoihoc.getText()).length() < 7 || (txtmanguoihoc.getText()).length() > 7) {
            if ((txtmanguoihoc.getText()).equals("")) {
               MsgBox.alert(this, "Mã người học không được để trống");
            } else {
                MsgBox.alert(this, "Mã người học phải nhập đúng 7 ký tự");
            }
        } else if ((txthovaten.getText()).equals("")) {
            MsgBox.alert(this, "Họ tên không được để trống");
        } else if (!txthovaten.getText().matches("[a-zA-Z][a-zA-Z ]+")) {
            MsgBox.alert(this, "Họ tên chỉ chứa alphabet và ký tự trắng");
        } else if (txtdienthoai.getText().equals("")) {
            MsgBox.alert(this, "Số điện thoại không được để trống");
        } else if (txtdienthoai.getText().length() < 10 || txtdienthoai.getText().length() > 12) {
            MsgBox.alert(this, "Số điện thoại phải nhập đủ 10 hoặc 11 số.");
        } else if (!txtdienthoai.getText().matches("[0-9]+")) {
            MsgBox.alert(this, "Số điện thoại chỉ nhập số");
        } else if (txtdiachiemail.getText().equals("")) {
           MsgBox.alert(this, "Email không đươc để trống");
        } else if (verifyEmail(txtdiachiemail.getText()) == false) {
            MsgBox.alert(this, "Định dạng email bạn nhập không chính xác");
        } else if (txtngaysinh.getText().equals("")) {
           MsgBox.alert(this, "Ngày sinh không đươc để trống");
        } else if (!txtngaysinh.getText().equals("")) {
            if ((txtngaysinh.getText().length() != 10)) {
                MsgBox.alert(this, "Định dạng ngày nhập vào chưa chính xác!");
            }
        }
        return true;
  }
  
     void edit() {
        
        String manh = (String) tbldanhsachnguoihoc.getValueAt(this.row, 0);
        nguoihoc nh = dao.selectById(manh);
        this.setForm(nh);
        jTabbedPane1.setSelectedIndex(0);
        this.updateStatus();
    }
  
  
  void load() { 
    
        DefaultTableModel model = (DefaultTableModel) tbldanhsachnguoihoc.getModel(); 
        
        model.setRowCount(0); 
       
        try { 
            String keyword = txttimkiem.getText(); 
            List<nguoihoc> list = dao.selectByKeyword(keyword); 
            for (nguoihoc nh : list) { 
                Object[] row = { 
                    nh.getMaNH(), 
                    nh.getHoTen(), 

 
                    nh.getGioiTinh()?"Nam":"Nữ", 
                    XDate.toString(nh.getNgaysinh()), 
                    nh.getDienThoai(), 
                    nh.getEmail(), 
                    nh.getMaNV(), 
                    XDate.toString(nh.getNgDK()) 
                }; 
                model.addRow(row); 
            } 
            tbldanhsachnguoihoc.setModel(model);
        }  
        catch (Exception e) { 
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!"); 
        } 
    }
  void clear(){
      nguoihoc model = new nguoihoc();
     
 model.setMaNV(Auth.user.getMaNV());
 model.setNgDK(XDate.now());
 this.setForm(model);
  }
  
   void setForm(nguoihoc model){
 txtmanguoihoc.setText(model.getMaNH());
 txthovaten.setText(model.getHoTen());
 cbogioitinh.setSelectedIndex(model.getGioiTinh()?0:1);
 txtngaysinh.setText(XDate.toString(model.getNgaysinh()));
 txtdienthoai.setText(model.getDienThoai());
 txtdiachiemail.setText(model.getEmail());
 txtghichu.setText(model.getGhiChu());
 }
 nguoihoc getForm() {
  nguoihoc model = new  nguoihoc();
 model.setMaNH(txtmanguoihoc.getText());
 model.setHoTen(txthovaten.getText());
 model.setGioiTinh(cbogioitinh.getSelectedIndex() == 0);
 model.setNgaysinh(XDate.toDate(txtngaysinh.getText()));
 model.setDienThoai(txtdienthoai.getText());
 model.setEmail(txtdiachiemail.getText());
 model.setGhiChu(txtghichu.getText());
 
 model.setNgDK(XDate.now());
 return model;
 }
  /*
        void setModel(nguoihoc model){ 
        txtmanguoihoc.setText(model.getMaNH()); 
        txthovaten.setText(model.getHoTen()); 
        cbogioitinh.setSelectedIndex(model.getGioiTinh()?0:1); 
        
        txtngaysinh.setText(XDate.toString(model.getNgaysinh()));
        
        txtdienthoai.setText(model.getDienThoai()); 
        txtdiachiemail.setText(model.getEmail()); 
        txtghichu.setText(model.getGhiChu()); 
        
       
    } 
 
       nguoihoc getForm(){
        
        nguoihoc cd = new nguoihoc();
        cd.setMaNH(txtmanguoihoc.getText());
        cd.setHoTen(txthovaten.getText());
        cd.setGioiTinh(cbogioitinh.getSelectedIndex()==0);
        cd.setNgaysinh(XDate.toDate(txtngaysinh.getText()));    
        cd.setDienThoai(txtdienthoai.getText());
        cd.setEmail(txtdiachiemail.getText());
        cd.setGhiChu(txtghichu.getText());
        return cd;
    }
        */ 
    
 
    
    
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txttimkiem = new javax.swing.JTextField();
        btntimkiem = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbldanhsachnguoihoc = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtmanguoihoc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txthovaten = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtngaysinh = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtdienthoai = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtdiachiemail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtghichu = new javax.swing.JTextArea();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnmoi = new javax.swing.JButton();
        btnfirt = new javax.swing.JButton();
        btnprev = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnlast = new javax.swing.JButton();
        cbogioitinh = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Người Học");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Quản Lý Người Học");

        jLabel9.setText("Tìm Kiếm ");

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txttimkiem.setToolTipText("");
        txttimkiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txttimkiemMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txttimkiemMousePressed(evt);
            }
        });
        txttimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttimkiemActionPerformed(evt);
            }
        });

        btntimkiem.setText("Tìm");
        btntimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimkiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108)
                .addComponent(btntimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addGap(44, 44, 44))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntimkiem))
                .addContainerGap())
        );

        tbldanhsachnguoihoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "MaNH", "HoTen", "GioiTinh", "ngaySinh", "DienThoai", "Email", "MaNV", "NgayDK"
            }
        ));
        tbldanhsachnguoihoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbldanhsachnguoihocMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbldanhsachnguoihoc);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel9))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Danh Sách", jPanel1);

        jLabel2.setText("Mã Người Học");

        jLabel3.setText("Họ Và TÊn");

        jLabel4.setText("Giới Tính");

        jLabel5.setText("Ngày Sinh");

        jLabel6.setText("Điện Thoại");

        jLabel7.setText("Địa Chỉ email");

        jLabel8.setText("Ghi chú:");

        txtghichu.setColumns(20);
        txtghichu.setRows(5);
        jScrollPane1.setViewportView(txtghichu);

        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnmoi.setText("Mới");
        btnmoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmoiActionPerformed(evt);
            }
        });

        btnfirt.setText("<");

        btnprev.setText("<<");

        btnnext.setText(">>");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnlast.setText(">");

        cbogioitinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "nam", "nữ" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtmanguoihoc)
                                .addComponent(txthovaten, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(txtdienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(cbogioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(28, 28, 28)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtngaysinh)
                                .addComponent(txtdiachiemail)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel5))
                                    .addGap(0, 179, Short.MAX_VALUE)))))
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(btnthem)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnsua)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnxoa)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnmoi)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnfirt)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnprev)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnnext)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnlast))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(308, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtmanguoihoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txthovaten, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbogioitinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdienthoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdiachiemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthem)
                    .addComponent(btnsua)
                    .addComponent(btnxoa)
                    .addComponent(btnmoi)
                    .addComponent(btnfirt)
                    .addComponent(btnprev)
                    .addComponent(btnnext)
                    .addComponent(btnlast))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Cập Nhật", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnextActionPerformed

    private void btntimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimkiemActionPerformed
load();

// TODO add your handling code here:
        
    }//GEN-LAST:event_btntimkiemActionPerformed

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        // TODO add your handling code here:    
            insert();        

    }//GEN-LAST:event_btnthemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:
        check();

update();
    
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnmoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmoiActionPerformed
        // TODO add your handling code here:
        
 txtmanguoihoc.setText("");
 txtdiachiemail.setText("");
 txtghichu.setText("");
 txthovaten.setText("");
  txttimkiem.setText("");
   txtngaysinh.setText("");
   buttonGroup1.clearSelection();
    }//GEN-LAST:event_btnmoiActionPerformed

    private void txttimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttimkiemActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txttimkiemActionPerformed

    private void txttimkiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttimkiemMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txttimkiemMouseClicked

    private void txttimkiemMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttimkiemMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txttimkiemMousePressed

    private void tbldanhsachnguoihocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbldanhsachnguoihocMouseClicked
        // TODO add your handling code here:
         if(evt.getClickCount() == 2){
            this.row = tbldanhsachnguoihoc.getSelectedRow();
            this.edit();
        }
    
    }//GEN-LAST:event_tbldanhsachnguoihocMouseClicked

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
            java.util.logging.Logger.getLogger(QuanLyNguoiHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyNguoiHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyNguoiHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyNguoiHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyNguoiHoc().setVisible(true);
            }
        });
    }
    
     void first(){
        this.row = 0;
        this.edit();
    }
    void prev(){
        if(this.row > 0){
            this.row--;
            this.edit();
        }
    }
    void next(){
        if(this.row < tbldanhsachnguoihoc.getRowCount() - 1){
            this.row++;
            this.edit();
        }
    }
    void last(){
        this.row = tbldanhsachnguoihoc.getRowCount() - 1;
        this.edit();
    }

    void updateStatus(){
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tbldanhsachnguoihoc.getRowCount() - 1);
        // Trạng thái form
        txtmanguoihoc.setEditable(!edit);
        btnthem.setEnabled(!edit);
        btnsua.setEnabled(edit);
        btnxoa.setEnabled(edit);
        
        // Trạng thái điều hướng
        btnfirt.setEnabled(edit && !first);
        btnprev.setEnabled(edit && !first);
        btnnext.setEnabled(edit && !last);
        btnlast.setEnabled(edit && !last);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnfirt;
    private javax.swing.JButton btnlast;
    private javax.swing.JButton btnmoi;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprev;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btntimkiem;
    private javax.swing.JButton btnxoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbogioitinh;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbldanhsachnguoihoc;
    private javax.swing.JTextField txtdiachiemail;
    private javax.swing.JTextField txtdienthoai;
    private javax.swing.JTextArea txtghichu;
    private javax.swing.JTextField txthovaten;
    private javax.swing.JTextField txtmanguoihoc;
    private javax.swing.JTextField txtngaysinh;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables

 
}
