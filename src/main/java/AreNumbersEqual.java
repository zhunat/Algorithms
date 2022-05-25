public class AreNumbersEqual {
/*
    Create algorithm AreNumbersEqual which accepts 2  int numbers and returns
    0 if numbers are equal
   -1 if the second number is greater than the first number
    1 if the first number is greater than the second number
*/
    public int areNumbersEqualAlgorithm(int a, int b){
        if(a == b) {
            return 0;
        } else {
            if( a > b) {
                return 1;
            } else
                return -1;
        }
    }
}
