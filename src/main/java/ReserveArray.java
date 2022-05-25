public class ReserveArray {
    // Написать алгоритм ReverseArray, который принимает на вход массив целых чисел, и возвращает “перевернутый” массив.
    //Test Data:
    //{2, 7, 3, 10} → {10, 3, 7, 2}
    public int[]reserveArrayAlgorithm(int[]array){
        if(array.length == 0){
            return new int[]{};
        }
        int[] reversearray = new int[array.length];
        for(int i = 0; i < array.length; i++){
            reversearray[i] = array[array.length-1-i];
        }
        return reversearray;
    }
}
