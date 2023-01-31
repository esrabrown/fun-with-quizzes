package org.example;

public class TrueAndFalse extends Question {

    public TrueAndFalse(String question, String answer){
        super(question, answer);
    }

    @Override
    public boolean checkAnswer(String answer) {
     if(answer.toLowerCase().equals(this.getAnswer().toLowerCase())){
         return true;
     }else {
         return false;
     }
    }
}
