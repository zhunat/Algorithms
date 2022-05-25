public class StringToLettersAndSpaces {
    public String stringToLettersAndSpacesAlgorithm(String str) {
        if (str != null) {
            if (str.length() > 0) {
                String strLetters = "";
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == 32) {
                        strLetters += str.charAt(i);
                    }
                    if (str.charAt(i) > 64 && str.charAt(i) < 91) {
                        strLetters += str.charAt(i);
                    }
                    if (str.charAt(i) > 96 && str.charAt(i) < 123) {
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
