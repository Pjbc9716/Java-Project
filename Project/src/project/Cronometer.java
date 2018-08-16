
package project;

/**
 *
 * @author rodri
 */
public class Cronometer extends javax.swing.JFrame implements Runnable {
    
    Thread hilo = new Thread(){
        public void run(){
            try{
                while(true){
                    if(cen == 99){
                        cen = 0;
                        seg++;
                    }
                    if(seg == 59){
                        seg = 0;
                        min++;
                    }
                    cen++;
                    
                    jlbTimer.setText(min + ":" + seg + ":" + cen);
                    hilo.sleep(10);
                }
            }catch(java.lang.InterruptedException ie){
                System.out.println(ie.getMessage());
            }
        }
    };
    int min = 0;
    int seg = 0;
    int cen = 0;

    public Cronometer() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(500, 500);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbTimer = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jlbTimer.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(jlbTimer);
        jlbTimer.setBounds(80, 4, 230, 50);

        btnIniciar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciar);
        btnIniciar.setBounds(150, 60, 90, 31);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        hilo.start();
    }//GEN-LAST:event_btnIniciarActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cronometer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cronometer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cronometer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cronometer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }



        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cronometer().setVisible(true);
            }
        });
    }

    @Override
    public void run() {
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JLabel jlbTimer;
    // End of variables declaration//GEN-END:variables
}
