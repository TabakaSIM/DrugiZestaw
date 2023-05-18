package pl.tabaka.dwudziestyMaja;

/*
Given two strings, a and b, create a bigger string made of the first char of a, the first char of b,
the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.

mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
*/

public class StringZad3 {
    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("xxxx", "There"));
    }
    public static String mixString(String string1, String string2){
        StringBuilder builder = new StringBuilder();

        for(int i=0;i<Math.min(string1.length(),string2.length());i++){
            builder.append(string1.charAt(i)).append(string2.charAt(i));
        }
        if(string1.length()>string2.length()) {
            builder.append(string1.substring(string2.length()));
        } else {
            builder.append(string2.substring(string1.length()));
        }

        return builder.toString();
    }
}
