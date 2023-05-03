package pl.tabaka.foremny.figury;

public class SzesciokatForemny extends Szesciokat{

    double pole;

    public SzesciokatForemny(int[] boki) {
        super(boki);
        this.nazwa+=" foremny";
        this.obliczPole();
    }

    private void obliczPole() {
        this.pole= boki.length*Math.pow(boki[0],2)/(Math.tan(Math.toRadians(360/boki.length/2))*4);
    }

    @Override
    public void wypisz(int nr) {
        super.wypisz(nr);
        gui.poleFigury(this.pole);
    }
}
