/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.logic;

import java.util.ArrayList;
import project.models.Question;
import project.models.User;

/**
 *
 * @author PJ129
 */
public class Administrador {

    public ArrayList<User> userInfo = new ArrayList<>();
    ArrayList<Question> questionList = new ArrayList<>();

    public void fillUserList() {
        User myUser = new User("Administrador", "TG2018JAVA", "C.R.C", 00);
        userInfo.add(myUser);

    }

    public void fillQuestioList() {

    }

    public boolean verifyNickname(String nickname) {
        boolean newNickname = true;
        if (!nickname.equals("")) {
            for (int i = 0; i < userInfo.size(); i++) {
                while (userInfo.get(i).getUserNickname().equals(nickname)) {
                    newNickname = false;
                    break;
                }

            }

        } else {
            newNickname = false;
        }
        return newNickname;
    }

    public boolean verifyPasswordLength(String password) {
        return (password.length() >= 8);
    }

    public boolean verifyPasswordSign(String password) {
        return password.contains("@") || password.contains("&") || password.contains("$");
    }

    public boolean verifyPasswordNumber(String password) {
        boolean hasNumber = false;
        for (int i = 0; i < password.length(); i++) {
            char currentChar = password.charAt(i);
            if (Character.isDigit(currentChar)) {
                hasNumber = true;
                break;
            }
        }
        return hasNumber;
    }

    public boolean verifyCountry(String country) {
        return !country.equals("Seleccione su pais");
    }
    public boolean verifyPasswordMatches (String password, String verifyPassword){
        return password.equals(verifyPassword);
    }
    
    public boolean correctInfo (String nickname, String password){
        int position=-1;
        boolean correctNickname = false;
        for (int i = 0; i < userInfo.size(); i++) {
                System.out.println(userInfo.get(i).getUserNickname());
            if (userInfo.get(i).getUserNickname().equals(nickname)) {
                position = i;
                correctNickname = true;
                break;
            }
        }
        if (correctNickname) {
            System.out.println("Bien");
            return userInfo.get(position).getUserPassword().equals(password);
        } else {
            System.out.println("Mal");
            return false;
        }
    }
}
