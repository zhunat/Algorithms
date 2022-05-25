import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToLettersAndSpacesTest {

    @Test
    public void testStringToLettersAndSpaces(){
        String str = "abra  cf%$# _";
        String expectedResult = "abra  cf ";

        StringToLettersAndSpaces stlas = new StringToLettersAndSpaces();
        String actualResult = stlas.stringToLettersAndSpacesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
