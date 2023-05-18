package pl.tabaka.dwudziestyMaja;

/*
Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.

countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0
*/

public class RekurencjaZad3 {
    public static void main(String[] args) {
        System.out.println(countX("xxhixx"));
        System.out.println(countX("xhixhix"));
        System.out.println(countX("hi"));
        System.out.println(countX("xxxXxxhhxox"));
    }
    public static int countX(String string){
        if(string.length()==0){return 0;}
        if(string.charAt(string.length()-1)=='x') {
            return 1+countX(string.substring(0, string.length() - 1));
        } else {
            return countX(string.substring(0, string.length() - 1));
        }
    }
}
