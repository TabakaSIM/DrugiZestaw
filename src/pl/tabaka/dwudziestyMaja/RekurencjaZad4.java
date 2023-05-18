package pl.tabaka.dwudziestyMaja;

/*
Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".

allStar("hello") → "h*e*l*l*o"
allStar("abc") → "a*b*c"
allStar("ab") → "a*b"
*/

public class RekurencjaZad4 {
    public static void main(String[] args) {
        System.out.println(allStar("hello"));
        System.out.println(allStar("abc"));
        System.out.println(allStar("ab"));
    }
    public static String allStar(String string){
        if(string.length()==1){return string;}
        else {
            return new StringBuilder()
                    .append(string.charAt(0))
                    .append("*")
                    .append(allStar(string.substring(1)))
                    .toString();
        }
    }
}
