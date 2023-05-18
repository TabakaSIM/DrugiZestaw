package pl.tabaka.sklep.core;

import pl.tabaka.sklep.artykuly.ListaProduktow;
import pl.tabaka.sklep.artykuly.Produkt;
import pl.tabaka.sklep.users.User;
import pl.tabaka.sklep.users.UserList;

import java.io.BufferedReader;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;


public class Loader {
    private static final Loader instance = new Loader();

    private Loader() {}

    public void readDataFromFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("db.csv"));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] objectData = line.split(";");
            String[] vars = Arrays.copyOfRange(objectData, 1, objectData.length);
            switch (objectData[0]) {
                case "Produkt":
                    ListaProduktow.getInstance().register(new Produkt(vars[0],Float.parseFloat(vars[1]),Integer.parseInt(vars[2])));
                    break;
                case "User":
                    UserList.getInstance().register(new User(vars[0],vars[1],Float.parseFloat(vars[2]),Boolean.parseBoolean(vars[3])),true);
                    break;
                default:
                    System.out.println("Unexpected type during DB loading !!");
                    break;
            }
        }
        reader.close();
    }

    public void saveDataToFile() throws IOException {
        Collection<Writable> entries = new ArrayList<>();
        entries.addAll(ListaProduktow.getInstance().getProducts());
        entries.addAll(UserList.getInstance().getUsers());
        BufferedWriter writer =
                new BufferedWriter(new FileWriter("db.csv"));
        boolean firstTime = true;
        for (Writable entry : entries) {
            String lineInFile = entry.toCSV();
            if (!firstTime) {
                writer.newLine();
            }
            firstTime = false;
            writer.write(lineInFile);
        }
        writer.close();
    }

    public static Loader getInstance() {
        return instance;
    }
}
