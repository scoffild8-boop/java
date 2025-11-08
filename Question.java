package QCM;

import java.util.ArrayList;
import java.util.Scanner;

public class Question {
    private String enonce;
    private ArrayList<String> reponses;
    private int Pos;
    public Question(String enonce){
        this.enonce = enonce;
        reponses = new ArrayList<>();
        Pos = -1;
    }

    public String getEnonce() {
        return enonce;
    }

    public void setEnonce(String enonce) {
        this.enonce = enonce;
    }

    public ArrayList<String> getReponses() {
        return reponses;
    }

    public void setReponses(ArrayList<String> reponses) {
        this.reponses = reponses;
    }
    public void ajouterReponse(String reponse){
        reponses.add(reponse);
    }

    public int getPos() {
        return Pos;
    }

    public void setPos(int pos) {
        if (pos >= 1  && pos <= reponses.size()) {
            Pos = pos;
        } else {
            System.out.println("Position invalide");
        }
    }

    public boolean lireReponseAuClavier(Scanner sc){
        //this.toString();
        System.out.print("Votre reponse : ");
        int rep = sc.nextInt();
        return (rep) == Pos;
    }

    @Override
    public String toString() {
        System.out.println("Question: " + enonce);
        System.out.println("Les reponses: ");
        for (int i = 0; i < reponses.size(); i++) {
            System.out.println((i + 1) + "- " + reponses.get(i));
        }
        return "";
    }
}
