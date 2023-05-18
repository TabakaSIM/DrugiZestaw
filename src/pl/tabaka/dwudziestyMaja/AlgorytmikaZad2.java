package pl.tabaka.dwudziestyMaja;

/*
We'll say that a "triple" in a string is a char appearing three times in a row.
Return the number of triples in the given string. The triples may overlap.


countTriple("abcXXXabc") → 1
countTriple("xxxabyyyycd") → 3
countTriple("a") → 0
*/

public class AlgorytmikaZad2 {
    public static void main(String[] args) {
        countTriple("abcXXXabc");
        countTriple("xxxabyyyycd");
        countTriple("a");
    }
    public static int countTriple(String string){
        char[] c= string.toCharArray();
        int count=0;
        for(int i=0;i<string.length()-2;i++){
            if(c[i]==c[i+1] & c[i]==c[i+2]){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
