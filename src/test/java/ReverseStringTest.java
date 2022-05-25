import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {
    //Написать алгоритм ReverseString, который переворачивает строку:
    //Test Data:
    //“Abracadabra” → “arbadacarbA”

    @Test
    public void testReverseString(){
        String str = "Abracadabra";
        String expectedresult = "arbadacarbA";

        ReverseString rs = new ReverseString();
        String actualResult = rs.reverseStringAlgorithm(str);

        Assertions.assertEquals(expectedresult, actualResult);
    }
    @Test
    public void testReverseStringEmptyString(){
        String str = "";
        String expectedresult = null;

        ReverseString rs = new ReverseString();
        String actualResult = rs.reverseStringAlgorithm(str);

        Assertions.assertEquals(expectedresult, actualResult);
    }
}
