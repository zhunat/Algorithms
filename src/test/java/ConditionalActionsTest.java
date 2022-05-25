import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConditionalActionsTest {
    ConditionalActions ca;
    @BeforeEach
    void SetUp(){ca = new ConditionalActions();}

    @Test
    public void testConditionalActionsHappyPathMultipleOfBoth(){
        int M = 15;
        String expectedResult = "Good Number";

        //ConditionalActions ca = new ConditionalActions();
        String actualResult = ca.conditionalActionsAlgorithm(M);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testConditionalActionsHappyPathMultipleOfThreeOnly(){
        int M = 9;
        String expectedResult = "Bad Number";

        //ConditionalActions ca = new ConditionalActions();
        String actualResult = ca.conditionalActionsAlgorithm(M);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testConditionalActionsHappyPathMultipleOfFiveOnly(){
        int M = 20;
        String expectedResult = "Poor Number";

        //ConditionalActions ca = new ConditionalActions();
        String actualResult = ca.conditionalActionsAlgorithm(M);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testConditionalActionsZeroNumber(){
        int M = 0;
        String expectedResult = "Good Number";

        //ConditionalActions ca = new ConditionalActions();
        String actualResult = ca.conditionalActionsAlgorithm(M);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
