/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.BusinessModel;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author nidhitiwari
 */
public class SystemAdminRole extends Role {
    
        public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, BusinessModel system) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
    }
}
