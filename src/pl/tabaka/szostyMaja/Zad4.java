package pl.tabaka.szostyMaja;

/*

Return an array that contains the exact same numbers as the given array,
but rearranged so that all the even numbers come before all the odd numbers.
Other than that, the numbers can be in any order.


You may modify and return the given array, or make a new array.


evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
evenOdd([3, 3, 2]) → [2, 3, 3]
evenOdd([2, 2, 2]) → [2, 2, 2]
*/

public class Zad4 {
    public static void main(String[] args) {
        evenOdd(1, 0, 1, 0, 0, 1, 1);
        evenOdd(3, 3, 2);
        evenOdd(2, 2, 2);
        evenOdd(2, 5, 3, 1, 4, 8, 9, 3, 6 ,7);
    }

    static int[] evenOdd(int ... tab){
        int oddIndex=0;
        int evenIndex=tab.length-1;
        int[] tabReturn = new int[evenIndex+1];

        for(int liczba:tab){
            if(liczba%2==0){
                tabReturn[oddIndex]=liczba;
                oddIndex++;
            }else{
                tabReturn[evenIndex]=liczba;
                evenIndex--;
            }
        }

        for (int i:tabReturn) {
            System.out.print(i + " ");
        }
        System.out.println();
        return tabReturn;
    }
}
