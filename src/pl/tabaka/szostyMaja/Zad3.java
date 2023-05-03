package pl.tabaka.szostyMaja;

/*

Given an array of ints, return true if the array contains no 1's and no 3's.


lucky13([0, 2, 4]) → true
lucky13([1, 2, 3]) → false
lucky13([1, 2, 4]) → false
*/

public class Zad3 {

    public static void main(String[] args) {
        lucky13(0, 2, 4);
        lucky13(1, 2, 3);
        lucky13(1, 2, 4);
        lucky13(2, 5, 7, 12, 3, 42, 6, 4);
    }

    static boolean lucky13 (int ... tab){
        boolean is1 = false;
        boolean is3 = false;

        for(int liczba:tab){
            if(liczba==1 | liczba==3){
                System.out.println(false);
                return false;
            }
        }
        System.out.println(true);
        return true;
    }

}
