package org.example;

public class Checkbox extends Question{


    public Checkbox(String question, String answer){
        super(question,answer);
    }
    @Override
    public boolean checkAnswer(String answer) {
        String inputAnswering = this.getAnswer();
        if(answer.toLowerCase().equals(inputAnswering.toLowerCase())){
            return true;
        } else {
            return false;
        }
    }
}
