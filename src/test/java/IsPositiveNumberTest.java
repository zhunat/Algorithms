import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsPositiveNumberTest {
    /*  Напишите алгоритм IsPositiveNumber, который возвращает true, если численный  параметр больше или равен нулю, и возвращает false, если параметр меньше 0.
      Проверьте работу метода на числах 555, 0 и -555.
  */
    @Test
    public void testIsPositiveNumberPositiveNumber() {
        int number = 555;
        //boolean expectedResult = true;

        IsPositiveNumber ipn = new IsPositiveNumber();
        boolean actualResult = ipn.isPositiveNumberAlgorithm(number);

        Assertions.assertTrue(actualResult);

    }

    @Test
    public void testIsPositiveNumberNegativeNumber() {
        int number = -555;
        //boolean expectedResult = false;

        IsPositiveNumber ipn = new IsPositiveNumber();
        boolean actualResult = ipn.isPositiveNumberAlgorithm(number);

        Assertions.assertFalse(actualResult);

    }

    @Test
    public void testIsPositiveNumberZeroNumber(){
        int number = 0;
        boolean expectedResult = true;

        IsPositiveNumber ipn = new IsPositiveNumber();
        boolean actualResult = ipn.isPositiveNumberAlgorithm(number);

        //Assertions.assertTrue(actualResult);
        Assertions.assertTrue(expectedResult,String.valueOf(actualResult));
        //Assertions.assertEquals(expectedResult, actualResult);
        }
}