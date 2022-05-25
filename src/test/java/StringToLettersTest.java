import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToLettersTest {

    @Test
    public void testStringToLetters(){
        String str = "ghfj7658 $&&._PLK   ";
        String expectedResult = "ghfjPLK";

        StringToLetters stl = new StringToLetters();
        String actualResult = stl.stringToLettersAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testStringToLettersEmptyString(){
        String str = "";
        String expectedResult = "";

        StringToLetters stl = new StringToLetters();
        String actualResult = stl.stringToLettersAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
