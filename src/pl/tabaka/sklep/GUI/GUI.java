package pl.tabaka.sklep.GUI;

import pl.tabaka.sklep.artykuly.Produkt;
import pl.tabaka.sklep.users.User;

import java.util.Scanner;

public class GUI {

    private static final GUI instance = new GUI();

    private GUI() {
    }

    public static GUI getInstance(){
        return instance;
    }

    public void showWelcomeMessage() {
        System.out.println("Witamy w sklepie u Thaumaturge'a");
    }

    public String showLogginMenu() {
        System.out.println("1. Zaloguj");
        System.out.println("2. Zarejestruj");
        System.out.println("3. Exit");
        return new Scanner(System.in).nextLine();
    }

    public void showMenuError() {
        System.out.println("Nie ma takiej komendy! Sprobuj ponownie!");
    }

    public void showExitMessage() {
        System.out.println("Dziekujemy za wizyte w sklepie! Zapraszamy ponownie!");
    }

    public void showLogginMenuLogowanie() {
        System.out.println("Wybrales zalogowanie sie.");
    }

    public void showLogginMenuRejestracja() {
        System.out.println("Wybrales rejestrowanie sie.");
    }

    public void showRegisterError() {
        System.out.println("Login zajety!");
    }

    public String showPodajLoggin() {
        System.out.println("Podaj login:");
        return new Scanner(System.in).nextLine();
    }

    public String showPodajHaslo() {
        System.out.println("Podaj haslo");
        return new Scanner(System.in).nextLine();
    }

    public void showLogginError() {
        System.out.println("Login lub haslo niepoprawne!");
    }

    public void showLogginSucces() {
        System.out.println("Pomyslnie zalogowano!");
    }

    public void showUserMenu(User user) {
        System.out.println("Masz na koncie: " + user.getMoney());
        System.out.println("1. Wyświetl listę produktów");
        System.out.println("2. Kup produkt");
        System.out.println("3. Doladuj konto");
        System.out.println("4. Wyloguj");
    }

    public void showUserMenuAdmin(User user) {
        this.showUserMenu(user);
        System.out.println("5. Restock");
        System.out.println("6. Wyswietl uzytkownikow");
        System.out.println("7. Zmien ustawienia uzytkownikow");
    }

    public void showUserMenuLogout() {
        System.out.println("Pomyslnie wylogowano!");
    }

    public void showRegisterSucces() {
        System.out.println("Pomyślnie zarejestrowano");
    }

    public void showProdukt(Produkt produkt) {
        System.out.println(produkt.getNazwa() + " - cena: " + produkt.getCena() + " - ilosc na stanie: " + produkt.getIloscNaStanie());
        System.out.println();
    }

    public void showUser(User user) {
        System.out.println("Login: " + user.getLogin() + " - Stan konta: " + user.getMoney());
    }

    public String showKupowanieNazwa() {
        System.out.println("Wpisz nazwe produktu który chcesz kupić:");
        return new Scanner(System.in).nextLine();
    }

    public int showKupowanieIlosc() {
        System.out.println("Wpisz ilosc produktu który chcesz kupić:");
        return scanGetInt();
    }

    public float showUserDoladowanie() {
        System.out.println("Podaj kwote ktora chcesz doladowac konto:");
        return scanGetFloat();
    }

    public void showZakupSucces() {
        System.out.println("Zakup pomyślny!");
    }

    public void showZakupyMoneyError() {
        System.out.println("Masz za malo pieniedzy na koncie!");
    }

    public void showZakupyAmountError() {
        System.out.println("Nie ma takiej ilosci tego produktu na stanie!");
    }

    public void showZakupyNoProductError() {
        System.out.println("Nie ma takiego produktu!");
    }

    public void showUserPomyslneDoladowanie() {
        System.out.println("Pomyslnie doladowano srodki!");
    }

    public String showRestock() {
        System.out.println("Wpisz nazwe produktu do uzupelnienia:");
        return new Scanner(System.in).nextLine();
    }

    public int showRestockIlosc() {
        System.out.println("Wprowadz ile sztuk produktu dodac na polke:");
        return scanGetInt();
    }

    public void showRestockSucces() {
        System.out.println("Pomyslnie dodano produkty!");
    }

    public void showRestockErrorAmount() {
        System.out.println("Ilosc uzupelniajaca nie moze byc ujemna!");
    }

    public String showZmianaRoli() {
        System.out.println("Podaj nazwe uzytkownika ktoremu chcesz zmienic role:");
        return new Scanner(System.in).nextLine();
    }

    public void showZmianaRoliError() {
        System.out.println("Nie ma takiego konta!");
    }

    public void showZmianaRoliSucces() {
        System.out.println("Pomyslnie zmieniono role!");
    }

    public void showWyjscieDoMenu() {
        System.out.println();
        System.out.println("Przekroczyles mozliwa ilosc prob!");
        System.out.println("Wyjscie do menu glownego!");
        System.out.println();
    }

    private int scanGetInt(){
        Scanner scan;
        do {
            scan  = new Scanner(System.in);
        } while (!scan.hasNextInt());
        return scan.nextInt();
    }

    private float scanGetFloat() {
        Scanner scan;
        do {
            scan  = new Scanner(System.in);
        } while (!scan.hasNextFloat());
        return scan.nextFloat();
    }


}
