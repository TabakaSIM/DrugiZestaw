package pl.tabaka.foremny.figury;

public class Trojkat extends Figure {
    double pole;

    public Trojkat(int[] boki) {
        super(boki,"Trojkat");
        this.obliczPole();
    }

    private void obliczPole() {
        this.pole=Math.sqrt((double) (this.obwod/2)*(this.obwod/2-boki[0])*(this.obwod/2-boki[1])*(this.obwod/2-boki[2]));
    }

    @Override
    public void wypisz(int nr) {
        super.wypisz(nr);
        gui.poleFigury(this.pole);
    }
}
