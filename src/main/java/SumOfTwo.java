public class SumOfTwo {
    //14.	Написать алгоритм SumOfTwo, который принимает на вход массив целых чисел,  и число n. Алгоритм
    // возвращает пары элементов, которые в сумме дают число n.
    //Test Data:
    //({4, 3, 7, 12, 5, 2, 9, 4, 12}, 12)  → {{3, 9}, {7, 5}} // 2D array

    public int[][] sumOfTwoAlgorithm (int[]array, int sum) {
        if (array.length == 0) {
            return new int[][]{};
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    count++;
                }
            }
        }
        if (count == 0) {
            return new int[][]{};
        }
        int[][] result = new int[count][2];// 2D array
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    result[number][0] = array[i];
                    result[number][1] = array[j];
                    number++;
                }
            }
        }
        return result;
    }
}
