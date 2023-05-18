package pl.tabaka.dwudziestyMaja;

/*
Zamiana liczb dziesiętnych na binarne.
Napiszcie program który działa rekurencyjnie i wyświetla liczbę w systemie binarnym.
*/

public class LiczbyBinarne {
    public static void main(String[] args) {
        System.out.println(toBinear(100).toString());
    }
    public static StringBuilder toBinear(int n){
        if(n==0) return new StringBuilder();
        return new StringBuilder().append(toBinear(n/2)).append(n%2);
    }
}
