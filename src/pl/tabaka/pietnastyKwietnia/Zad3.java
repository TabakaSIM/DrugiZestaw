package pl.tabaka.pietnastyKwietnia;

/*
Given 2 int values greater than 0, return whichever value is nearest to 21 without going over.
Return 0 if they both go over.
*/

public class Zad3 {
    public static void main(String[] args) {
        System.out.println(blackjack(19, 21));
        System.out.println(blackjack(21, 19));
        System.out.println(blackjack(19, 22));
        System.out.println(blackjack(18,18));
    }

    private static int blackjack(int a, int b) {
        if (a==b){
            return 0;
        } else{
            return Math.max(helper(a),helper(b));
        }

    }

    private static int helper(int a){
        if(a>0&&a<=21){
            return a;
        }
        else{
            return 0;
        }
    }

}
