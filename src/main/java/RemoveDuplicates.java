import java.util.Locale;

public class RemoveDuplicates {
    //Написать алгоритм RemoveDuplicates, который принимает строку и возвращает строку уникальных букв:
    //“AABBCCaabbcc” → “abc”
    public String removeDuplicatesAlgorithm(String str){
        if(str != null && str.length()> 0){
            str = str.toLowerCase();// remove if you need upper and lower unique letters
            String unique = "";

            for (int i = str.length(); i > 0; i =str.length()) {
                unique += str.charAt(0);
                str = str.replace(str.charAt(0), ' ');
                str = str.trim();
            }
            return unique;
        }

        return null;
    }
}
