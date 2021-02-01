package be.intecbrussel.param;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class WordReverserTest {

    private WordReverser wordReverser;
    private String word;
    private String expectedResult;

    @Before
    public void initialize() {
        wordReverser = new WordReverser();
    }

    public WordReverserTest(String word, String expectedResult) {
        this.word = word;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection strings() {
        return Arrays.asList(new String[][] {
                { "Boot", "tooB" },
                { "Veilig", "gilieV" },
                { "reteiD", "Dieter" }
        });
    }

    @Test
    public void testWordReverser() {
        System.out.println("Word to be reversed: " + word);
        Assertions.assertEquals(expectedResult, wordReverser.reverseWord(word));
    }
}
