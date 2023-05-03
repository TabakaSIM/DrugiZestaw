package pl.tabaka.szostyMaja;

/*

Return an array that contains the exact same numbers as the given array,
but rearranged so that all the zeros are grouped at the start of the array.
The order of the non-zero numbers does not matter.
So {1, 0, 0, 1} becomes {0 ,0, 1, 1}.

You may modify and return the given array or make a new array.


zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
zeroFront([1, 0]) → [0, 1]
*/

public class Zad5 {
    public static void main(String[] args) {
        zeroFront(1, 0, 0, 1);
        zeroFront(0, 1, 1, 0, 1);
        zeroFront(1, 0);
        zeroFront(3,5,0,8,0,6,5,0,2,0,1,3,5,2,3,0,9,8,0,0,0,7);
    }

    static int[] zeroFront(int ... tab){
        int zeroIndex=0;
        int zeroNoIndex=tab.length-1;
        int[] tabReturn = new int[zeroNoIndex+1];

        for(int liczba:tab){
            if(liczba==0){
                tabReturn[zeroIndex]=liczba;
                zeroIndex++;
            }else{
                tabReturn[zeroNoIndex]=liczba;
                zeroNoIndex--;
            }
        }

        for (int i:tabReturn) {
            System.out.print(i + " ");
        }
        System.out.println();
        return tabReturn;
    }
}
