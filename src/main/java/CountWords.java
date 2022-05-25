import java.util.Locale;

public class CountWords {
    //Напишите алгоритм CountWords, который принимает на вход текст и слово,  и считает все вариации этого слова
    // в тексте:
    public int countWordsAlgorithm(String text, String word){
        if(text != null && word != null){
            if(text.length() > 0 && word.length() > 0){
                int count = 0;
                String wordLower = word.toLowerCase();
                for(int i = 0; i < text.length()-word.length(); i++){
                    String sub = text.substring(i, i + word.length());
                    if(sub.contains(word)){
                        count++;
                        i += word.length();
                    }
                    if(sub.contains(wordLower)) {
                        count++;
                        i += word.length();
                    }
                }
                return count;
            }
            return 0;
        }
        return 0;
    }


}
