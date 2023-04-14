package pl.tabaka.pietnastyKwietnia;

import java.util.Random;

public class Zad9Helper {
    Random rng = new Random();
    int[] tab;

    public Zad9Helper(int n) {
        tab = new int[n];
        int amount =0;
        boolean condition;
        do {
            amount++;
            condition=false;
            for (int i = 0; i < tab.length; i++) {
                tab[i] = rng.nextInt(15) - 7;
            }
            for (int i = 0; i < tab.length - 1; i++) {
                for (int j = i + 1; j < tab.length; j++) {
                    if (tab[i] == tab[j]) {
                        condition = true;
                    }
                }
            }
        } while (condition);
        this.print();
        System.out.println("Powtornie generowano tablice: " + (amount-1) + " razy!");
    }

    public void print() {
        System.out.print("[");
        for (int i=0;i<this.tab.length;i++){
            System.out.print(tab[i]);
            if(i!=this.tab.length-1){
                System.out.print(" ");
            }
        }
        System.out.print("]");
        System.out.println();
    }



}
