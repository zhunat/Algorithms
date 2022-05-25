public class ReverseString {
    //Написать алгоритм ReverseString, который переворачивает строку:
    //Test Data:
    //“Abracadabra” → “arbadacarbA”
    public String reverseStringAlgorithm(String str){
        if(str != null && str.length() > 0){
            String reverse = "";
            for(int i = str.length()-1; i >= 0 ; i--){
                reverse += str.charAt(i);
            }
            return reverse;
        }
        return null;
    }
}
