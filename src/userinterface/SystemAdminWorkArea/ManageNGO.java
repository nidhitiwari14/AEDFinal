/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import Business.BusinessModel;
import Business.NGO.NGO;
import Business.Role.NgoAdminRole;
import Business.UserAccount.UserAccount;
import SendEmail.SendEmail;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nidhitiwari
 */
public class ManageNGO extends javax.swing.JPanel {

    /**
     * Creates new form ManageNGO
     */
    private JPanel userProcessContainer;
    private BusinessModel business;
    UserAccount user;
    
    public ManageNGO(JPanel userProcessContainer, BusinessModel business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        populateManageNGOTable();
        btnConfirm.setEnabled(false);
    }
    
    private void populateManageNGOTable() {
        DefaultTableModel model = (DefaultTableModel) tblManageNGO.getModel();
        
        model.setRowCount(0);
        
        for (UserAccount user : business.getUserAccountDirectory().getUserAccountList()) {
            
            for (NGO ngo:business.getNgoDirectory().getNGOList()) {
            if ("Business.Role.NgoAdminRole".equals(user.getRole().getClass().getName()) && ngo.getNgoAdminUserName().equals(user.getUsername())) {
                Object[] row = new Object[5];
               
                row[0] = user.getName();
                row[1] = user.getUsername();
                row[2] = user.getPassword();
                row[3] = ngo.getNgoContact();
                row[4] = ngo.getNgoAddress();
                
                model.addRow(row);
            }
            }
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblManageNGOTitle = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        lblNGOName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageNGO = new javax.swing.JTable();
        txtNGOName = new javax.swing.JTextField();
        lblNGOUsername = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        txtNGOUserName = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        lblNGOPassword = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        txtNGOPassword = new javax.swing.JTextField();
        lblNGOAddress = new javax.swing.JLabel();
        txtNGOAddress = new javax.swing.JTextField();
        lblNGOContact = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtNGOContact = new javax.swing.JTextField();

        lblManageNGOTitle.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        lblManageNGOTitle.setText("Manage NGO");

        btnSubmit.setBackground(new java.awt.Color(0, 153, 255));
        btnSubmit.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblNGOName.setText("NGO Name");

        tblManageNGO.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "NGO Name", "Username", "Password", "Contact", "Address"
            }
        ));
        jScrollPane1.setViewportView(tblManageNGO);

        lblNGOUsername.setText("Username");

        btnUpdate.setBackground(new java.awt.Color(0, 153, 255));
        btnUpdate.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnConfirm.setBackground(new java.awt.Color(0, 153, 255));
        btnConfirm.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        btnConfirm.setText("Confirm Update");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        lblNGOPassword.setText("Password");

        btnDelete.setBackground(new java.awt.Color(204, 51, 0));
        btnDelete.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblNGOAddress.setText("NGO Address");

        lblNGOContact.setText("NGO Contact");

        btnBack.setBackground(new java.awt.Color(0, 153, 255));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtNGOContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNGOContactActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBack)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnConfirm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelete)
                                .addGap(17, 17, 17))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNGOUsername)
                                    .addComponent(lblNGOName)
                                    .addComponent(lblNGOPassword)
                                    .addComponent(lblNGOContact)
                                    .addComponent(lblNGOAddress))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNGOName)
                                    .addComponent(txtNGOUserName)
                                    .addComponent(txtNGOPassword)
                                    .addComponent(txtNGOAddress)
                                    .addComponent(txtNGOContact, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(lblManageNGOTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnBack)
                .addGap(22, 22, 22)
                .addComponent(lblManageNGOTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNGOName)
                    .addComponent(txtNGOName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNGOUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNGOUsername))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNGOPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNGOPassword))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNGOAddress)
                    .addComponent(txtNGOAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNGOContact)
                    .addComponent(txtNGOContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addContainerGap(81, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String name = txtNGOName.getText();
        String username=txtNGOUserName.getText();
        String password=txtNGOPassword.getText();
        String address=txtNGOAddress.getText();
        String contact=txtNGOContact.getText();
        Pattern pattern = Pattern.compile("^[a-zA-Z'\\-\\s]+$");

        try {
            if(name==null || name.isEmpty()){

                throw new NullPointerException("Name cannot be empty");

            } else if (pattern.matcher(name).find() == false){

                throw new Exception("Please enter valid  Name");

            }
        } catch(NullPointerException e){

            JOptionPane.showMessageDialog(null, "Name is empty");

            return;

        } catch (Exception e){

            JOptionPane.showMessageDialog(null, "Name is invalid");

            return;
        }

        try {
            if(username==null || username.isEmpty()){

                throw new NullPointerException("User Name cannot be empty");

            } else if (username.length()<3){
                throw new Exception("Please enter valid User Name");

            }
        } catch(NullPointerException e){

            JOptionPane.showMessageDialog(null, "User Name is Empty");

            return;

        }catch (Exception e){

            JOptionPane.showMessageDialog(null, "User Name is invalid");

            return;
        }

        try {

            if(password==null || password.isEmpty()){

                throw new NullPointerException("Password cannot be empty");

            } else if (Pattern.matches("^(?=(.*[a-z]){1,})(?=(.*[\\d]){1,})(?=(.*[\\W]){1,})(?!.*\\s).{5,30}$", password)==false){

                throw new Exception("Invalid Password");
            }

        }  catch(NullPointerException e){

            JOptionPane.showMessageDialog(null, "Password is Empty");

            return;
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Password is invalid");

            return;
        }

        if (business.getUserAccountDirectory().checkIfUsernameIsUnique(username)==false) {
            JOptionPane.showMessageDialog(null,"User Name already exists ");
        }else{

            UserAccount ua1 =business.getUserAccountDirectory().createUserAccount(name,username,password,null, new NgoAdminRole());
            NGO ngo= business.getNgoDirectory().createNGOInfo(name, username, address, contact);
            populateManageNGOTable();
            SendEmail se = new SendEmail(username, "NGO Registration");
            se.sendEmailToUsers(username, "NGO Registration");
            JOptionPane.showMessageDialog(null,"Email has been sent to give Username. Please check");

            txtNGOName.setText("");
            txtNGOUserName.setText("");
            txtNGOPassword.setText("");
            txtNGOAddress.setText("");
            txtNGOContact.setText("");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectRow = tblManageNGO.getSelectedRow();

        if(selectRow>=0){
            String username= (String) tblManageNGO.getValueAt(selectRow, 1);
            String pwd= (String) tblManageNGO.getValueAt(selectRow, 2);
            user=business.getUserAccountDirectory().authenticateUser(username, pwd);

            txtNGOName.setText(user.getName()+"");
            txtNGOUserName.setText(user.getUsername()+"");
            txtNGOPassword.setText(user.getPassword()+"");

        }
        else {
            JOptionPane.showMessageDialog(null,"Please select a row");
        }

        btnSubmit.setEnabled(false);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        btnConfirm.setEnabled(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        String name = txtNGOName.getText();
        String username=txtNGOUserName.getText();
        String password=txtNGOPassword.getText();

        Pattern pattern = Pattern.compile("^[a-zA-Z'\\-\\s]+$");

        try {
            if(name==null || name.isEmpty()){

                throw new NullPointerException("Name cannot be empty");

            } else if (pattern.matcher(name).find() == false){

                throw new Exception("Please enter valid  Name");

            }
        } catch(NullPointerException e){

            JOptionPane.showMessageDialog(null, "Name is empty");

            return;

        } catch (Exception e){

            JOptionPane.showMessageDialog(null, "Name is invalid");

            return;
        }

        try {
            if(username==null || username.isEmpty()){

                throw new NullPointerException("User Name cannot be empty");

            } else if (username.length()<3){
                throw new Exception("Please enter valid User Name");

            }
        } catch(NullPointerException e){

            JOptionPane.showMessageDialog(null, "User Name is Empty");

            return;

        }catch (Exception e){

            JOptionPane.showMessageDialog(null, "User Name is invalid");

            return;
        }

        business.getUserAccountDirectory().updateUserAccount(user,name,username,password);
        populateManageNGOTable();
        btnSubmit.setEnabled(true);
        btnDelete.setEnabled(true);
        btnUpdate.setEnabled(true);
        btnConfirm.setEnabled(false);
        txtNGOName.setText("");
        txtNGOUserName.setText("");
        txtNGOPassword.setText("");
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblManageNGO.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Confirm Delete ? ","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                String username= (String) tblManageNGO.getValueAt(selectedRow, 1);
                String pwd= (String) tblManageNGO.getValueAt(selectedRow, 2);
                UserAccount user=business.getUserAccountDirectory().authenticateUser(username, pwd);

                business.getUserAccountDirectory().deleteUserAccount(user);
                //                business.getCustomerDirectory().deleteCustomer(user.getUsername());
                business.getNgoDirectory().deleteNGO(username);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row to delete!");
        }
        populateManageNGOTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtNGOContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNGOContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNGOContactActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageNGOTitle;
    private javax.swing.JLabel lblNGOAddress;
    private javax.swing.JLabel lblNGOContact;
    private javax.swing.JLabel lblNGOName;
    private javax.swing.JLabel lblNGOPassword;
    private javax.swing.JLabel lblNGOUsername;
    private javax.swing.JTable tblManageNGO;
    private javax.swing.JTextField txtNGOAddress;
    private javax.swing.JTextField txtNGOContact;
    private javax.swing.JTextField txtNGOName;
    private javax.swing.JTextField txtNGOPassword;
    private javax.swing.JTextField txtNGOUserName;
    // End of variables declaration//GEN-END:variables
}
