public class KthLargest {
    //Написать алгоритм KthLargest, который принимает на вход массив целых чисел и число k, и возвращает k-тый максимальный элемент.
    //Test Data:
    //({4, 3, 7, 12, 5, 2, 9, 4, 12}, 3) → 9
    // (12 и 12 - первый и второй самые большие элементы)

    public int kthLargestAlgoryithm(int[]array, int k){
        if(array.length == 0 || k < 0 || k >= array.length){
            return 0;
        }
       /* SortArray so = new SortArray();
        int[] array1 = so.sortArrayAlgorithm(array);

        return array1[array.length-k];
        */
        int[]sorted = {};
        for(int i = 0; i < array.length; i++){
            for(int j = i + 1; j < array.length; j++){
                int temp;
                if(array[i] < array[j]) {
                    temp = array[i];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        sorted = array;
        return sorted[k - 1];
    }
}
