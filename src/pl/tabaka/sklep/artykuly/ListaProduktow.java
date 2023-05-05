package pl.tabaka.sklep.artykuly;

import pl.tabaka.sklep.GUI.GUI;
import pl.tabaka.sklep.users.User;

import java.util.Scanner;

public class ListaProduktow {
    Produkt[] listaProduktow = new Produkt[10];
    GUI gui = new GUI();

    public ListaProduktow() {
        listaProduktow[0]=new Produkt("Void seeds", 8.00f, 64);
        listaProduktow[1]=new Produkt("Enchanted Fabric", 1.50f, 80);
        listaProduktow[2]=new Produkt("Alchemical brass", 3.00f, 120);
        listaProduktow[3]=new Produkt("Thaumium plate", 5.00f, 40);
        listaProduktow[4]=new Produkt("Primordial pearl", 100.00f, 0);
        listaProduktow[5]=new Produkt("Crimson Rites", 25.00f, 3);
        listaProduktow[6]=new Produkt("Thaumaturge helmet", 15.00f, 2);
        listaProduktow[7]=new Produkt("Thaumaturge robes", 25.00f, 3);
        listaProduktow[8]=new Produkt("Thaumaturge leggins", 20.00f, 3);
        listaProduktow[9]=new Produkt("Thaumaturge boots", 15.00f, 4);
    }

    public void show(boolean isAdmin) {
        for(Produkt produkt:listaProduktow){
            if(produkt.dostepny()|isAdmin){
                gui.showProdukt(produkt);
            }
        }
    }

    public void kup(User user) {
        gui.showKupowanie();
        int productIndex =  findProdukt(new Scanner(System.in).nextLine());
        zakup(productIndex,user);
    }

    private void zakup(int i, User user){
        if(i!=-1){
            gui.showZakupPodajIlosc();
            int iloscDoZakupu = new Scanner(System.in).nextInt();
            if(listaProduktow[i].getIloscNaStanie()>=iloscDoZakupu) {
                if (user.getMoney() >= iloscDoZakupu*listaProduktow[i].getCena()){
                    user.obciazRachunek(iloscDoZakupu*listaProduktow[i].getCena());
                    return;
                }
                gui.showZakupyMoneyError();
                return;
            }
            gui.showZakupyAmountError();
            return;
        }
        gui.showZakupyNoProductError();
        return;
    }

    private int findProdukt(String nazwa){
        for(int i=0;i<listaProduktow.length;i++){
            if(nazwa.equals(this.listaProduktow[i].getNazwa())){
                return i;
            }
        }
        return -1;
    }

    public void Restock() {
        gui.showRestock();
        int index =findProdukt(new Scanner(System.in).nextLine());
        if(index ==-1){
            gui.showZakupyNoProductError();
            return;
        }
        gui.showRestockIlosc();
        this.listaProduktow[index].restock(new Scanner(System.in).nextInt());
    }
}
