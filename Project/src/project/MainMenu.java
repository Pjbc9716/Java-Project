
package project;

import project.logic.Administrador;


public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    Administrador myadministrador;
    int userPosition;
    public MainMenu(Administrador myList, int position) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.myadministrador = myList;
        this.userPosition = position;
        System.out.println(position);
        jblNickname.setText("Nickname: "+this.myadministrador.userInfo.get(this.userPosition).getUserNickname());
        jblUserLifes.setText("Vidas: "+this.myadministrador.userInfo.get(this.userPosition).getUserLifes());
        jblUserPoints.setText("Puntos: "+this.myadministrador.userInfo.get(this.userPosition).getUserPoints());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jblUserPoints = new javax.swing.JLabel();
        jblNickname = new javax.swing.JLabel();
        jblUserLifes = new javax.swing.JLabel();
        btnStartGame = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/TriviaGame_Logo.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, 150));

        jblUserPoints.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jblUserPoints.setForeground(new java.awt.Color(255, 255, 255));
        jblUserPoints.setText("Puntos:");
        getContentPane().add(jblUserPoints, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, 30));

        jblNickname.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jblNickname.setForeground(new java.awt.Color(255, 255, 255));
        jblNickname.setText("Nickname:");
        getContentPane().add(jblNickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jblUserLifes.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jblUserLifes.setForeground(new java.awt.Color(255, 255, 255));
        jblUserLifes.setText("Vidas:");
        getContentPane().add(jblUserLifes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        btnStartGame.setBackground(new java.awt.Color(51, 153, 255));
        btnStartGame.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnStartGame.setForeground(new java.awt.Color(255, 255, 255));
        btnStartGame.setText("Iniciar Partida");
        btnStartGame.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStartGameMouseClicked(evt);
            }
        });
        getContentPane().add(btnStartGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 300, 60));

        btnExit.setBackground(new java.awt.Color(51, 153, 255));
        btnExit.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Salir");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, 300, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/CoolBackground.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartGameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStartGameMouseClicked
        // TODO add your handling code here:
        GameControl mygame = new GameControl (this.myadministrador, this.userPosition, 0);
        mygame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnStartGameMouseClicked

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Administrador myList = new Administrador();
                int position=0;
                new MainMenu(myList, position).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnStartGame;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jblNickname;
    private javax.swing.JLabel jblUserLifes;
    private javax.swing.JLabel jblUserPoints;
    // End of variables declaration//GEN-END:variables
}
