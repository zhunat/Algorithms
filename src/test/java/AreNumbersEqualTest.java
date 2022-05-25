import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class AreNumbersEqualTest {
   /* Test Data:
            89, 89
    Expected result: 0
            -89, 89
    Expected result: -1
            89, -89
    Expected result: 1*/

    AreNumbersEqual ane;
    @BeforeEach
    void Setup (){ane = new AreNumbersEqual();}

    @Order(1)
    @Test
    public void testAreNumbersEqualHappyPathEqualNumbers (){
        int a = 89;
        int b = 89;
        int expectedResult = 0;

        //AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.areNumbersEqualAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);

    }
    @Order(2)
    @Test
    public void testAreNumbersEqualHappyPathFirstNumberIsLess (){
        int a = -89;
        int b = 89;
        int expectedResult = -1;

        //AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.areNumbersEqualAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);

    }
    @Order(3)
    @Test
    public void testAreNumbersEqualHappyPathFirstNumberIsGreater (){
        int a = 89;
        int b = -89;
        int expectedResult = 1;

        //AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.areNumbersEqualAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testAreNumbersEqualNegativeNumbers (){
        int a = -89;
        int b = -88;
        int expectedResult = -1;

        //AreNumbersEqual ane = new AreNumbersEqual();
        int actualResult = ane.areNumbersEqualAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);

    }
}
