/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.logic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import project.models.Question;
import project.models.User;

/**
 *
 * @author PJ129
 */
public class Administrador {
    public ArrayList<User> userInfo = new ArrayList<>();
    public ArrayList<Question> questionList = new ArrayList<>();
    
    public void fillUserList() {
        User myUser = new User("Administrador", "TG2018JAVA", "C.R.C", 00);
        userInfo.add(myUser);

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
        if (nickname.length() > 13) {
            JOptionPane.showMessageDialog(null, "El nickname no debe ser mayor a 13 caracteres");
            newNickname = false;
        }else if (!newNickname) {
            JOptionPane.showMessageDialog(null, "Nickname ya asignado, ingrese uno diferente");
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
        int position = -1;
        boolean correctNickname = false;
        for (int i = 0; i < userInfo.size(); i++) {
            if (userInfo.get(i).getUserNickname().equals(nickname)) {
                position = i;
                correctNickname = true;
                break;
            }
        }
        if (correctNickname) {
            JOptionPane.showMessageDialog(null, "Bienvenid@: "+userInfo.get(position).getUserNickname());
            return userInfo.get(position).getUserPassword().equals(password);

        } else {
            return false;
        }
    }
    public int getUserPosition (String nickname){
        int userPosition=-1;
        for (int i=0; i<userInfo.size();i++){
            if (userInfo.get(i).getUserNickname().equals(nickname)){
                userPosition = i;
            }
        }
        return userPosition;
    }
        
    public int getQuestion() {
        int questionSelected = -1;

        try {
            FileReader address = new FileReader("src\\database\\QuestionList.csv");
            BufferedReader file = new BufferedReader(address);
            boolean emptyList = false;
            while (!emptyList) {
                String info = file.readLine();
                if (info != null) {
                    String questionInfo[] = info.split(";");
                    String question = questionInfo[0];
                    String correctOption = questionInfo[1];
                    String option1 = questionInfo[2];
                    String option2 = questionInfo[3];
                    this.questionList.add(new Question(question, correctOption, option1, option2));
                } else {
                    emptyList = true;
                }
            }

            questionSelected = (int) (Math.random() * 68);
            while (questionList.get(questionSelected).getAlreadyAnswered().equals("YES")) {
                questionSelected = (int) (Math.random() * 68);
                System.out.println(questionSelected);
            }
            System.out.println(this.questionList.get(questionSelected).getQuestion());


        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return questionSelected;
    }

    public int setType (){
        int type = (int) (Math.random()*(4-1)+1);
        System.out.println(type);
        return type;
    }

}
