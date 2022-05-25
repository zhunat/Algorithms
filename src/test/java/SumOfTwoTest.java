import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfTwoTest {
    //14.	Написать алгоритм SumOfTwo, который принимает на вход массив целых чисел,  и число n. Алгоритм
    // возвращает пары элементов, которые в сумме дают число n.
    //Test Data:
    //({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}} // 2D array

   @Test
    public void testSumOfTwoHappyPathOne(){
        int[] array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int sum = 12;
        int[][] expectedResult = {{3, 9}, {7, 5}};

        SumOfTwo sot = new SumOfTwo();
        int[][]actualResult = sot.sumOfTwoAlgorithm(array, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testSumOfTwoHappyPathTwo(){
        int[] array = {7, 8, 5, 43, -98, -9, 0};
        int sum = 34;
        int[][] expectedResult = {{43, -9}};

        SumOfTwo sot = new SumOfTwo();
        int[][]actualResult = sot.sumOfTwoAlgorithm(array, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
