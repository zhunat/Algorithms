public class MinMaxAve {
   /* 8.	Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов.
   Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,  и среднее среди
   всех значений между 2-мя индексами.

    Test Data:
            ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}
*/
    public int[] minMaxAveAlgorithm (int[] array, int a, int b){
        if(array.length > 0 && a >= 0 && b < array.length && a <= b) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int ave = 0;
            for(int i = a; i <= b; i++){
                ave += array[i];
                if(array[i] <= min){
                    min = array[i];
                }
                if(array[i] >= max){
                    max = array[i];
                }
            }
            ave = ave / (b - a + 1);
            return new int[]{min, max, ave};
        }
        return new int[]{};
    }
}
