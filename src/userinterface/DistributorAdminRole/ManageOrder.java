/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DistributorAdminRole;

import Business.BusinessModel;
import Business.DiscardedItem.DiscardedItemDirectory;
import Business.UserAccount.UserAccount;
import Business.Warehouse.Warehouse;
import Business.Warehouse.WarehouseDirectory;
import Business.WarehouseOrder.WarehouseOrder;
import Business.WarehouseOrder.WarehouseOrderDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nidhitiwari
 */
public class ManageOrder extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private UserAccount account;
    private BusinessModel business;
    private WarehouseDirectory warehouseDirectory;
    private DiscardedItemDirectory restaurantMenuDirectory;
    private WarehouseOrderDirectory warehouseOrderDirectory;

    /**
     * Creates new form ManageWarehouseOrder
     */ 
    public ManageOrder(
            JPanel userProcessContainer,
            UserAccount account, 
            BusinessModel business
    ) {
        initComponents();
        
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.account = account;
        populateTable();
    }
    
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) ManageOrdersTbl.getModel();
        
        model.setRowCount(0);
        
       
        for (Warehouse ware:business.getWarehouseDirectory().getWarehouseList()) {
           
            if (ware.getAdminUserName().equals(account.getUsername())) {
               for(WarehouseOrder order:ware.getOrderList()){
                Object[] row = new Object[5];
                row[0] = order;
                row[1] = order.getCustomerName();
                row[2] = order.getDeliveryAddress();
                row[3] = order.getPrice();
                row[4] = order.getStatus();
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

        jScrollPane1 = new javax.swing.JScrollPane();
        ManageOrdersTbl = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnAcceptOrder = new javax.swing.JButton();
        btnRejectOrder = new javax.swing.JButton();

        ManageOrdersTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Order Id", "Customer Name", "Address", "Price", "Status"
            }
        ));
        jScrollPane1.setViewportView(ManageOrdersTbl);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        jLabel2.setText("Warehouse Admin Role: Manage Orders  ");

        btnBack.setBackground(new java.awt.Color(0, 153, 255));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAcceptOrder.setBackground(new java.awt.Color(0, 153, 255));
        btnAcceptOrder.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        btnAcceptOrder.setText("Accept Order");
        btnAcceptOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptOrderActionPerformed(evt);
            }
        });

        btnRejectOrder.setBackground(new java.awt.Color(0, 153, 255));
        btnRejectOrder.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        btnRejectOrder.setText("Reject Order");
        btnRejectOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 988, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnBack)
                            .addGap(187, 187, 187)
                            .addComponent(jLabel2))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAcceptOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnRejectOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(147, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(jLabel2))
                        .addComponent(btnBack))
                    .addGap(47, 47, 47)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAcceptOrder)
                        .addComponent(btnRejectOrder))
                    .addContainerGap(171, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAcceptOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptOrderActionPerformed
        // TODO add your handling code here:
        int selectedRow = ManageOrdersTbl.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table");
        }
        else{
            WarehouseOrder order  = (WarehouseOrder)ManageOrdersTbl.getValueAt(selectedRow, 0);
            if(order.getStatus().equals("Ready to Deliver")|| order.getStatus().equals("Order Rejected")){
                JOptionPane.showMessageDialog(null,"Check order status");
            }else{
                ManageOrderDetails viewOrder=new ManageOrderDetails(userProcessContainer,account,order,business);
                userProcessContainer.add("View Order",viewOrder);
                CardLayout layout=(CardLayout)userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }
    }//GEN-LAST:event_btnAcceptOrderActionPerformed

    private void btnRejectOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectOrderActionPerformed
        // TODO add your handling code here:
        int selectedRow = ManageOrdersTbl.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            WarehouseOrder order  = (WarehouseOrder)ManageOrdersTbl.getValueAt(selectedRow, 0);
            order.setStatus("Reject");
            populateTable();
        }
    }//GEN-LAST:event_btnRejectOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ManageOrdersTbl;
    private javax.swing.JButton btnAcceptOrder;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRejectOrder;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}