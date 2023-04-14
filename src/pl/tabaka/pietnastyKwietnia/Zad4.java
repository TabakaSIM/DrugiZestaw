package pl.tabaka.pietnastyKwietnia;

import java.util.Scanner;

/*
4.Napisz program w którym zdefiniowana jest zmienna n.
Program ma wyświetlać n elementów ciągu Fibonacciego.
Co to jest ciąg Fibonacciego znajdziecie na wikipedii. Przykład:
n = 3
0 1 1
n = 8
0 1 1 2 3 5 8 13
*/
public class Zad4 {
    public static void main(String[] args) {
        System.out.println("Wprowadz dlugosc ciagu Fibonnaciego: ");
        printFibbonaci(new Scanner(System.in).nextInt());
    }

    private static void printFibbonaci(int n) {

        if(n<3){
            System.out.println("0 1");
            return;
        }
        int[] tab = new int[n];
        tab[0]=0;
        tab[1]=1;

        for(int i=2;i<n;i++){
            tab[i]=tab[i-1]+tab[i-2];
        }

        for (int i=0;i<n;i++){
            System.out.print(tab[i] + " ");
        }
    }


}
