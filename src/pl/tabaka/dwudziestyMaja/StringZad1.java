package pl.tabaka.dwudziestyMaja;

/*
Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
You may assume that n is between 0 and the length of the string, inclusive.

repeatEnd("Hello", 3) → "llollollo"
repeatEnd("Hello", 2) → "lolo"
repeatEnd("Hello", 1) → "o"
*/

public class StringZad1 {
    public static void main(String[] args) {
        System.out.println(repeatEnd("Hello", 1));
        System.out.println(repeatEnd("Hello", 2));
        System.out.println(repeatEnd("Hello", 3));
    }
    public static String repeatEnd(String string, int n){

        StringBuilder build =new StringBuilder();
        for(int i=0;i<n;i++){
            build.append(string.substring(string.length()-n,string.length()));
        }
        return build.toString();
    }
}
