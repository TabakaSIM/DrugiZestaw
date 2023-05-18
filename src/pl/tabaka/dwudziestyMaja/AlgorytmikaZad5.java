package pl.tabaka.dwudziestyMaja;

/*
Given a non-empty array, return true if there is a place to split the array so
that the sum of the numbers on one side is equal to the sum of the numbers on the other side.


canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true
*/

public class AlgorytmikaZad5 {
    public static void main(String[] args) {
        System.out.println(canBalance(1, 1, 1, 2, 1));//true
        System.out.println(canBalance(2, 1, 1, 2, 1));//false
        System.out.println(canBalance(10, 10));//true
        System.out.println(canBalance(1, 2, 3, 1, 0, 1, 3));//false
        System.out.println(canBalance(1, 2, 3, 1, 0, 2, 3));//true
    }

    public static boolean canBalance(int ... tab){
        int sum=0;
        for (int i:tab) {
            sum+=i;
        }
        System.out.println("Suma: " + sum);
        if(sum%2==1) {return false;}

        int i=0;
        int count=0;
        while(count!=sum/2 & i<tab.length){
            count+=tab[i];
            i++;
        }
        System.out.println("i: " + i);
        return i!=tab.length;
    }
}
