package pl.tabaka.pietnastyKwietnia;

public class Zad6Helper {
    private int liczba;
    private int n;
    private int index =0;

    public Zad6Helper(int liczba) {
        this.liczba = liczba;
        this.n=liczba;
        dwa(n);
    }

    private void dwa(int n){
        if(n==1){
            System.out.println("Liczba " + liczba + " jest potega liczby 2!");
            System.out.println(liczba + " to 2 do potegi " + this.index);
            return;
        }
        if(n%2==0){
            this.index++;
            dwa(n/2);
        }
        else {
            System.out.println("Liczba " + liczba + " NIE jest potega liczby 2!");
        }
    }
}
