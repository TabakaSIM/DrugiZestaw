package pl.tabaka.foremny.figury;

import pl.tabaka.foremny.gui.GUI;

public class Exeption extends Figure{

    public Exeption() {
    }

    @Override
    public void wypisz(int nr) {
        new GUI().zglosBlad(nr);
    }
}
