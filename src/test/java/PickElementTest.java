import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PickElementTest {
    // //10.	Написать алгоритм PeakElement,  который принимает на вход массив целых чисел и возвращает значения пиковых
    //    // элементов (элементы, которые больше своих соседей).
    //    //Test Data:
    //    //{3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}

    @Test
    public void testPickElementHappyPathOne(){
        int[]array = {3, 2, 7, 5, 1, 9, 23, 1};
        int[]expectedResult = {3, 7, 23};

        PickElement pe = new PickElement();
        int[]actualResult = pe.peakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testPickElementHappyPathTwo(){
        int[]array = {3, 7, 7, 5, 1, 9, 0, 1};
        int[]expectedResult = {9,1};

        PickElement pe = new PickElement();
        int[]actualResult = pe.peakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }
    @Test
    public void testPickElementHappyPathNegative(){
        int[]array = {-3, -7, -7, -5};
        int[]expectedResult = {-3,-5};

        PickElement pe = new PickElement();
        int[]actualResult = pe.peakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }
    @Test
    public void testPickElementZeros(){
        int[]array = {0, 0, 0, 0, 0};
        int[]expectedResult = {};

        PickElement pe = new PickElement();
        int[]actualResult = pe.peakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }
    @Test
    public void testPickElementEmptyArray(){
        int[]array = {};
        int[]expectedResult = {};

        PickElement pe = new PickElement();
        int[]actualResult = pe.peakElementAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }
}
