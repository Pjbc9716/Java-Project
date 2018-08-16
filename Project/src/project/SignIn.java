/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import javax.swing.JOptionPane;
import project.logic.Administrador;
import project.models.User;

/**
 *
 * @author PJ129
 */
public class SignIn extends javax.swing.JFrame {
    
    /**
     * Creates new form SignIn
     */
    Administrador myadministrador;
    public SignIn(Administrador myList) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.myadministrador = myList;
        jblHasNumberImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/X.png"))); 
        jblHasSignImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/X.png"))); 
        jblLengthImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/X.png"))); 
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNickname = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jPasswordVerify = new javax.swing.JPasswordField();
        jcbAge = new javax.swing.JComboBox<>();
        jcbCountry = new javax.swing.JComboBox<>();
        btnRegister = new javax.swing.JButton();
        Length = new javax.swing.JLabel();
        hasSign = new javax.swing.JLabel();
        hasNumber = new javax.swing.JLabel();
        jblLengthImage = new javax.swing.JLabel();
        jblHasSignImage = new javax.swing.JLabel();
        jblHasNumberImage = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();
        jblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/TriviaGame_Logo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nickname:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Verifique Password:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Edad:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, -1, -1));

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pais:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 500, -1, -1));

        txtNickname.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        getContentPane().add(txtNickname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 310, -1));

        jPassword.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 310, -1));

        jPasswordVerify.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jPasswordVerify.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordVerifyMouseClicked(evt);
            }
        });
        getContentPane().add(jPasswordVerify, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 310, -1));

        jcbAge.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jcbAge.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99" }));
        getContentPane().add(jcbAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, -1, -1));

        jcbCountry.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jcbCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione su pais", "Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bangladés", "Barbados", "Baréin", "Bélgica", "Belice", "Benín", "Bielorrusia", "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Ciudad del Vaticano", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guyana", "Guinea", "Guinea ecuatorial", "Guinea-Bisáu", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí", "Malta", "Marruecos", "Mauricio", "Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Reino Unido", "República Centroafricana", "República Checa", "República de Macedonia", "República del Congo", "República Democrática del Congo", "República Dominicana", "República Sudafricana", "Ruanda", "Rumanía", "Rusia", "Samoa", "San Cristóbal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Lucía", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sudán", "Sudán del Sur", "Suecia", "Suiza", "Surinam", "Tailandia", "Tanzania", "Tayikistán", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia" }));
        getContentPane().add(jcbCountry, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, -1, -1));

        btnRegister.setBackground(new java.awt.Color(0, 51, 153));
        btnRegister.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Registrar");
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegisterMouseClicked(evt);
            }
        });
        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 560, -1, -1));

        Length.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        Length.setForeground(new java.awt.Color(255, 255, 255));
        Length.setText("Contiene al menos 8 caracteres.");
        getContentPane().add(Length, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        hasSign.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        hasSign.setForeground(new java.awt.Color(255, 255, 255));
        hasSign.setText("Contiene al menos un \"@\",\"$\",\"&\"");
        getContentPane().add(hasSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, -1, -1));

        hasNumber.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        hasNumber.setForeground(new java.awt.Color(255, 255, 255));
        hasNumber.setText("Contiene un numero");
        getContentPane().add(hasNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, -1, -1));

        jblLengthImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Check.png"))); // NOI18N
        getContentPane().add(jblLengthImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, -1, -1));

        jblHasSignImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Check.png"))); // NOI18N
        getContentPane().add(jblHasSignImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));
        getContentPane().add(jblHasNumberImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, -1, -1));

        btnReturn.setBackground(new java.awt.Color(0, 51, 153));
        btnReturn.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        btnReturn.setForeground(new java.awt.Color(255, 255, 255));
        btnReturn.setText("Regresar");
        btnReturn.setMaximumSize(new java.awt.Dimension(127, 31));
        btnReturn.setMinimumSize(new java.awt.Dimension(127, 31));
        btnReturn.setPreferredSize(new java.awt.Dimension(127, 31));
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        getContentPane().add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        jblBackground.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/CoolBackground.jpg"))); // NOI18N
        jblBackground.setPreferredSize(new java.awt.Dimension(700, 600));
        getContentPane().add(jblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordVerifyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordVerifyMouseClicked
        // TODO add your handling code here:
        char[] passwordChar = jPassword.getPassword();
        String password = new String(passwordChar);
        if (myadministrador.verifyPasswordLength(password)){
            jblLengthImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Check.png"))); 
        } else {
            jblLengthImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/X.png")));

        }
        if(myadministrador.verifyPasswordNumber(password)){
            jblHasNumberImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Check.png")));
        }else{
            jblHasNumberImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/X.png")));
        }
        if (myadministrador.verifyPasswordSign(password)){
            jblHasSignImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Check.png")));
        }else{
            jblHasSignImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/X.png")));
        }
        correctPassword = myadministrador.verifyPasswordLength(password) && myadministrador.verifyPasswordNumber(password) && myadministrador.verifyPasswordSign(password);
    }//GEN-LAST:event_jPasswordVerifyMouseClicked

    private void btnRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseClicked
        // TODO add your handling code here:
        String nickname = txtNickname.getText().trim();
        boolean correctNickname = myadministrador.verifyNickname(nickname);
        char[] passwordChar = jPassword.getPassword();
        String password = new String(passwordChar);
        char[] verifyChar = jPasswordVerify.getPassword();
        String verifyPassword = new String(verifyChar);
        boolean passwordMatches = myadministrador.verifyPasswordMatches(password, verifyPassword);
        int age = Integer.parseInt((String) jcbAge.getSelectedItem());
        String country = (String) jcbCountry.getSelectedItem();
        if (correctNickname && correctPassword && myadministrador.verifyCountry(country) && passwordMatches) {
            myadministrador.userInfo.add (new User(nickname,password,country,age));
            JOptionPane.showMessageDialog(null, "Usuari@ Cread@!");
            this.dispose();
            Menu myMenu = new Menu(myadministrador);
            myMenu.setVisible(true);
        }
         if (!correctPassword) {
            JOptionPane.showMessageDialog(null, "Password incorrecta, por favor seguir todos los parametros");
        } else if (!myadministrador.verifyCountry(country)) {
            JOptionPane.showMessageDialog(null, "Por favor seleccione un pais");
        } else if (!passwordMatches) {
            JOptionPane.showMessageDialog(null, "Los password no verifica, por favor verifique los password");
        }
        for (int i = 0; i < myadministrador.userInfo.size(); i++) {
            System.out.println(myadministrador.userInfo.get(i).toString());
        }
    }//GEN-LAST:event_btnRegisterMouseClicked

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        Menu backMenu = new Menu(myadministrador);
        backMenu.setVisible(true);
        backMenu.setLocationRelativeTo(null);
        this.dispose();
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
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Administrador myList = new Administrador ();
                new SignIn(myList).setVisible(true);
            }
        });
    }
    boolean correctPassword;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Length;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnReturn;
    private javax.swing.JLabel hasNumber;
    private javax.swing.JLabel hasSign;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JPasswordField jPasswordVerify;
    private javax.swing.JLabel jblBackground;
    private javax.swing.JLabel jblHasNumberImage;
    private javax.swing.JLabel jblHasSignImage;
    private javax.swing.JLabel jblLengthImage;
    private javax.swing.JComboBox<String> jcbAge;
    private javax.swing.JComboBox<String> jcbCountry;
    private javax.swing.JTextField txtNickname;
    // End of variables declaration//GEN-END:variables
}
