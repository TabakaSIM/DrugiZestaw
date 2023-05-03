package pl.tabaka.foremny;

/*
Dziedziczenie:
Napisz program który wczytuje z klawiatury 5 zestawów liczb oddzielonych spacją np:
2 5 3 8
3 3 3
3 4 3 4 5
7 7 7 7 7 7
1 2 3
Podanych liczb w jednym zestawie może być minimum 3 i maksimum 6.
Każdy jeden zestaw to figura geometryczna.
Podane wartości to długości boków. Program ma rozpoznawać czy wprowadzony został trójkąt, czworokąt, pięciokąt czy sześciokąt.
Program powinien również sprawdzać czy z podanych boków da się stworzyć figurę np.
2 3 8 - z takich boków nie da się utworzyć trójkąta
3 20 5 1 - z takich boków nie da się utworzyć czworokąta
1 2 3 4 5 - z takich boków da się stworzyć pięciokąt.

Dla trójkątów program rozpoznaje czy podane boki tworzą trójkąt równoboczny (3 3 3), trójkąt równoramienny (4 4 6) czy trójkąt równoboczny (3 4 5).
Dla czworokątów program rozpoznaje czy dane boki tworzą kwadrat (1 1 1 1), prostokąt (2 3 2 3) czy czworokąt nieforemny (4 5 6 6).
Dla pięciokątów program rozpoznaje czy dane boki tworzą pięciokąt foremny (4 4 4 4 4).
Dla sześciokątów program rozpoznaje czy dane boki tworzą sześciokąt foremny (7 7 7 7 7 7).
Jeśli z podanych programowi boków nie da się utworzyć figury program wypisuje taką informację.
Jeśli z podanych boków da się stworzyć figurę program tworzy obiekt odpowiedniej klasy.
Klasy jakie powinny być w programie:
- TrojkatRownoboczny
- TrojkatRownoramienny
- TrojkatRoznoboczny
- Kwadrat
- Prostokat
- Czworokat
- PieciokatForemny
- Pieciokat
- Szesciokat
- SzesciokatForemny
Oczywiście jeśli uważacie że powinny znaleźć się jeszcze jakieś klasy, które są według was niezbędne do stworzenia hierarchii dziedziczenia to śmiało je róbcie. Tak samo z klasami pomocniczymi, które mają coś tam robić w programie (np. Main).


Program tworzy 5 elementową tablicę odpowiednich obiektów (figur)
Po utworzeniu odpowiednich obiektów program wypisuje w pętli co zostało stworzone, jakie są długości boków utworzonej figury, jaki jest obwód tej figury oraz w przypadku jeśli jest to:
- dowolny trójką
- kwadrat
- prostokąt
- pięciokąt foremny
- sześciokąt foremny
wypisuje również pole tej figury.
Przykład:
wejście:
3 3 4
4 5 6 7
5 5 5 5 5
wyjście:
Trójkąt Równoramienny - boki: 3, 3, 4 - obwód: 10 - pole: 4.4721...
Czworokąt - boki: 4, 5, 6, 7 - obwód: 22 - pole: brak
Pięciokąt Foremny - boki: 5, 5, 5, 5, 5 - obwód: 25 - pole: 43.012
W przykładzie podałem 3 zestawy bo nie chciało mi się więcej pisać - w treści zadania macie 5 zestawów.

Do zrobienia tego programu użyjcie dziedziczenia, polimorfizmu i przesłaniania metod.
Dla chętnych:
Dodaj do programu obsługę zestawu składającego się z jednej liczby - będzie to koło o takim promieniu.
Rozbuduj program tak aby nie przyjmował zawsze 5 zestawów. Po uruchomieniu programu najpierw podaję liczbę zestawów, a następnie podaję zestawy boków. Jeśli jako pierwsze podam 10 to program przyjmie 10 zestawów boków i stworzy 10 figur.
Zakładam że wiecie jak obliczyć obwody i pola kwadratów czy prostokątów. Gdyby ktoś jednak nie wiedział to poszukajcie w internecie albo napiszcie :)
Do liczenia może wam się przydać klasa wbudowana w Javę - Math - posiada gotowe metody do obliczania pierwiastków, potęg itp :) Do zamieniania stringa na integera przyda wam się metoda parseInt(String) z klasy Integer. Przykładowe użycie:
String a = "5";
int i = Integer.parseInt(a);
*/

import pl.tabaka.foremny.core.Core;

public class App {
    public static void main(String[] args) {
        new Core();
    }
}
