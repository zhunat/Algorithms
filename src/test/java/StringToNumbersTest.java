import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringToNumbersTest {
    //Написать алгоритм StringToNumbers, который принимает строку, и возвращает массив чисел:
    //Test Data:
    //“1, 2, 3, 4, 5” → {1, 2, 3, 4, 5}
    //(Без форматирования)

    @Test
    public void testStringToNumbersHappyPath(){
        String str = "1, 2, 3, 4, 5";
        int[] expectedResult = {1, 2, 3, 4, 5};

        StringToNumbers stn = new StringToNumbers();
        int[] actualResult = stn.stringToNumbersArrayAlgorithmVersionOne(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testStringToNumbersFromMixed(){
        String str = "M, 2, 3, 4, 5";
        int[] expectedResult = {0, 2, 3, 4, 5};

        StringToNumbers stn = new StringToNumbers();
        int[] actualResult = stn.stringToNumbersArrayAlgorithmVersionOne(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testStringToNumbersFromLetters(){
        String str = "M, 2, 3, !, 5";
        int[] expectedResult = {0, 2, 3, 0, 5};

        StringToNumbers stn = new StringToNumbers();
        int[] actualResult = stn.stringToNumbersArrayAlgorithmVersionTwo(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testStringToNumbersFromEmpty(){
        String str = "";
        int[] expectedResult = {};

        StringToNumbers stn = new StringToNumbers();
        int[] actualResult = stn.stringToNumbersArrayAlgorithmVersionTwo(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testStringToNumbersFromSpaces(){
        String str = "      ";
        int[] expectedResult = {};

        StringToNumbers stn = new StringToNumbers();
        int[] actualResult = stn.stringToNumbersArrayAlgorithmVersionTwo(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
