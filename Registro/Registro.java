/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegotrivia;

/**
 *
 * @author PJ129
 */
public class Registro {
    private String userNickname,
            userPassword,
            userCountry;
    private int userAge,userPriovity;

    public Registro(String userNaickname, String userPassword, String userCountry, int userAge, int userPriovity) {
        this.userNickname = userNaickname;
        this.userPassword = userPassword;
        this.userCountry =  userCountry;
        this.userAge = userAge;
        this.userPriovity = userPriovity;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public int getUserPriovity() {
        return userPriovity;
    }

    public void setUserPriovity(int userPriovity) {
        this.userPriovity = userPriovity;
    }

    @Override
    public String toString() {
        return "Registro{" + "userNickname=" + userNickname + ", userPassword=" + userPassword + ", userCountry=" + userCountry + ", userAge=" + userAge + ", userPriovity=" + userPriovity + '}';
    }
    
    
}
