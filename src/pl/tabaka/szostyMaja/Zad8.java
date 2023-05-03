package pl.tabaka.szostyMaja;

/*

Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1),
while the other is "far", differing from both other values by 2 or more.
Note: Math.abs(num) computes the absolute value of a number.


closeFar(1, 2, 10) → true
closeFar(1, 2, 3) → false
closeFar(4, 1, 3) → true
*/

public class Zad8 {
    public static void main(String[] args) {
        closeFar(1, 2, 10);
        closeFar(1, 2, 3);
        closeFar(4, 1, 3);
    }

    static boolean closeFar(int a, int b, int c){
        boolean[] result = {Math.abs(a-b)<=1,Math.abs(a-c)<=1,Math.abs(b-c)<=1};
        int count=0;

        for(boolean boolek:result){
            if(boolek) count++;
        }

        boolean trueResult=count==1;
        System.out.println(trueResult);
        return count==1;
    }
}
