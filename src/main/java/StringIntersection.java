import java.util.Locale;

public class StringIntersection {
    //Написать алгоритм StringIntersection,  который принимает на вход 2 строки и возвращает общее вхождение в этих строках
    //Test Data:
    //“Carrot”, “carwash” → “car”
    //“Noob”, “Schmooze” → “oo”

    public String stringIntersectionAlgorithm(String str1, String str2){
        if(str1 != null && str2 != null && str1.length() > 0 && str2.length() > 0){
            String pattern = "";
            String intersection = "";
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            if(str1.length() >= str2.length()){
                for(int i = 0; i < str1.length(); i++){
                    for(int j =i + 2; j <= str1.length(); j++){
                        /*if(j == str1.length()){
                            pattern = str1.substring(i);
                        }*/
                        pattern = str1.substring(i,j);
                        if(str2.contains(pattern)){
                            if(intersection.length() < pattern.length()) {
                                intersection = pattern ;
                            }
                        }
                    }

                }
            } else {
                for(int i = 0; i < str2.length(); i++){
                    for(int j = i+2; j <= str2.length() ; j++){
                        /*if(j == str2.length()){
                            pattern = str2.substring(i);
                        }*/
                        pattern = str2.substring(i,j);
                        if(str1.contains(pattern)){
                            if(intersection.length() < pattern.length()) {
                                intersection = pattern ;
                            }
                        }
                    }

                }
            }
            return intersection;
        }
        return "";
    }
}
