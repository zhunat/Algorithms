import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesTest {
    /*Написать алгоритм RemoveDuplicates, который принимает строку и возвращает строку уникальных букв:
            “AABBCCaabbcc” → “abc”
*/
    @Test
    public void testRemoveDuplicatesHappyPath(){
        String str = "AABBCCaabbcc";
        String expectedResult = "abc";

        RemoveDuplicates rd = new RemoveDuplicates();
        String actualResult = rd.removeDuplicatesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testRemoveDuplicates(){
        String str = "AABBCCaabDbccf";
        String expectedResult = "abcdf";

        RemoveDuplicates rd = new RemoveDuplicates();
        String actualResult = rd.removeDuplicatesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
