package pl.tabaka.sklep.artykuly;

import pl.tabaka.sklep.GUI.GUI;
import pl.tabaka.sklep.users.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ListaProduktow {
    private final GUI gui = GUI.getInstance();
    private final Map<String,Produkt> listaProduktow = new HashMap<>();
    private static final ListaProduktow instance = new ListaProduktow();

    private ListaProduktow() {
        /*register(new Produkt("Void seeds", 8.00f, 64));
        register(new Produkt("Enchanted Fabric", 1.50f, 80));
        register(new Produkt("Alchemical brass", 3.00f, 120));
        register(new Produkt("Thaumium plate", 5.00f, 40));
        register(new Produkt("Primordial pearl", 100.00f, 0));
        register(new Produkt("Crimson Rites", 25.00f, 3));
        register(new Produkt("Thaumaturge helmet", 15.00f, 2));
        register(new Produkt("Thaumaturge robes", 25.00f, 3));
        register(new Produkt("Thaumaturge leggins", 20.00f, 3));
        register(new Produkt("Thaumaturge boots", 15.00f, 4));*/
    }

    public void register(Produkt produkt) {
        listaProduktow.put(produkt.getNazwa(),produkt);
    }

    private Produkt findProduct(String nazwa){
        return listaProduktow.get(nazwa);
    }

    public void show(boolean isAdmin) {
        listaProduktow.forEach((key, produkt) ->{
            if(produkt.getIloscNaStanie()>0 | isAdmin) {
                gui.showProdukt(produkt);
            }
        });
    }

    public void kup(User user) {
        String produkt = gui.showKupowanieNazwa();
        if(!listaProduktow.containsKey(produkt)){
            gui.showZakupyNoProductError();
            return;
        }
        int ilosc = gui.showKupowanieIlosc();
        Produkt zakupProduktu = findProduct(produkt);

        if(zakupProduktu.getIloscNaStanie()>=ilosc){
                user.obciazRachunek(ilosc , zakupProduktu);
                return;
        } else {
                gui.showZakupyAmountError();
                return;
        }
    }

    public void restock() {
        String nazwa = gui.showRestock();
        if(!listaProduktow.containsKey(nazwa)){
            gui.showZakupyNoProductError();
            return;
        }
        int ilosc = gui.showRestockIlosc();
        if(ilosc<1){
            gui.showRestockErrorAmount();
            return;
        }
        listaProduktow.get(nazwa).restock(ilosc);
        gui.showRestockSucces();
    }

    public Collection<Produkt> getProducts(){
        return listaProduktow.values();
    }

    public static ListaProduktow getInstance(){
        return instance;
    }
}
