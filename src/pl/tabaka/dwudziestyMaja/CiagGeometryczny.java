package pl.tabaka.dwudziestyMaja;

/*
Program który wylicza n-ty element ciągu geometrycznego.
Na wejściu program dostaje pierwszy wyraz ciągu, iloraz i numer wyrazu który ma wyliczyć.
Przykład:

Wejście
3 2 5
Wynik
48
*/

public class CiagGeometryczny {
    public static void main(String[] args) {
        System.out.println(nTyGeometryczny(3,2,5));
    }

    public static int nTyGeometryczny(int a, int q, int n){
        return a*(int) Math.pow(q,n-1);
    }
}
