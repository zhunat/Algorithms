import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinMaxAveTest {
       /* 8.	Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов.
   Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,  и среднее среди
   всех значений между 2-мя индексами.

    Test Data:
            ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
*/
    @Test
    public void testMinMaxAveHappyPath(){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int a = 2;
        int b = 6;
        int[] expectedResult = {3, 7, 5};

        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAveAlgorithm(array, a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveHappyPathNegativeNumbers(){
        int[] array = {-5, -2, -5, -4, -5, -1, -7, -1};
        int a = 2;
        int b = 3;
        int[] expectedResult = {-5,-4,-4};

        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAveAlgorithm(array, a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveEmptyArray(){
        int[] array = {};
        int a = 2;
        int b = 3;
        int[] expectedResult = {};

        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAveAlgorithm(array, a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveNegativeIndex(){
        int[] array = {8, 9, 0, 5, 6};
        int a = -2;
        int b = 3;
        int[] expectedResult = {};

        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAveAlgorithm(array, a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testMinMaxAveSameIndices(){
        int[] array = {8, 9, 6, 4};
        int a = 3;
        int b = 3;
        int[] expectedResult = {4, 4, 4};

        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAveAlgorithm(array, a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testMinMaxAveFirstIndexIsGreaterThanSecond(){
        int[] array = {1, 3, 5, 6, 5, 9};
        int a = 5;
        int b = 3;
        int[] expectedResult = {};

        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAveAlgorithm(array, a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveSecondIndexIsGreaterThanArrayLength(){
        int[] array = {1, 6, 2, 5, 6, 8};
        int a = 2;
        int b = 6;
        int[] expectedResult = {};

        MinMaxAve mma = new MinMaxAve();
        int[] actualResult = mma.minMaxAveAlgorithm(array, a, b);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
