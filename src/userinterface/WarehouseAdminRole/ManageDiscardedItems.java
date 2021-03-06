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
                Object[] row = new Object[3];
                row[0] = item.getItemName();
                row[1] = item.getPrice();
                row[2] = item.getQuantity();
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
        lblItemQuantity = new javax.swing.JLabel();
        txtItemQuantity = new javax.swing.JTextField();

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

        lblWarehouseItems.setFont(new java.awt.Font("Times New Roman", 1, 32)); // NOI18N
        lblWarehouseItems.setText("Add Discarded Items");

        lblItemName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblItemName.setText("Item Name:");

        lblItemPrice.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblItemPrice.setText("Price:");

        txtItemPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemPriceActionPerformed(evt);
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

        tblItem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Item Name", "Price", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(tblItem);

        lblItemQuantity.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblItemQuantity.setText("Quantity:");

        txtItemQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemQuantityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblWarehouseItems, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(111, 111, 111)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblItemName)
                                        .addComponent(lblItemPrice)
                                        .addComponent(lblItemQuantity))
                                    .addGap(46, 46, 46)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtItemQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(84, 84, 84))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblWarehouseItems)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblItemName))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblItemPrice))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItemQuantity)
                    .addComponent(txtItemQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
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

    private void txtItemPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemPriceActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String name=txtItemName.getText();
        Double price=Double.parseDouble(txtItemPrice.getText());
        String quantity=txtItemQuantity.getText();

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
                item=business.getWarehouseDirectory().AddDiscardedItems(ware, name, price, quantity);
            }
        }

        txtItemName.setText("");
        txtItemPrice.setText("");
        txtItemQuantity.setText("");
        populateItemTable();

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtItemQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemQuantityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblItemName;
    private javax.swing.JLabel lblItemPrice;
    private javax.swing.JLabel lblItemQuantity;
    private javax.swing.JLabel lblWarehouseItems;
    private javax.swing.JTable tblItem;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtItemPrice;
    private javax.swing.JTextField txtItemQuantity;
    // End of variables declaration//GEN-END:variables
}
