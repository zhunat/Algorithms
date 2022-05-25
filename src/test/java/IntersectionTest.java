import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

   public class IntersectionTest {
      /*9. 	Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел и возвращает
    массив общих элементов.

      Test Data:
      {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
      {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
      {1, 2, 4, 5, 89}, {8, 9, 45} → {}
  */
      @Test
      public void testIntersectionHappyPathOne() {
          int[] array1 = {1, 2, 4, 5, 89};
          int[] array2 = {8, 9, 4, 2};
          int[] expectedResult = {2, 4};

          Intersection is = new Intersection();
          int[] actualResult = is.intersectionAlgorithm(array1, array2);

          Assertions.assertArrayEquals(expectedResult, actualResult);
      }
      @Test
      public void testIntersectionHappyPathTwo() {
          int[] array1 = {1, 2, 4, 5, 8, 9};
          int[] array2 = {8, 9, -4, -2};
          int[] expectedResult = {8,9};

          Intersection is = new Intersection();
          int[] actualResult = is.intersectionAlgorithm(array1, array2);

          Assertions.assertArrayEquals(expectedResult, actualResult);
      }

       @Test
       public void testIntersectionHappyPathThree() {
           int[] array1 = {1, 2, 4, 5, 89};
           int[] array2 = {8, 9, -4, -2};
           int[] expectedResult = {};

           Intersection is = new Intersection();
           int[] actualResult = is.intersectionAlgorithm(array1, array2);

           Assertions.assertArrayEquals(expectedResult, actualResult);
       }

       @Test
       public void testIntersectionHappyPathFour() {
           int[] array1 = {1, 2, 2, 5, 4, 4};
           int[] array2 = {4, 4, -4, -2};
           int[] expectedResult = {4};

           Intersection is = new Intersection();
           int[] actualResult = is.intersectionAlgorithm(array1, array2);

           Assertions.assertArrayEquals(expectedResult, actualResult);

       }
       @Test
       public void testIntersectionHappyPathFive() {
           int[] array1 = {1, 2, 2, 5, 4, 4};
           int[] array2 = {0, 0, 0, 0};
           int[] expectedResult = {};

           Intersection is = new Intersection();
           int[] actualResult = is.intersectionAlgorithm(array1, array2);

           Assertions.assertArrayEquals(expectedResult, actualResult);

       }

  }