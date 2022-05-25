public class StringToNumbersAndSpaces {
    public String stringToNumbersAndSpacesAlgorithm(String str) {
        if (str != null) {
            if (str.length() > 0) {
                String strLetters = "";
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == 32) {
                        strLetters += str.charAt(i);
                    }
                    if (str.charAt(i) > 47 && str.charAt(i) < 58) {
                        strLetters += str.charAt(i);
                    }
                }

                return strLetters;
            }
            return "";
        }

       return null;
    }
}
