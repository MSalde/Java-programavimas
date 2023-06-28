package Uzduotis1;

import java.util.Scanner;

public class pagrindinePrograma {
    public static void main(String[] args) {
        Preke preke1 = nuskaitytiPrekeIsKonsoles();
        System.out.println("preke = " + preke1);
        Preke preke2 = nuskaitytiPrekeIsKonsoles();
        System.out.println("preke2 = " + preke2);
        System.out.println("preke2 kaina = " + preke2.getKaina());
        System.out.println("preke1.getPavadinimas() = " + preke1.getPavadinimas());

    }
    public static Preke nuskaitytiPrekeIsKonsoles() {
        Scanner skaitytuvas = new Scanner(System.in);
        System.out.println("Iveskite prekes ID: ");
        int id = skaitytuvas.nextInt();
        System.out.println("Iveskite prekes pavadinima: ");
        skaitytuvas.nextLine();
        String pavadinimas = skaitytuvas.nextLine();
        System.out.println("Iveskite prekes kaina: ");
        double kaina = skaitytuvas.nextDouble();
        System.out.println("Iveskite kieki sandelyje: ");
        int kiekisSandelyje = skaitytuvas.nextInt();
        System.out.println("Iveskite kategorija: ");
        skaitytuvas.nextLine();
        String kategorija = skaitytuvas.nextLine();

        return new Preke(id, pavadinimas, kaina, kiekisSandelyje, kategorija);
    }
}
