package pl.tabaka.dwudziestyMaja.FIFO;

/*
Kolejka priorytetowa. Napisz klase FIFOPriority która przechowuje Stringi.
Kolejka ma działać zgodnie z zasadami kolejki FIFO jednak elementy mają mieć priorytety.
Klasa posiada metodę push(String element, int priority).
Metoda dodaje element na koniec kolejki z zadanym priorytetem (0 najmniejszy priorytet,
99 najwyższy priorytet). Klasa posiada metodę

popFirst() zwracającą pierwszego stringa w kolejce,

popHighThree() zwracającą jednego z 3 pierwszych Stringów -
tego o najwyższym priorytecie najwyższym priorytecie, jeśli są dwa elementy
o tym samym priorytecie zwracany jest ten który stoi bliżej "wyjścia" z kolejki.

popHighest() zwracajacą stringa o najwyższym priorytecie w całej kolejce.
Jeśli jest wiecej niż jeden element o najwyższym priorytecie metoda zwraca element który stoi najbliżej "wyjścia" z kolejki
*/

public class FIFO {
    public static void main(String[] args) {
        new FIFOPriority();
    }
}
