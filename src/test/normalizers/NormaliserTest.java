package test.normalizers;


import main.normalizers.Normaliser;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class NormaliserTest {

    private final String inputString = "Java enginner";
    private Normaliser normaliser;

    @Before
    public void setUp(){
        normaliser = new Normaliser();
    }

    @Test
    public void returnInputStringNormalized(){
        String normalizedString = normaliser.normalise(inputString);
        assertEquals("Software engineer", normalizedString);
    }
}