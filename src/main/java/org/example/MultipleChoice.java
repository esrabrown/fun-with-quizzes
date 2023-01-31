package org.example;

public class MultipleChoice extends Question{
    public MultipleChoice(String question, String answer){
        super(question,answer);
    }

    @Override
    public boolean checkAnswer(String answer) {

        String inputAnswering = this.getAnswer();

        //If input answers uppercase or lowercase;
        if(answer.toLowerCase().equals(inputAnswering.toLowerCase())){
            return true;
        } else {
            return false;
        }
    }
}
