/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.woon;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.JTextComponent;

/**
 *
 * @author eusea
 */
public class PreferencesDialog extends javax.swing.JDialog {

    DefaultListModel model = new DefaultListModel();
    boolean isChangesMade;
    int previousEmployeeIndex = -1;

    /**
     * Creates new form PreferencesDialog
     */
    public PreferencesDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        refreshEmployeeList();

        DocumentListener textChangedListener = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                setDirty();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                setDirty();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                setDirty();
            }

            public void setDirty() {
                if (isChangesMade == false) {
                    isChangesMade = true;
                    setTitle(getTitle() + " *");
                }
            }
        };

        try {
            for (JTextField textBox : ReflectionUtil.getComponentsByType(JTextField.class, this)) {
                textBox.getDocument().addDocumentListener(textChangedListener);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void refreshEmployeeList() {
        setTitle("Employee Profiles");
        model.clear();
        for (EmployeeData employeeData : LoginFrame.employeeList) {
            model.addElement(employeeData.getUsername());
        }
        clearInputs();
        setInputsEnabeld(false);
        lbEmployees.setModel(model);
    }

    void clearInputs() {
        isChangesMade = true;
        try {
            for (JTextField textInput : ReflectionUtil.getComponentsByType(JTextField.class, this)) {
                textInput.setText("");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        txtPassword.setText("");
        isChangesMade = false;
    }

    void setInputsEnabeld(boolean enabled) {
        try {
            for (JTextField textInput : ReflectionUtil.getComponentsByType(JTextField.class, this)) {
                textInput.setEnabled(enabled);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        txtPassword.setEnabled(enabled);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        lbEmployees = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtFirstname = new javax.swing.JTextField();
        txtLastname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        cbShowPassword = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Employee Profiles");

        jPanel1.setPreferredSize(new java.awt.Dimension(960, 540));

        jScrollPane2.setPreferredSize(new java.awt.Dimension(200, 147));

        lbEmployees.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbEmployees.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lbEmployees.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lbEmployees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbEmployeesMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(lbEmployees);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Firstname");

        txtFirstname.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        txtLastname.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Lastname");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Username");

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Password");

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Email");

        btnSave.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSave.setText("Save");
        btnSave.setPreferredSize(new java.awt.Dimension(150, 50));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        cbShowPassword.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cbShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbShowPasswordActionPerformed(evt);
            }
        });

        jPanel2.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdd);

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnDelete.setText("Remove");
        btnDelete.setPreferredSize(new java.awt.Dimension(150, 50));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel2.add(btnDelete);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLastname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtFirstname, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEmail)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 604, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbShowPassword)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPassword)
                            .addComponent(cbShowPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbEmployeesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEmployeesMouseReleased
        if (isChangesMade) {
            int response = JOptionPane.showConfirmDialog(this, "You have made changes, discard changes?", "Info", JOptionPane.OK_CANCEL_OPTION);
            if (response == JOptionPane.CANCEL_OPTION) {
                lbEmployees.setSelectedIndex(previousEmployeeIndex);
                return;
            }
        }

        isChangesMade = true;

        if (lbEmployees.getSelectedIndex() >= 0) {
            String employeeUsername = lbEmployees.getSelectedValue();
            setTitle(employeeUsername + " - Employee Profiles");
            if (lbEmployees.getSelectedIndex() > LoginFrame.employeeList.size() - 1) {
                txtFirstname.setText("");
                txtLastname.setText("");
                txtPassword.setText("");
                txtUsername.setText("New Employee");
                txtEmail.setText("");
            } else {
                EmployeeData selectedEmployee = LoginFrame.employeeList.get(lbEmployees.getSelectedIndex());
                txtFirstname.setText(selectedEmployee.getFirstName());
                txtLastname.setText(selectedEmployee.getLastName());
                txtPassword.setText(selectedEmployee.getPassword());
                txtUsername.setText(selectedEmployee.getUsername());
                txtEmail.setText(selectedEmployee.getEmail());
            }
            setInputsEnabeld(true);
        }
        previousEmployeeIndex = lbEmployees.getSelectedIndex();
        isChangesMade = false;
    }//GEN-LAST:event_lbEmployeesMouseReleased

    private void cbShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbShowPasswordActionPerformed
        txtPassword.setEchoChar((cbShowPassword.isSelected()) ? '\u0000' : '\u2022');
    }//GEN-LAST:event_cbShowPasswordActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (txtUsername.getText().trim().isBlank() || String.valueOf(txtPassword.getPassword()).trim().isBlank()) {
            JOptionPane.showMessageDialog(this, "Please input atleast a username and password for the employee profile", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (lbEmployees.getSelectedIndex() > LoginFrame.employeeList.size() - 1) {
            if (LoginFrame.employeeList.stream().anyMatch((t) -> {
                EmployeeData employeeData = (EmployeeData) t;
                return employeeData.getUsername().equals(txtUsername.getText().trim());
            })) {
                JOptionPane.showMessageDialog(this, "An employee with the same username already exists!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            LoginFrame.employeeList.add(lbEmployees.getSelectedIndex(),
                    new EmployeeData(String.valueOf(txtPassword.getPassword()).trim(),
                            txtUsername.getText().trim(), txtFirstname.getText().trim(),
                            txtLastname.getText().trim(), txtEmail.getText().trim()));
        } else {
            LoginFrame.employeeList.set(lbEmployees.getSelectedIndex(),
                    new EmployeeData(String.valueOf(txtPassword.getPassword()).trim(),
                            txtUsername.getText().trim(), txtFirstname.getText().trim(),
                            txtLastname.getText().trim(), txtEmail.getText().trim()));
        }
        SaveData.saveEmployeeData();

        JOptionPane.showMessageDialog(this,
                "Successfully saved new employee profile", "Info", JOptionPane.INFORMATION_MESSAGE);
        refreshEmployeeList();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (lbEmployees.getSelectedIndex() > LoginFrame.employeeList.size() - 1) {
            model.removeElementAt(lbEmployees.getSelectedIndex());
        } else {
            int response = JOptionPane.showConfirmDialog(this, "Are you sure you want to remove this employee profile?", "Alert", JOptionPane.OK_CANCEL_OPTION);
            if (response == JOptionPane.OK_OPTION) {
                LoginFrame.employeeList.remove(lbEmployees.getSelectedIndex());
            }
        }
        refreshEmployeeList();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        model.addElement("New Employee");
    }//GEN-LAST:event_btnAddActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAdd;
    public javax.swing.JButton btnDelete;
    public javax.swing.JButton btnSave;
    public javax.swing.JCheckBox cbShowPassword;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JList<String> lbEmployees;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtFirstname;
    public javax.swing.JTextField txtLastname;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
