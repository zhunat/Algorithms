import java.util.Arrays;

public class StringToNumbers {

    //Написать алгоритм StringToNumbers, который принимает строку, и возвращает массив чисел:
    //Test Data:
    //“1, 2, 3, 4, 5” → {1, 2, 3, 4, 5}
    //(Без форматирования)

    public int[] stringToNumbersArrayAlgorithmVersionOne(String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() != 0) {
                String[] strArr = str.split(", ");
                str = str.replace(" ", "");
                str = str.replace(",", "");
                int[] numberArray = new int[strArr.length];
                for (int i = 0; i < numberArray.length; i++) {
                    if (Character.isDigit(str.trim().charAt(i))) {
                        numberArray[i] = Integer.parseInt(strArr[i]);
                    } else {
                        numberArray[i] = 0;
                    }
                }

                return numberArray;
            }

            return new int[]{};
        }

        return null;
    }

    public int[] stringToNumbersArrayAlgorithmVersionTwo(String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() != 0) {
                str = str.replace(" ", "");
                str = str.replace(",", "");
                char[] arrayChar = str.toCharArray();

                int[] numberArray = new int[arrayChar.length];
                for (int i = 0; i < numberArray.length; i++) {
                    //System.out.println(arrayChar[i] + 0 - 0);//ascii numeric values
                    if (Character.isDigit(arrayChar[i])) {
                        numberArray[i] = Integer.parseInt(String.valueOf(arrayChar[i]));
                    } else {
                        numberArray[i] = 0;
                    }
                }

                return numberArray;

            }
            return new int[]{};
        }

        return null;
    }






}
