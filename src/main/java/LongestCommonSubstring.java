public class LongestCommonSubstring {
    //Написать алгоритм LongestCommonSubstring, который принимает 3 строки и ищет самое длинное общее пересечение:
    //
    //“Smaze”, “amazing”, “amazon” → “maz”
    public String longestCommonSubstringAlgorithm(String str1, String str2, String str3) {
        if (str1 != null && str2 != null && str3 != null && str1.length() > 0 && str2.length() > 0 && str3.length() > 0) {
            String pattern = "";
            String intersection = "";
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            str3 = str3.toLowerCase();
            if (str1.length() >= str2.length() && str1.length() >= str3.length()) {
                for (int i = 0; i < str1.length(); i++) {
                    for (int j = i + 2; j <= str1.length(); j++) {
                        /*if (j == str1.length()) {
                            pattern = str1.substring(i);
                        }*/
                        pattern = str1.substring(i, j);
                        if (str2.contains(pattern) && str3.contains(pattern)) {
                            if (intersection.length() < pattern.length()) {
                                intersection = pattern;
                            }
                        }
                    }
                }
            } else {
                if (str2.length() > str1.length() && str2.length() >= str3.length()) {
                    for (int i = 0; i < str2.length(); i++) {
                        for (int j = i + 2; j <= str2.length(); j++) {
                            /*if (j == str2.length()) {
                                pattern = str2.substring(i);
                            }*/
                            pattern = str2.substring(i, j);
                            if (str1.contains(pattern) && str3.contains(pattern)) {
                                if (intersection.length() < pattern.length()) {
                                    intersection = pattern;
                                }
                            }
                        }

                    }

                } else {
                    //if (str3.length() > str1.length()// && str3.length() > str2.length()) {//always true
                    for (int i = 0; i < str3.length(); i++) {
                        for (int j = i + 2; j <= str3.length(); j++) {
                                /*if (j == str3.length()) {
                                    pattern = str3.substring(i);
                                }*/
                            pattern = str3.substring(i, j);
                            if (str1.contains(pattern) && str2.contains(pattern)) {
                                if (intersection.length() < pattern.length()) {
                                    intersection = pattern;
                                }
                            }
                        }

                    }

                    //}

                }

            }
            return intersection;
        }
        return "";
    }
}
