/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.windows;

import javax.swing.DefaultListModel;
import project.logic.Administrador;
import project.models.User;

/**
 *
 * @author PJ129
 */
public class Ranking extends javax.swing.JFrame {

    /**
     * Creates new form Ranking
     */
    Administrador myadministrador;
    String informationList[];
    User user;

    public Ranking(Administrador myLogic, User user) {
        initComponents();
        this.user = user;
        this.myadministrador = myLogic;
        this.informationList = this.myadministrador.ranking();
        this.fillList(informationList);

    }

    public void fillList(String[] informationList) {
        DefaultListModel model = new DefaultListModel();
        for (String information : informationList) {
            model.addElement(information);
        }

        jList1.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jblTrivia_Logo = new javax.swing.JLabel();
        jspRankingList = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btnReturn = new javax.swing.JButton();
        jblBackground = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TriviaGame_Logo.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jblTrivia_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TriviaGame_Logo.png"))); // NOI18N
        getContentPane().add(jblTrivia_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jList1.setBackground(new java.awt.Color(51, 0, 102));
        jList1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jList1.setForeground(new java.awt.Color(255, 255, 255));
        jspRankingList.setViewportView(jList1);

        getContentPane().add(jspRankingList, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 390, 420));

        btnReturn.setBackground(new java.awt.Color(0, 51, 153));
        btnReturn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnReturn.setForeground(new java.awt.Color(255, 255, 255));
        btnReturn.setText("Regresar");
        btnReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReturnMouseClicked(evt);
            }
        });
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        getContentPane().add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 180, 40));

        jblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CoolBackground.jpg"))); // NOI18N
        getContentPane().add(jblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReturnMouseClicked
        // TODO add your handling code here:
        MainMenu mainMenu = new MainMenu(this.myadministrador, this.user);
        mainMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReturnMouseClicked

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReturnActionPerformed

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
            java.util.logging.Logger.getLogger(Ranking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ranking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ranking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ranking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Administrador myList = new Administrador();
                User user = null;
                new Ranking(myList, user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JLabel jblBackground;
    private javax.swing.JLabel jblTrivia_Logo;
    private javax.swing.JScrollPane jspRankingList;
    // End of variables declaration//GEN-END:variables
}