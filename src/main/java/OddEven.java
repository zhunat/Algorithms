public class OddEven {
    //Создать алгоритм OddEven, который принимает на вход целое число, возвращает “Odd”,  если число нечетное,
    // и “Even”, если число четное. Во всех остальных случаях результат будет “Undefined”.
    //
    //Test Data:
    //-345 →  “Odd”
    //0 →  “Even”
    //222222 →  “Even”
    //2147483647 + 1 →  “Undefined”

    public String oddEvenAlgorithm (long number) {
        if (number > 2147483647 || number < -2147483648) {
        //if ((number > 0 && (number + 1) < 0) || (number < 0 && (number -1) > 0)) {

            return "Undefined";

        }  else  {
            if(number % 2 == 0) {

               return "Even";
            } else

               return "Odd";
        }
    }
}
