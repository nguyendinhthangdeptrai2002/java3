/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package du_an_mau;

import com.sun.xml.internal.fastinfoset.util.PrefixArray;
import java.awt.Button;
import java.awt.Color;

/**
 *
 * @author dinh thang
 */
public class edusys extends javax.swing.JFrame {

    /**
     * Creates new form edusys
     */
    public edusys() {
        initComponents();
        setLocationRelativeTo(this);
        this.setIconImage(xlmage.getAppicon());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btndangxuat = new javax.swing.JButton();
        btnketthuc = new javax.swing.JButton();
        btnchuyende = new javax.swing.JButton();
        btnnguoihoc = new javax.swing.JButton();
        btnkhoahoc = new javax.swing.JButton();
        btnhocvien = new javax.swing.JButton();
        btnhuongdan = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblchuy = new javax.swing.JLabel();
        lbldongho = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuhethong = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnidoimatkhau = new javax.swing.JMenuItem();
        mnidangxuat = new javax.swing.JMenuItem();
        mniketthuc = new javax.swing.JMenuItem();
        mnuquanly = new javax.swing.JMenu();
        mnichuyende = new javax.swing.JMenuItem();
        mnikhoahoc = new javax.swing.JMenuItem();
        mninguoihoc = new javax.swing.JMenuItem();
        mnihocvien = new javax.swing.JMenuItem();
        mninhanvien = new javax.swing.JMenuItem();
        mnuthongke = new javax.swing.JMenu();
        mnibangdiem = new javax.swing.JMenuItem();
        mniluongnguoihoc = new javax.swing.JMenuItem();
        mnidiemchuyende = new javax.swing.JMenuItem();
        mnidoanhthu = new javax.swing.JMenuItem();
        mnutrogiup = new javax.swing.JMenu();
        mnihuongdansudung = new javax.swing.JMenuItem();
        mnigioithieusanpham = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hệ Quản Lý Đào Tạo");

        jToolBar1.setRollover(true);

        btndangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/dangxuat.png"))); // NOI18N
        btndangxuat.setText("Đăng Xuất");
        btndangxuat.setFocusable(false);
        btndangxuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btndangxuat.setMargin(new java.awt.Insets(5, 14, 2, 30));
        btndangxuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btndangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndangxuatActionPerformed(evt);
            }
        });
        jToolBar1.add(btndangxuat);

        btnketthuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/Stop 2.png"))); // NOI18N
        btnketthuc.setText("Kết Thúc");
        btnketthuc.setFocusable(false);
        btnketthuc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnketthuc.setMargin(new java.awt.Insets(5, 14, 2, 30));
        btnketthuc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnketthuc);

        btnchuyende.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/chuyende.png"))); // NOI18N
        btnchuyende.setText("Chuyên Đề ");
        btnchuyende.setFocusable(false);
        btnchuyende.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnchuyende.setMargin(new java.awt.Insets(5, 14, 2, 30));
        btnchuyende.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnchuyende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchuyendeActionPerformed(evt);
            }
        });
        jToolBar1.add(btnchuyende);

        btnnguoihoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/nguoihoc.png"))); // NOI18N
        btnnguoihoc.setText("Người Học");
        btnnguoihoc.setFocusable(false);
        btnnguoihoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnnguoihoc.setMargin(new java.awt.Insets(5, 14, 2, 30));
        btnnguoihoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnnguoihoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnguoihocActionPerformed(evt);
            }
        });
        jToolBar1.add(btnnguoihoc);

        btnkhoahoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/khoahoc.png"))); // NOI18N
        btnkhoahoc.setText("Khóa Học");
        btnkhoahoc.setFocusable(false);
        btnkhoahoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnkhoahoc.setMargin(new java.awt.Insets(5, 14, 2, 30));
        btnkhoahoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnkhoahoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkhoahocActionPerformed(evt);
            }
        });
        jToolBar1.add(btnkhoahoc);

        btnhocvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/hocvien.png"))); // NOI18N
        btnhocvien.setText("Học Viên");
        btnhocvien.setFocusable(false);
        btnhocvien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnhocvien.setMargin(new java.awt.Insets(5, 14, 2, 30));
        btnhocvien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnhocvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhocvienActionPerformed(evt);
            }
        });
        jToolBar1.add(btnhocvien);

        btnhuongdan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/huongdan.png"))); // NOI18N
        btnhuongdan.setText("Hướng Dẫn");
        btnhuongdan.setFocusable(false);
        btnhuongdan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnhuongdan.setMargin(new java.awt.Insets(5, 14, 2, 30));
        btnhuongdan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnhuongdan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhuongdanActionPerformed(evt);
            }
        });
        jToolBar1.add(btnhuongdan);

        lblchuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/Button Info.png"))); // NOI18N
        lblchuy.setText("jLabel2");

        lbldongho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/dongho.png"))); // NOI18N
        lbldongho.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblchuy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbldongho)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblchuy)
                    .addComponent(lbldongho))
                .addContainerGap())
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/18198154_10208600482868814_3469513_n-234x375.png"))); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        mnuhethong.setText("Hệ Thống ");
        mnuhethong.add(jSeparator1);

        mnidoimatkhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/doimatkhau.png"))); // NOI18N
        mnidoimatkhau.setText("đổi mật khẩu");
        mnuhethong.add(mnidoimatkhau);

        mnidangxuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        mnidangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/dangxuat.png"))); // NOI18N
        mnidangxuat.setText("đăng xuất");
        mnuhethong.add(mnidangxuat);

        mniketthuc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, 0));
        mniketthuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/Stop 2.png"))); // NOI18N
        mniketthuc.setText("kết thúc");
        mniketthuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniketthucActionPerformed(evt);
            }
        });
        mnuhethong.add(mniketthuc);

        jMenuBar1.add(mnuhethong);

        mnuquanly.setText("Quản Lý");

        mnichuyende.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_MASK));
        mnichuyende.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/chuyende.png"))); // NOI18N
        mnichuyende.setText("chuyên đề");
        mnuquanly.add(mnichuyende);

        mnikhoahoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_MASK));
        mnikhoahoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/khoahoc.png"))); // NOI18N
        mnikhoahoc.setText("khóa học");
        mnuquanly.add(mnikhoahoc);

        mninguoihoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_MASK));
        mninguoihoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/nguoihoc.png"))); // NOI18N
        mninguoihoc.setText("người học");
        mnuquanly.add(mninguoihoc);

        mnihocvien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_MASK));
        mnihocvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/hocvien.png"))); // NOI18N
        mnihocvien.setText("học viên");
        mnuquanly.add(mnihocvien);

        mninhanvien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.CTRL_MASK));
        mninhanvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/nhanvien.png"))); // NOI18N
        mninhanvien.setText("nhân viên");
        mnuquanly.add(mninhanvien);

        jMenuBar1.add(mnuquanly);

        mnuthongke.setText("Thống kê");

        mnibangdiem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.SHIFT_MASK));
        mnibangdiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/bangdiem.png"))); // NOI18N
        mnibangdiem.setText("Bảng điểm ");
        mnuthongke.add(mnibangdiem);

        mniluongnguoihoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.SHIFT_MASK));
        mniluongnguoihoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/luongnguoihoc.png"))); // NOI18N
        mniluongnguoihoc.setText("Lượng Người Học");
        mniluongnguoihoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniluongnguoihocActionPerformed(evt);
            }
        });
        mnuthongke.add(mniluongnguoihoc);

        mnidiemchuyende.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.SHIFT_MASK));
        mnidiemchuyende.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/diemchuyende.png"))); // NOI18N
        mnidiemchuyende.setText("Điểm chuyên đề");
        mnuthongke.add(mnidiemchuyende);

        mnidoanhthu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.SHIFT_MASK));
        mnidoanhthu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/doanhthu.png"))); // NOI18N
        mnidoanhthu.setText("Doanh thu");
        mnuthongke.add(mnidoanhthu);

        jMenuBar1.add(mnuthongke);

        mnutrogiup.setText("Trợ giúp");

        mnihuongdansudung.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.META_MASK));
        mnihuongdansudung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/anh/huongdan.png"))); // NOI18N
        mnihuongdansudung.setText("Hướng Dẫn Sử Dụng");
        mnutrogiup.add(mnihuongdansudung);

        mnigioithieusanpham.setText("Giới Thiệu Sản Phẩm");
        mnutrogiup.add(mnigioithieusanpham);

        jMenuBar1.add(mnutrogiup);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 843, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniketthucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniketthucActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniketthucActionPerformed

    private void mniluongnguoihocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniluongnguoihocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniluongnguoihocActionPerformed

    private void btnchuyendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchuyendeActionPerformed
        // TODO add your handling code here:
         new QuanLyChuyenDe().setVisible(true);
    }//GEN-LAST:event_btnchuyendeActionPerformed

    private void btnnguoihocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnguoihocActionPerformed
        // TODO add your handling code here:
        new QuanLyNguoiHoc().setVisible(true);
    }//GEN-LAST:event_btnnguoihocActionPerformed

    private void btnkhoahocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkhoahocActionPerformed
        // TODO add your handling code here:
        new Quanlykhoahoc().setVisible(true);
    }//GEN-LAST:event_btnkhoahocActionPerformed

    private void btnhocvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhocvienActionPerformed
        // TODO add your handling code here:
        new QuanLyHocVien().setVisible(true);
    }//GEN-LAST:event_btnhocvienActionPerformed

    private void btnhuongdanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhuongdanActionPerformed
        // TODO add your handling code here:
        btnhuongdan.setText("<HTML>");
        
    }//GEN-LAST:event_btnhuongdanActionPerformed

    private void btndangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndangxuatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btndangxuatActionPerformed

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
            java.util.logging.Logger.getLogger(edusys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(edusys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(edusys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(edusys.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new edusys().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnchuyende;
    private javax.swing.JButton btndangxuat;
    private javax.swing.JButton btnhocvien;
    private javax.swing.JButton btnhuongdan;
    private javax.swing.JButton btnketthuc;
    private javax.swing.JButton btnkhoahoc;
    private javax.swing.JButton btnnguoihoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblchuy;
    private javax.swing.JLabel lbldongho;
    private javax.swing.JMenuItem mnibangdiem;
    private javax.swing.JMenuItem mnichuyende;
    private javax.swing.JMenuItem mnidangxuat;
    private javax.swing.JMenuItem mnidiemchuyende;
    private javax.swing.JMenuItem mnidoanhthu;
    private javax.swing.JMenuItem mnidoimatkhau;
    private javax.swing.JMenuItem mnigioithieusanpham;
    private javax.swing.JMenuItem mnihocvien;
    private javax.swing.JMenuItem mnihuongdansudung;
    private javax.swing.JMenuItem mniketthuc;
    private javax.swing.JMenuItem mnikhoahoc;
    private javax.swing.JMenuItem mniluongnguoihoc;
    private javax.swing.JMenuItem mninguoihoc;
    private javax.swing.JMenuItem mninhanvien;
    private javax.swing.JMenu mnuhethong;
    private javax.swing.JMenu mnuquanly;
    private javax.swing.JMenu mnuthongke;
    private javax.swing.JMenu mnutrogiup;
    // End of variables declaration//GEN-END:variables
}