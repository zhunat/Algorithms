import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OddIndicesTest {

    @Test
    public void testOddIndicesHappyPathArrayLengthEven (){
        int[]array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        OddIndices oi = new OddIndices();
        int[] actualResult = oi.oddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesHappyPathArrayLengthOdd (){
        int[]array = {-45, 590, 234, 985, 12};
        int[] expectedResult = {590, 985};

        OddIndices oi = new OddIndices();
        int[] actualResult = oi.oddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
    @Test
    public void testOddIndicesHappyPathArrayLengthOne (){
        int[]array = {-45};
        int[] expectedResult = {};

        OddIndices oi = new OddIndices();
        int[] actualResult = oi.oddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesArrayLengthZero (){
        int[]array = {};
        int[] expectedResult = {};

        OddIndices oi = new OddIndices();
        int[] actualResult = oi.oddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
