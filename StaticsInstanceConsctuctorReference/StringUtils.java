package FullPractice.StaticsInstanceConsctuctorReference;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {
    public static List<String> reverseString(String [] a){

         List<String> reverse = new ArrayList<>();
        for (int i=a.length-1; i>=0; i--){
            reverse.add(a[i]);

        }

        return  reverse;
    }
}
