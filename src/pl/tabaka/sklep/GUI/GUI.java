package pl.tabaka.sklep.GUI;

import pl.tabaka.sklep.artykuly.Produkt;
import pl.tabaka.sklep.users.User;

public class GUI {

    public GUI() {
    }

    public void showWelcomeMessage() {
        System.out.println("Witamy w sklepie u Thaumaturge'a");
    }

    public void showLogginMenu() {
        System.out.println("1. Zaloguj");
        System.out.println("2. Zarejestruj");
        System.out.println("3. Exit");
    }

    public void showLogginMenuError() {
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

    public void showRegisterPodajLoggin() {
        System.out.println("Podaj login konta");
    }

    public void showRegisterPodajHaslo() {
        System.out.println("Podaj haslo konta");
    }

    public void showRegisterError() {
        System.out.println("Login zajety!");
    }

    public void showRegisterErrorOutOfIndex(){
        System.out.println("Brak miejsca w systemie!");
    };

    public void showPodajLoggin() {
        System.out.println("Podaj login:");
    }

    public void showPodajHaslo() {
        System.out.println("Podaj haslo");
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

    public void showKupowanie() {
        System.out.println("Wpisz nazwe produktu który chcesz kupić:");
    }

    public void showUserDoladowanie() {
        System.out.println("Podaj kwote ktora chcesz doladowac konto:");
    }

    public void showZakupPodajIlosc() {
        System.out.println("Podaj ilosc sztuk towaru ktory chcesz kupic:");
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

    public void showRestock() {
        System.out.println("Wpisz nazwe produktu do uzupelnienia:");
    }

    public void showRestockIlosc() {
        System.out.println("Wprowadz ile sztuk produktu dodac na polke:");
    }

    public void showZmianaRoli() {
        System.out.println("Podaj nazwe uzytkownika ktoremu chcesz zmienic nazwe:");
    }

    public void showZmianaRoliError() {
        System.out.println("Nie ma takiego konta!");
    }

    public void showZmianaRoliSucces() {
        System.out.println("Pomyslnie zmieniono role!");
    }
}
