package pl.tabaka.dwudziestyMaja;

/*
Na wejściu program dostaje dowolny string który składa się tylko z liter a, b i c np. aaabbcbcbcbabab.
Program ma zrobić redukcję tego stringa.
Jak działa redukcja: ab i ba zamieniane jest na c, ac i ca zamieniane jest na b, bc i cb zamieniane jest na a.
Program ma redukować stringa maksymalnie jak się da. Przykład: ababcbcbacab -> ccaabc -> cbcc -> acc -> bc -> a.
Program wyświetla a. Możecie też sprawdzić co się stanie w takich sytuacjach:
najpierw będziecie zamieniać pary ab i ba później ac i ca i na końcu bc i cb
najpierw bc i cb, później ac i ca i na końcu ab i ba
dowolna inna kombinacja kolejności.
*/

public class Redukcja {
    public static void main(String[] args) {
        System.out.println(reduce(new StringBuilder("ababcbcbacab")));
    }

    private static StringBuilder reduce(StringBuilder string) {
        if(string.length()==1) return string;
        boolean changed=false;
        for(int i=string.length()-1;i>0;i--){
            if(string.charAt(i)!=string.charAt(i-1)){
                string.replace(string.length()-2,string.length(), Character.toString(match(string.charAt(i),string.charAt(i-1))));
                changed=true;
            }
        }
        return changed ? reduce(string) : string;
    }

    private static char match(char c1, char c2) {
        return "abc".replace(Character.toString(c1),"").replace(Character.toString(c2),"").charAt(0);
    }
}
