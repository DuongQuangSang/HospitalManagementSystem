/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import service.DoctorService;
import service.ListDoctorService;
import service.PatientService;
import java.awt.event.ItemEvent;
import java.sql.SQLException;
import java.util.List;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Doctor;
import model.ListDoctor;
import model.Patient;

/**
 *
 * @author user
 */
public class DoctorView extends javax.swing.JFrame {

    /**
     * Creates new form DoctorView
     */
    public DoctorView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextPane7 = new javax.swing.JTextPane();
        jButton6 = new javax.swing.JButton();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        input_DoctorId = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        input_DoctorDepartmentId = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        btnDoctorInsert = new javax.swing.JButton();
        btnDoctorDelete = new javax.swing.JButton();
        btnDoctorUpdate = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBox = new javax.swing.JComboBox<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        input_DoctorName = new javax.swing.JTextPane();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        input_DoctorGender = new javax.swing.JTextPane();
        btnDoctorClear = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        input_DoctorSalary = new javax.swing.JTextPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        searchInfoDoctor = new javax.swing.JTextPane();
        jLabel10 = new javax.swing.JLabel();
        btnShowDoctor = new javax.swing.JButton();
        btnSearchDoctor = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        doctorTable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        clickManagerView = new javax.swing.JMenu();
        clickManager = new javax.swing.JMenuItem();
        clickLogout = new javax.swing.JMenuItem();
        clickExit = new javax.swing.JMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "患者名", "検査日", "所属科室", "担当医師", "診断", "治療"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        jLabel1.setText("患者名リスク");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "患者名", "検査日", "所属科室", "担当医師", "診断", "治療"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jLabel9.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel9.setText("患者名");

        jScrollPane8.setViewportView(jTextPane7);

        jButton6.setFont(new java.awt.Font("MS UI Gothic", 1, 12)); // NOI18N
        jButton6.setText("Cancel");
        jButton6.setPreferredSize(new java.awt.Dimension(70, 21));

        jMenuItem2.setText("jMenuItem2");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("医師管理");
        setPreferredSize(new java.awt.Dimension(1080, 700));

        jLabel2.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel2.setText("医師ID");

        jLabel4.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel4.setText("所属科ID");

        jScrollPane2.setViewportView(input_DoctorId);

        input_DoctorDepartmentId.setEditable(false);
        jScrollPane4.setViewportView(input_DoctorDepartmentId);

        jLabel7.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel7.setText("給与");

        btnDoctorInsert.setText("新規");
        btnDoctorInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorInsertActionPerformed(evt);
            }
        });

        btnDoctorDelete.setText("削除");
        btnDoctorDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorDeleteActionPerformed(evt);
            }
        });

        btnDoctorUpdate.setText("変更");
        btnDoctorUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorUpdateActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel5.setText("所属科室");

        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "内科", "外科", "小児科", "歯科", "眼科" }));
        jComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxActionPerformed(evt);
            }
        });

        jScrollPane7.setViewportView(input_DoctorName);

        jLabel8.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel8.setText("医師名");

        jLabel11.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel11.setText("性別");

        jScrollPane10.setViewportView(input_DoctorGender);

        btnDoctorClear.setText("X");
        btnDoctorClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoctorClearActionPerformed(evt);
            }
        });

        jScrollPane11.setViewportView(input_DoctorSalary);

        jScrollPane9.setViewportView(searchInfoDoctor);

        jLabel10.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        jLabel10.setText("医師名");

        btnShowDoctor.setFont(new java.awt.Font("MS UI Gothic", 1, 12)); // NOI18N
        btnShowDoctor.setText("一覧");
        btnShowDoctor.setPreferredSize(new java.awt.Dimension(70, 21));
        btnShowDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowDoctorActionPerformed(evt);
            }
        });

        btnSearchDoctor.setFont(new java.awt.Font("MS UI Gothic", 1, 12)); // NOI18N
        btnSearchDoctor.setText("検索");
        btnSearchDoctor.setPreferredSize(new java.awt.Dimension(70, 21));
        btnSearchDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDoctorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDoctorInsert)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDoctorDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnDoctorUpdate)
                                .addGap(18, 18, 18)
                                .addComponent(btnDoctorClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearchDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnShowDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel8)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnDoctorInsert)
                                    .addComponent(btnDoctorDelete)
                                    .addComponent(btnDoctorUpdate)
                                    .addComponent(btnDoctorClear)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(jLabel10)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnShowDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSearchDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jComboBox, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel6.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        jLabel6.setText("医師の情報");

        jLabel3.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        jLabel3.setText("医師リスク");

        doctorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "医生ID", "医師名", "性別", "所属科室ID", "所属科室", "給与"
            }
        ));
        doctorTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctorTableMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(doctorTable);

        clickManagerView.setText("ファィル");
        clickManagerView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickManagerViewActionPerformed(evt);
            }
        });

        clickManager.setText("総合管理");
        clickManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickManagerActionPerformed(evt);
            }
        });
        clickManagerView.add(clickManager);

        clickLogout.setText("ログアウト");
        clickLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickLogoutActionPerformed(evt);
            }
        });
        clickManagerView.add(clickLogout);

        clickExit.setText("終了");
        clickExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickExitActionPerformed(evt);
            }
        });
        clickManagerView.add(clickExit);

        jMenuBar1.add(clickManagerView);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDoctorUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorUpdateActionPerformed
        // TODO add your handling code here:
        try {
            int row = doctorTable.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel) doctorTable.getModel();

            input_DoctorId.setEditable(false);

            String insertedId = input_DoctorId.getText();
            String insertedName = input_DoctorName.getText();
            String insertedGender = input_DoctorGender.getText();
            String insertedDepartmentId = input_DoctorDepartmentId.getText();
            String insertedSalary = input_DoctorSalary.getText();

            int IdNo = Integer.parseInt(insertedId);
            int departmentIdNo = Integer.parseInt(insertedDepartmentId);
            int salaryNo = Integer.parseInt(insertedSalary);

            Doctor dr = new Doctor();
            DoctorService doctorService = new DoctorService();

            dr.setId(IdNo);
            dr.setName(insertedName);
            dr.setGender(insertedGender);
            dr.setDepartmentId(departmentIdNo);
            dr.setSalary(salaryNo);

            int response = JOptionPane.showConfirmDialog(null, "変更確認お願いします。 ", "変更", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                try {
                    doctorService.updateDoctor(dr);
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Update Error!");
                }
            }
            clearDoctor();
            getListDoctor();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "給与は数字で記入お願いいたします。");
        }
    }//GEN-LAST:event_btnDoctorUpdateActionPerformed

    private void btnSearchDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchDoctorActionPerformed
        // TODO add your handling code here
        try {
            searchListDoctor();
        } catch (SQLException ex) {
            Logger.getLogger(DoctorView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSearchDoctorActionPerformed

    private void jComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxActionPerformed
        String item = (String) jComboBox.getSelectedItem();
        if (item.equals("内科")) {
            input_DoctorDepartmentId.setText("1");
        }
        if (item.equals("外科")) {
            input_DoctorDepartmentId.setText("2");
        }
        if (item.equals("小児科")) {
            input_DoctorDepartmentId.setText("3");
        }
        if (item.equals("歯科")) {
            input_DoctorDepartmentId.setText("4");
        }
        if (item.equals("眼科")) {
            input_DoctorDepartmentId.setText("5");
        }
        if (item.equals("")) {
            input_DoctorDepartmentId.setText("");
        }

    }//GEN-LAST:event_jComboBoxActionPerformed

    private void btnShowDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowDoctorActionPerformed
        // TODO add your handling code here:
        getListDoctor();
    }//GEN-LAST:event_btnShowDoctorActionPerformed

    private void btnDoctorClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorClearActionPerformed
        // TODO add your handling code here:
        jComboBox.setSelectedItem("");
        clearDoctor();
    }//GEN-LAST:event_btnDoctorClearActionPerformed

    private void btnDoctorInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorInsertActionPerformed
        // TODO add your handling code here:
        try {
            String insertedId = input_DoctorId.getText();
            String insertedName = input_DoctorName.getText();
            String insertedGender = input_DoctorGender.getText();
            String insertedDepartmentId = input_DoctorDepartmentId.getText();
            String insertedSalary = input_DoctorSalary.getText();

            int IdNo = Integer.parseInt(insertedId);
            int DepartmentIdNo = Integer.parseInt(insertedDepartmentId);
            int salaryNo = Integer.parseInt(insertedSalary);

            Doctor dr = new Doctor();
            DoctorService doctorService = new DoctorService();
            dr.setId(IdNo);
            dr.setName(insertedName);
            dr.setGender(insertedGender);
            dr.setDepartmentId(DepartmentIdNo);
            dr.setSalary(salaryNo);

            int response = JOptionPane.showConfirmDialog(null, "新規登録確認お願いします。 ", "登録", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (response == JOptionPane.YES_OPTION) {
                try {
                    doctorService.insertDoctor(dr);
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "医師ID存在しています!他のIDを入力して下さい。");
                }
                clearDoctor();
                getListDoctor();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "給与は数字で記入お願いいたします。");
        }


    }//GEN-LAST:event_btnDoctorInsertActionPerformed

    private void doctorTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorTableMouseClicked
        // TODO add your handling code here:
        int row = doctorTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) doctorTable.getModel();

        input_DoctorId.setEditable(false);
        input_DoctorId.setText(model.getValueAt(row, 0).toString());
        input_DoctorName.setText(model.getValueAt(row, 1).toString());
        input_DoctorGender.setText(model.getValueAt(row, 2).toString());
        input_DoctorDepartmentId.setText(model.getValueAt(row, 3).toString());
        jComboBox.setSelectedItem(model.getValueAt(row, 4).toString());
        input_DoctorSalary.setText(model.getValueAt(row, 5).toString());
    }//GEN-LAST:event_doctorTableMouseClicked

    private void btnDoctorDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoctorDeleteActionPerformed
        // TODO add your handling code here:
        int row = doctorTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) doctorTable.getModel();

        Doctor dr = new Doctor();
        dr.setId((int) model.getValueAt(row, 0));

        DoctorService doctorService = new DoctorService();

        int response = JOptionPane.showConfirmDialog(null, "削除確認お願いします。 ", "削除", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            try {
                doctorService.deleteDoctor(dr);
            } catch (SQLException ex) {
            }
            clearDoctor();
            getListDoctor();
        }

    }//GEN-LAST:event_btnDoctorDeleteActionPerformed

    private void clickManagerViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickManagerViewActionPerformed
        // TODO add your handling code here:
        new ManagerView().setVisible(true);
    }//GEN-LAST:event_clickManagerViewActionPerformed

    private void clickExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickExitActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(null, "終了をよろしでしょうか。 ", "終了", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            System.exit(WIDTH);
        }
    }//GEN-LAST:event_clickExitActionPerformed

    private void clickManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickManagerActionPerformed
        JMenuItem btn = null;
        // TODO add your handling code here:
        new ManagerView(btn).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_clickManagerActionPerformed

    private void clickLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickLogoutActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(null, "ログアウトよろしでしょうか。 ", "ログアウト", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            new LoginView().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_clickLogoutActionPerformed

    public void getListDoctor() {
        searchInfoDoctor.setText("");
        ListDoctorService dr = new ListDoctorService();
        List<ListDoctor> drInfo = dr.selectAll();
        DefaultTableModel df = (DefaultTableModel) doctorTable.getModel();
        df.setRowCount(0);
        drInfo.forEach((p) -> {
            df.addRow(new Object[]{p.getDoctorId(), p.getDoctorName(), p.getDoctorGender(), p.getDepartmentId(), p.getDepartmentName(), p.getSalary()});
        });
    }

    public void clearDoctor() {
        input_DoctorId.setText("");
        input_DoctorId.setEditable(true);
        input_DoctorName.setText("");
        input_DoctorGender.setText("");
        input_DoctorDepartmentId.setText("");
        input_DoctorSalary.setText("");
    }

    public void searchListDoctor() throws SQLException {
        String keyword = searchInfoDoctor.getText();
        ListDoctorService doctor = new ListDoctorService();
        List<ListDoctor> searchDoctor = doctor.searchDoctor(keyword);
        DefaultTableModel df = (DefaultTableModel) doctorTable.getModel();
        df.setRowCount(0);
        searchDoctor.forEach((p) -> {
            df.addRow(new Object[]{p.getDoctorId(), p.getDoctorName(), p.getDoctorGender(), p.getDepartmentId(), p.getDepartmentName(), p.getSalary()});
        });
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
            java.util.logging.Logger.getLogger(DoctorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoctorClear;
    private javax.swing.JButton btnDoctorDelete;
    private javax.swing.JButton btnDoctorInsert;
    private javax.swing.JButton btnDoctorUpdate;
    private javax.swing.JButton btnSearchDoctor;
    private javax.swing.JButton btnShowDoctor;
    private javax.swing.JMenuItem clickExit;
    private javax.swing.JMenuItem clickLogout;
    private javax.swing.JMenuItem clickManager;
    private javax.swing.JMenu clickManagerView;
    private javax.swing.JTable doctorTable;
    private javax.swing.JTextPane input_DoctorDepartmentId;
    private javax.swing.JTextPane input_DoctorGender;
    private javax.swing.JTextPane input_DoctorId;
    private javax.swing.JTextPane input_DoctorName;
    private javax.swing.JTextPane input_DoctorSalary;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextPane jTextPane7;
    private javax.swing.JTextPane searchInfoDoctor;
    // End of variables declaration//GEN-END:variables
}
