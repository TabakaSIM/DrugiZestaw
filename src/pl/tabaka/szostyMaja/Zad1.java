package pl.tabaka.szostyMaja;

/*
Return the number of even ints in the given array.
Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.


countEvens([2, 1, 2, 3, 4]) → 3
countEvens([2, 2, 0]) → 3
countEvens([1, 3, 5]) → 0
 */


public class Zad1 {

    public static void main(String[] args) {
        countEvens(2, 1, 2, 3, 4);
        countEvens( 2, 2, 0 );
        countEvens( 1, 3, 5 );
        countEvens();
    }

    static int countEvens(int ... tab){
        int count = 0;
        for (int element:tab) {
            if (element%2==0){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

}
