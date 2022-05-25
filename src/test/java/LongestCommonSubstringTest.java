import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonSubstringTest {
    //Написать алгоритм LongestCommonSubstring, который принимает 3 строки и ищет самое длинное общее пересечение:
    //
    //“Smaze”, “amazing”, “amazon” → “maz”
    @Test
    public void testLongestCommonSubstringHappyPathOne(){
        String str1 = "Smaze";
        String str2 = "amazing";
        String str3 = "maz";
        String expectedResult = "maz";

        LongestCommonSubstring lcs = new LongestCommonSubstring();
        String actualResult = lcs.longestCommonSubstringAlgorithm(str1, str2, str3);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testLongestCommonSubstringHappyPathTwo(){
        String str1 = "blazing";
        String str2 = "amazing";
        String str3 = "sizing";
        String expectedResult = "zing";

        LongestCommonSubstring lcs = new LongestCommonSubstring();
        String actualResult = lcs.longestCommonSubstringAlgorithm(str1, str2, str3);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
