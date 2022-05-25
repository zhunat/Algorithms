import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CapitalizeWordsTest {

    //// Написать алгоритм CapitalizeWords, который принимает на вход предложение
    //// с единичным пробелом между словами,
    //// и возвращает предложение, в котором все слова написаны с большой буквы
    //// "        happy birthday!  " --> "Happy Birthday!"
    //// "     john jacob smith jr." --> "John Jacob Smith Jr."
    CapitalizeWords cw;
    @BeforeEach
    void setUp() {cw = new CapitalizeWords();}

    @Test
    public void testCapitalizeWordsHappyPathWithSpaces(){
        String sentence = "        happy birthday!  ";
        String expectedResult = "Happy Birthday!";

        //CapitalizeWords cw = new CapitalizeWords();
        String actualResult = cw.capitalizeWordsAlgorithm(sentence);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testCapitalizeWordsHappyPath(){
        String sentence = "     john jacob smith jr.";
        String expectedResult = "John Jacob Smith Jr.";

        //CapitalizeWords cw = new CapitalizeWords();
        String actualResult = cw.capitalizeWordsAlgorithm(sentence);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
