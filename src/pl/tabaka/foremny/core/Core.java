package pl.tabaka.foremny.core;

import pl.tabaka.foremny.gui.GUI;

import java.util.Scanner;

public class Core {

    GUI gui = new GUI();
    Scanner scanner = new Scanner(System.in);

    public Core() {
        gui.wprowadzIlosc();
        new FigureList(new Scanner(System.in).nextInt());
        gui.koniecProgramu();
    }
}
