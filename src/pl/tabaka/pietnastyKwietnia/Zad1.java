package pl.tabaka.pietnastyKwietnia;
/*

We want to make a row of bricks that is goal inches long.
We have a number of small bricks (1 inch each) and big bricks (5 inches each).
Return true if it is possible to make the goal by choosing from the given bricks.
This is a little harder than it looks and can be done without any loops
 */
public class Zad1 {

    public static void main(String[] args) {
        System.out.println(makeBricks(3, 1, 8));
        System.out.println(makeBricks(3, 1, 9));
        System.out.println(makeBricks(3, 2, 10));
        System.out.println(makeBricks(3, 4, 50));
        System.out.println(makeBricks(1, 6, 17));
    }



    static boolean makeBricks(int a, int b, int c){
        return (c<=(b+1)*5 && c%5<=a);
    }
}
