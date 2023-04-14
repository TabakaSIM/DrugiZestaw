package pl.tabaka.pietnastyKwietnia;

import java.util.Random;

public class Zad5i7Helper {
    private int[] tab;
    Random rng = new Random();

    public Zad5i7Helper(int n) {
        this.tab = new int[n];
        for(int i=0;i<n;i++){
            this.tab[i]= rng.nextInt(101);
        }
    }

    public void move() {
        int h;
        int[] memory = new int[3];
        memory[0]=this.tab[0];
        memory[1]=this.tab[1];
        memory[2]=this.tab[2];
        for(int i=0;i<this.tab.length;i++){
            h=this.tab[(i+3)%this.tab.length];
            this.tab[(i+3)%this.tab.length]=memory[i%3];
            memory[i%3]=h;
        }
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

    public int what2Max() {
        int max=0,almostMax;

        for(int i=2;i<this.tab.length;i++){
            if(this.tab[max]<=this.tab[i]){
                max=i;
            }
        }

        if(max!=0){
            almostMax=0;
        } else {
            almostMax=1;
        }

        for(int i=2;i<this.tab.length;i++){
            if(i!=max&&this.tab[almostMax]<=this.tab[i]){
                almostMax=i;
            }
        }

        return tab[almostMax];
    }


}
