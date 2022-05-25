public class NegativeOnTheRight {
    //3. Написать алгоритм NegativeOnTheRight, который принимает на вход массив целых чисел, и возвращает массив,  в котором все негативные числа находятся во второй половине массива
    //Test Data:
    //{4, -3, 7, -12, 5, -2, 9, 4, 12} → {4, 7, 5, 9, 4, 12, -3, -12, -2}
    public int[] negativeOnTheRightAlgorithm(int[]array){
       if(array.length == 0){
           return new int[]{};
       }
       int[] array1 = new int[array.length];
       int j = 0;
       for(int i = 0; i < array.length; i++){
           if(array[i] > 0){
               array1[j] = array[i];
               j++;
           }
       }
        for(int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array1[j] = array[i];
                j++;
            }
        }
       return array1;
    }
    public int[] negativeOnTheRightAlgorithmIrina(int[]array) {// different outcome {4, 7, 5, 9, 4, 12, -2, -12, -3};
        if (array.length == 0) {
            return new int[]{};
        }
        int[] result = new int[array.length];
        int count1 = result.length - 1;
        int count2 = 0;
        for (int i = 0; i < result.length; i++) {
            if (array[i] < 0) {
                result[count1] = array[i];
                count1--;
            } else {
                result[count2] = array[i];
                count2++;
            }
        }
        return result;
    }
}
