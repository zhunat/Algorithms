import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToNumbersAndSpacesTest {

        @Test
        public void testStringToLettersAndSpaces(){
            String str = "abra 6 cf%$# _";
            String expectedResult = " 6  ";

            StringToNumbersAndSpaces stnas = new StringToNumbersAndSpaces();
            String actualResult = stnas.stringToNumbersAndSpacesAlgorithm(str);

            Assertions.assertEquals(expectedResult, actualResult);
        }
}
