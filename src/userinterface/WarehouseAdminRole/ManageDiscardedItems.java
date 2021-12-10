/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.WarehouseAdminRole;

import Business.BusinessModel;
import Business.DiscardedItem.DiscardedItem;
import Business.UserAccount.UserAccount;
import Business.Warehouse.Warehouse;
import java.awt.CardLayout;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nidhitiwari
 */
public class ManageDiscardedItems extends javax.swing.JPanel {
    DiscardedItem item;
    JPanel userProcessContainer;
    BusinessModel business;
   
    UserAccount account;
    /**
     * Creates new form ManageDiscardedItems
     */
    public ManageDiscardedItems() {
        initComponents();
    }
    
    public ManageDiscardedItems(JPanel userProcessContainer,UserAccount account, BusinessModel business) {
        initComponents();
        this.account=account;
        this.business=business;
        this.userProcessContainer=userProcessContainer;
        populateItemTable();
    }
    
    private void populateItemTable() {
        DefaultTableModel model = (DefaultTableModel) tblItem.getModel();
        
        model.setRowCount(0);
        
        for (Warehouse ware:business.getWarehouseDirectory().getWarehouseList()) {
           
            if (ware.getAdminUserName().equals(account.getUsername())) {
                
               for(DiscardedItem item:ware.getItem()){
                Object[] row = new Object[2];
                row[0] = item.getItemName();
                row[1] = item.getPrice();
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

        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblWarehouseItems = new javax.swing.JLabel();
        lblItemName = new javax.swing.JLabel();
        lblItemPrice = new javax.swing.JLabel();
        txtItemName = new javax.swing.JTextField();
        txtItemPrice = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblItem = new javax.swing.JTable();

        btnDelete.setBackground(new java.awt.Color(255, 0, 51));
        btnDelete.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 153, 255));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblWarehouseItems.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        lblWarehouseItems.setText("Add Discarded Items");

        lblItemName.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        lblItemName.setText("Item Name");

        lblItemPrice.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        lblItemPrice.setText("Price");

        txtItemPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemPriceActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(0, 153, 255));
        btnSave.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        tblItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Item Name", "Price"
            }
        ));
        jScrollPane1.setViewportView(tblItem);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(lblWarehouseItems, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDelete)
                    .addComponent(btnBack)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblItemName)
                            .addComponent(lblItemPrice))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addGap(17, 17, 17)
                .addComponent(lblWarehouseItems)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblItemName))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItemPrice)
                    .addComponent(txtItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(btnDelete)
                .addContainerGap(81, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblItem.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Confirm delete ?","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){

                for(Warehouse ware:business.getWarehouseDirectory().getWarehouseList()){
                    if(ware.getAdminUserName().equals(account.getUsername())){
                        business.getWarehouseDirectory().DeleteItems(ware, item);
                    }
                }
                populateItemTable();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtItemPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemPriceActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String name=txtItemName.getText();
        Double price=Double.parseDouble(txtItemPrice.getText());

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
            if(price==null){

                throw new NullPointerException("Item Price cannot be empty");

            } else if (price==0) {

                throw new Exception("Item Price cannot be zero");
            }

        } catch(NullPointerException e) {

            JOptionPane.showMessageDialog(null, "Item Price is Empty");

            return;

        } catch(Exception e) {

            JOptionPane.showMessageDialog(null, "Item Price is zero");

            return;
        }

        for(Warehouse ware:business.getWarehouseDirectory().getWarehouseList()){
            if(ware.getAdminUserName().equals(account.getUsername())){
                item=business.getWarehouseDirectory().AddDiscardedItems(ware, name, price);
            }
        }

        txtItemName.setText("");
        txtItemPrice.setText("");
        populateItemTable();

    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblItemName;
    private javax.swing.JLabel lblItemPrice;
    private javax.swing.JLabel lblWarehouseItems;
    private javax.swing.JTable tblItem;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtItemPrice;
    // End of variables declaration//GEN-END:variables
}