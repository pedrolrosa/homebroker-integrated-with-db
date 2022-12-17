/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import control.AccountController;
import control.UserController;
import javax.swing.JOptionPane;
import model.enums.TypeUser;

/**
 *
 * @author pedro
 */
public class UserScreen extends javax.swing.JFrame {
    
    /**
     * Creates new form Account
     */
    public UserScreen() {
        initComponents();
        
        UserController.refresh();

        nameInLabel.setText(UserController.logued.getName());
        cpfInLabel.setText(UserController.logued.getCpf());
        addressInLabel.setText(UserController.logued.getAddress());
        phoneInLabel.setText(UserController.logued.getPhone());

        startInLabel.setText(UserController.logued.getStart().toString());
        if(UserController.logued.getModify() != null){
            modifyInLabel.setText(UserController.logued.getModify().toString());
        }

        typeInLabel.setText(UserController.logued.getType().name());
        
        if(UserController.logued.getType().equals(TypeUser.COMMOM)){
            admButton.setEnabled(false);
        }
        
        if(!(AccountController.acess(UserController.logued.getId()))){
            if(JOptionPane.showConfirmDialog(this,"User does not have an account, do you want to create one?") ==  JOptionPane.YES_OPTION){

                if(AccountController.create(UserController.logued.getId())){

                    if(AccountController.acess(UserController.logued.getId())){
                        UserController.coupling(AccountController.current.getId(), UserController.logued.getId());
                        JOptionPane.showMessageDialog(this, "Create Sucess !");
                        acessAccountButton.setEnabled(true);
                    }

                } else {
                    acessAccountButton.setEnabled(false);
                }
            } else {
                acessAccountButton.setEnabled(false);
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

        infoAccountPanel = new javax.swing.JPanel();
        nameInLabel = new javax.swing.JTextField();
        cpfInLabel = new javax.swing.JTextField();
        addressInLabel = new javax.swing.JTextField();
        phoneInLabel = new javax.swing.JTextField();
        typeInLabel = new javax.swing.JTextField();
        startInLabel = new javax.swing.JTextField();
        modifyInLabel = new javax.swing.JTextField();
        vascoToken = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        acessAccountButton = new javax.swing.JButton();
        admButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameLabel.setText("Name:");

        cpfLabel.setText("Cpf:");

        addressLabel.setText("Address:");

        phoneLabel.setText("Phone:");

        nameInLabel.setEditable(false);

        cpfInLabel.setEditable(false);

        addressInLabel.setEditable(false);

        phoneInLabel.setEditable(false);

        startLabel.setText("Start");

        modifyLabel.setText("Modify");

        typeInLabel.setEditable(false);
        typeInLabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        startInLabel.setEditable(false);

        modifyInLabel.setEditable(false);

        javax.swing.GroupLayout infoAccountPanelLayout = new javax.swing.GroupLayout(infoAccountPanel);
        infoAccountPanel.setLayout(infoAccountPanelLayout);
        infoAccountPanelLayout.setHorizontalGroup(
            infoAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoAccountPanelLayout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(infoAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(infoAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(infoAccountPanelLayout.createSequentialGroup()
                            .addGroup(infoAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(addressLabel)
                                .addComponent(phoneLabel))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(infoAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(phoneInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addressInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoAccountPanelLayout.createSequentialGroup()
                            .addComponent(cpfLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cpfInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(infoAccountPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameInLabel)))
                .addGap(92, 92, 92)
                .addGroup(infoAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startLabel)
                    .addComponent(modifyLabel)
                    .addComponent(startInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifyInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(typeInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );
        infoAccountPanelLayout.setVerticalGroup(
            infoAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoAccountPanelLayout.createSequentialGroup()
                .addGroup(infoAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(infoAccountPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(infoAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(infoAccountPanelLayout.createSequentialGroup()
                                    .addGap(84, 84, 84)
                                    .addComponent(modifyInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(infoAccountPanelLayout.createSequentialGroup()
                                    .addComponent(startLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(startInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(modifyLabel)))
                            .addComponent(typeInLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(infoAccountPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(infoAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameLabel)
                            .addComponent(nameInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infoAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cpfInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpfLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infoAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addressInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(infoAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneLabel)
                            .addComponent(phoneInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49))
        );

        vascoToken.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        vascoToken.setText("all rigths reserved to vascoToken");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        acessAccountButton.setText("Acess Account");
        acessAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acessAccountButtonActionPerformed(evt);
            }
        });

        admButton.setText("Administrator");
        admButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(acessAccountButton, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(admButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(152, 152, 152))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(admButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(acessAccountButton)
                .addGap(42, 42, 42))
        );

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/socrates.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 200));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(235, 235, 235)
                        .addComponent(vascoToken)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(infoAccountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(infoAccountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addContainerGap())
                    .addComponent(vascoToken, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void acessAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acessAccountButtonActionPerformed
        AccountController.setNameLabel(UserController.logued.getName());
        AcessAccountScreen acessAccountScreen = new AcessAccountScreen();
        acessAccountScreen.setVisible(true);
    }//GEN-LAST:event_acessAccountButtonActionPerformed

    private void admButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admButtonActionPerformed
        AdmScreen admScreen = new AdmScreen();
        admScreen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_admButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UserScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acessAccountButton;
    private javax.swing.JTextField addressInLabel;
    private final javax.swing.JLabel addressLabel = new javax.swing.JLabel();
    private javax.swing.JButton admButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField cpfInLabel;
    private final javax.swing.JLabel cpfLabel = new javax.swing.JLabel();
    private javax.swing.JPanel infoAccountPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField modifyInLabel;
    private final javax.swing.JLabel modifyLabel = new javax.swing.JLabel();
    private javax.swing.JTextField nameInLabel;
    private final javax.swing.JLabel nameLabel = new javax.swing.JLabel();
    private javax.swing.JTextField phoneInLabel;
    private final javax.swing.JLabel phoneLabel = new javax.swing.JLabel();
    private javax.swing.JTextField startInLabel;
    private final javax.swing.JLabel startLabel = new javax.swing.JLabel();
    private javax.swing.JTextField typeInLabel;
    private javax.swing.JLabel vascoToken;
    // End of variables declaration//GEN-END:variables
}
