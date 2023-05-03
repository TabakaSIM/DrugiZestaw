package pl.tabaka.szostyMaja;

/*

(This is a slightly harder version of the fix34 problem.)
Return an array that contains exactly the same numbers as the given array,
but rearranged so that every 4 is immediately followed by a 5.
Do not move the 4's, but every other number may move.
The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4.

In this version, 5's may appear anywhere in the original array.


fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]
*/

public class Zad7 {

    public static void main(String[] args) {
        fix45(5, 4, 9, 4, 9, 5);
        fix45(1, 4, 1, 5) ;
        fix45(1, 4, 1, 5, 5, 4, 1);
        fix45(4, 5, 4, 1, 5, 4, 5, 1, 4, 1, 5);
    }

    static void fix45(int ... tab){

        int count4=0;
        int count5=0;

        for(int liczba:tab){
            if(liczba==4) count4++;
            if(liczba==5) count5++;
        }

        if(count4!=count5|tab[tab.length-1]==4) return; // Tutaj jest mój warunek sprawdzający (bez uzwględnienia dwóch "4" po sobie)
                                                        // dane z zadania (ponieważ jeszcze nie było wyjątków - tak to bym tutaj wrzucił throw.exeption :) )

        // Tworzenie indexów gdzie sa "4" bez "5"
        int[] pos4 = new int[count4];
        int pos4Index = 0;
        int true4Index=0;
        for(int i=0; i<tab.length-1; i++){
            if(tab[i]==4 & tab[i+1]!=5) {
                pos4[pos4Index]=i;
                pos4Index++;
                true4Index++;
            }
        }

        // Podmiana "5" za odpowiednie liczby po "4"
        pos4Index=0;
        for(int i=0;i<tab.length;i++) {
            if (tab[i] == 5) {
                if (i != 0 && tab[i - 1] == 4) {
                        continue;
                }
                    tab[i] = tab[pos4[pos4Index] + 1];
                    tab[pos4[pos4Index] + 1] = 5;
                    pos4Index++;
            }
        }


        // Wypisanie
        for (int liczba:tab) {
            System.out.print(liczba + " ");
        }
        System.out.println();
    }
}
