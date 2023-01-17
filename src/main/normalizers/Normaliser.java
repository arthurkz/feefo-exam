package main.normalizers;

import main.normalizers.utils.NormaliserUtils;

public class Normaliser implements Normalise {

    @Override
    public String normalise(String jobTitle) {
        double q;
        double bestSimilarityNumber = 0.0;
        String normalizedJobTitle = null;

        for (String titles : normalizedJobTitlesList) {
            q = NormaliserUtils.validateSimilarity(jobTitle, titles);

            if (bestSimilarityNumber == 0.0 || bestSimilarityNumber < q) {
                normalizedJobTitle = titles;
                bestSimilarityNumber = q;
            }
        }

        return normalizedJobTitle;
    }

    public void printNormaliseJobTitle(String input, String normalisedJobTitle) {
        System.out.println("input : ".concat(input) + " - normalized: ".concat(normalisedJobTitle));
    }

}
