/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javax.swing.JButton;
import project.logic.Administrador;

/**
 *
 * @author PJ129
 */
public class GameControl extends javax.swing.JFrame {

    public void setButtons(int question, int type) {
        switch (type) {
            case 1:
                btnOption1.setText(this.myadministradror.questionList.get(question).getCorrectOption());
                btnOption2.setText(this.myadministradror.questionList.get(question).getOption1());
                btnOption3.setText(this.myadministradror.questionList.get(question).getOption2());
                break;
            case 2:
                btnOption2.setText(this.myadministradror.questionList.get(question).getCorrectOption());
                btnOption3.setText(this.myadministradror.questionList.get(question).getOption1());
                btnOption1.setText(this.myadministradror.questionList.get(question).getOption2());
                break;
            case 3:
                btnOption3.setText(this.myadministradror.questionList.get(question).getCorrectOption());
                btnOption1.setText(this.myadministradror.questionList.get(question).getOption1());
                btnOption2.setText(this.myadministradror.questionList.get(question).getOption2());
        }
    }

    public void setAlignment(int question, JButton button1, JButton button2, JButton button3) {
        if (this.myadministradror.questionList.get(question).getCorrectOption().length() > 22) {
            button1.setHorizontalAlignment(2);
            button2.setHorizontalAlignment(2);
            button3.setHorizontalAlignment(2);
        } else {
            button1.setHorizontalAlignment(0);
            button2.setHorizontalAlignment(0);
            button3.setHorizontalAlignment(0);
        }
    
    }
    public void setSize (int question){
        if (this.myadministradror.questionList.get(question).getQuestion().length()>20){
            jblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/GiantBackground.png")));
        }
    }

    /**
     * Creates new form GameControl
     */
    Administrador myadministradror;
    public GameControl(Administrador myList) {
        initComponents();
        this.myadministradror = myList;
        int question = this.myadministradror.selectQuestion();
        jblQuestion.setText(this.myadministradror.questionList.get(question).getQuestion());
        this.setButtons(question, myadministradror.setType());
        this.setSize(question);
        this.setAlignment(question, btnOption1, btnOption2, btnOption3);
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jblQuestion = new javax.swing.JLabel();
        btnOption1 = new javax.swing.JButton();
        btnOption2 = new javax.swing.JButton();
        btnOption3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jblQuestion1 = new javax.swing.JLabel();
        jblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jblQuestion.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jblQuestion.setForeground(new java.awt.Color(255, 255, 255));
        jblQuestion.setText("Pregunta aqui...");
        jblQuestion.setFocusable(false);
        jblQuestion.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        getContentPane().add(jblQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 60));

        btnOption1.setBackground(new java.awt.Color(51, 153, 255));
        btnOption1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnOption1.setForeground(new java.awt.Color(255, 255, 255));
        btnOption1.setText("Boton 1");
        btnOption1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnOption1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnOption1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOption1MouseClicked(evt);
            }
        });
        btnOption1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOption1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnOption1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 470, 60));

        btnOption2.setBackground(new java.awt.Color(51, 153, 255));
        btnOption2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnOption2.setForeground(new java.awt.Color(255, 255, 255));
        btnOption2.setText("Boton 2");
        btnOption2.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnOption2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOption2MouseClicked(evt);
            }
        });
        getContentPane().add(btnOption2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 470, 60));

        btnOption3.setBackground(new java.awt.Color(51, 153, 255));
        btnOption3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnOption3.setForeground(new java.awt.Color(255, 255, 255));
        btnOption3.setText("Boton 3");
        btnOption3.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnOption3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        btnOption3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOption3MouseClicked(evt);
            }
        });
        btnOption3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOption3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnOption3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 470, 60));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/TriviaGame_Logo.png"))); // NOI18N
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        jblQuestion1.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jblQuestion1.setForeground(new java.awt.Color(255, 255, 255));
        jblQuestion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblQuestion1.setText("Puntos:");
        jblQuestion1.setFocusable(false);
        jblQuestion1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jblQuestion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, -1, 60));

        jblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/BigBackground.png"))); // NOI18N
        getContentPane().add(jblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOption1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOption1MouseClicked

    }//GEN-LAST:event_btnOption1MouseClicked

    private void btnOption2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOption2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOption2MouseClicked

    private void btnOption3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOption3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOption3MouseClicked

    private void btnOption1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOption1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOption1ActionPerformed

    private void btnOption3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOption3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOption3ActionPerformed

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
            java.util.logging.Logger.getLogger(GameControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Administrador myList = new Administrador ();
                new GameControl(myList).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOption1;
    private javax.swing.JButton btnOption2;
    private javax.swing.JButton btnOption3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jblBackground;
    private javax.swing.JLabel jblQuestion;
    private javax.swing.JLabel jblQuestion1;
    // End of variables declaration//GEN-END:variables
}