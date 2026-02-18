package FullPractice.StaticsInstanceConsctuctorReference;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {
    public static String reverseString(String a){
        return new StringBuilder(a).reverse().toString();
    }
}
