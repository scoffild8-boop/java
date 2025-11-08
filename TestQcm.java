package QCM;

import java.util.Scanner;

public class TestQcm {
    public static void main(String[] args) {
        QuestionnaireParametre questionnaire = new QuestionnaireParametre("QCM sur la programmation en Java");
        Question question = new Question("Qu'est-ce qu'une classe en Java ?");
        question.ajouterReponse("Un type de données primitif");
        question.ajouterReponse("Un modèle pour créer des objets");
        question.ajouterReponse("Une bibliothèque externe");
        question.setPos(2);
        questionnaire.ajouterQuestion(question,2);

        question = new Question("Quelle est la méthode principale en Java ?");
        question.ajouterReponse("public static void main(String[] args)");
        question.ajouterReponse("public void start()");
        question.ajouterReponse("public static void run()");
        question.setPos(1);
        questionnaire.ajouterQuestion(question,3);

        question = new Question("Que signifie JRE ?");
        question.ajouterReponse("Java Runtime Environment");
        question.ajouterReponse("Java Real-time Engine");
        question.ajouterReponse("Java Remote Execution");
        question.setPos(1);
        questionnaire.ajouterQuestion(question,1);

        
        questionnaire.reinitialiser();
        System.out.println(questionnaire.getTitre());
        Scanner sc = new Scanner(System.in);
        while (questionnaire.resteDesQuestions()) {
            questionnaire.afficherQuestionSuivante();
            questionnaire.testerReponse(sc);
        }
        System.out.println();
        System.out.println("Votre note : " + String.format("%.2f", questionnaire.resultat()) + "/20");
        questionnaire.reinitialiser();
    }
}