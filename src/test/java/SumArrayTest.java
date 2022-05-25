import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumArrayTest {
    //Написать алгоритм SumArray, который возвращает сумму всех чисел массива
    //
    //Test Data:
    //{0, 1, 2, 3, 4, 5} → 15
    //{-7, -3} → -10

    SumArray sa;
    int actualResult;
    @BeforeEach
    void SetUp(){sa = new SumArray();}

    @Test
    public void testSumArrayHappyPathPositiveNumbers(){
        int[] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayHappyPathNegativeNumbers(){
        int[] array = {-7, -3};
        int expectedResult = -10;

        //SumArray sa = new SumArray();
        int actualResult = sa.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayHappyPathMixedNumbers(){
        int[] array = {-7, -3, 0, 4, 6, -2};
        int expectedResult = -2;

        //SumArray sa = new SumArray();
        int actualResult = sa.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayHappyPathOneNumber(){
        int[] array = {-7};
        int expectedResult = -7;

        //SumArray sa = new SumArray();
        int actualResult = sa.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayEmpty(){
        int[] array = {};
        int expectedResult = 0;

        //SumArray sa = new SumArray();
        int actualResult = sa.sumArray(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
