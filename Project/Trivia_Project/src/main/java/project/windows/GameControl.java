package project.windows;

import com.google.cloud.firestore.DocumentReference;
import java.applet.AudioClip;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import project.logic.Administrador;
import project.models.User;

public class GameControl extends javax.swing.JFrame implements Runnable {

    Thread hilo;

    public void setButtons(int question, int type) {
        switch (type) {
            case 1:
                btnOption1.setText(this.myadministradror.questionList.get(question).getCorrectOption());
                correctButton = btnOption1;
                btnOption2.setText(this.myadministradror.questionList.get(question).getOption1());
                btnOption3.setText(this.myadministradror.questionList.get(question).getOption2());
                break;
            case 2:
                btnOption2.setText(this.myadministradror.questionList.get(question).getCorrectOption());
                correctButton = btnOption2;
                btnOption3.setText(this.myadministradror.questionList.get(question).getOption1());
                btnOption1.setText(this.myadministradror.questionList.get(question).getOption2());
                break;
            case 3:
                btnOption3.setText(this.myadministradror.questionList.get(question).getCorrectOption());
                correctButton = btnOption3;
                btnOption1.setText(this.myadministradror.questionList.get(question).getOption1());
                btnOption2.setText(this.myadministradror.questionList.get(question).getOption2());
        }
    }

    public void setAlignment(int question, JButton button1, JButton button2, JButton button3) {
        if (this.myadministradror.questionList.get(question).getCorrectOption().length() > 20) {
            button1.setHorizontalAlignment(2);
            button2.setHorizontalAlignment(2);
            button3.setHorizontalAlignment(2);
        } else {
            button1.setHorizontalAlignment(0);
            button2.setHorizontalAlignment(0);
            button3.setHorizontalAlignment(0);
        }

    }

    public void setSizeQuestion(int question) {
        if (this.myadministradror.questionList.get(question).getQuestion().length() > 40) {
            jblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GiantBackground.png")));
            this.setSize(930, 800);
        }
    }

    Administrador myadministradror;
    private JButton correctButton;
    private User user;
    private int numberQuestion;
    AudioClip music;

    public GameControl(Administrador myList, int numberQuestion, User user) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.startChronometer();
        this.user = user;
        this.numberQuestion = numberQuestion;
        this.myadministradror = myList;
        music = this.myadministradror.playMusic();
        int question = this.myadministradror.getQuestion();
        jblQuestion.setText(this.myadministradror.questionList.get(question).getQuestion());
        this.jblPoints.setText("Puntos: " + this.user.getUserPoints());
        this.jblNumberQuestion.setText(this.numberQuestion + "/15");
        this.btnContinue.setVisible(false);
        this.btnBacktoMainMenu.setVisible(false);
        this.setPreferredSize(new java.awt.Dimension(400, 400));
        this.gameOver(user);
        this.setButtons(question, myadministradror.setType());
        this.setSizeQuestion(question);
        this.setAlignment(question, btnOption1, btnOption2, btnOption3);

    }

    public void verifyAnswer(JButton button) {
        long points = 0;
        this.numberQuestion++;
        if (button.equals(correctButton)) {
            if (this.getTimeLeft() < 15) {
                points = this.user.getUserPoints() + 100;
            } else if (this.getTimeLeft() < 30) {
                points = this.user.getUserPoints() + 75;
            } else if (this.getTimeLeft() < 45) {
                points = this.user.getUserPoints() + 50;
            } else if (this.getTimeLeft() < 60) {
                points = this.user.getUserPoints() + 25;
            }
            this.myadministradror.updateUserPoints(user, points);
            hilo.interrupt();
            this.jblResult.setText("Correcta");
            this.jblResult.setForeground(new java.awt.Color(0, 204, 0));
            this.user.setUserPoints(points);
            this.jblPoints.setText("Puntos: " + this.user.getUserPoints());
            this.btnOption1.setVisible(false);
            this.btnOption2.setVisible(false);
            this.btnOption3.setVisible(false);
            this.btnContinue.setVisible(true);

        } else {
            hilo.interrupt();
            this.jblResult.setText("Incorrecto");
            this.jblResult.setForeground(new java.awt.Color(255, 51, 51));
            this.jblResult.setVisible(true);
            this.btnOption1.setVisible(false);
            this.btnOption2.setVisible(false);
            this.btnOption3.setVisible(false);
            this.btnContinue.setVisible(true);
        }
    }

    public void gameOver(User user) {
        if (this.numberQuestion > 15) {
            this.jblNumberQuestion.setText("15/15");
            this.jblQuestion.setText("Fin de la partida");
            this.btnOption1.setVisible(false);
            this.btnOption2.setVisible(false);
            this.btnOption3.setVisible(false);
            this.btnContinue.setVisible(false);
            this.jblResult.setVisible(false);
            hilo.interrupt();
            this.btnBacktoMainMenu.setVisible(true);
            MainMenu mainMenu = new MainMenu(this.myadministradror, this.user);
            mainMenu.setVisible(true);

        }

    }

    public void run() {
        jblResult.setVisible(true);
        jblResult.setText("0:00");
        jblResult.setForeground(new java.awt.Color(255, 255, 255));
        Integer minutos = 0, segundos = 0;
        String min = "", seg = "";
        try {
            while (minutos < 1) {
                Thread.sleep(1000);
                segundos++;
                if (segundos == 60) {
                    segundos = 0;
                    minutos++;
                }
                min = minutos.toString();
                if (segundos < 10) {
                    seg = ("0" + segundos.toString());
                } else {
                    seg = segundos.toString();
                }
                jblResult.setText(min + ":" + seg);

                if (minutos == 1) {

                    jblResult.setText("Se acabo el tiempo");
                    btnOption1.setVisible(false);
                    btnOption2.setVisible(false);
                    btnOption3.setVisible(false);
                    btnContinue.setVisible(true);
                    hilo.interrupt();
                }

            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public int getTimeLeft() {
        String timeOnChronometer[] = jblResult.getText().split(":");
        String time = timeOnChronometer[0] + timeOnChronometer[1];
        int timeInNumber = Integer.parseInt(time);
        return timeInNumber;
    }

    public void startChronometer() {
        hilo = new Thread(this);
        hilo.start();
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
        btnContinue = new javax.swing.JButton();
        btnBacktoMainMenu = new javax.swing.JButton();
        btnOption1 = new javax.swing.JButton();
        btnOption2 = new javax.swing.JButton();
        btnOption3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jblNumberQuestion = new javax.swing.JLabel();
        jblResult = new javax.swing.JLabel();
        jblPoints = new javax.swing.JLabel();
        jblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jblQuestion.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jblQuestion.setForeground(new java.awt.Color(255, 255, 255));
        jblQuestion.setText("Pregunta aqui...");
        jblQuestion.setFocusable(false);
        jblQuestion.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        getContentPane().add(jblQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, 60));

        btnContinue.setBackground(new java.awt.Color(51, 153, 255));
        btnContinue.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnContinue.setForeground(new java.awt.Color(255, 255, 255));
        btnContinue.setText("Siguiente pregunta");
        btnContinue.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnContinue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnContinueMouseClicked(evt);
            }
        });
        btnContinue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinueActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinue, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 580, 60));

        btnBacktoMainMenu.setBackground(new java.awt.Color(51, 153, 255));
        btnBacktoMainMenu.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        btnBacktoMainMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnBacktoMainMenu.setText("           Regresar al Menu Principal");
        btnBacktoMainMenu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBacktoMainMenu.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnBacktoMainMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBacktoMainMenuMouseClicked(evt);
            }
        });
        btnBacktoMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBacktoMainMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnBacktoMainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 580, 60));

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
        getContentPane().add(btnOption1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 580, 60));

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
        btnOption2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOption2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnOption2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 580, 60));

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
        getContentPane().add(btnOption3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 460, 580, 60));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TriviaGame_Logo.png"))); // NOI18N
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

        jblNumberQuestion.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jblNumberQuestion.setForeground(new java.awt.Color(255, 255, 255));
        jblNumberQuestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblNumberQuestion.setText("0/15");
        jblNumberQuestion.setFocusable(false);
        jblNumberQuestion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jblNumberQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 60));

        jblResult.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jblResult.setForeground(new java.awt.Color(0, 204, 0));
        jblResult.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblResult.setText("Buena!");
        jblResult.setFocusable(false);
        jblResult.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jblResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, 60));

        jblPoints.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jblPoints.setForeground(new java.awt.Color(255, 255, 255));
        jblPoints.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblPoints.setText("Puntos:");
        jblPoints.setFocusable(false);
        jblPoints.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jblPoints, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 60));

        jblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BigBackground.png"))); // NOI18N
        getContentPane().add(jblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOption1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOption1MouseClicked
        this.verifyAnswer(btnOption1);
    }//GEN-LAST:event_btnOption1MouseClicked

    private void btnOption2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOption2MouseClicked
        this.verifyAnswer(btnOption2);
    }//GEN-LAST:event_btnOption2MouseClicked

    private void btnOption3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOption3MouseClicked
        this.verifyAnswer(btnOption3);
    }//GEN-LAST:event_btnOption3MouseClicked

    private void btnOption1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOption1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOption1ActionPerformed

    private void btnOption3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOption3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOption3ActionPerformed

    private void btnContinueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnContinueMouseClicked
        // TODO add your handling code here:
        GameControl gameControl = new GameControl(this.myadministradror, this.numberQuestion, this.user);
        gameControl.setVisible(true);
        this.myadministradror.stopMusic(music);
        this.dispose();
    }//GEN-LAST:event_btnContinueMouseClicked

    private void btnContinueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnContinueActionPerformed

    private void btnOption2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOption2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOption2ActionPerformed

    private void btnBacktoMainMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBacktoMainMenuMouseClicked
        // TODO add your handling code here:
        MainMenu mainMenu = new MainMenu(this.myadministradror, this.user);
        mainMenu.setVisible(true);
        this.myadministradror.cleanQuestionList();
        this.dispose();
    }//GEN-LAST:event_btnBacktoMainMenuMouseClicked

    private void btnBacktoMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBacktoMainMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBacktoMainMenuActionPerformed

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
                Administrador myList = new Administrador();
                int numberQuestion = 0;
                User user = null;
                new GameControl(myList, numberQuestion, user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBacktoMainMenu;
    private javax.swing.JButton btnContinue;
    private javax.swing.JButton btnOption1;
    private javax.swing.JButton btnOption2;
    private javax.swing.JButton btnOption3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jblBackground;
    private javax.swing.JLabel jblNumberQuestion;
    private javax.swing.JLabel jblPoints;
    private javax.swing.JLabel jblQuestion;
    private javax.swing.JLabel jblResult;
    // End of variables declaration//GEN-END:variables

}
