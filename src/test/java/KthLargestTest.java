import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class KthLargestTest {
    // //Написать алгоритм KthLargest, который принимает на вход массив целых чисел и число k, и возвращает k-тый максимальный элемент.
    //    //Test Data:
    //    //({4, 3, 7, 12, 5, 2, 9, 4, 12}, 3) → 9
    //    // (12 и 12 - первый и второй самые большие элементы)/
    KthLargest kt;
    @BeforeEach
    void Setup(){kt = new KthLargest();}

    @Test
    public void testKthLargestHappyPathOne(){
        int[]array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 3;
        int expectedResult = 9;

        //KthLargest kt = new KthLargest();
        int actualResult = kt.kthLargestAlgoryithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testKthLargestHappyPathTwo(){
        int[]array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 5;
        int expectedResult = 5;

        //KthLargest kt = new KthLargest();
        int actualResult = kt.kthLargestAlgoryithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testKthLargestNegativeInt(){
        int[]array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = -5;
        int expectedResult = 0;

        int actualResult = kt.kthLargestAlgoryithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testKthLargestEmptyArray(){
        int[]array = {};
        int k = 5;
        int expectedResult = 0;

        int actualResult = kt.kthLargestAlgoryithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testKthLargestIntGreaterThanArrayLength(){
        int[]array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 10;
        int expectedResult = 0;

        int actualResult = kt.kthLargestAlgoryithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testKthLargestIntGreaterEqualArrayLength(){
        int[]array = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int k = 9;
        int expectedResult = 0;

        int actualResult = kt.kthLargestAlgoryithm(array, k);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
