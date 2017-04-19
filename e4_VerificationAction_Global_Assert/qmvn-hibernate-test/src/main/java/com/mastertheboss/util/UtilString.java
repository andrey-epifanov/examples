package com.mastertheboss.util;

/**
 * Created by Андрей on 11.05.2015.
 */
public class UtilString {
    public static String getIncrementedString(String str, int count){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<count;i++){
            sb.append(str);
        }
        return sb.toString();
    }
}
