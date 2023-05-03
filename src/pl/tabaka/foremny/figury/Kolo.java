package pl.tabaka.foremny.figury;

public class Kolo extends Figure{
    double pole;

    public Kolo(int[] boki) {
        super(boki, "Kolo");
        this.obliczPole();
    }

    @Override
    protected void obliczObwod() {
        this.obwod=2*boki[0]*Math.PI;
    }

    private void obliczPole() {
        this.pole=Math.pow(boki[0],2)*Math.PI;
    }

    @Override
    public void wypisz(int nr) {
        gui.nazwaFigury(this.nazwa);
        System.out.println("Promien tej figury " + (nr+1) + " to: " + boki[0]);
        gui.obwodFigury(this.obwod);
        gui.poleFigury(this.pole);
    }
}
