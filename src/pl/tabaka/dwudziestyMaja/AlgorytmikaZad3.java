package pl.tabaka.dwudziestyMaja;

/*
We want make a package of goal kilos of chocolate.
We have small bars (1 kilo each) and big bars (5 kilos each).
Return the number of small bars to use, assuming we always use big bars before small bars.
Return -1 if it can't be done.


makeChocolate(4, 1, 9) → 4
makeChocolate(4, 1, 10) → -1
makeChocolate(4, 1, 7) → 2
*/

public class AlgorytmikaZad3 {
    public static void main(String[] args) {
        System.out.println(makeChocolate(4, 1, 9));//4
        System.out.println(makeChocolate(4, 1, 10));//-1
        System.out.println(makeChocolate(4, 1, 7));//2
        System.out.println(makeChocolate(1, 2, 6));//1
        System.out.println(makeChocolate(1, 2, 5));//0
        System.out.println(makeChocolate(6, 1, 10));//5
        System.out.println(makeChocolate(6, 1, 11));//6
        System.out.println(makeChocolate(6, 2, 12));//2
        System.out.println(makeChocolate(60, 100, 550));//50
        System.out.println(makeChocolate(1000, 1000000, 5000006));//6
        System.out.println(makeChocolate(7, 1, 12));//7
        System.out.println(makeChocolate(7, 1, 13));//-1
        System.out.println(makeChocolate(7, 2, 13));//3
    }
    public static int makeChocolate(int a, int b, int c){
        if(c%5>a | b*5+a<c) return -1;
        return Math.max(c%5,c-b*5);
    }
}
