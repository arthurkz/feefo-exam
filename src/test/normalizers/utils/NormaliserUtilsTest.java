package test.normalizers.utils;


import main.normalizers.utils.NormaliserUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class NormaliserUtilsTest {

    private String str1TestMock = "Chief Account";
    private String str2TestMock = "Accountant";

    @Test
    public void returnSimilarityBetweenTwoStrings(){
        var similarityValue = NormaliserUtils.validateSimilarity(str1TestMock, str2TestMock);
        assertTrue(0.3076923076923077 == similarityValue);
    }

    @Test
    public void returnOneBiggestStringEqualToZero(){
        var similiarityValue = NormaliserUtils.validateSimilarity("", "");
        assertTrue(1.0 == similiarityValue);
    }


}