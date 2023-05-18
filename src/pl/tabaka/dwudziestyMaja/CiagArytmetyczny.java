package pl.tabaka.dwudziestyMaja;

/*
Program który wylicza n-ty element ciągu arytmetycznego.
Na wejściu program dostaje pierwszy wyraz ciągu, różnicę i numer wyrazu który ma wyliczyć.
Przykład działania programu:

Wejście
2 5 4
Wynik
17
*/

public class CiagArytmetyczny {
    public static void main(String[] args) {
        System.out.println(nTyWyraz(2,5,4));
    }

    public static int nTyWyraz(int a, int r, int n){
        return a+(n-1)*r;
    }
}
