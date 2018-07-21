/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.models;

/**
 *
 * @author PJ129
 */
public class User {
    String userNickname,
            userPassword,
            userCountry;
    int userAge,
            userPoints,
            userLifes;

    public User(String userNickname, String userPassword, String userCountry, int userAge) {
        this.userNickname = userNickname;
        this.userPassword = userPassword;
        this.userCountry = userCountry;
        this.userAge = userAge;
        this.userPoints = 000;
        this.userLifes = 5;
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

    public int getUserPoints() {
        return userPoints;
    }

    public void setUserPoints(int userPoints) {
        this.userPoints = userPoints;
    }

    public int getUserLifes() {
        return userLifes;
    }

    public void setUserLifes(int userLifes) {
        this.userLifes = userLifes;
    }

    @Override
    public String toString() {
        return "User{" + "userNickname=" + userNickname + ", userPassword=" + userPassword + ", userCountry=" + userCountry + ", userAge=" + userAge + ", userPoints=" + userPoints + ", userLifes=" + userLifes + '}';
    }
    
    
    
    
    
}
