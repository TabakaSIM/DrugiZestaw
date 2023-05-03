package pl.tabaka.szostyMaja;

/*

Given 3 int values, a b c, return their sum. However, if one of the values is 13 then
it does not count towards the sum and values to its right do not count.
So for example, if b is 13, then both b and c do not count.


luckySum(1, 2, 3) → 6
luckySum(1, 2, 13) → 3
luckySum(1, 13, 3) → 1

*/

import static pl.tabaka.szostyMaja.Zad2.sum13;

public class Zad9 {
    public static void main(String[] args) {
        luckySum(1, 2, 3);
        luckySum(1, 2, 13);
        luckySum(1, 13, 3);
    }

    static int luckySum (int a, int b, int c){
        return sum13(a,b,c);
    }
}
