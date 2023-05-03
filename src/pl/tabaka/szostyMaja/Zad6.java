package pl.tabaka.szostyMaja;

/*

Given n>=0, create an array length n*n with the following pattern,
shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).


squareUp(3) → [0, 0, 1,
               0, 2, 1,
               3, 2, 1]
squareUp(2) → [0, 1,
               2, 1]
squareUp(4) → [0, 0, 0, 1,
               0, 0, 2, 1,
               0, 3, 2, 1,
               4, 3, 2, 1]

*/

public class Zad6 {

    public static void main(String[] args) {
        squareUp(3);
        squareUp(2);
        squareUp(4);
    }

    static int[] squareUp(int n){

        int [] tab = new int[n*n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j<n-i-1){
                    tab[i*n+j]=0;
                    System.out.print(0 + " ");
                }else{
                    tab[i*n+j]=n-j;
                    System.out.print(tab[i*n+j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        return tab;
    }
}
