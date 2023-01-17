package main;

import main.normalizers.Normaliser;

public class Main {
    public static void main(String[] args) {

        String jt = "Java enginner";
        Normaliser n = new Normaliser();

        String normalisedTitle = n.normalise(jt);
        n.printNormaliseJobTitle(jt, normalisedTitle);
        //output normalisedTitle

        jt = "C# enginner";
        normalisedTitle = n.normalise(jt);
        n.printNormaliseJobTitle(jt, normalisedTitle);
        //output normalisedTitle

        jt = "Chief Accountant";
        normalisedTitle = n.normalise(jt);
        n.printNormaliseJobTitle(jt, normalisedTitle);
        //output normalisedTitle

    }
}