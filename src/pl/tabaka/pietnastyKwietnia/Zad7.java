package pl.tabaka.pietnastyKwietnia;
/*
7.Napisz program, który generuje 30 elementową tablicę (liczby 0 - 100).
Program powinien wypisywać na ekranie wygenerowaną tablicę oraz drugą największą liczbę w tablicy. Przykład:
[1,2,3,4,5,6]
5
[2,3,6,9,34,35}
34
[65,23,76,45,34,12}
65
*/
public class Zad7 {
    public static void main(String[] args) {
        Zad5i7Helper tab = new Zad5i7Helper(30);
        tab.print();
        System.out.println(tab.what2Max());
    }
}
