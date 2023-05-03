package pl.tabaka.szostyMaja;

/*

Given an array of ints, return the number of times that two 6's are next to each other in the array.
Also count instances where the second "6" is actually a 7.


array667([6, 6, 2]) → 1
array667([6, 6, 2, 6]) → 1
array667([6, 7, 2, 6]) → 1
*/

public class Zad10 {
    public static void main(String[] args) {
        array667(6, 6, 2);
        array667(6, 6, 2, 6);
        array667(6, 7, 2, 6);
        array667(6, 6, 7, 8, 6, 5, 9, 7, 7, 6, 7, 6);
        array667(6, 7, 6, 6); // powinno być 2 i tak jest. Może dlatego chcą aby "drugie" to było 7.
    }
    static int array667(int ... tab){

        int count=0;

        for(int i=0;i<tab.length-1;i++){
            if(tab[i]==6 &
                    (tab[i+1]==6 | tab[i+1]==7)){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
