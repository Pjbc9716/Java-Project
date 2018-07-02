/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegotrivia;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author PJ129
 */
public class Administrador {

    ArrayList<Registro> userInfo = new ArrayList<>();

    public void firstUser() {
        Registro user = new Registro("Pablo", "12345678", "C.R.C", 21, 5);
        Registro user1 = new Registro("Pablo", "12345678", "C.R.C", 21, 5);
        userInfo.add(user);
        userInfo.add(user1);
        signUp();
    }

    public void signUp() {
        String name = getNickname();
        String password = getPassword();
        String country = getCountry();
        int age = getAge();
        Registro user = new Registro(name, password, country, age, 1);
        userInfo.add(user);
        System.out.println(userInfo.get(1).toString());
        int option = Integer.parseInt(JOptionPane.showInputDialog("1 o 2"));
        if (option == 1) {
            signUp();
        } else {
            System.out.println(userInfo.size());
            for (int i = 0; i < userInfo.size(); i++) {
                System.out.println(userInfo.get(i).toString());
            }
                signIn();
        }
    }

    public String getNickname() {
        String name = "";
        boolean correctInput = false;
        while (!correctInput) {
            name = JOptionPane.showInputDialog("Ingrese el nickname que desea: ");
            for (int i = 0; i < userInfo.size(); i++) {
                if (userInfo.get(i).getUserNickname().equals(name)) {
                    JOptionPane.showMessageDialog(null, "El nickname: " + name + " ya fue registrado");
                    break;
                } else {
                    correctInput = true;
                }
            }
        }
        System.out.println(name);
        return name;
    }

    public String getPassword() {
        String password = "";
        boolean correctInput = false;
        while (!correctInput) {
            password = JOptionPane.showInputDialog("Ingrese el password: ");
            System.out.println(password);
            Boolean correctLength = password.length() >= 8;
            if (correctLength) {
                correctInput = true;
            } else {
                System.out.println("Password no cumple los requisitos");
            }
        }
        System.out.println(password);
        return password;
    }

    public Integer getAge() {
        int age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
        return age;
    }

    public String getCountry() {
        String country = JOptionPane.showInputDialog("Ingrese su pais: ");
        return country;
    }

    public int signIn() {
        int position = 0;
        String nameInput = JOptionPane.showInputDialog("Ingrese el nombre del usuario: ");
        String passwordInput = JOptionPane.showInputDialog("Ingrese su password: ");
        for (int i = 0; i < userInfo.size(); i++) {
            if (userInfo.get(i).getUserNickname().equals(nameInput)) {
                boolean correctInformation = userInfo.get(i).getUserPassword().equals(passwordInput);
                if (correctInformation) {
                    position = i;
                    JOptionPane.showMessageDialog(null,"Sesion iniciada");
                    break;
                }
                if (i == userInfo.size()) {
                    JOptionPane.showMessageDialog(null,"Informacion no calza");
                    break;
                }
            }
        }
        System.out.println(position);
        return position;
    }
}
