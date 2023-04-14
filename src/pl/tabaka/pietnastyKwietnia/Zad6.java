package pl.tabaka.pietnastyKwietnia;

import java.util.Scanner;

/*
6.Program zawiera zmienną n. Napisz program, który sprawdzi jaką potęgą liczby 2 jest liczba n.
Program powinien wyświetlać potęgę lub komunikat jeśli liczba n nie jest potęgą liczby 2. Przykład:
n = 4
2
n = 16
4
n = 128
7
n = 199
to nie jest potęga dwójki
*/
public class Zad6 {
    public static void main(String[] args) {
        System.out.println("Wprowadz liczbe: ");
        new Zad6Helper(new Scanner(System.in).nextInt());
    }
}
