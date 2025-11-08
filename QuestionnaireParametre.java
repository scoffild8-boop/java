package QCM;

import java.util.ArrayList;
import java.util.Scanner;

public final class QuestionnaireParametre extends Questionnaire {
    private ArrayList<Float> points;

    public QuestionnaireParametre(String titre) {
        super(titre);
        points = new ArrayList<>();
    }

    public void ajouterQuestion(Question question, float point) {
        super.ajouterQuestion(question);
        points.add(point);
    }

    @Override
    public double resultat() {
        float totalPoints = 0;
        for (float point : points) {
            totalPoints += point;
        }
        return (getNote() / totalPoints) * 20;
    }

    @Override
    public void testerReponse(Scanner sc) {
        int indice = getQuestionCourante() - 1;
        if (getQuestions().get(indice).lireReponseAuClavier(sc)) {
            setNote(getNote() + points.get(indice));
        }
    }

    @Override
    public void reinitialiser() {
        super.reinitialiser();
        setNote(0);
    }
}