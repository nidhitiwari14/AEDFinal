/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NgoAdminRole;

import Business.BusinessModel;
import Business.DeliveryMan.DeliveryMan;
import Business.NGO.NGO;
import Business.UserAccount.UserAccount;
import Business.Volunteer.Volunteer;
import Business.WarehouseOrder.WarehouseOrder;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nidhitiwari
 */
public class VolunteerAssign extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount account;
    WarehouseOrder order;
    BusinessModel business;
    String orgName;
    /**
     * Creates new form VolunteerAssign
     */
    
    public VolunteerAssign(JPanel userProcessContainer, UserAccount account, WarehouseOrder order, BusinessModel business, String orgName) {
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.order = order;
        this.business = business;
        this.orgName = orgName;
        System.out.print("orgName " + orgName);
        initComponents();
        populateOrderVolunteerTable();
    }
    
    private void populateOrderVolunteerTable() {
        jLabel1.setText("Order ID:"+ order.getOrderID());
        DefaultTableModel model = (DefaultTableModel) tblVolunteerAssign.getModel();
        
        model.setRowCount(0);
        
        for(Volunteer volt:business.getVolunteerDirectory().getVolunteerList()){
               Object[] row = new Object[1];
                row[0] = volt; 
                model.addRow(row);
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

        btnAssignOrder = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVolunteerAssign = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblAssignDeliveryMan = new javax.swing.JLabel();

        btnAssignOrder.setBackground(new java.awt.Color(0, 153, 255));
        btnAssignOrder.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        btnAssignOrder.setText("Assign Order to Deliver");
        btnAssignOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignOrderActionPerformed(evt);
            }
        });

        tblVolunteerAssign.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Volunteer Name"
            }
        ));
        jScrollPane1.setViewportView(tblVolunteerAssign);

        btnBack.setBackground(new java.awt.Color(0, 153, 255));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        jLabel1.setText("<value>");

        lblAssignDeliveryMan.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        lblAssignDeliveryMan.setText("Volunteer Assignation");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addContainerGap(689, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAssignDeliveryMan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)))
                        .addGap(78, 78, 78))))
            .addGroup(layout.createSequentialGroup()
                .addGap(272, 272, 272)
                .addComponent(btnAssignOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAssignDeliveryMan)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAssignOrder)
                .addContainerGap(315, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignOrderActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblVolunteerAssign.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table");
        }
        else
        {

            Volunteer volt  = (Volunteer)tblVolunteerAssign.getValueAt(selectedRow, 0);
            volt.getOrderList().add(order);
            order.setStatus("Assigned to Volunteeer");
            order.setOrgName(orgName);

//            for(NGO ngo:business.getNgoDirectory().getNGOList()){
//                System.out.print("order.getNgoName() " + order.getNgoName());
//                System.out.print("order.getNgoName() " + ngo.getUsername());
//                System.out.print("orgName " + orgName);
//                if(order.getNgoName().equals(ngo.getUsername())){
//                    for(WarehouseOrder order : ngo.getOrderList()){
//                        order.setStatus("Assigned to Volunteer");
//                        order.setOrgName(orgName);
//                    }
//                }
//            }
            userProcessContainer.remove(this);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);

        }
    }//GEN-LAST:event_btnAssignOrderActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignOrder;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAssignDeliveryMan;
    private javax.swing.JTable tblVolunteerAssign;
    // End of variables declaration//GEN-END:variables
}
