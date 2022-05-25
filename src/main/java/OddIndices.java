public class OddIndices {
    // Написать алгоритм OddIndices, который принимает массив чисел,  и возвращает массив значений нечетных индексов
    //Test Data:
    //Input = {-45, 590, 234, 985, 12, 68}
    //Expected Result =  {590, 985, 68}

    public int[] oddIndicesAlgorithm (int[] array) {
        if( array.length > 0 ){
            int[] oddArray = new int[array.length / 2];
            for(int i = 0, j = 0; i < array.length && j < oddArray.length; i++){
                if(i % 2 != 0) {
                    oddArray[j] = array[i];
                    j++;
                }
            }

            return oddArray;
        }
        return new int[]{};
    }





}
