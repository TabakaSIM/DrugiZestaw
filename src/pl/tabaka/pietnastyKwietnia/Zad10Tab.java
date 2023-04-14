package pl.tabaka.pietnastyKwietnia;

public class Zad10Tab {
    private int n=10;
    private int amount=-1;
    private Zad10TabGeneration tab1;
    private Zad10TabGeneration tab2;
    private Zad10TabGeneration tab3;

    public Zad10Tab() {
        boolean result=false;
         do {
             this.tab1 = new Zad10TabGeneration(n);
             this.tab2 = new Zad10TabGeneration(n);
             this.tab3 = new Zad10TabGeneration(n);

            for (int i = 0; i < n; i++) {
                boolean result2 = false;
                boolean result3 = false;
                int k = tab1.get(i);
                for (int j = 0; j < n; j++) {
                    if (tab1.get(i) == tab2.get(j)) {
                        result2 = true;
                        break;
                    }
                }
                for (int j = 0; j < n; j++) {
                    if (tab1.get(i) == tab3.get(j)) {
                        result3 = true;
                        break;
                    }
                }
                amount++;
                result = result || (result2 && result3);
            }
        } while (!result);
        System.out.println("Stworzone tablice to: ");
        tab1.print();
        tab2.print();
        tab3.print();
        System.out.println("Ponownie generowano tablice " + amount + " razy!");
    }
}
