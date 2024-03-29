/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastdapp;

import java.awt.Color;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TROJAN
 */
public class ManageStudent extends javax.swing.JFrame {

    student std = new student();
    
    public ManageStudent() {
        initComponents();
        std.FillStdTable(jTable1, "");
        ButtonGroup bg = new ButtonGroup();
        bg.add(jR_male);
        bg.add(jR_female);
        jTable1.setRowHeight(40);
        jTable1.setShowGrid(true);
        jTable1.setGridColor(Color.black);
        jTable1.setSelectionBackground(Color.blue);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jL_fname = new javax.swing.JLabel();
        jL_lname = new javax.swing.JLabel();
        jL_sex = new javax.swing.JLabel();
        jL_phone = new javax.swing.JLabel();
        jL_birthdate = new javax.swing.JLabel();
        jL_address = new javax.swing.JLabel();
        jT_lname = new javax.swing.JTextField();
        jT_birthdate = new javax.swing.JTextField();
        jT_fname = new javax.swing.JTextField();
        jR_male = new javax.swing.JRadioButton();
        jR_female = new javax.swing.JRadioButton();
        jT_phone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_address = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jB_add2 = new javax.swing.JButton();
        jB_remove = new javax.swing.JButton();
        jL_fname1 = new javax.swing.JLabel();
        jT_id = new javax.swing.JTextField();
        jB_edit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jL_fname.setBackground(new java.awt.Color(0, 0, 0));
        jL_fname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jL_fname.setText("Id");

        jL_lname.setBackground(new java.awt.Color(0, 0, 0));
        jL_lname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jL_lname.setText("Last Name");

        jL_sex.setBackground(new java.awt.Color(0, 0, 0));
        jL_sex.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jL_sex.setText("Sex");

        jL_phone.setBackground(new java.awt.Color(0, 0, 0));
        jL_phone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jL_phone.setText("Phone");

        jL_birthdate.setBackground(new java.awt.Color(0, 0, 0));
        jL_birthdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jL_birthdate.setText("Birthdate");

        jL_address.setBackground(new java.awt.Color(0, 0, 0));
        jL_address.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jL_address.setText("Address");

        jT_lname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jT_birthdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jT_fname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jT_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_fnameActionPerformed(evt);
            }
        });

        jR_male.setText("Male");
        jR_male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jR_maleActionPerformed(evt);
            }
        });

        jR_female.setText("Female");

        jT_phone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jT_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_phoneActionPerformed(evt);
            }
        });
        jT_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jT_phoneKeyTyped(evt);
            }
        });

        jT_address.setColumns(20);
        jT_address.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jT_address.setRows(5);
        jScrollPane1.setViewportView(jT_address);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Manage Student");

        jB_add2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jB_add2.setText("Add");
        jB_add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_add2ActionPerformed(evt);
            }
        });

        jB_remove.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jB_remove.setText("Remove");
        jB_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_removeActionPerformed(evt);
            }
        });

        jL_fname1.setBackground(new java.awt.Color(0, 0, 0));
        jL_fname1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jL_fname1.setText("First Name");

        jT_id.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jT_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jT_idActionPerformed(evt);
            }
        });

        jB_edit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jB_edit.setText("Edit");
        jB_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_editActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "First Name", "Last Name", "Sex", "BirthDate", "Phone", "Address"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jL_sex, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jL_birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jL_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jL_address, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jL_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jL_fname1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jL_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jB_add2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jB_remove))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jT_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jT_birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jR_male, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(58, 58, 58)
                                        .addComponent(jR_female))
                                    .addComponent(jT_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jT_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jT_id, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(jB_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)))
                .addGap(99, 99, 99))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jL_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT_id, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jL_fname1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jL_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jL_sex, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jR_male, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jR_female, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jT_birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jL_birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jL_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jT_phone, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jL_address, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addComponent(jB_edit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jB_add2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jB_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jT_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_fnameActionPerformed

    private void jR_maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jR_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jR_maleActionPerformed

    private void jT_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_phoneActionPerformed

    private void jT_phoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jT_phoneKeyTyped
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jT_phoneKeyTyped

    private void jB_add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_add2ActionPerformed
                    AddStudentForm addStu = new AddStudentForm();
                    addStu.setVisible(true);
                    addStu.pack();
                    addStu.setLocationRelativeTo(null);
                    addStu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


    }//GEN-LAST:event_jB_add2ActionPerformed

    private void jB_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_removeActionPerformed
        
        if(jT_id.getText().equals("")){
            JOptionPane.showMessageDialog(null, "No Student Selected");
        }
        int id = Integer.valueOf(jT_id.getText());
        std.insertUpdateDelete('d', id, null, null, null, null, null, null);
        
        ManageStudent.jTable1.setModel(new DefaultTableModel(null,new Object[]{"Id","First Name","Last Name","Sex","BirthDate","Phone","Address"}));
        std.FillStdTable(ManageStudent.jTable1, "");
        Main.jL_3.setText("Students "+Integer.toString(FuncStu.count("student")));
        
        
    }//GEN-LAST:event_jB_removeActionPerformed

    private void jT_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jT_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jT_idActionPerformed

    public boolean vertfText(){
           if(jT_fname.getText().equals("") || jT_lname.getText().equals("") || jT_phone.getText().equals("") || jT_address.getText().equals("") || jT_birthdate.getText().equals("") || jT_id.getText().equals("")){
               JOptionPane.showMessageDialog(null, "One Or More Field Empty");
               return  false;
           }else{
            return true;
           }
        
        } 
    
    private void jB_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_editActionPerformed
         String fname =  jT_fname.getText();
        String lname =  jT_lname.getText();
        String phone =  jT_phone.getText();
        String address = jT_address.getText();
        String bdate =  jT_birthdate.getText();
        int id = Integer.valueOf(jT_id.getText());
        String sex = "";
        if(jR_female.isSelected()){
            sex ="Female";
        }else if(jR_male.isSelected()){
            sex ="male";
        }
        if(vertfText()){
            
            std.insertUpdateDelete('u', id, fname, lname, sex, bdate, phone, address);
            Main.jL_3.setText("Students "+Integer.toString(FuncStu.count("student")));
           
            ManageStudent.jTable1.setModel(new DefaultTableModel(null,new Object[]{"Id","First Name","Last Name","Sex","BirthDate","Phone","Address"}));
            std.FillStdTable(ManageStudent.jTable1, "");
        }
    }//GEN-LAST:event_jB_editActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int rowIndex = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        jT_id.setText(model.getValueAt(rowIndex, 0).toString());
        jT_fname.setText(model.getValueAt(rowIndex, 1).toString());
        jT_lname.setText(model.getValueAt(rowIndex, 2).toString());
        if(model.getValueAt(rowIndex, 3).toString().equals("Male")){
            jR_male.setSelected(true);
            jR_female.setSelected(false);
        }else{
            jR_female.setSelected(true);
            jR_male.setSelected(false);
        }
        jT_birthdate.setText(model.getValueAt(rowIndex, 4).toString());
        jT_phone.setText(model.getValueAt(rowIndex, 5).toString());
        jT_address.setText(model.getValueAt(rowIndex, 6).toString());
        
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(ManageStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ManageStudent().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_add2;
    private javax.swing.JButton jB_edit;
    private javax.swing.JButton jB_remove;
    private javax.swing.JLabel jL_address;
    private javax.swing.JLabel jL_birthdate;
    private javax.swing.JLabel jL_fname;
    private javax.swing.JLabel jL_fname1;
    private javax.swing.JLabel jL_lname;
    private javax.swing.JLabel jL_phone;
    private javax.swing.JLabel jL_sex;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jR_female;
    private javax.swing.JRadioButton jR_male;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jT_address;
    private javax.swing.JTextField jT_birthdate;
    private javax.swing.JTextField jT_fname;
    private javax.swing.JTextField jT_id;
    private javax.swing.JTextField jT_lname;
    private javax.swing.JTextField jT_phone;
    public static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    
}
