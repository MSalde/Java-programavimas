package Uzduotis3;

import java.util.Arrays;
import java.util.Scanner;

public class pagrindinePrograma {
    public static void main(String[] args) {
        Preke preke = nuskaitytiPrekeIsKonsoles();
        System.out.println("preke = " + preke);
        Preke[] n = nuskaitytiMasyvaIsKonsoles();
        System.out.println("prekes = " + Arrays.toString(n));
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
    public static Preke[] nuskaitytiMasyvaIsKonsoles() {
        Scanner skaitytuvas = new Scanner(System.in);
        System.out.println("Iveskite kiek bus prekiu masyve: ");
        int n = skaitytuvas.nextInt();
        Preke[] prekes = new Preke [n];
        for (int i = 0; i < n; i++) {
            prekes[i] = nuskaitytiPrekeIsKonsoles();
        }
        return prekes;
    }
}
