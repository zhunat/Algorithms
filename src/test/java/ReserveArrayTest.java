import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReserveArrayTest {
    // Написать алгоритм ReverseArray, который принимает на вход массив целых чисел, и возвращает “перевернутый” массив.
    //Test Data:
    //{2, 7, 3, 10} → {10, 3, 7, 2}

    ReserveArray ra;
    @BeforeEach
    void Setup(){ra = new ReserveArray();}

    @Test
    public void testReserveArrayHappyPath() {
        int[]array = {2, 7, 3, 10};
        int[]expectedResult = {10, 3, 7, 2};

        //ReserveArray ra = new ReserveArray();
        int[]actualResult = ra.reserveArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }
    @Test
    public void testReserveArrayHappyPathNegativeNumbers() {
        int[]array = {-2, -7, -3, -10};
        int[]expectedResult = {-10, -3, -7, -2};

        //ReserveArray ra = new ReserveArray();
        int[]actualResult = ra.reserveArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }
}
