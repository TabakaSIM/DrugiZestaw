package pl.tabaka.pietnastyKwietnia;

/*
5.Napisz program który generuje 10 elementową tablicę liczb (0 - 100) a następnie przesuwa tą tablicę o 3 elementy w prawo.
Program ma wypisywać na ekranie pierwotną oraz przesuniętą tablicę. Przykład:
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
[8, 9, 10, 1, 2, 3, 4, 5, 6, 7]
*/
public class Zad5 {
    public static void main(String[] args) {
    Zad5i7Helper tab = new Zad5i7Helper(10);
    tab.print();
    tab.move();
    tab.print();
    }

}
