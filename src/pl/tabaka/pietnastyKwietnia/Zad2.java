package pl.tabaka.pietnastyKwietnia;
/*

Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive
-- then that value counts as 0, except 15 and 16 do not count as a teens.
Write a separate helper "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule.
In this way, you avoid repeating the teen code 3 times (i.e. "decomposition").
Define the helper below and at the same indent level as the main noTeenSum().
 */
public class Zad2 {
    public static void main(String[] args) {
        System.out.println(noTeenSum(1, 2, 3));
        System.out.println(noTeenSum(2, 13, 1));
        System.out.println(noTeenSum(2, 1, 14));
        System.out.println(noTeenSum(5,14,16));
    }

    private static int noTeenSum(int a, int b, int c) {
        return helper(a)+helper(b)+helper(c);
    }

    private static int helper(int a){
        if (a>=13 && a<=19 && a!=15 && a!=16){
            return 0;
        }
        else return a;
    }
}
