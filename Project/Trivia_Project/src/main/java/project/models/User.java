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
            userCountry,
            userID;
    Long userAge,
            userPoints;

    public User(String userNickname, String userPassword, String userCountry, Long userAge, String userID) {
        this.userNickname = userNickname;
        this.userPassword = userPassword;
        this.userCountry = userCountry;
        this.userAge = userAge;
        this.userPoints = 0L;
        this. userID = userID;
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

    public long getUserAge() {
        return userAge;
    }

    public void setUserAge(long userAge) {
        this.userAge = userAge;
    }

    public long getUserPoints() {
        return userPoints;
    }

    public void setUserPoints(long userPoints) {
        this.userPoints = userPoints;
    }

    public User() {
    }

}
