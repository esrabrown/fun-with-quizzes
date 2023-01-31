package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

   private ArrayList<Question> questions = new ArrayList<Question>();
   private int numberOfQuestionCorrect = 0;
   private Scanner scanner = new Scanner(System.in);

   public Quiz(){

   }

   public ArrayList<Question> getQuestions(){
       return this.questions;
   }

   public void askQuestion(Question question){
       this.questions.add(question);
   }

   private String getInputAnswers(){
      String inputAnswers = scanner.nextLine();
      return inputAnswers;
   }

   public void runQuiz(){
      for(Question question :questions) {
         System.out.println(question.getQuestion());

         String inputAnswer = this.getInputAnswers();
         boolean inputCorrectAnswer = question.checkAnswer(inputAnswer);

         if(inputCorrectAnswer){
            this.numberOfQuestionCorrect ++;
         }
      }

  //NEED TO GRADE QUIZ

      double gradeQuiz = ((double) this.numberOfQuestionCorrect / (double) this.questions.size()) * 100;
      System.out.println("Grade is " + gradeQuiz + "%");
   }

}


