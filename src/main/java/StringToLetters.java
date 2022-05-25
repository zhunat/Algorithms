public class StringToLetters {
    // Написать  алгоритм StringToLetters.Каждый алгоритм принимает строку,  и удаляет ненужные символы:
    //Delete all but letters.
    public String stringToLettersAlgorithm(String str){
        if(str != null){
                if(str.length() > 0){
                    str = str.trim();
                    if(str.length() > 0) {
                        String strLetters = "";
                        for (int i = 0; i < str.length(); i++) {
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

                return "";
        }

        return null;
    }

}
