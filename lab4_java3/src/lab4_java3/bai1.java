/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4_java3;

import java.awt.Color;
import java.io.File;
import java.io.PrintWriter;
import javafx.print.Printer;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author dinh thang
 */
public class bai1 extends javax.swing.JFrame {

    /**
     * Creates new form bai1
     */
    public bai1() {
        initComponents();
        setLocationRelativeTo(null);
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
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdulieu = new javax.swing.JTextArea();
        txtfopy = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnnew = new javax.swing.JMenuItem();
        btnopen = new javax.swing.JMenuItem();
        btnsave = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnucolorred = new javax.swing.JMenuItem();
        mnucolorgreen = new javax.swing.JMenuItem();
        mnucoloryellow = new javax.swing.JMenuItem();
        mnucolortextcolor = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\dinh thang\\Downloads\\aaa.png")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Slide4/images/business_user.png"))); // NOI18N
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Slide4/images/shut_down.png"))); // NOI18N
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        txtdulieu.setColumns(20);
        txtdulieu.setRows(5);
        jScrollPane1.setViewportView(txtdulieu);

        txtfopy.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtfopy.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfopy.setText("foly-java3");

        jMenu1.setText("File");

        btnnew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        btnnew.setIcon(new javax.swing.ImageIcon("C:\\Users\\dinh thang\\Downloads\\aaa.png")); // NOI18N
        btnnew.setText("new");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });
        jMenu1.add(btnnew);

        btnopen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        btnopen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Slide4/images/accept.png"))); // NOI18N
        btnopen.setText("Open");
        btnopen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnopenActionPerformed(evt);
            }
        });
        jMenu1.add(btnopen);

        btnsave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Save.png"))); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jMenu1.add(btnsave);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("color");

        mnucolorred.setText("red");
        mnucolorred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnucolorredActionPerformed(evt);
            }
        });
        jMenu2.add(mnucolorred);

        mnucolorgreen.setText("green");
        mnucolorgreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnucolorgreenActionPerformed(evt);
            }
        });
        jMenu2.add(mnucolorgreen);

        mnucoloryellow.setText("yellow");
        mnucoloryellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnucoloryellowActionPerformed(evt);
            }
        });
        jMenu2.add(mnucoloryellow);

        mnucolortextcolor.setText("text color");
        mnucolortextcolor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnucolortextcolorActionPerformed(evt);
            }
        });
        jMenu2.add(mnucolortextcolor);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("system");

        jMenuItem8.setText("about us");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuItem9.setText("exit");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtfopy)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(txtfopy, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnucolorgreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnucolorgreenActionPerformed
        // TODO add your handling code here:
        txtfopy.setBackground(Color.GREEN);
    }//GEN-LAST:event_mnucolorgreenActionPerformed

    private void mnucolorredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnucolorredActionPerformed
        // TODO add your handling code here:
        txtfopy.setBackground(Color.RED);
    }//GEN-LAST:event_mnucolorredActionPerformed

    private void mnucoloryellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnucoloryellowActionPerformed
        // TODO add your handling code here:
        txtfopy.setBackground(Color.yellow);
    }//GEN-LAST:event_mnucoloryellowActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        // TODO add your handling code here:
        txtdulieu.setText("");
        txtdulieu.requestFocus();
    }//GEN-LAST:event_btnnewActionPerformed

    private void btnopenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnopenActionPerformed
        // TODO add your handling code here:
        JFileChooser fchooser = new JFileChooser();
        int result = fchooser.showOpenDialog(null);
        if(result ==JFileChooser.APPROVE_OPTION){
            try {
               txtdulieu.setText(fchooser.getSelectedFile().getPath());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnopenActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        JFileChooser fchoChooser = new JFileChooser();
        int result = fchoChooser.showSaveDialog(null);
        if(result==JFileChooser.APPROVE_OPTION){
            File fname =fchoChooser.getSelectedFile();
            try {
                PrintWriter pw =new PrintWriter(fname);
                pw.print(txtdulieu.getText());
                pw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void mnucolortextcolorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnucolortextcolorActionPerformed
        // TODO add your handling code here:
        Color c = JColorChooser.showDialog(null, " ch???n m??u ch???", Color.white);
        txtfopy.setForeground(c);
    }//GEN-LAST:event_mnucolortextcolorActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        showAboutus();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        showAboutus();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        txtdulieu.setText("");
        txtdulieu.requestFocus();
    }//GEN-LAST:event_jButton1ActionPerformed
  
    private void showAboutus(){
        String str="program demo menu ";
        str+="\nAuthor: Tuech";
        str+="\n last update:07-oct-2021";
        str+="\nEducation : fpoly";
        JOptionPane.showMessageDialog(null, str,"gioi thi???u",JOptionPane.INFORMATION_MESSAGE);
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
            java.util.logging.Logger.getLogger(bai1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bai1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bai1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bai1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bai1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnnew;
    private javax.swing.JMenuItem btnopen;
    private javax.swing.JMenuItem btnsave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem mnucolorgreen;
    private javax.swing.JMenuItem mnucolorred;
    private javax.swing.JMenuItem mnucolortextcolor;
    private javax.swing.JMenuItem mnucoloryellow;
    private javax.swing.JTextArea txtdulieu;
    private javax.swing.JTextField txtfopy;
    // End of variables declaration//GEN-END:variables
}
