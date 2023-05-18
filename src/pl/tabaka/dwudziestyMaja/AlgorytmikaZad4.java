package pl.tabaka.dwudziestyMaja;

/*
Say that a "clump" in an array is a series of 2 or more adjacent elements
of the same value. Return the number of clumps in the given array.

countClumps([1, 2, 2, 3, 4, 4]) → 2
countClumps([1, 1, 2, 1, 1]) → 2
countClumps([1, 1, 1, 1, 1]) → 1
*/

public class AlgorytmikaZad4 {
    public static void main(String[] args) {
        countClumps(1, 2, 2, 3, 4, 4);
        countClumps(1, 1, 2, 1, 1);
        countClumps(1, 1, 1, 1, 1);
        countClumps(0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2);
        countClumps(1, 2, 3);
        countClumps();
    }
    public static int countClumps(int ... tab){
        if(tab.length<1) {
            System.out.println(0);
            return 0;
        }
        int count=0;
        boolean matchPossible=true;
        for(int i=0;i<tab.length-1;i++){
            if(tab[i]==tab[i+1]){
                if(matchPossible) {
                    matchPossible = false;
                    count++;
                }
            } else {
                matchPossible=true;
            }
        }
        System.out.println(count);
        return count;
    }
}
