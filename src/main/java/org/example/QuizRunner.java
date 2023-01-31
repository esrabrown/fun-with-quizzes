package org.example;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz quizes = new Quiz();

        TrueAndFalse trueAndFalsequestion = new TrueAndFalse("There are no mosquitoes in Iceland. \ngit rTrue or False?" ,"True" );
        quizes.askQuestion(trueAndFalsequestion);

        MultipleChoice multipleChoiceQuestion = new MultipleChoice("What country has the longest coastline in the world? \nA: United States\nB:Canada\nC: Italy\nD:Russia ", "B");
        quizes.askQuestion(multipleChoiceQuestion);

        Checkbox checkboxquestion = new Checkbox("What are the cities in Italy? Select all that apply \n A:Naples\n B:Verona\n C:Turin \n D:Palermo" , "A,B,C,D");
        quizes.askQuestion(checkboxquestion);


  quizes.runQuiz();
    }
}