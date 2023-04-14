package pl.tabaka.pietnastyKwietnia;

import java.util.Random;

public class Zad10TabGeneration {
    private int[] tab;
    private Random rng = new Random();

    public Zad10TabGeneration(int n) {
        this.tab = new int[n];
        for (int i=0;i<n;i++){
            this.tab[i]=rng.nextInt(41)-20;
        }
    }

    public int get(int i){
        return this.tab[i];
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
