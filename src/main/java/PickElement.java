import java.util.Arrays;

public class PickElement {
    //10.	Написать алгоритм PeakElement,  который принимает на вход массив целых чисел и возвращает значения пиковых
    // элементов (элементы, которые больше своих соседей).
    //Test Data:
    //{3, 2, 7, 5, 1, 9, 23, 1} → {3, 7, 23}

    public int[] peakElementAlgorithm(int[] array) {
        if (array.length > 0) {
            int count = 0;
            for (int i = 0; i < array.length; i++){
                if (i == 0 && array[i] > array[i+1]) {
                    count++;
                }
                 if (i > 0 && i < array.length - 1
                          && array[i] > array[i - 1] && array[i] > array[i + 1]) {
                     count++;
                 }
                 if (i == array.length - 1 && array[i] > array[i - 1]) {
                     count++;
                 }
            }

            System.out.println(count);
            if (count == 0) {
                 return new int[]{};
            } else {
                 int[] resultArray = new int[count];
                  int k = 0;
                  for(int i  = 0; i < array.length; i++) {
                      if (i == 0 && array[i] > array[i+1]) {
                          resultArray[k] = array[i];
                          k++;
                      }
                      if ( i > 0 && i < array.length -1 &&
                          array[i] > array[i - 1] && array[i] > array[i + 1]) {
                          resultArray[k] = array[i];
                          k++;
                      }
                      if (i == array.length-1 && array[i] > array[i-1]) {
                          resultArray[k] = array[i];
                      }
                  }
                  return resultArray;
            }
            //return resultArray;

        }

        return new int[]{};
    }


    public static void main(String[] args) {
        PickElement pe = new PickElement();
        System.out.println(Arrays.toString(pe.peakElementAlgorithm(new int[]{3, 2, 7, 5, 1, 9, 23, 1})));
        System.out.println(Arrays.toString(pe.peakElementAlgorithm(new int[]{3, 7, 7, 5, 1, 9, 0, 1})));
    }


}
