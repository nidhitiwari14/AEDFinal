/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NgoAdminRole;

import Business.BusinessModel;
import Business.NGO.NGO;
import Business.Org.Org;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nidhitiwari
 */
public class ManageOrg extends javax.swing.JPanel {
    
    Org org;
    JPanel userProcessContainer;
    BusinessModel business;
   
    UserAccount account;
    /**
     * Creates new form ManageOrg
     */
    public ManageOrg() {
        initComponents();
    }
    
    public ManageOrg(JPanel userProcessContainer,UserAccount account, BusinessModel business) {
        initComponents();
        this.account=account;
        this.business=business;
        this.userProcessContainer=userProcessContainer;
        populateOrgTable();
    }
    
    private void populateOrgTable() {
        DefaultTableModel model = (DefaultTableModel) tblOrg.getModel();
        
        model.setRowCount(0);
        
        for (NGO ngo:business.getNgoDirectory().getNGOList()) {
           
            if (ngo.getNgoAdminUserName().equals(account.getUsername())) {
                
               for(Org org:ngo.getOrg()){
                Object[] row = new Object[2];
                row[0] = org.getOrgName();
                row[1] = org.getOrgAddress();
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

        lblOrgName = new javax.swing.JLabel();
        lblOrgAddress = new javax.swing.JLabel();
        txtOrgName = new javax.swing.JTextField();
        txtOrgAddress = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrg = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblWarehouseItems = new javax.swing.JLabel();

        lblOrgName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblOrgName.setText("Organization Name");

        lblOrgAddress.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblOrgAddress.setText("Organization Address");

        txtOrgName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrgNameActionPerformed(evt);
            }
        });

        txtOrgAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrgAddressActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(0, 153, 255));
        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setText("Save");
        btnSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        tblOrg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Organization Name", "Price"
            }
        ));
        jScrollPane1.setViewportView(tblOrg);

        btnDelete.setBackground(new java.awt.Color(255, 0, 51));
        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 153, 255));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblWarehouseItems.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        lblWarehouseItems.setText("Add Organizations");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblOrgName)
                                    .addComponent(lblOrgAddress))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtOrgName, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOrgAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addComponent(lblWarehouseItems, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(87, 87, 87))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblWarehouseItems)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrgName)
                    .addComponent(txtOrgName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrgAddress)
                    .addComponent(txtOrgAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtOrgAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrgAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrgAddressActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String name=txtOrgName.getText();
        String address=txtOrgAddress.getText();

        Pattern pattern = Pattern.compile("^[a-zA-Z'\\-\\s]+$");

        try {
            if(name==null || name.isEmpty()){

                throw new NullPointerException("Item Name cannot be empty");

            } else if (pattern.matcher(name).find() == false){

                throw new Exception("Please enter valid Item Name");

            }
        } catch(NullPointerException e){

            JOptionPane.showMessageDialog(null, "Item Name is empty");

            return;

        } catch (Exception e){

            JOptionPane.showMessageDialog(null, "Item Name is invalid");

            return;
        }
        
        try {
            if(address==null || address.isEmpty()){

                throw new NullPointerException("Address cannot be empty");

            } else if (pattern.matcher(address).find() == false){

                throw new Exception("Please enter valid Address");

            }
        } catch(NullPointerException e){

            JOptionPane.showMessageDialog(null, "Address is empty");

            return;

        } catch (Exception e){

            JOptionPane.showMessageDialog(null, "Address is invalid");

            return;
        }

        for(NGO ngo:business.getNgoDirectory().getNGOList()){
            if(ngo.getNgoAdminUserName().equals(account.getUsername())){
                org=business.getNgoDirectory().AddOrg(ngo, name, address);
            }
        }

        txtOrgName.setText("");
        txtOrgAddress.setText("");
        populateOrgTable();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblOrg.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Selected Org will be deleted ?","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){

                for(NGO ngo:business.getNgoDirectory().getNGOList()){
                    if(ngo.getNgoAdminUserName().equals(account.getUsername())){
                        business.getNgoDirectory().DeleteOrg(ngo, org);
                    }
                }
                populateOrgTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a Row!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtOrgNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrgNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrgNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOrgAddress;
    private javax.swing.JLabel lblOrgName;
    private javax.swing.JLabel lblWarehouseItems;
    private javax.swing.JTable tblOrg;
    private javax.swing.JTextField txtOrgAddress;
    private javax.swing.JTextField txtOrgName;
    // End of variables declaration//GEN-END:variables
}
