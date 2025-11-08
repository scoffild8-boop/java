package QCM;

import java.util.ArrayList;
import java.util.Scanner;

public sealed class Questionnaire permits QuestionnaireParametre {
    private String titre;
    private ArrayList<Question> questions;
    private double note;
    private int questionCourante;

    public Questionnaire(String titre){
        this.titre = titre;
        questions = new ArrayList<>();
        note = 0;
        questionCourante = 0;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public int getQuestionCourante() {
        return questionCourante;
    }

    public void setQuestionCourante(int questionCourante) {
        this.questionCourante = questionCourante;
    }
    public void ajouterQuestion(Question question){
        questions.add(question);
    }
    public boolean resteDesQuestions(){
       if (questionCourante < questions.size()){
           this.questionCourante++;
           return true;
       } else {
           return false;
       }
    }
    public void afficherQuestionSuivante(){
        System.out.println(questions.get(questionCourante - 1).toString());
    }
    public void testerReponse(Scanner sc){
        if (questions.get(questionCourante - 1).lireReponseAuClavier(sc)){
            note++;
        }
    }
    public double resultat(){
        return (double) note / questions.size() * 20;
    }
    public void reinitialiser(){
        note = 0;
        questionCourante = 0;
    }

}
