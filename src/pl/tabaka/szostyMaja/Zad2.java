package pl.tabaka.szostyMaja;

/*

Return the sum of the numbers in the array, returning 0 for an empty array.
Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.


sum13([1, 2, 2, 1]) → 6
sum13([1, 1]) → 2
sum13([1, 2, 2, 1, 13]) → 6
*/

public class Zad2 {

    public static void main(String[] args) {
        sum13(1, 2, 2, 1);
        sum13(1, 1);
        sum13(1, 2, 2, 1, 13, 123);
        sum13(7, 13, 2, 1, 13);
        sum13();
    }

    public static int sum13(int ... tab){
        int suma = 0;
        for(int liczba : tab){
            if(liczba!=13){
                suma+=liczba;
            }else {
                break;
            }
        }

        System.out.println(suma);
        return suma;
    }
}
