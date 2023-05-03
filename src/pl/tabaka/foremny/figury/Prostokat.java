package pl.tabaka.foremny.figury;

public class Prostokat extends Czworokat {

    double pole;

    public Prostokat(int[] boki) {
        super(boki);
        this.nazwa="Prostokat";
        this.obliczPole();
    }

    private void obliczPole() {
        this.pole=boki[0]*boki[1];
    }

    @Override
    public void wypisz(int nr) {
        super.wypisz(nr);
        gui.poleFigury(this.pole);
    }
}
