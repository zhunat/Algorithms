import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringIntersectionTest {
    //Написать алгоритм StringIntersection,  который принимает на вход 2 строки и возвращает общее вхождение в этих строках
    //Test Data:
    //“Carrot”, “carwash” → “car”
    //“Noob”, “Schmooze” → “oo”

    @Test
    public void testStringIntersectionHappyPathOne(){
        String str1 = "Carrot";
        String str2 = "carwash";
        String expectedResult = "car";

        StringIntersection si = new StringIntersection();
        String actualResult = si.stringIntersectionAlgorithm(str1, str2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testStringIntersectionHappyPathTwo(){
        String str1 = "Noob";
        String str2 = "Schmooze";
        String expectedResult = "oo";

        StringIntersection si = new StringIntersection();
        String actualResult = si.stringIntersectionAlgorithm(str1, str2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testStringIntersectionHappyPathThree(){
        String str1 = "kadAbra";
        String str2 = "Kadabra";
        String expectedResult = "kadabra";

        StringIntersection si = new StringIntersection();
        String actualResult = si.stringIntersectionAlgorithm(str1, str2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testStringIntersectionHappyPathFour(){
        String str1 = "kadAbra";
        String str2 = "abra";
        String expectedResult = "abra";

        StringIntersection si = new StringIntersection();
        String actualResult = si.stringIntersectionAlgorithm(str1, str2);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
