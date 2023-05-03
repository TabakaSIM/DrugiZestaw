package pl.tabaka.foremny.core;

import pl.tabaka.foremny.figury.Figure;
import pl.tabaka.foremny.gui.GUI;

import java.util.Scanner;

public class FigureList {
    private GUI gui = new GUI();
    private int n;
    public Figure[] lista;

    public FigureList(int ilosc) {
        this.n=ilosc;
        this.lista = new Figure[this.n];
        this.stworzListe();
        this.wypiszDane();
    }

    private void stworzListe(){
        for(int i=0;i<this.n;i++){
            gui.podajBoki(i);
            lista[i]= new FigureHandler().use(this.wprowadzBoki(new Scanner(System.in).nextLine()));
        }
    }

    private void wypiszDane() {
        for(int i=0;i<n;i++){
            gui.newLine();
            lista[i].wypisz(i);
        }
    }

    private int[] wprowadzBoki(String string){
        int[] tab = new int[6];
        int count=0;
        Scanner scan = new Scanner(string);

        // Wczytuje dane
        while(scan.hasNextInt() & count<6){
            int bok = scan.nextInt();
            if(bok<=0){
                return new int[0];
            }
            tab[count]=bok;
            count++;
        }

        //Sprawdza czy dane są odpowiednie (w przypadku podania złych danych zwraca tablice 0 elementowa)
        if((count<3&count!=1)|scan.hasNextInt()){
            //gui.zglosBlad();
            return new int[0];
        }

        //Tworzy faktyczną tablicę z bokami (jeśli możliwe)
        int[] trueTab = new int[count];
        for (int i=0;i<count;i++){
            trueTab[i]=tab[i];
        }
        return trueTab;
    }
}



