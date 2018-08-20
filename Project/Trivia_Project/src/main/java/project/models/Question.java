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
public class Question {

    private String question,
            correctOption,
            option1,
            option2;
    private String alreadyAnswered;

    public Question(String question, String correctOption, String option1, String option2) {
        this.question = question;
        this.correctOption = correctOption;
        this.option1 = option1;
        this.option2 = option2;
        this.alreadyAnswered = "NO";

    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Question() {
    }

    public String getCorrectOption() {
        return correctOption;
    }

    public void setCorrectOption(String correctOption) {
        this.correctOption = correctOption;
    }

    public String getOption1() {
        return option1;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public String getOption2() {
        return option2;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public String getAlreadyAnswered() {
        return alreadyAnswered;
    }

    public void setAlreadyAnswered(String alreadyAnswered) {
        this.alreadyAnswered = alreadyAnswered;
    }

}
