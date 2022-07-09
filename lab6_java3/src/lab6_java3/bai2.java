/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_java3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author dinh thang
 */
public class bai2 extends javax.swing.JFrame {
 boolean addNew=false;
 boolean fill=false;
 Vector data=new Vector();
 Vector header=new Vector();
 Vector col =new Vector();
 Connection con=null;
 PreparedStatement pstDetails=null;
 PreparedStatement pstInsert=null;
 PreparedStatement pstDelete=null;
 PreparedStatement pstUpdate=null;
 String sqlInsert="Insert into Students ([Name],Address,ParentName,Phone,standard) values(?,?,?,?,?)";
 String sqlDelete="Delete from Students where Name=?";
 String sqlUpdate="Update Students set Address=?, ParentName=?,Phone=? ,standard=? where Name=?";
 
  ResultSet rts;
 /** Creates new form Assignment */
 public bai2() {
 initComponents();
 // this.cbMID.setVisible(false);
 // this.pnlDetails.setVisible(false);
 //connect database
 try
 {
 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

con=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=KidszonSchool","sa","123");

 pstInsert=con.prepareStatement(this.sqlInsert);
 pstUpdate=con.prepareStatement(this.sqlUpdate);
 pstDelete=con.prepareStatement(this.sqlDelete);
 pstDetails=con.prepareStatement("select * from Students",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

 rts=pstDetails.executeQuery();
 JOptionPane.showMessageDialog(this,"Connection Database Successful!");
 this.loadCombobox();
 this.loadData();
 fill=true;
 }
 catch(Exception e)
 {
     JOptionPane.showMessageDialog(this,e);
 }
 btnupdate.setEnabled(false);
 }
private void loadCombobox() {
        String sql1 = "select * from dbo.Standars";
        try {
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql1);
            while (rs.next()) {
                cbostandard.addItem(rs.getString(1));
                cbofrees.addItem(rs.getString(2));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            System.exit(0);
        }
    }
 private void loadData() throws SQLException
 {
 String sql="Select [Name], standard from Students";
 try
 {
 Statement st=con.createStatement();
 ResultSet rs=st.executeQuery(sql);
 data.removeAllElements();
 if(!fill)
 {
 //get header
     ResultSetMetaData rsmd=rs.getMetaData();
 int n=rsmd.getColumnCount();

 col.add(rsmd.getColumnName(1));
 col.add(rsmd.getColumnName(2));
 }
 //get data
 while(rs.next())
 {
 Vector v=new Vector();
 v.add(rs.getString(1));
 v.add(rs.getString(2));
 data.add(v);
 }
 TableModel tbl=new DefaultTableModel(data,col);
 this.tblstudent.setModel(tbl);
 rs.close();
 st.close();
 }
 catch(Exception e)
 {
 JOptionPane.showMessageDialog(this,e);
 }
 }
 boolean validates(){
 if(txtname.getText().matches("^\\w+$")==false){
 JOptionPane.showMessageDialog(this, "Name ko dc trong ", "Chu y", 1);
 txtname.requestFocus();
 return false;
 }
 String pName=this.txtname.getText().trim();
 Iterator it=data.iterator();
 while(it.hasNext())
 {
 Vector v=(Vector)it.next();
 String name=((String)v.get(0)).trim();
 if(pName.equalsIgnoreCase(name))
 {
 JOptionPane.showMessageDialog(this,"Ten Sinh Vien nay da ton tai!");
 this.txtname.grabFocus();
 return false;
 }
 }
 if(txtadress.getText().matches("^\\w+$")==false){
 JOptionPane.showMessageDialog(this, "Address khong duoc de trong ","Chu y",1);
 txtadress.requestFocus();
 return false;
 }
 if(txtparentname.getText().matches("^\\w+$")==false){
 JOptionPane.showMessageDialog(this, "ParentsName khong duoc de trong ","Chu y",1);
 txtparentname.requestFocus();
 return false;
 }

 if(txtcontact.getText().matches("^\\d{7,11}$")==false){
 JOptionPane.showMessageDialog(this, "Contact(Phone) khong duoc de trong va phai la 7-12 so ","Chu y",1);
 txtcontact.requestFocus();
 return false;
 }
 if((cbostandard.getSelectedIndex()==0))
 {
 JOptionPane.showMessageDialog(this,cbostandard.getSelectedItem());
 }
 return true;
 }
 boolean duplicate(String s){
 if(addNew==false) return false;
 for (int i=0;i<data.size();i++){
 Vector v=(Vector)data.get(i);
 if(s.equalsIgnoreCase((String)v.get(0))) return true;
 }
 return false;
 }
 private void clearForm() {
 txtname.setText("");
 txtadress.setText("");
 txtparentname.setText("");
 txtcontact.setText("");
 cbostandard.setSelectedIndex(0);
 cbofrees.setSelectedIndex(0);
 txtname.requestFocus();
 }
    /**
     * Creates new form bai2
     */
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblstudent = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtadress = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txtparentname = new javax.swing.JTextField();
        txtcontact = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbostandard = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnnew = new javax.swing.JButton();
        btninsert = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        btnpreview = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        cbofrees = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblstudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tblstudent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblstudentMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblstudentMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblstudent);

        jLabel1.setText("Name:");

        jLabel2.setText("Adress:");

        txtadress.setColumns(20);
        txtadress.setRows(5);
        jScrollPane2.setViewportView(txtadress);

        jLabel3.setText("ParentName:");

        jLabel4.setText("contactNo:");

        jLabel5.setText("Standard:");

        cbostandard.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "hoc luc" }));
        cbostandard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbostandardActionPerformed(evt);
            }
        });

        jLabel6.setText("Frees");

        jPanel1.setLayout(new java.awt.GridLayout(2, 4));

        btnnew.setText("new");
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });
        jPanel1.add(btnnew);

        btninsert.setText("insert");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });
        jPanel1.add(btninsert);

        btnedit.setText("edit ");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        jPanel1.add(btnedit);

        btnupdate.setText("update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate);

        btnnext.setText("next");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });
        jPanel1.add(btnnext);

        btnpreview.setText("preview");
        btnpreview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpreviewActionPerformed(evt);
            }
        });
        jPanel1.add(btnpreview);

        btndelete.setText("delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btndelete);

        btnexit.setText("exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });
        jPanel1.add(btnexit);

        cbofrees.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtparentname, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbostandard, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbofrees, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(cbostandard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(cbofrees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtparentname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(121, 121, 121)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
        // TODO add your handling code here:
fill=false;
 System.exit(0);

    }//GEN-LAST:event_btnexitActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
         try
 {
 int n;
 if(addNew)
 {
 //them moi
 //set cac tham so
 pstInsert.setString(1,this.txtname.getText().trim());
 pstInsert.setString(2,txtadress.getText().trim());
 pstInsert.setString(3,txtparentname.getText().trim());
 pstInsert.setString(4,txtcontact.getText().trim());
 pstInsert.setString(5,(String) cbostandard.getSelectedItem());
 n=pstInsert.executeUpdate();//thuc thi
 this.loadData();
 }
 else
 {
 //update
 //set cac tham so
 pstUpdate.setString(5,this.txtname.getText().trim());
 pstUpdate.setString(2,this.txtadress.getText().trim());
 pstUpdate.setString(1,this.txtparentname.getText().trim());
 pstUpdate.setString(3,this.txtcontact.getText().trim());
 pstUpdate.setString(4,(String) cbostandard.getSelectedItem());
 n=pstUpdate.executeUpdate();//thuc thi
 this.loadData();
 }
 }
 catch(Exception e)
 {
 JOptionPane.showMessageDialog(this,e);
 }
  

    }//GEN-LAST:event_btnupdateActionPerformed

    private void cbostandardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbostandardActionPerformed
        // TODO add your handling code here:
        cbofrees.setSelectedIndex(cbostandard.getSelectedIndex());
    }//GEN-LAST:event_cbostandardActionPerformed

    private void tblstudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblstudentMouseClicked
        // TODO add your handling code here:
  try{
  rts.beforeFirst();
  this.clearForm();
  int row=tblstudent.getSelectedRow();
  String name=(String) tblstudent.getValueAt(row,0);
  while(rts.next()){
  String str=rts.getString(2); 
  if(str.equalsIgnoreCase(name))
 { txtname.setText(rts.getString(2));
 txtadress.setText(rts.getString(3));
 txtcontact.setText(rts.getInt(5)+"");
 //String parent=dencry(rts.getString(5));
 txtparentname.setText(rts.getString(4));
 cbostandard.setSelectedItem(rts.getString(6));
 //com_fees.setSelectedItem(rts.getInt(7));
 break;
 }
 }
 }catch(Exception e){
 txtname.setEnabled(false);
 txtadress.setEnabled(false);
 txtparentname.setEnabled(false);
 txtcontact.setEnabled(false);
 cbostandard.setEnabled(false);
 cbofrees.setEnabled(false);
 } 

    }//GEN-LAST:event_tblstudentMouseClicked

    private void tblstudentMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblstudentMouseReleased
        // TODO add your handling code here:
                if(this.tblstudent.getCellEditor()!=null)
 this.tblstudent.getCellEditor().cancelCellEditing();
    }//GEN-LAST:event_tblstudentMouseReleased

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
 btnupdate.setEnabled(true);
 btnnew.setEnabled(true);
 btnedit.setEnabled(true);
 txtname.setEnabled(true);
 txtadress.setEnabled(true);
 txtparentname.setEnabled(true);
 txtcontact.setEnabled(true);
 cbostandard.setEnabled(true);
    }//GEN-LAST:event_btneditActionPerformed

    private void btnpreviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpreviewActionPerformed
        // TODO add your handling code here:
        try {
 
 rts.previous();

 btnnext.setEnabled(true);
 if(rts.isBeforeFirst()){

 btnpreview.setEnabled(false);
 btnnext.setEnabled(true);
 JOptionPane.showMessageDialog(null, "You have reached the first record " +
 "of the ResultSet!!!!");
 }
 else {
 txtname.setText(rts.getString(2));
 txtadress.setText(rts.getString(3));
 txtparentname.setText(rts.getString(4));
 txtcontact.setText(rts.getString(5));
 cbostandard.setSelectedItem(rts.getString(6));
 }
 } catch (Exception e) {
 //JOptionPane.showConfirmDialog(this,"co loi xay ra");
 }
    }//GEN-LAST:event_btnpreviewActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        // TODO add your handling code here:
        loadCombobox();
 try {
 rts.next();
 btnpreview.setEnabled(true);
 if(rts.isAfterLast() || rts.isBeforeFirst()){
 btnnext.setEnabled(false);
 btnpreview.setEnabled(true);
 JOptionPane.showMessageDialog(null, "You have reached the last record" +
 " of the ResultSet!!!!");
 } else {
 txtname.setText(rts.getString(2));
 txtadress.setText(rts.getString(3));
 txtparentname.setText(rts.getString(4));
 txtcontact.setText(rts.getString(5));
 cbostandard.setSelectedItem(rts.getString(6));
 }
 } catch (Exception e) {
 e.printStackTrace();
 }
    }//GEN-LAST:event_btnnextActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        try
 {
 int n=this.tblstudent.getSelectedRow();
 if(n>=0)//nguoi dung co chon
 {
 //this.pnlDetails.setVisible(false);
 Vector v=(Vector)data.get(n);
 int ans=JOptionPane.showConfirmDialog(this,"Ban co thuc su muon xoa Sinh Vien " +
((String)v.get(0)).trim() + " khong?");
 if(ans==JOptionPane.YES_OPTION)
 {
 pstDelete.setString(1,(String)v.get(0));
 pstDelete.executeUpdate();
 this.loadData();
 }
 }
 }
 catch(Exception e)
 {
 JOptionPane.showMessageDialog(this,e);
 }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
        // TODO add your handling code here:
         if(!validates()) return;
 String name=txtname.getText();
 String addr=txtadress.getText();
 String parentName=txtparentname.getText();
 String phone=txtcontact.getText();
 String standard=(String) cbostandard.getSelectedItem();
 try{
 pstInsert.setString(1, name);
 pstInsert.setString(2, addr);
 pstInsert.setString(3, parentName);
 pstInsert.setString(4, phone);
 pstInsert.setString(5, standard);
 int addRows= pstInsert.executeUpdate();
 this.loadData();
 clearForm();
 if(addRows>0)
 JOptionPane.showMessageDialog(this, "Students Details Have BeenSave ","Successfull",JOptionPane.INFORMATION_MESSAGE);

 }catch(Exception ex){
 JOptionPane.showMessageDialog(this, "Failed to save data in database", "Error",
JOptionPane.ERROR_MESSAGE);
 ex.printStackTrace();
 }
    }//GEN-LAST:event_btninsertActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
        // TODO add your handling code here:
         clearForm();
 txtname.setEnabled(true);
 txtadress.setEnabled(true);
 txtparentname.setEnabled(true);
 txtcontact.setEnabled(true);
 cbofrees.setEnabled(true);
 cbostandard.setEnabled(true);
 txtname.requestFocus();

    }//GEN-LAST:event_btnnewActionPerformed

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
            java.util.logging.Logger.getLogger(bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bai2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bai2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnpreview;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> cbofrees;
    private javax.swing.JComboBox<String> cbostandard;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblstudent;
    private javax.swing.JTextArea txtadress;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtparentname;
    // End of variables declaration//GEN-END:variables
}
