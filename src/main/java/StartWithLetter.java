public class StartWithLetter {
    //Написать алгоритм StartsWithLetter, который принимает на вход текст,  и возвращает в виде строки все слова,
    // которые начинаются с буквы l.

    public String startWithLetterAlgorithm(String text, char l) {
        if (text != null && !text.isEmpty() && !Character.isDigit(l)) {
            text = text.replace("\n", " ");
            text = text.replace(", ", " ");
            text = text.replace(". ", " ");
            String startWithL = "";
            String[] arrayFromString = text.split(" ");
            for (int i = 0; i < arrayFromString.length; i++) {
                if (arrayFromString[i].charAt(0) == 'l' || arrayFromString[i].charAt(0) == 'L') {
                    startWithL += arrayFromString[i] + ", ";
                }
            }

            return startWithL.substring(0, startWithL.length()-2);
        }
        return null;
    }
}
