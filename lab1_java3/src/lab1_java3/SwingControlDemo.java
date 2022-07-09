/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_java3;

/**
 *
 * @author dinh thang
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SwingControlDemo {
private JFrame mainFrame;
 private JLabel headerLabel;
 private JLabel statusLabel;
  private JLabel statusLabel1;
   private JLabel statusLabel2;
 private JPanel controlPanel;

 public SwingControlDemo(){
 prepareGUI();
 }
 public static void main(String[] args){
 SwingControlDemo swingControlDemo = new SwingControlDemo();
 swingControlDemo.showCheckBoxDemo();
 }
 private void prepareGUI(){
 mainFrame = new JFrame("Vi du Java Swing");
 mainFrame.setSize(400,400);
 mainFrame.setLocationRelativeTo(null);
 mainFrame.setLayout(new GridLayout(3, 1));
 mainFrame.addWindowListener(new WindowAdapter() {
 public void windowClosing(WindowEvent windowEvent){
 System.exit(0);
 }
 });
 headerLabel = new JLabel("", JLabel.CENTER);
 statusLabel = new JLabel("");
 statusLabel.setSize(350,100);
 statusLabel1 = new JLabel("");
 statusLabel1.setSize(350,100);
 statusLabel2 = new JLabel("");
 statusLabel2.setSize(350,100);
 controlPanel = new JPanel();
 controlPanel.setLayout(new FlowLayout());
 
 mainFrame.add(headerLabel);
 mainFrame.add(controlPanel);
 mainFrame.add(statusLabel);
 mainFrame.add(statusLabel1);
 mainFrame.add(statusLabel2);
 mainFrame.setVisible(true);
 }
 void showCheckBoxDemo(){
 headerLabel.setText("Control in action: CheckBox");
 final JCheckBox chkApple = new JCheckBox("Apple");
 final JCheckBox chkMango = new JCheckBox("Mango");
 final JCheckBox chkPeer = new JCheckBox("Peer");
 chkApple.setMnemonic(KeyEvent.VK_C);
 chkMango.setMnemonic(KeyEvent.VK_M);
 chkPeer.setMnemonic(KeyEvent.VK_P);
 chkApple.addItemListener(new ItemListener() {
 public void itemStateChanged(ItemEvent e) {
 statusLabel.setText("Apple Checkbox: "
 + (e.getStateChange()==1?"checked":"unchecked"));
 }
 });
 chkMango.addItemListener(new ItemListener()
          {
 public void itemStateChanged(ItemEvent e) {
 statusLabel1.setText("Mango Checkbox: "
 + (e.getStateChange()==1?"checked":"unchecked"));
 }
 });
 
 chkPeer.addItemListener(new ItemListener() {
 public void itemStateChanged(ItemEvent e) {
 statusLabel2.setText("Peer  Checkbox: "
 + (e.getStateChange()==1?"checked":"unchecked"));
 }
 });
 controlPanel.add(chkApple);
 controlPanel.add(chkMango);
 controlPanel.add(chkPeer);
 mainFrame.setVisible(true);
 }

}
