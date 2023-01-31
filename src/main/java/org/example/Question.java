package org.example;

public abstract class Question {

    private final String question;
    private final String answer;


    //Constructors
    public Question(String question, String answer){
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion(){
        return this.question;
    }
    public String getAnswer(){
        return answer;
    }

    public  abstract boolean checkAnswer(String answer);


}
