import java.util.Arrays;

public class Intersection {
    /*9. 	Написать алгоритм Intersection, который принимает на вход 2 массива целых чисел и возвращает
    массив общих элементов.

      Test Data:
      {1, 2, 4, 5, 89}, {8, 9, 4, 2} → {2, 4}
      {1, 2, 4, 5, 8, 9}, {8, 9, -4, -2} → {8, 9}
      {1, 2, 4, 5, 89}, {8, 9, 45} → {}
  */
    public int[] intersectionAlgorithm(int[] array1, int[] array2) {
        if(array1.length > 0 && array2.length > 0) {// common part for both tests

     /*       for(int i = 0; i < array1.length; i++){
                for(int j = i +1; j < array1.length; j++){
                    if(array1[i] == array1[j]) {
                        array1[j] = Integer.MIN_VALUE;
                    }
                }
            }

            for(int i = 0; i < array2.length; i++){
                 for(int j = i + 1; j < array2.length; j++){
                      if(array2[i] == array2[j]) {
                          array2[j] = Integer.MAX_VALUE;
                      }
                }
            }

            int count = 0;
            for(int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i] == array2[j] && array1[i] != Integer.MIN_VALUE && array2[j] != Integer.MAX_VALUE) {
                        count++;
                        j = array2.length;
                    }
                }
            }
            int[] array3 = new int[count] ;
            for(int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i] == array2[j] && array1[i] != Integer.MIN_VALUE && array2[j] != Integer.MAX_VALUE) {
                        array3[array3.length-count] = array1[i];
                        count--;
                        j = array2.length;
                    }
                }
            }
            return array3;
        */

            int[]array1UniqueNumbers = Arrays.stream(array1).distinct().toArray();
            int[]array2UniqueNumbers = Arrays.stream(array2).distinct().toArray();
            int count1 = 0;
            for(int i = 0; i < array1UniqueNumbers.length; i++) {
                for (int j = 0; j < array2UniqueNumbers.length; j++) {
                    if (array1UniqueNumbers[i] == array2UniqueNumbers[j]){
                        count1++;
                        j = array2UniqueNumbers.length;
                    }
                }
            }
            int[] resultArray = new int[count1] ;
            for(int i = 0; i < array1UniqueNumbers.length; i++) {
                for (int j = 0; j < array2UniqueNumbers.length; j++) {
                    if (array1UniqueNumbers[i] == array2UniqueNumbers[j]) {
                        resultArray[resultArray.length-count1] = array1UniqueNumbers[i];
                        count1--;
                        j = array2UniqueNumbers.length;
                    }
                }
            }
            return resultArray;
        }

        return new int[]{};
    }




}