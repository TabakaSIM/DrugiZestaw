package pl.tabaka.pietnastyKwietnia;

public class Zad8Helper {
    private int[] tab;

    public Zad8Helper(int n) {
        this.tab = new int[n];
        System.out.println("Cala tablica to:");
        for(int i=0;i<n;i++){
            tab[i]=i+2;
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }

    public void sito() {
        System.out.println("Elementy pierwsze tablicy to:");
        int max = (int) Math.sqrt(this.tab.length+2);
        for(int i=0;i<max+1;i++){
            if(tab[i]!=0){
                for(int j=i+1;j<this.tab.length;j++){
                    if(tab[j]%tab[i]==0){
                        tab[j]=0;
                    }
                }
            }
        }

        for(int i=0;i<this.tab.length;i++){
            if(tab[i]!=0){
                System.out.print(tab[i] + " ");
            }
        }
    }
}
