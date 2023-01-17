package main.normalizers.utils;
public class NormaliserUtils {

    public static double validateSimilarity(String str1, String str2){
        double biggestStringLength = Double.max(str1.length(), str2.length());

        if (biggestStringLength > 0) {
            return (biggestStringLength - calculateLevenshteinDistanceBetweenStrings(str1, str2)) / biggestStringLength;
        }

        return 1.0;
    }

    private static int calculateLevenshteinDistanceBetweenStrings(String str1, String str2) {
        int str1Length = str1.length();
        int str2Length = str2.length();
        int numberOfChanges;

        int[][] finalResult = new int[str1Length + 1][str2Length + 1];

        for (int i = 1; i <= str1Length; i++){
            finalResult[i][0] = i;
        }

        for (int j = 1; j <= str2Length; j++) {
            finalResult[0][j] = j;
        }

        for (int i = 1; i <= str1Length; i++){
            for (int j = 1; j <= str2Length; j++){
                numberOfChanges = str1.charAt(i-1) == str2.charAt(j - 1) ? 0 : 1;
                finalResult[i][j] = Integer.min(
                        Integer.min(finalResult[i - 1][j] + 1, finalResult[i][j - 1] + 1),
                        finalResult[i - 1][j - 1] + numberOfChanges);
            }
        }

        return finalResult[str1Length][str2Length];
    }
}
