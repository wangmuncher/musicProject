/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3project;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author atabe
 */
public class UserScreen extends javax.swing.JFrame {
    
    DbService db = new DbService();
    String username;
    
    
    /**
     * Creates new form UserScreen
     */
    public UserScreen() {
        initComponents();
    }
    
    public UserScreen(String username)
    {
        this.username = username;
        initComponents();
        String welcometext = username + "'s account";
        headerText.setText(welcometext);
        db.createUserSongTable(username);
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
        headerText = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        songNameField = new javax.swing.JTextField();
        artistNameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        genreNameField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pathNameField = new javax.swing.JTextField();
        addSongButton = new javax.swing.JButton();
        changeAccountsButton = new javax.swing.JButton();
        globalSongPlayerButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        userPlayerButton = new javax.swing.JButton();
        favoritesButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        headerText.setForeground(new java.awt.Color(0, 255, 204));
        jPanel1.add(headerText, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 310, 30));

        jPanel2.setBackground(new java.awt.Color(73, 64, 64));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(songNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 420, 30));
        jPanel2.add(artistNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 420, 30));

        jLabel3.setForeground(new java.awt.Color(0, 255, 204));
        jLabel3.setText("Song Name");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 70, -1));

        jLabel4.setForeground(new java.awt.Color(0, 255, 204));
        jLabel4.setText("Artist");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 40, -1));

        jLabel5.setForeground(new java.awt.Color(0, 255, 204));
        jLabel5.setText("Genre");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, 50, -1));
        jPanel2.add(genreNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 420, 30));

        jLabel6.setForeground(new java.awt.Color(0, 255, 204));
        jLabel6.setText("Path of The File");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 100, -1));
        jPanel2.add(pathNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 420, 30));

        addSongButton.setText("Add Song");
        addSongButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSongButtonActionPerformed(evt);
            }
        });
        jPanel2.add(addSongButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, -1, -1));

        changeAccountsButton.setText("Change Accounts");
        changeAccountsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeAccountsButtonActionPerformed(evt);
            }
        });
        jPanel2.add(changeAccountsButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, -1));

        globalSongPlayerButton.setText("Global Song Player");
        globalSongPlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                globalSongPlayerButtonActionPerformed(evt);
            }
        });
        jPanel2.add(globalSongPlayerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("If you have some songs you  would like to add to your player, feel free !");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        userPlayerButton.setText("User Player");
        userPlayerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userPlayerButtonActionPerformed(evt);
            }
        });
        jPanel2.add(userPlayerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 470, 140, -1));

        favoritesButton.setText("My Favorites");
        favoritesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favoritesButtonActionPerformed(evt);
            }
        });
        jPanel2.add(favoritesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 530, 140, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 610, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addSongButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSongButtonActionPerformed
        
        String songname = songNameField.getText();
        String artistname = artistNameField.getText();
        String genrename = genreNameField.getText();
        String songpath = pathNameField.getText();
        int userid = db.getUserId(username);
        
        if(!db.checkSongUser(songname,artistname,username))
        {
           db.addSongToUser(songname, artistname, genrename, songpath,username);
           JOptionPane.showMessageDialog(null, "Your song has been added to your player!");
        }else
        {
           JOptionPane.showMessageDialog(null, "That song seems to be already in your player !");
        }

        

    }//GEN-LAST:event_addSongButtonActionPerformed

    private void globalSongPlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_globalSongPlayerButtonActionPerformed
        PlayerScreen playerscreen;
        try {
            playerscreen = new PlayerScreen(username);
            playerscreen.setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(UserScreen.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_globalSongPlayerButtonActionPerformed

    private void changeAccountsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeAccountsButtonActionPerformed
        LoginScreen loginscreen = new LoginScreen();
        loginscreen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_changeAccountsButtonActionPerformed

    private void userPlayerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userPlayerButtonActionPerformed
        
        PlayerScreen playerscreen;
        try {
            playerscreen = new PlayerScreen(username,true);
            playerscreen.setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(UserScreen.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_userPlayerButtonActionPerformed

    private void favoritesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_favoritesButtonActionPerformed
       
        PlayerScreen playerscreen;
        try {
            playerscreen = new PlayerScreen(username,1);
            playerscreen.setVisible(true);
            this.dispose();
        } catch (Exception ex) {
            Logger.getLogger(UserScreen.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_favoritesButtonActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSongButton;
    private javax.swing.JTextField artistNameField;
    private javax.swing.JButton changeAccountsButton;
    private javax.swing.JButton favoritesButton;
    private javax.swing.JTextField genreNameField;
    private javax.swing.JButton globalSongPlayerButton;
    private javax.swing.JLabel headerText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField pathNameField;
    private javax.swing.JTextField songNameField;
    private javax.swing.JButton userPlayerButton;
    // End of variables declaration//GEN-END:variables
}
