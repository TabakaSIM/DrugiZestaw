package pl.tabaka.pietnastyKwietnia;

import java.util.Scanner;

public class HowNextWorks {
    public static void main(String[] args) {

           /* Scanner scan = new Scanner(System.in);
            System.out.println("1 linijka: " + scan.nextInt());

            System.out.println("2 linijka: " + scan.next());*/
        String[] str = podaj();
        System.out.println(str[0] + str[1]);

    }

    private static String[] podaj() {
        return new String[]{"haha", "xd"};
    }
}
